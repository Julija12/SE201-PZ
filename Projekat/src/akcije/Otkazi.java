/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akcije;

import Frame1.Frame_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Julija
 */
public class Otkazi implements ActionListener {
    Frame_2 f;
    public Otkazi(Frame_2 frame) {
        f=frame;
    }

   @Override
    public void actionPerformed(ActionEvent e) {
         f.setVisible(false);
        
   
    }

}
