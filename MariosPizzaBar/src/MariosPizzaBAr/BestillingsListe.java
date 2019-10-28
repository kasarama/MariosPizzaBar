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

    @Override
    public String toString() {
        String result = "";
        for (Ordrer o : bestillingsliste) {
            result += o.toString() + "\n";
        }
        return result;
    }

    public void addOrder(Ordrer o) {
        bestillingsliste.add(o);
    }

    public void fjernOrdre(Ordrer o) {
        bestillingsliste.remove(o);

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
    }
    
    public Ordrer findEfterNummer(int n) {
        
    }
}
