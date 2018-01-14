/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akcije;

import Frame1.Frame_1;
import Podaci.Usluge;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Julija
 */
public class Izracunaj implements ActionListener {

    Frame_1 frame;
    

    public Izracunaj(Frame_1 f) {
        frame = f;
       
    }

    public boolean poredjenje(Usluge P, ArrayList<Usluge> lista) {

        //obezbedjujem da nema duplih datuma u comboxDatum
        Usluge trenutni = P;
        boolean nasao = false;
        for (Usluge Q : lista) {
            if (Q == trenutni) {
                break;
            }
            if (trenutni.getDatum().equals(Q.getDatum())) {
                nasao = true;
                break;
            }
        }

        return nasao;
        //

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //na svaki klik dugmeta Izracunaj prvo ponistimo datume da bi ih opet dole punili
        frame.getComboxDatum().removeAllItems();
        frame.getComboxDatum().addItem("Odaberi");
        frame.getComboxDatum1().removeAllItems();
        frame.getComboxDatum1().addItem("Odaberi");
        frame.getComboxDatum2().removeAllItems();
        frame.getComboxDatum2().addItem("Odaberi");
        frame.getComboxDatum3().removeAllItems();
        frame.getComboxDatum3().addItem("Odaberi");
        //

        String racun = "";
        int rezultat = 0, cena = 0;
        Usluge trenutni;
        boolean nasao;

        String stikliranoFU = frame.getComboxFU().getSelectedItem().toString();
        String stikliranoNega = frame.getComboxNegaTela().getSelectedItem().toString();
        String stikliranoMasaza = frame.getComboxMasaza().getSelectedItem().toString();
        String stikliranoKU = frame.getComboxKU().getSelectedItem().toString();

        if (stikliranoFU.equals("Odaberi")
                && stikliranoNega.equals("Odaberi")
                && stikliranoMasaza.equals("Odaberi")
                && stikliranoKU.equals("Odaberi")) {
            JOptionPane.showMessageDialog(null, "Odaberite nešto!");
        } else {
            //frizerske
            ArrayList<Usluge> lista = frame.getUvoz().getlistaFrizerske();

            for (Usluge P : lista) {
                if (stikliranoFU.equals(P.getUsluga())) {
                    cena = Integer.parseInt(P.getCena());
                    if (!poredjenje(P, lista)) {
                        frame.getComboxDatum().addItem(P.getDatum());
                    }
                    // dodavanje cene pored frizerske usluge
                
                    frame.getfUcena().setText("" + cena + " dinara ");
                    frame.getfUcena().setSize(100, 20);
                    frame.getfUcena().setLocation(350, 30);
                    frame.getPanel1().add(frame.getfUcena());

                }
            }
            rezultat += cena;
            cena = 0;

            //kozmeticke
            lista = frame.getUvoz().getlistaKozmeticke();

            for (Usluge P : lista) {
                if (stikliranoKU.equals(P.getUsluga())) {
                    cena = Integer.parseInt(P.getCena());
                    if (!poredjenje(P, lista)) {
                        frame.getComboxDatum1().addItem(P.getDatum());
                    }
              
                    frame.getkUcena().setText("" + cena + " dinara ");
                    frame.getkUcena().setSize(100, 20);
                    frame.getkUcena().setLocation(350, 95);
                    frame.getPanel1().add(frame.getkUcena());

                }
            }
            rezultat += cena;
            cena = 0;

            //masaza
            lista = frame.getUvoz().getlistaMasaza();

            for (Usluge P : lista) {
                if (stikliranoMasaza.equals(P.getUsluga())) {
                    cena = Integer.parseInt(P.getCena());
                    if (!poredjenje(P, lista)) {
                        frame.getComboxDatum2().addItem(P.getDatum());
                    }
                   
                    frame.getMasazacena().setText("" + cena + " dinara ");
                    frame.getMasazacena().setSize(100, 20);
                    frame.getMasazacena().setLocation(350, 160);
                    frame.getPanel1().add(frame.getMasazacena());
                }
            }
            rezultat += cena;
            cena = 0;

            //negaTela
            lista = frame.getUvoz().getlistaNega();

            for (Usluge P : lista) {
                if (stikliranoNega.equals(P.getUsluga())) {
                    cena = Integer.parseInt(P.getCena());
                    if (!poredjenje(P, lista)) {
                        frame.getComboxDatum3().addItem(P.getDatum());
                    }

                  
                    frame.getNegaTelacena().setText("" + cena + " dinara ");
                    frame.getNegaTelacena().setSize(100, 20);
                    frame.getNegaTelacena().setLocation(350, 225);
                    frame.getPanel1().add(frame.getNegaTelacena());
                }
            }
            rezultat += cena;
            cena = 0;

            if (frame.getDodatniKupon().isSelected()) {
                rezultat = rezultat - (rezultat / 10); //cena sa kuponom
            }

            racun = racun + rezultat;
         
            frame.getLabelaRezultat().setText(racun + " dinara ");
            frame.getLabelaRezultat().setSize(100, 20);
            frame.getLabelaRezultat().setLocation(500, 260);
            frame.getPanel1().add(frame.getLabelaRezultat());
            frame.setContentPane(frame.getPanel1());

            frame.getRezervisi().setEnabled(true);
            frame.getOdustani().setVisible(true);
            frame.getComboxOdustani().setVisible(true);
        }

    }
}
