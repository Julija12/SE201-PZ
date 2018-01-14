/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Podaci;

/**
 *
 * @author Julija
 */
public class Usluge {
    
    private String usluga;
    private String datum;
    private String cena;

    public Usluge(String u, String d,  String c) {
        usluga = u; datum = d;  cena = c;
    }
    public String getUsluga(){
        return usluga;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }


    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }
}
