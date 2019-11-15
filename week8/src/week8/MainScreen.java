/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 4manop68
 */
public class MainScreen extends JFrame implements ActionListener {

    private CarPark park;
    private GridBagConstraints constraints;
    private JLabel lblRegNo;
    private JLabel lblColour;
    private JLabel lblMake;
    private JLabel lblModel;
    private JLabel lblstatus;

    private JTextField txtRegNo;
    private JTextField txtColour;
    private JTextField txtMake;
    private JTextField txtModel;

    private JButton btnAdd;
    private JButton btnRemove;

    public MainScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        park = new CarPark(15);

        initComponents();
        layoutComponents();

    }

    private void initComponents() {
        lblRegNo = new JLabel("Reg No: ");
        lblColour = new JLabel("Colour: ");
        lblMake = new JLabel("Make: ");
        lblModel = new JLabel("Model: ");

        lblstatus = new JLabel("Car park has 15 empty spaces");

        txtRegNo = new JTextField();
        txtColour = new JTextField();
        txtMake = new JTextField();
        txtModel = new JTextField();

        btnAdd = new JButton("add");
        btnAdd.addActionListener(this);
        btnRemove = new JButton("Remove");
        btnRemove.addActionListener(this);

    }

    private void layoutComponents() {
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblRegNo, constraints);

        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtRegNo, constraints);

        constraints.gridy = 1;
        constraints.gridx = 0;
        this.add(lblColour, constraints);

        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtColour, constraints);

        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 2;
        constraints.gridx = 0;
        this.add(lblMake, constraints);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        this.add(txtMake, constraints);

        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 3;
        constraints.gridx = 0;
        this.add(lblModel, constraints);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        this.add(txtModel, constraints);

        constraints.gridy = 4;
        constraints.gridx = 0;
        constraints.gridwidth = 2;

        this.add(lblstatus, constraints);

        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 5;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(btnAdd, constraints);

        constraints.gridx = 1;
        this.add(btnRemove, constraints);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource().equals(btnAdd)) {
            String RegNo = txtRegNo.getText();
            String Colour = txtColour.getText();

            if (park.addUser(new User(1, "blue", "ford", "fiasta"))) {
                JOptionPane.showMessageDialog(null, "Car has been added");
                lblstatus.setText("Car Park has " + park.CalcFreeSpaces() + " spaces ");
            } else {

                JOptionPane.showMessageDialog(null, "The Carpark is full");

            }
        } else if (ev.getSource().equals(btnRemove)) {
            String RegNo = txtRegNo.getText();
            String Colour = txtColour.getText();

            if (park.removeUser(1)) {
                JOptionPane.showMessageDialog(null, "Car has been removed");
                lblstatus.setText("Car Park has " + park.CalcFreeSpaces() + " spaces ");
            } else {
                JOptionPane.showMessageDialog(null, "The Car cannot be found");
            }

        }
    }
}
