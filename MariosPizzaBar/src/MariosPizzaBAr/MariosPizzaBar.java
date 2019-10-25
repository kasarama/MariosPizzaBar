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
    public static void main(String[] args) throws FileNotFoundException {
        //Opret pizzaListe

        HovedMenu hm = new HovedMenu();
        hm.startProgram();
        /*PizzaFactory pizza1 = new PizzaFactory(1);
        System.out.println(pizza1);

        Menu x = new Menu();
        try {
            x.readFiles();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(MariosPizzaBar.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");

        }*/

    }

}
