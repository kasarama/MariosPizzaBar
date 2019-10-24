package MariosPizzaBAr;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MariosPizzaBar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Opret pizzaListe
        Ordrer ordrer = new Ordrer();
        System.out.println(ordrer);
        // TODO code application logic here
        Menu x = new Menu();
        try {
            x.readFiles();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(MariosPizzaBar.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
           
        }
        Pizza p = new Pizza(1,"ok","ok",1);
        Ordrer o = new Ordrer();
        BestillingsListe bl= new BestillingsListe();

        
    }
    
}
