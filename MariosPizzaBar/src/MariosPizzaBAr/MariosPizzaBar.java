/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizzaBAr;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Magdalena
 */
public class MariosPizzaBar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu x = new Menu();
        try {
            x.readFiles();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(MariosPizzaBar.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
        }
    }
    
}
