/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author 4manop68
 */
public class Staff {

    private String name;

    public Staff(String nameln) {
        name = nameln;

    }

    Staff() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

   

    public void setName(String name) {
        this.name = name;
    }

    

}
