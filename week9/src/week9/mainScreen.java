/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 4manop68
 */
public class mainScreen extends JFrame implements ActionListener {

    private int currentspeed;
    private int maxspeed;
    private int fuellevel;

    private Car carpark;
    private GridBagConstraints constraints;
    private JLabel lblname;
    private JLabel lblcolour;
    private JLabel lblcurrentspeed;
    private JLabel lblmaxspeed;
    private JLabel lblfuellevel;
    private JLabel lblaccelerate;
    private JLabel lblbrake;
    private JLabel lblrefuel;

    private JTextField txtname;
    private JTextField txtcolour;
    private JTextField txtdoors;

    private JButton btnaccelerate;
    private JButton btnrefuel;
    private JButton Btnbrake;

    public mainScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        carpark = new Car(50,100,50);
        intComponents();
        layoutComponents();

    }

    private void intComponents() {
        lblname = new JLabel("Name: ");
        lblcolour = new JLabel("colour: ");

        lblcurrentspeed = new JLabel("The car's current speed is 40mph");
        lblmaxspeed = new JLabel("the Car's maximum speed is 120mph ");
        lblfuellevel = new JLabel("The fuel level is at 50%");

        txtname = new JTextField();
        txtcolour = new JTextField();

        btnaccelerate = new JButton("accelerate");
        btnaccelerate.addActionListener((ActionListener) this);
        btnrefuel = new JButton("Refuel");
        btnrefuel.addActionListener((ActionListener) this);
        Btnbrake = new JButton("Brake");
        Btnbrake.addActionListener((ActionListener) this);

    }

    private void layoutComponents() {
        constraints.gridy = 0;
        constraints.gridx = 0;
        this.add(lblname, constraints);

        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtname, constraints);

        constraints.gridy = 1;
        constraints.gridx = 0;
         constraints.fill = GridBagConstraints.NONE;
        this.add(lblcolour, constraints);

        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtcolour, constraints);

        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblfuellevel, constraints);

        constraints.gridy = 3;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        this.add(lblcurrentspeed, constraints);

        constraints.gridy = 4;
        constraints.gridx = 0;
        constraints.gridwidth = 3;
        this.add(lblmaxspeed, constraints);

        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 5;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(btnaccelerate, constraints);
       
        constraints.gridx = 1;
        this.add(Btnbrake, constraints);
        
        constraints.gridx = 2;
        this.add(btnrefuel, constraints);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnaccelerate)) {
            
            carpark.accelerate(5);
            lblcurrentspeed.setText("The car's current speed is " + carpark.getCurrentspeed() + "mph");
        } else if (e.getSource().equals(Btnbrake)) {
            carpark.brake(5);

        }
        else if(e.getSource().equals(btnrefuel))
                {
                carpark.refuel(40);
                
                }
    }

}
