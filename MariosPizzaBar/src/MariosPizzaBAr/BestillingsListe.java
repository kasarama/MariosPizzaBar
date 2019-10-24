package MariosPizzaBAr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BestillingsListe {


    ArrayList<Ordrer> bestillingsliste = new ArrayList();
    
    public void addOdrer(Ordrer o) {

        bestillingsliste.add(o);
        File file = new File("Arkiv.txt");
        try(BufferedWriter br =  new BufferedWriter(new FileWriter(file))){
            for (Ordrer o: bestillingsliste){
                br.write(o.toString);
                br.newLine();
            }
            
            
        } catch (IOException e){
            System.out.println("can't find file");
        }
    }
    
    public void fjernOrdre(Ordrer o) {
        
    }
}
