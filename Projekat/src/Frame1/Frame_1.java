/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame1;

import akcije.Izlaz;
import akcije.Izracunaj;
import Podaci.Usluge;
import akcije.Rezervacija;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.border.TitledBorder;
import uvoz_izvoz.Uvezi;  

/**
 *
 * @author Julija
 */
public class Frame_1 extends JFrame {

    private Uvezi uvoz;  


    private JPanel panel1 = new JPanel();
    private JPanel panelUsluge = new JPanel();
    private JPanel panelPopust = new JPanel();

    //za panel Usluge 
    private JLabel fU = new JLabel("Frizerske usluge");
    private JComboBox<String> comboxFU = new JComboBox<>();
    JLabel labelaRezultat = new JLabel("");
    JLabel fUcena = new JLabel("");
    JLabel kUcena = new JLabel("");
    JLabel masazacena = new JLabel("");
    JLabel NegaTelacena = new JLabel("");
    

    private JLabel kU = new JLabel("Kozmetičke usluge");
    private JComboBox<String> comboxKU = new JComboBox<>();

    private JLabel masaza = new JLabel("Masaža tela");
    private JComboBox<String> comboxMasaza = new JComboBox<>();

    private JLabel negaTela = new JLabel("Nega tela");
    private JComboBox<String> comboxNegaTela = new JComboBox<>();

    private JLabel datum = new JLabel("Datum");
    private JComboBox<String> comboxDatum = new JComboBox<>();

    private JLabel datum1 = new JLabel("Datum");
    private JComboBox<String> comboxDatum1 = new JComboBox<>();

    private JLabel datum2 = new JLabel("Datum");
    private JComboBox<String> comboxDatum2 = new JComboBox<>();

    private JLabel datum3 = new JLabel("Datum");
    private JComboBox<String> comboxDatum3 = new JComboBox<>();

    private JLabel cena = new JLabel("Cena: ");
    private JLabel racun = new JLabel("Vaš račun je: ");

    //za panelPopust
    private JRadioButton dodatniKupon = new JRadioButton("Dodatni kupon");
    private JRadioButton bezKupona = new JRadioButton("Bez kupona");
    private ButtonGroup grupaPopusta = new ButtonGroup();

    private JButton Rezervisi = new JButton("Rezerviši");
    private JButton Izracunaj = new JButton("Izračunaj");
    private JButton Odustani = new JButton("Odustani");
    private JComboBox<String> comboxOdustani = new JComboBox<>();

    public Frame_1(Uvezi u) throws IOException {    
        uvoz = u; 

        setTitle("Studio lepote LADY - Rezervacija");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setPanel1();
        popuni();

        setVisible(true);
    }

    public Uvezi getUvoz() {
        return uvoz;
    }

    public boolean poredimSobom(Usluge P, ArrayList<Usluge> lista) {
        
        //obezbedjujem da nema duplih naziva u combox
        Usluge trenutni = P;
        boolean nasao = false;
        for (Usluge Q : lista) {
            if (Q == trenutni) {
                break;
            }
            if (trenutni.getUsluga().equals(Q.getUsluga())) {
                nasao = true;
                break;
            }
        }
        return nasao;
        //
    }

    public void popuni() {
        ArrayList<Usluge> lista = uvoz.getlistaFrizerske();

        for (Usluge P : lista) {

            if (!poredimSobom(P, lista)) {
                comboxFU.addItem(P.getUsluga());
            }

        }
        lista = uvoz.getlistaKozmeticke();
        for (Usluge P : lista) {
            if (!poredimSobom(P, lista)) {
                comboxKU.addItem(P.getUsluga());
            }

        }
        lista = uvoz.getlistaMasaza();
        for (Usluge P : lista) {
            if (!poredimSobom(P, lista)) {
                comboxMasaza.addItem(P.getUsluga());
            }

        }
        lista = uvoz.getlistaNega();
        for (Usluge P : lista) {
            if (!poredimSobom(P, lista)) {
                comboxNegaTela.addItem(P.getUsluga());
            }

        }

    }

