package week6.pkg2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 4manop68
 */
public class CarPark {

    private int CarRegNum;
    int maximumspaces = 15;
    private boolean Spaces;
    private User assignedUser;

    private User[] cars;

    public CarPark(int maximumspaces) {
        this.maximumspaces = maximumspaces;
        cars = new User[maximumspaces];

    }

    public boolean addUser(User userln) {
        for (int i = 0; i < cars.length - 1; i++) {
            if (cars[i] == null) {
                cars[i] = userln;
                return true;

            }
        }

        return false;

    }
    public boolean removeUser(int RegistrationNum)
    {
        for(int i = 0; i <cars.length - 1; i++)
        {
         if(cars[i] == null)
         {
         if(cars[i].getRegristrationNum() == RegistrationNum)
         {
         cars[i] = null;
         
         }
         }
         
        }
        
        return false;
}

    public int getCarRegNum() {
        return CarRegNum;
    }

    public void setCarRegNum(int CarRegNum) {
        this.CarRegNum = CarRegNum;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public boolean isSpaces() {
        return Spaces;
    }

    public void setSpaces(boolean Spaces) {
        this.Spaces = Spaces;
    }

}
