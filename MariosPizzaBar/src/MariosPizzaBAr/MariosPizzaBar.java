package MariosPizzaBAr;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MariosPizzaBar {

    public static void main(String[] args) {
        //Opret pizzaListe
        Ordrer ordrer = new Ordrer();
        System.out.println(ordrer);
        Ordrer o2 = new Ordrer();
        System.out.println(o2);
        Pizza p1 = new Pizza(2,"Sofie","peperoni, skinke, ost",70);
        Pizza p2 = new Pizza(4,"benjamin","tomat, ost, gorgonzola, champignon og groen peber",80);
        System.out.println(p1.toString());
        p1.toString();
        System.out.println("");
        ordrer.tilføjPizza(p1);
        ordrer.tilføjPizza(p2);
        System.out.println(ordrer.toString());
        System.out.println("");
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
