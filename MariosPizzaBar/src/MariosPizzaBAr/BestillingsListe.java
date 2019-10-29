package MariosPizzaBAr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BestillingsListe {

    ArrayList<Ordrer> bestillingsliste = new ArrayList();

    public BestillingsListe() {

    }

    //Udskriver alle skabte og gemte ordrer i ArrayListen "bestillingsliste".
    @Override
    public String toString() {
        String result = "";
        for (Ordrer o : bestillingsliste) {
            result += o.toString() + "\n";
        }
        return result;
    }

    //Tilføjer en skabt ordre til ArrayListen.
    public void addOrder(Ordrer o) {
        bestillingsliste.add(o);
    }

    //Fjerner en ordre fra ArrayListen.
    public void fjernOrdre(Ordrer o) {
        bestillingsliste.remove(o);
    }

    /*
    public void addOrdrerToArchive(){
        File file = new File("Arkiv.txt");
        try(BufferedWriter br =  new BufferedWriter(new FileWriter(file))){
            for (Ordrer ordrer: bestillingsliste){
                br.write(ordrer.toString());
                br.newLine();
            }
            
            
        } catch (IOException e){
            System.out.println("can't find file");
        }
    }
     */
    
    /*Find en skabt ordre i ArrayListen ud fra et givent nummer; ordrenummer.
    Bliver ikke brugt alene, men sammen med fjernOrdre ovenover for at fjerne
    en ordre fra ArrayListen.*/
    
    public Ordrer findEfterNummer(int n) {

        Ordrer tmpOrder = null;
        for (Ordrer order : bestillingsliste) {
            if (n == order.getNummer()) {
                tmpOrder = order;
            } else {
                System.out.println("Ordren findes ikke");
            }

        }
        return tmpOrder;
    }
}
