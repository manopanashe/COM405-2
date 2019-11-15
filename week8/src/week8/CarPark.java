package week8;

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
    private int RegistrationNumber;

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

    public boolean removeUser(int RegistrationNum) {
        for (int i = 0; i < cars.length - 1; i++) {
            if (cars[i] != null) {
                if (cars[i].getRegristrationNum() == RegistrationNum) {
                    cars[i] = null;

                }
            }

        }

        return false;
    }

    public int CalcFreeSpaces() {
        int tally = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                tally++;
            }
        }

        return tally;
    }

    public int getMaximumspaces() {
        return maximumspaces;
    }

    public void setMaximumspaces(int maximumspaces) {
        this.maximumspaces = maximumspaces;
    }

    public int getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(int RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
    }

    public User[] getCars() {
        return cars;
    }

    public void setCars(User[] cars) {
        this.cars = cars;
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

    boolean addUser(String ford) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
