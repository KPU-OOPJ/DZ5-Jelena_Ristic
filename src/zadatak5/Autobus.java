package zadatak5;
import java.util.*;
public class Autobus {
    boolean[] sediste = new boolean[50];
    
    public Autobus() {
        Arrays.fill(sediste, true);
    }
    
    public void uvozPutnika(int brSedista){
        if (sediste[brSedista]) {
            sediste[brSedista] = false;
        }
        else {
            throw new AutobusException("Došlo je do greške, sedište broj " + (brSedista + 1) + " je već zauzeto.");
        } 
    }
    
    public boolean provera() {
        for(int i = 0; i < 50; i++) 
            if (sediste[i])
                return true;
        return false;
    }
    
    public int brSlobodnihMesta() {
        int br = 0;
        for(int i = 0; i < 50; i++)
            if (sediste[i])
                br++;
        return br;
    }
    
    public int brZauzetihMesta() {
        int br = 0;
        for (int i = 0; i < 50; i++)
            if(!sediste[i])
                br++;
        return br;
    }
    
    public void status() {
        for (int i = 0; i < 50; i++) {
            if (sediste[i])
                System.out.println("Sedište broj " + (i+1) + " je slobodno.");
            else
                System.out.println("Sedište broj " + (i+1) + " je zauzeto.");
        }
    }
}