    public void setPanel1() {
        panel1.setBackground(new Color(255, 250, 230));
        panel1.setSize(600, 400);
        panel1.setLocation(0, 0);
        panel1.setLayout(null);

        //usluge i datum
        fU.setSize(100, 20);
        fU.setLocation(10, 10);
        panel1.add(fU);

        kU.setSize(120, 20);
        kU.setLocation(10, 75);
        panel1.add(kU);

        datum.setSize(80, 20);
        datum.setLocation(430, 50);
        panel1.add(datum);

        datum.setSize(80, 20);
        datum.setLocation(180, 10);
        panel1.add(datum);

        datum1.setSize(80, 20);
        datum1.setLocation(180, 75);
        panel1.add(datum1);

        datum2.setSize(80, 20);
        datum2.setLocation(180, 140);
        panel1.add(datum2);

        datum3.setSize(80, 20);
        datum3.setLocation(180, 205);
        panel1.add(datum3);

        masaza.setSize(80, 20);
        masaza.setLocation(10, 140);
        panel1.add(masaza);

        negaTela.setSize(80, 20);
        negaTela.setLocation(10, 205);
        panel1.add(negaTela);

        //cena
        cena.setSize(80, 20);
        cena.setLocation(350, 10);
        panel1.add(cena);

        racun.setSize(80, 20);
        racun.setLocation(420, 260);
        panel1.add(racun);

        comboxFU.setBackground(new Color(244, 244, 233));
        comboxFU.setSize(100, 20);
        comboxFU.setLocation(10, 30);
        panel1.add(comboxFU);
        comboxFU.addItem("Odaberi");

        comboxKU.setBackground(new Color(244, 244, 233));
        comboxKU.setSize(100, 20);
        comboxKU.setLocation(10, 95);
        panel1.add(comboxKU);
        comboxKU.addItem("Odaberi");

        comboxMasaza.setBackground(new Color(244, 244, 233));
        comboxMasaza.setSize(100, 20);
        comboxMasaza.setLocation(10, 160);
        panel1.add(comboxMasaza);
        comboxMasaza.addItem("Odaberi");

        comboxNegaTela.setBackground(new Color(244, 244, 233));
        comboxNegaTela.setSize(100, 20);
        comboxNegaTela.setLocation(10, 225);
        panel1.add(comboxNegaTela);
        comboxNegaTela.addItem("Odaberi");

        comboxDatum.setBackground(new Color(244, 244, 233));
        comboxDatum.setSize(100, 20);
        comboxDatum.setLocation(160, 30);
        panel1.add(comboxDatum);
        comboxDatum.addItem("Odaberi");

        comboxDatum1.setBackground(new Color(244, 244, 233));
        comboxDatum1.setSize(100, 20);
        comboxDatum1.setLocation(160, 95);
        panel1.add(comboxDatum1);
        comboxDatum1.addItem("Odaberi");

        comboxDatum2.setBackground(new Color(244, 244, 233));
        comboxDatum2.setSize(100, 20);
        comboxDatum2.setLocation(160, 160);
        panel1.add(comboxDatum2);
        comboxDatum2.addItem("Odaberi");

        comboxDatum3.setBackground(new Color(244, 244, 233));
        comboxDatum3.setSize(100, 20);
        comboxDatum3.setLocation(160, 225);
        panel1.add(comboxDatum3);
        comboxDatum3.addItem("Odaberi");

        //kupon
        panelPopust.setBackground(new Color(100, 100, 100));
        panelPopust.setBorder(new TitledBorder("KUPON: "));
        panelPopust.setLocation(10, 280);
        panelPopust.setSize(220, 90);
        panelPopust.setLayout(new GridLayout(2, 1));
        dodatniKupon.setBackground(new Color(255, 255, 255));
        bezKupona.setBackground(new Color(250, 255, 255));
        panelPopust.add(dodatniKupon);
        panelPopust.add(bezKupona);
        grupaPopusta.add(dodatniKupon);
        grupaPopusta.add(bezKupona);
        panel1.add(panelPopust);

        // Dugme rezervisi
        Rezervisi.setBackground(new Color(235, 235, 224));
        Rezervisi.setLocation(420, 340);
        Rezervisi.addActionListener(new Rezervacija(this));
        Rezervisi.setSize(150, 30);
        panel1.add(Rezervisi);
        Rezervisi.setEnabled(false); // prvo ugasen, pa ce ga dugme izracunaj upaliti

        
        //Dugme izracunaj
        Izracunaj.setBackground(new Color(235, 235, 224));
        Izracunaj.setLocation(420, 290);
        Izracunaj.addActionListener(new Izracunaj(this));
        Izracunaj.setSize(120, 30);
        panel1.add(Izracunaj);

        //Dugme Odustani
        Odustani.setBackground(new Color(235, 235, 224));
        Odustani.setLocation(20, 400);
        Odustani.addActionListener(new Izlaz(this));
        Odustani.setSize(150, 30);
        panel1.add(Odustani);
        Odustani.setVisible(false);

        comboxOdustani.setBackground(new Color(244, 244, 233));
        comboxOdustani.setSize(190, 20);
        comboxOdustani.setLocation(220, 405);
        panel1.add(comboxOdustani);
        comboxOdustani.addItem("Odaberi");
        comboxOdustani.addItem("Skupo je!");
        comboxOdustani.addItem("Ponudjeni termini ne odgovaraju.");
        comboxOdustani.addItem("Samo sam proverio cene.");
        comboxOdustani.setVisible(false);

        this.setContentPane(panel1);
        revalidate();

    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanelUsluge() {
        return panelUsluge;
    }

    public void setPanelUsluge(JPanel panelUsluge) {
        this.panelUsluge = panelUsluge;
    }

    public JPanel getPanelPopust() {
        return panelPopust;
    }

    public void setPanelPopust(JPanel panelPopust) {
        this.panelPopust = panelPopust;
    }

    public JLabel getfU() {
        return fU;
    }

    public void setfU(JLabel fU) {
        this.fU = fU;
    }

    public JComboBox<String> getComboxFU() {
        return comboxFU;
    }

    public void setComboxFU(JComboBox<String> comboxFU) {
        this.comboxFU = comboxFU;
    }

    public void setUvoz(Uvezi uvoz) {
        this.uvoz = uvoz;
    }


    public JLabel getkU() {
        return kU;
    }

    public void setkU(JLabel kU) {
        this.kU = kU;
    }

    public JComboBox<String> getComboxKU() {
        return comboxKU;
    }

    public void setComboxKU(JComboBox<String> comboxKU) {
        this.comboxKU = comboxKU;
    }

    public JButton getOdustani() {
        return Odustani;
    }

    public void setOdustani(JButton Odustani) {
        this.Odustani = Odustani;
    }

    public JLabel getMasaza() {
        return masaza;
    }

    public void setMasaza(JLabel masaza) {
        this.masaza = masaza;
    }

    public JComboBox<String> getComboxMasaza() {
        return comboxMasaza;
    }

    public void setComboxMasaza(JComboBox<String> comboxMasaza) {
        this.comboxMasaza = comboxMasaza;
    }

    public JLabel getNegaTela() {
        return negaTela;
    }

    public void setNegaTela(JLabel negaTela) {
        this.negaTela = negaTela;
    }

    public JComboBox<String> getComboxNegaTela() {
        return comboxNegaTela;
    }

    public void setComboxNegaTela(JComboBox<String> comboxNegaTela) {
        this.comboxNegaTela = comboxNegaTela;
    }

    public JLabel getDatum() {
        return datum;
    }

    public void setDatum(JLabel datum) {
        this.datum = datum;
    }

    public JComboBox<String> getComboxDatum() {
        return comboxDatum;
    }

    public void setComboxDatum(JComboBox<String> comboxDatum) {
        this.comboxDatum = comboxDatum;
    }

    public JRadioButton getDodatniKupon() {
        return dodatniKupon;
    }

    public void setDodatniKupon(JRadioButton dodatniKupon) {
        this.dodatniKupon = dodatniKupon;
    }

    public JRadioButton getBezKupona() {
        return bezKupona;
    }

    public void setBezKupona(JRadioButton bezKupona) {
        this.bezKupona = bezKupona;
    }

    public ButtonGroup getGrupaPopusta() {
        return grupaPopusta;
    }

    public void setGrupaPopusta(ButtonGroup grupaPopusta) {
        this.grupaPopusta = grupaPopusta;
    }

    public JButton getRezervisi() {
        return Rezervisi;
    }

    public void setRezervisi(JButton Rezervisi) {
        this.Rezervisi = Rezervisi;
    }

    public void ucitaj() {

    }

    public JLabel getDatum1() {
        return datum1;
    }

    public void setDatum1(JLabel datum1) {
        this.datum1 = datum1;
    }

    public JComboBox<String> getComboxDatum1() {
        return comboxDatum1;
    }

    public void setComboxDatum1(JComboBox<String> comboxDatum1) {
        this.comboxDatum1 = comboxDatum1;
    }

    public JLabel getDatum2() {
        return datum2;
    }

    public void setDatum2(JLabel datum2) {
        this.datum2 = datum2;
    }

    public JComboBox<String> getComboxDatum2() {
        return comboxDatum2;
    }

    public void setComboxDatum2(JComboBox<String> comboxDatum2) {
        this.comboxDatum2 = comboxDatum2;
    }

    public JLabel getDatum3() {
        return datum3;
    }

    public void setDatum3(JLabel datum3) {
        this.datum3 = datum3;
    }

    public JComboBox<String> getComboxDatum3() {
        return comboxDatum3;
    }

    public void setComboxDatum3(JComboBox<String> comboxDatum3) {
        this.comboxDatum3 = comboxDatum3;
    }

    public JLabel getCena() {
        return cena;
    }

    public void setCena(JLabel cena) {
        this.cena = cena;
    }

    public JLabel getRacun() {
        return racun;
    }

    public void setRacun(JLabel racun) {
        this.racun = racun;
    }

    public JButton getIzracunaj() {
        return Izracunaj;
    }

    public void setIzracunaj(JButton Izracunaj) {
        this.Izracunaj = Izracunaj;
    }

    public JComboBox<String> getComboxOdustani() {
        return comboxOdustani;
    }

    public void setComboxOdustani(JComboBox<String> comboxOdustani) {
        this.comboxOdustani = comboxOdustani;
    }

    public JLabel getLabelaRezultat() {
        return labelaRezultat;
    }

    public void setLabelaRezultat(JLabel labelaRezultat) {
        this.labelaRezultat = labelaRezultat;
    }

    public JLabel getfUcena() {
        return fUcena;
    }

    public void setfUcena(JLabel fUcena) {
        this.fUcena = fUcena;
    }

    public JLabel getkUcena() {
        return kUcena;
    }

    public void setkUcena(JLabel kUcena) {
        this.kUcena = kUcena;
    }

    public JLabel getMasazacena() {
        return masazacena;
    }

    public void setMasazacena(JLabel masazacena) {
        this.masazacena = masazacena;
    }

    public JLabel getNegaTelacena() {
        return NegaTelacena;
    }

    public void setNegaTelacena(JLabel NegaTelacena) {
        this.NegaTelacena = NegaTelacena;
    }
    

}
