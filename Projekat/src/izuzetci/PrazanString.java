/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izuzetci;

/**
 *
 * @author Julija
 */
public class PrazanString extends Exception {

    public PrazanString(String poruka) {
        super(poruka);
    }

    public PrazanString() {
        super("Niste popunili sva polja!");
    }
    
    
}
