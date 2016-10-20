/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepproject;
import java.util.ArrayList;


/**
 *
 * @author phili
 */
public class Major {
    
    ArrayList<Classes> classes;

    public Major() 
    {
        this.classes = new ArrayList<Classes>();
    }
    
    public void addClass(String name, String preReqName, 
            int classNum, int amtCredits, boolean preReq, 
            boolean taken)
    {
        Classes class1 = new Classes(name, preReqName, 
            classNum, amtCredits, preReq, taken);
        
        classes.add(class1);
    }
    
    public void deleteClassName(String name)
    {
        int arrayIndex = 0;
        while(!name.equals(classes.get(arrayIndex).getName()))
        {
            arrayIndex++;
        }
        
        classes.remove(arrayIndex);   
    }
    
    public void deleteClassNum(int classNum)
    {
        int arrayIndex = 0;
        while(classNum != classes.get(arrayIndex).getClassNum())
        {
            arrayIndex++;
        }
        
        classes.remove(arrayIndex);
    }

    
    
}