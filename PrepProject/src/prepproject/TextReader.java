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

/**
 *
 * @author tayl1776
 */
public class TextReader 
{
    String fileName;
    String line;
    
    public TextReader(String file)
    {
        fileName = file;
        line = null;
    }
    
    public void ReadFile()
    {
        try{
            FileReader reader = new FileReader(fileName);
            BufferedReader reader2 = new BufferedReader(reader);
            
            while(reader2.readLine() != null)
            {
                line = reader2.readLine();
            }
        }
        catch(FileNotFoundException ex)
        {
            
        }
        catch(IOException ex)
        {
        }
    }
}
