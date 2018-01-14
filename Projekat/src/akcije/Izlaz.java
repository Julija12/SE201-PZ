/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akcije;

import Frame1.Frame_1;
import Podaci.BeanOdustao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julija
 */
public class Izlaz implements ActionListener {

    private Frame_1 frame;
    private BeanOdustao bean;

    public Izlaz(Frame_1 f) {
        frame = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        bean = new BeanOdustao(frame);
        //izlazni fajl
        try {

            PrintWriter writer = new PrintWriter("Odustajanje.txt", "UTF-8");

            writer.println("Sertifikat - ODUSTAO");

            if (!bean.getStikliranoFU().equals("Odaberi")) {
                if (!bean.getStikliranoDU().equals("Odaberi")) {
                    writer.println(bean.getStikliranoFU() + " " + bean.getStikliranoDU() + " " + bean.getCenaFu());
                } else {
                    writer.println(bean.getStikliranoFU() + " " + bean.getCenaFu());
                }
            }
            if (!bean.getStikliranoKU().equals("Odaberi")) {
                if (!bean.getStikliranoDKU().equals("Odaberi")) {
                    writer.println(bean.getStikliranoKU() + " " + bean.getStikliranoDKU() + " " + bean.getCenaKu());
                } else {
                    writer.println(bean.getStikliranoKU() + " " + bean.getCenaKu());
                }
            }
            if(!bean.getStikliranoMasaza().equals("Odaberi")){
                if (!bean.getStikliranoDMasaza().equals("Odaberi")) {
                    writer.println(bean.getStikliranoMasaza() + " " + bean.getStikliranoDMasaza() + " " + bean.getCenaMasaza());
                } else {
                    writer.println(bean.getStikliranoMasaza() + " " + bean.getCenaMasaza());
                }
            }

            if(!bean.getStikliranoNega().equals("Odaberi")){
                if (!bean.getStikliranoDNega().equals("Odaberi")) {
                    writer.println(bean.getStikliranoNega() + " " + bean.getStikliranoDNega() + " " + bean.getCenaNega());
                } else {
                    writer.println(bean.getStikliranoNega() + " " + bean.getCenaNega());
                }
            }

            writer.println("Ukupna cena bi bila: " + bean.getUkupno());

            if (!bean.getRazlog().equals("Odaberi")) {
                writer.println("Razlog odustajanja : " + bean.getRazlog());
            }

            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Izlaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Izlaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }

}
