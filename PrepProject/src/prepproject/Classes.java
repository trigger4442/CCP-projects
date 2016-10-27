/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepproject;

/**
 *
 * @author phili hello there 
 */
public final class Classes {
    private String name;
    private String preReqName;
    private int classNum;
    private int amtCredits;
    private boolean preReq;
    private boolean taken;
    
    public Classes (String name, String preReqName, 
            int classNum, int amtCredits, boolean preReq, 
            boolean taken)
    {
        this.setName(name);
        this.setPreReqName(preReqName);
        this.setClassNum(classNum);
        this.setAmtCredits(amtCredits);
        this.setPreReq(preReq);
        this.setTaken(taken);
        
    }

    /**
     * @return the name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * @return the preReqNam
     */
    public String getPreReqName() 
    {
        return preReqName;
    }

    /**
     * @param preReqNam the preReqNam to set
     */
    public void setPreReqName(String preReqName) 
    {
        this.preReqName = preReqName;
    }

    /**
     * @return the classNum
     */
    public int getClassNum() 
    {
        return classNum;
    }

    /**
     * @param classNum the classNum to set
     */
    public void setClassNum(int classNum) 
    {
        this.classNum = classNum;
    }

    /**
     * @return the amtCredits
     */
    public int getAmtCredits() 
    {
        return amtCredits;
    }

    /**
     * @param amtCredits the amtCredits to set
     */
    public void setAmtCredits(int amtCredits) 
    {
        this.amtCredits = amtCredits;
    }

    /**
     * @return the preReq
     */
    public boolean isPreReq() 
    {
        return preReq;
    }

    /**
     * @param preReq the preReq to set
     */
    public void setPreReq(boolean preReq) 
    {
        this.preReq = preReq;
    }

    /**
     * @return the taken
     */
    public boolean hasTaken() 
    {
        return taken;
    }

    /**
     * @param taken the taken to set
     */
    public void setTaken(boolean taken) 
    {
        this.taken = taken;
    }
    
}
