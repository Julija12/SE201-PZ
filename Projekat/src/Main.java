
import Frame1.Frame_1;
import java.io.IOException;
import uvoz_izvoz.Uvezi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julija
 */

public class Main {
    
    public static Frame_1 frame_1;
    
   
    
    public static void main(String[] args) throws IOException {
        frame_1 = new Frame_1(new Uvezi());
    }
    
}
