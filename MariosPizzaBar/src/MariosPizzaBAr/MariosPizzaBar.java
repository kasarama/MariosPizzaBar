package MariosPizzaBAr;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MariosPizzaBar {

    /*Laves en loop som spørger bruger om han vil lave en new order og hvis ja,
    hvilken pizza skal tilføjes, og som lukker order og sender den videre
    når bruger giver en kommend til det (som for eksampel"send") 
    og går tilbage til at starte på en ny order
     */
    public static void main(String[] args) {
        //Opret pizzaListe
        
        
        PizzaFactory pizza1 = new PizzaFactory(1);
        System.out.println(pizza1.toString());
        PizzaFactory pizza2 = new PizzaFactory(2);
        System.out.println(pizza2.toString());
        PizzaFactory pizza3 = new PizzaFactory(3);
        System.out.println(pizza3.toString());
        Ordrer ordrer1 = new Ordrer();
        ordrer1.addPizza(pizza1);
        
        System.out.println(ordrer1);
        
        // TODO code application logic here
        Menu x = new Menu();
        try {
            x.readFiles();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(MariosPizzaBar.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
           
        }
        /*Pizza p = new Pizza(1,"ok","ok",1);
        Ordrer o = new Ordrer();
        BestillingsListe bl= new BestillingsListe();
*/
        
    }
    
}
