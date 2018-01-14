/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame1;

import Podaci.Bean;
import akcije.Otkazi;
import akcije.Potvrda;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Julija
 */
public class Frame_2 extends JFrame {

    private Bean bean;
    private Frame_1 frame;

    //panel
    private JPanel panel = new JPanel();

    //ime
    private JLabel prezime = new JLabel("Prezime: ");
    private JTextField textFieldPrezime = new JTextField();

    //prezime
    private JLabel ime = new JLabel("Ime: ");
    private JTextField textFieldIme = new JTextField();

    //email
    private JLabel labEmail = new JLabel("Email: ");
    private JTextField textFieldEmail = new JTextField();

    //rezervacija
    private JLabel labVasaRezervacija = new JLabel("Vaša rezervacija: ");
    private JTextArea textArea = new JTextArea();

    //otkazi.potvrdi dugme
    private JButton butOtkazi = new JButton("Otkaži");
    private JButton butPotvrda = new JButton("Potvrdi");

    public Frame_2(Frame_1 f) {
        frame = f;
        bean = new Bean(frame);

        setTitle("Potvrda");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setPanel();
        this.add(panel);
        setResizable(false);
        setVisible(true);
    }

    public void setPanel() {
        //panel
        panel.setBackground(new Color(255, 250, 230));
        panel.setSize(400, 400);
        panel.setLocation(0, 0);
        panel.setLayout(null);

        //prezime
        prezime.setLocation(10, 10);
        prezime.setSize(70, 30);
        panel.add(prezime);

        textFieldPrezime.setBackground(new Color(235, 235, 234));
        textFieldPrezime.setLocation(80, 15);
        textFieldPrezime.setSize(120, 20);
        panel.add(textFieldPrezime);

        //ime
        ime.setLocation(10, 40);
        ime.setSize(40, 30);
        panel.add(ime);

        textFieldIme.setBackground(new Color(235, 235, 224));
        textFieldIme.setLocation(80, 45);
        textFieldIme.setSize(120, 20);
        panel.add(textFieldIme);

        //rezervacija
        labVasaRezervacija.setLocation(90, 110);
        labVasaRezervacija.setSize(120, 30);
        panel.add(labVasaRezervacija);

        textArea.setBackground(new Color(235, 235, 224));
        textArea.setLocation(80, 140);
        textArea.setSize(250, 120);
        textArea.setEditable(false);

        //popunjavanje textArea
        if (!bean.getStikliranoFU().equals("Odaberi")) {
            if (!bean.getStikliranoDU().equals("Odaberi")) {
                textArea.append(bean.getStikliranoFU() + " " + bean.getStikliranoDU() + " " + bean.getCenaFu() + "\n");
            } else {
                textArea.append(bean.getStikliranoFU() + " " + bean.getCenaFu() + "\n");
            }
        }
        if (!bean.getStikliranoKU().equals("Odaberi")) {
            if (!bean.getStikliranoDKU().equals("Odaberi")) {
                textArea.append(bean.getStikliranoKU() + " " + bean.getStikliranoDKU() + " " + bean.getCenaKu() + "\n");
            } else {
                textArea.append(bean.getStikliranoKU() + " " + bean.getCenaKu() + "\n");
            }
        }
        if (!bean.getStikliranoMasaza().equals("Odaberi")) {
            if (!bean.getStikliranoDMasaza().equals("Odaberi")) {
                textArea.append(bean.getStikliranoMasaza() + " " + bean.getStikliranoDMasaza() + " " + bean.getCenaMasaza() + "\n");
            } else {
                textArea.append(bean.getStikliranoMasaza() + " " + bean.getCenaMasaza() + "\n");
            }
        }
        if (!bean.getStikliranoNega().equals("Odaberi")) {
            if (!bean.getStikliranoDNega().equals("Odaberi")) {
                textArea.append(bean.getStikliranoNega() + " " + bean.getStikliranoDNega() + " " + bean.getCenaNega() + "\n");
            } else {
                textArea.append(bean.getStikliranoNega() + " " + bean.getCenaNega() + "\n");
            }
        }
        panel.add(textArea);

        //email
        labEmail.setLocation(10, 80);
        labEmail.setSize(120, 20);
        panel.add(labEmail);

        textFieldEmail.setBackground(new Color(235, 235, 224));
        textFieldEmail.setLocation(80, 80);
        textFieldEmail.setSize(120, 20);
        panel.add(textFieldEmail);

        //buttons
        butOtkazi.setBackground(new Color(235, 235, 224));
        butOtkazi.setLocation(10, 325);
        butOtkazi.setSize(90, 30);
        butOtkazi.addActionListener(new Otkazi(this));
        panel.add(butOtkazi);

        butPotvrda.setBackground(new Color(235, 235, 224));
        butPotvrda.setLocation(300, 325);
        butPotvrda.setSize(90, 30);
        butPotvrda.addActionListener(new Potvrda(frame, this));
        panel.add(butPotvrda);

    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getPrezime() {
        return prezime;
    }

    public void setPrezime(JLabel prezime) {
        this.prezime = prezime;
    }

    public JTextField getTextFieldPrezime() {
        return textFieldPrezime;
    }

    public void setTextFieldPrezime(JTextField textFieldPrezime) {
        this.textFieldPrezime = textFieldPrezime;
    }

    public JLabel getIme() {
        return ime;
    }

    public void setIme(JLabel ime) {
        this.ime = ime;
    }

    public JTextField getTextFieldIme() {
        return textFieldIme;
    }

    public void setTextFieldIme(JTextField textFieldIme) {
        this.textFieldIme = textFieldIme;
    }

    public JLabel getLabEmail() {
        return labEmail;
    }

    public void setLabEmail(JLabel labEmail) {
        this.labEmail = labEmail;
    }

    public JTextField getTextFieldEmail() {
        return textFieldEmail;
    }

    public void setTextFieldEmail(JTextField textFieldEmail) {
        this.textFieldEmail = textFieldEmail;
    }

    public JLabel getLabVasaRezervacija() {
        return labVasaRezervacija;
    }

    public void setLabVasaRezervacija(JLabel labVasaRezervacija) {
        this.labVasaRezervacija = labVasaRezervacija;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public JButton getButOtkazi() {
        return butOtkazi;
    }

    public void setButOtkazi(JButton butOtkazi) {
        this.butOtkazi = butOtkazi;
    }

    public JButton getButPotvrda() {
        return butPotvrda;
    }

    public void setButPotvrda(JButton butPotvrda) {
        this.butPotvrda = butPotvrda;
    }

}
