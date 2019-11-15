/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author 4manop68
 */
public class User {
    private int regristrationNum;
    private String colour;
    private String Make;
    private String Model;
    


      public User(int RegristrationNumln, String Colourln, String Makeln, String Modelln)
      {
         regristrationNum =  RegristrationNumln;
         colour = Colourln;
         Make = Makeln;
         Model = Modelln;
         
      }
        
      public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getcolour() {
        return colour;
    }

    public void setcolour(String Colour) {
        this.colour = Colour;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }
  
    public int getRegristrationNum() {
        return regristrationNum;
    }

    public void setRegristrationNum(int regristrationNum) {
        this.regristrationNum = regristrationNum;
    }

    
    
    
}
