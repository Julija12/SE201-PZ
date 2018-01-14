/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvoz_izvoz;

import java.io.*;
import java.util.ArrayList;
import Podaci.Usluge;
import akcije.Izlaz;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julija
 */
public class Uvezi {

    public static final String frizerske = "Frizerske", kozmeticke = "Kozmeticke", masaza = "Masaza", nega = "Nega";
    ArrayList<Usluge> listaFrizerske, listaKozmeticke, listaMasaza, listaNega;

    public ArrayList<Usluge> getlistaFrizerske() {
        return listaFrizerske;
    }

    public ArrayList<Usluge> getlistaKozmeticke() {
        return listaKozmeticke;
    }

    public ArrayList<Usluge> getlistaMasaza() {
        return listaMasaza;
    }

    public ArrayList<Usluge> getlistaNega() {
        return listaNega;
    }

    public Uvezi() throws FileNotFoundException, IOException {
        listaFrizerske = new ArrayList<>();
        listaKozmeticke = new ArrayList<>();
        listaMasaza = new ArrayList<>();
        listaNega = new ArrayList<>();
        try {
            String linija;
            String[] podaci;

            BufferedReader fin = new BufferedReader(new FileReader("usluge.txt")); //datoteka

            while ((linija = fin.readLine()) != null) {

                switch (linija) {
                    case frizerske:
                        while (!(linija = fin.readLine()).equals("")) {
                            podaci = linija.split(",");
                            listaFrizerske.add(new Usluge(podaci[0], podaci[1], podaci[2]));
                        }
                        break;
                    case kozmeticke:
                        while (!(linija = fin.readLine()).equals("")) {
                            podaci = linija.split(",");
                            listaKozmeticke.add(new Usluge(podaci[0], podaci[1], podaci[2]));
                        }
                        break;
                    case masaza:
                        while (!(linija = fin.readLine()).equals("")) {
                            podaci = linija.split(",");
                            listaMasaza.add(new Usluge(podaci[0], podaci[1], podaci[2]));
                        }
                        break;
                    case nega:
                        while (!(linija = fin.readLine()).equals("")) {
                            podaci = linija.split(",");
                            listaNega.add(new Usluge(podaci[0], podaci[1], podaci[2]));
                        }
                        break;
                    default:
                        break;
                }

            }
            fin.close();
      } catch (FileNotFoundException ex) {
            Logger.getLogger(Izlaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Izlaz.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
