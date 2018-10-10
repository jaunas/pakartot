package jaunas.pakartot;

import jaunas.pakartot.GUI.Dashboard;

import javax.swing.*;

public class Main {

    public static void main(String [] args) {
        JFrame frame = new JFrame("Pakartot");
        frame.setContentPane(new Dashboard().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
