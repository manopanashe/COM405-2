/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

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
public class MainScreen1 extends JFrame implements ActionListener {

    private GridBagConstraints constraints;
    private Bridge1 bridge;
    private JLabel lblBridgeSystem;
    private JLabel lblCurrentLoad;
    private JLabel lblregistration;
    private JLabel lblWeight;
    private JLabel lblstatus;
    private JLabel lblfee;

    private JTextField txtregistration;
    private JTextField txtweight;

    private JButton btnadd;
    private JButton btnremove;

    public MainScreen1() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        bridge = new Bridge1(30000);
        intComponents();
        layoutComponents();

    }

    private void intComponents() {
        lblBridgeSystem = new JLabel("Bridge System");
        lblCurrentLoad = new JLabel("Current load: 300kg");
        lblregistration = new JLabel("Registration: ");
        lblWeight = new JLabel("Weight: ");
        lblstatus = new JLabel("Entry Granted");
        lblfee = new JLabel("fee: £5.00 ");

        btnadd = new JButton("Add");
        btnadd.addActionListener((ActionListener) this);
        btnremove = new JButton("Remove");
        btnremove.addActionListener((ActionListener) this);

        txtregistration = new JTextField();
        txtweight = new JTextField();

    }

    private void layoutComponents() {
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 2;

        this.add(lblBridgeSystem, constraints);

        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.gridwidth = 3;
        this.add(lblCurrentLoad, constraints);

        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblregistration, constraints);

        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtregistration, constraints);

        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 3;
        constraints.gridx = 0;
        this.add(lblWeight, constraints);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        this.add(txtweight, constraints);

        constraints.gridy = 4;
        constraints.gridx = 0;
        constraints.gridwidth = 3;
        this.add(lblstatus, constraints);

        constraints.gridy = 5;
        constraints.gridx = 0;
        constraints.gridwidth = 3;
        this.add(lblfee, constraints);

        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 6;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(btnadd, constraints);

        constraints.gridx = 1;
        this.add(btnremove, constraints);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnadd)) {
            String reg = txtregistration.getText();
            double wieght = Integer.parseInt(txtweight.getText());
            Vehicle1 veh = null;
            if (wieght < 200) {
                veh = new MotorBike1("4hid3", 1402, 3);

            } else if (wieght >= 2000 && wieght < 3500) {
                veh = new Car1("20r8f", 1239, 10);
            } else {
                veh = new Lorry1("e93jr", 2982, 15);
            }
            if (bridge.addVehicle(veh)) {
                lblstatus.setText("Entry Granted");
                lblCurrentLoad.setText(bridge.calcTotalWeight() + "kg");
                lblfee.setText("£" + veh.CalculateFee());
            } else {
                lblstatus.setText("Access denied");
            }

        } else if (e.getSource().equals(btnremove)) {
            String reg = txtregistration.getText();
            if (bridge.removeVehicle(reg)) {
                lblstatus.setText("Vehicle granted");
                lblCurrentLoad.setText(bridge.calcTotalWeight() + "kg");
                lblfee.setText("-");
            }
        }
    }

}
