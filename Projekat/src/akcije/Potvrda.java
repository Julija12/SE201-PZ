/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akcije;

import izuzetci.PrazanString;
import Frame1.Frame_1;
import Frame1.Frame_2;
import Podaci.BeanRezervisao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Julija
 */
public class Potvrda implements ActionListener {

    private BeanRezervisao bean;
    private Frame_1 frame1;
    private Frame_2 frame2;

    public Potvrda(Frame_1 f1, Frame_2 f2) {
        frame1 = f1;
        frame2 = f2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        bean = new BeanRezervisao(frame1, frame2);

        try {

            provera();
            PrintWriter writer = new PrintWriter("Rezervacija.txt", "UTF-8");

            writer.println("Sertifikat - REZERVISANO");
            writer.println(bean.getIme() + " " + bean.getPrezime());
            writer.println("e-mail: " + bean.getEmail());
            writer.println("");

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
            if (!bean.getStikliranoMasaza().equals("Odaberi")) {
                if (!bean.getStikliranoDMasaza().equals("Odaberi")) {
                    writer.println(bean.getStikliranoMasaza() + " " + bean.getStikliranoDMasaza() + " " + bean.getCenaMasaza());
                } else {
                    writer.println(bean.getStikliranoMasaza() + " " + bean.getCenaMasaza());
                }
            }
            if (!bean.getStikliranoNega().equals("Odaberi")) {
                if (!bean.getStikliranoDNega().equals("Odaberi")) {
                    writer.println(bean.getStikliranoNega() + " " + bean.getStikliranoDNega() + " " + bean.getCenaNega());
                } else {
                    writer.println(bean.getStikliranoNega() + " " + bean.getCenaNega());
                }
            }

            writer.println("Ukupna cena je: " + bean.getUkupno());

            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Izlaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Izlaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PrazanString ex) {
            Logger.getLogger(Potvrda.class.getName()).log(Level.SEVERE, null, ex);
        }
       

    }

    public void provera() throws PrazanString {

        if (bean.getIme().equals("") || bean.getPrezime().equals("") || bean.getEmail().equals("")) {
            JOptionPane.showMessageDialog(null,"Popunite sva polja!" );
            throw new PrazanString("Popunite sva polja!");
            

        }

    }
}
