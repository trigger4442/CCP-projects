/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;


/**
 *
 * @author tayl1776
 */
public class TextReader 
{
    String fileName;
    String line;
    FileReader reader;
    BufferedReader reader2;
    FileWriter filewriter;
    BufferedWriter bufferedWriter;
    
    
    public TextReader(String file)
    {
        fileName = file;
        line = null;
        try{
            reader = new FileReader(fileName);
            reader2 = new BufferedReader(reader);
        }
        catch(FileNotFoundException ex)
        {
            
        }
        try{
            filewriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(filewriter);
        }
        catch(IOException ex)
        {
            System.out.println("Error writing to the file '" + fileName + "'");
        }
    }
    
    public ArrayList<String> ReadFile()
    {
        ArrayList<String> returnList = new ArrayList<String>(25);
        try{
            while(reader2.readLine() != null)
            {
                line = reader2.readLine();
                returnList.add(line);
            }
            reader2.close();
        }
        catch(IOException ex)
        {
        }
        return returnList;
    }
    
    public void WriteFile(String input)
    {
        try{
            bufferedWriter.write(input);
            bufferedWriter.newLine(); 
        }
        catch(IOException ex)
        {
            System.out.println("Error writing to the file '" + fileName + "'");
        }
    }
    
    public void CloseBufferedWriter()
    {
        try{
            bufferedWriter.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error writing to the file '" + fileName + "'");
        }
    }
    
    public static Major buildMajor(ArrayList<String> fileInput)
    {
        Major returnValue = new Major();
        
        for(int i = 0; i < fileInput.size(); i++)
        {
            char[] input = new char[40];
            String name = null;
            String prereq = null;
            String number = null;
            int amt = 0;
            boolean requirement = true;
            boolean taken = false;
            
            for(int j = 0; j < fileInput.get(i).length(); j++)
            {
                int commaCounter = 0;
                if(fileInput.get(i).charAt(j) != ',')
                {
                    if(j >= input.length)
                    {
                        char[] newArray = new char[input.length + 20];
                        for(int k = 0; k < input.length; k++)
                        {
                            newArray[k] = input[k];
                        }
                        input = newArray;
                    }
                    input[j] = fileInput.get(i).charAt(j);
                }
                else if(commaCounter >= 0 && commaCounter <= 5)
                {
                    commaCounter++;
                    if(commaCounter == 1)
                    {
                        name = String.valueOf(input);
                        input = new char[40];
                        j++;
                    }
                    else if(commaCounter == 2)
                    {
                        if(input[6] != '0')
                        {
                            prereq = String.valueOf(input);

                        }
                        else
                        {
                            number = String.valueOf(input);
                        }
                        input = new char[40];
                        j++;
                    }
                    else if(commaCounter == 3)
                    {
                        if(prereq != null)
                        {
                            number = String.valueOf(input);
                        }
                        else
                        {
                            amt = Character.getNumericValue(input[0]);
                        }
                        input = new char[40];
                        j++;
                    }
                    else if(commaCounter == 4)
                    {
                        if(prereq != null)
                        {
                            amt = Character.getNumericValue(input[0]);
                        }
                        else
                        {
                            requirement = false;
                        }
                        input = new char[40];
                        j++;
                    }
                    else if(commaCounter == 5)
                    {
                        if(prereq != null)
                        {
                            requirement = true;
                        }
                        else
                        {
                            if(input[0] == 't')
                            {
                                taken = true;
                            }
                            else
                            {
                                taken = false;
                            }
                        }
                        input = new char[40];
                        j++;
                    }      
                }
                else
                {
                    if(input[0] == 't')
                    {
                        taken = true;
                    }
                    else
                    {
                        taken = false;
                    }
                }
            }
            if(prereq != null)
            {
                returnValue.addClass(name, prereq, number, amt, requirement, taken);
            }
            else
            {
                returnValue.addClass(name, number, amt, requirement, taken);
            }
        }
        return returnValue;
    }
}
