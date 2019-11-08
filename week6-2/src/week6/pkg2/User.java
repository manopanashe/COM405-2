/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.pkg2;

/**
 *
 * @author 4manop68
 */
public class User {
    private int regristrationNum;
    private int occupants;
    private boolean carParkFull;
    private String CarName;

      public User( String CarNameln)
      {
      
      CarName = CarNameln;
      }
        
     
  
    public int getRegristrationNum() {
        return regristrationNum;
    }

    public void setRegristrationNum(int regristrationNum) {
        this.regristrationNum = regristrationNum;
    }

    public int getOccupants() {
        return occupants;
    }

    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

    public boolean isCarParkFull() {
        return carParkFull;
    }

    public void setCarParkFull(boolean carParkFull) {
        this.carParkFull = carParkFull;
    }

   
    
    
}
