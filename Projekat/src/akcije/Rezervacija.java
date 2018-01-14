/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akcije;

import Frame1.Frame_1;
import Frame1.Frame_2;
import Podaci.Bean;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Julija
 */
public class Rezervacija implements ActionListener {
    private Frame_1 frame;

    public Rezervacija(Frame_1 f) {
        frame = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (frame.getComboxDatum().getSelectedItem().toString().equals("Odaberi")
                && frame.getComboxDatum1().getSelectedItem().toString().equals("Odaberi")
                && frame.getComboxDatum2().getSelectedItem().toString().equals("Odaberi")
                && frame.getComboxDatum3().getSelectedItem().toString().equals("Odaberi")) {

            JOptionPane.showMessageDialog(null, "Odaberite datum!");
        } else {
            new Frame_2(frame);
        }

    }

}
