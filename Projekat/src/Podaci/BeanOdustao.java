/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Podaci;

import Frame1.Frame_1;

/**
 *
 * @author Julija
 */
public class BeanOdustao extends Bean {

    private String razlog;

    public String getRazlog() {
        return razlog;
    }

    public void setRazlog(String razlog) {
        this.razlog = razlog;
    }

    public BeanOdustao(Frame_1 frame) {
        super(frame);
        razlog = frame.getComboxOdustani().getSelectedItem().toString();
    }

    public String getStikliranoFU() {
        return stikliranoFU;
    }

    public void setStikliranoFU(String stikliranoFU) {
        this.stikliranoFU = stikliranoFU;
    }

    public String getStikliranoKU() {
        return stikliranoKU;
    }

    public void setStikliranoKU(String stikliranoKU) {
        this.stikliranoKU = stikliranoKU;
    }

    public String getStikliranoMasaza() {
        return stikliranoMasaza;
    }

    public void setStikliranoMasaza(String stikliranoMasaza) {
        this.stikliranoMasaza = stikliranoMasaza;
    }

    public String getStikliranoNega() {
        return stikliranoNega;
    }

    public void setStikliranoNega(String stikliranoNega) {
        this.stikliranoNega = stikliranoNega;
    }

    public String getStikliranoDU() {
        return stikliranoDU;
    }

    public void setStikliranoDU(String stikliranoDU) {
        this.stikliranoDU = stikliranoDU;
    }

    public String getStikliranoDKU() {
        return stikliranoDKU;
    }

    public void setStikliranoDKU(String stikliranoDKU) {
        this.stikliranoDKU = stikliranoDKU;
    }

    public String getStikliranoDMasaza() {
        return stikliranoDMasaza;
    }

    public void setStikliranoDMasaza(String stikliranoDMasaza) {
        this.stikliranoDMasaza = stikliranoDMasaza;
    }

    public String getStikliranoDNega() {
        return stikliranoDNega;
    }

    public void setStikliranoDNega(String stikliranoDNega) {
        this.stikliranoDNega = stikliranoDNega;
    }

    public String getCenaFu() {
        return cenaFu;
    }

    public void setCenaFu(String cenaFu) {
        this.cenaFu = cenaFu;
    }

    public String getUkupno() {
        return ukupno;
    }

    public void setUkupno(String ukupno) {
        this.ukupno = ukupno;
    }

    public String getCenaKu() {
        return cenaKu;
    }

    public void setCenaKu(String cenaKu) {
        this.cenaKu = cenaKu;
    }

    public String getCenaMasaza() {
        return cenaMasaza;
    }

    public void setCenaMasaza(String cenaMasaza) {
        this.cenaMasaza = cenaMasaza;
    }

    public String getCenaNega() {
        return cenaNega;
    }

    public void setCenaNega(String cenaNega) {
        this.cenaNega = cenaNega;
    }
    

}
