package MariosPizzaBAr;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MariosPizzaBar {

    /*Laves en loop som spørger bruger om han vil lave en new order og hvis ja,
    hvilken pizza skal tilføjes, og som lukker order og sender den videre
    når bruger giver en kommend til det (som for eksampel"send") 
    og går tilbage til at starte på en ny order
     */
    public static void main(String[] args) throws IOException {
        //Opret pizzaListe

        HovedMenu hm = new HovedMenu();
        hm.startProgram();
     //  OrderFactory of= new OrderFactory();
       //of.makeOrdrerObject();
      //* of.makeOrdrerObject();*/
      
      /* PizzaFactory myFactory = new PizzaFactory("Data/Pizzaer.txt");
        Pizza tmpPizza = myFactory.getPizzaByPosition(3);
        System.out.println(tmpPizza.toString());
        OrderFactory myOrderFactory = new OrderFactory();

        Ordrer order = myOrderFactory.orderMaker();

        Pizza pizza1 = myFactory.getPizzaByPosition(8);
        Pizza pizza2 = myFactory.getPizzaByPosition(2);
        Pizza pizza3 = myFactory.getPizzaByPosition(3);
        Pizza pizza4 = myFactory.getPizzaByPosition(5);
        order.addPizza(pizza1);
        order.addPizza(pizza2);
        order.addPizza(pizza3);
        order.addPizza(pizza4);

        System.out.println(order.toString());
        System.out.println("Sum of order:" + order.sum());*/

       
      
      
        /*   
        Menu x = new Menu();
        try {
            x.readFiles();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(MariosPizzaBar.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");

        }
         */
    }

}
