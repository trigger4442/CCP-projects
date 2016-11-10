/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepproject;

/**
 *
 * @author phili
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Major ComputerScience;
       ComputerScience = new Major();
       
       
       ComputerScience.addClass("Discrete Mathematical Structures 1", "MA-2550", 3, false, false);
       ComputerScience.addClass("Introduction to Computer Science 1", "CS-1140", 4, false, false);
       ComputerScience.addClass("Intreoduction to Computer Science 2", "Introduction to Computer Science 1", "CS-2150", 4, true, false);
       ComputerScience.addClass("Discrete Mathematical Structure 2", "Discrete Mathematical Structures 1", "CS-2550", 3, true, false);
       ComputerScience.addClass("Information and Knowledge Management", "Discrete Mathematical Structure 2", "CS-3100", 4, true, false);
       ComputerScience.addClass("Algorithm Design and Data Analysis", "Discrete Mathematical Sturctures 2", "CS-3500", 4, true, false);
       ComputerScience.addClass("Computer Architecture", "Discrete Mathematical Structures 2", "CS-4200", 4, true, false);
       ComputerScience.addClass("Software Development and Design", "Algorithem Design and Data Analysis", "CS-4290", 3, true, false);
       ComputerScience.addClass("Operating Systems and Networking", "Discrete Mathematical Structures 2", "CS-4400", 4, true, false);
       ComputerScience.addClass("Computer Science Senior Capstone", "Software Development and Design", "CS-4230", 3, true, false);
       
       TextReader text = new TextReader("CS.txt");
       for(int i = 0; i < ComputerScience.classes.size(); i++)
       {
           String fileInput;
           if(ComputerScience.classes.get(i).isPreReq())
           {
               fileInput = ComputerScience.classes.get(i).getName() + ", " + ComputerScience.classes.get(i).getPreReqName() + ", " + ComputerScience.classes.get(i).getClassNum() + ", " + Integer.toString(ComputerScience.classes.get(i).getAmtCredits()) + ", "
                       + Boolean.toString(ComputerScience.classes.get(i).isPreReq()) + ", " + Boolean.toString(ComputerScience.classes.get(i).hasTaken());
           }
           else
           {
               fileInput = ComputerScience.classes.get(i).getName() + ", " + ComputerScience.classes.get(i).getClassNum() + ", " + Integer.toString(ComputerScience.classes.get(i).getAmtCredits()) + ", "
                       + Boolean.toString(ComputerScience.classes.get(i).isPreReq()) + ", " + Boolean.toString(ComputerScience.classes.get(i).hasTaken());
           }
           text.WriteFile(fileInput);
       }
       text.CloseBufferedWriter();
       
    }
    
}
