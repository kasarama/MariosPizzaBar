package MariosPizzaBAr;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
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
     /*   PizzaFactory myFactory = new PizzaFactory("Data/Pizzaer.txt");
        Pizza tmpPizza = myFactory.getPizzaByPosition(3);
      //  System.out.println(tmpPizza.toString());
        OrderFactory myOrderFactory = new OrderFactory();
        BestillingsListe bestillinger = new BestillingsListe();
        Ordrer order = myOrderFactory.orderMaker();
        Ordrer order2 = myOrderFactory.orderMaker();

        Pizza pizza1 = myFactory.getPizzaByPosition(8);
        Pizza pizza2 = myFactory.getPizzaByPosition(2);
        Pizza pizza3 = myFactory.getPizzaByPosition(3);
        Pizza pizza4 = myFactory.getPizzaByPosition(5);
        Pizza pizza5 = myFactory.getPizzaByPosition(19);
        Pizza pizza6 = myFactory.getPizzaByPosition(21);
        Pizza pizza7 = myFactory.getPizzaByPosition(10);

        order.addPizza(pizza1);
        order.addPizza(pizza2);
        order.addPizza(pizza3);
        order.addPizza(pizza4);
        order2.addPizza(pizza5);
        order2.addPizza(pizza6);
        order2.addPizza(pizza7);

      //  System.out.println(order.toString());
      //  System.out.println("Sum of order:" + order.sum());

      //  System.out.println("\n" + order2.toString());
        bestillinger.addOrder(order);
        bestillinger.addOrder(order2);

        System.out.println("Bestillings Liste:\n"+bestillinger.toString());

        Scanner scaner = new Scanner(System.in);
        System.out.println("skriv order nummer og tryk enter");
        int orderNummer = scaner.nextInt();
        
        
        bestillinger.fjernOrdre(bestillinger.findEfterNummer(orderNummer));

        System.out.println("Bestillings Liste:\n"+bestillinger.toString());
*/

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
