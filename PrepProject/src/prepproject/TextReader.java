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
}
