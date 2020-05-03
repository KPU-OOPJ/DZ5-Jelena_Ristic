package zadatak5;
import java.io.*;
public class WriteAutobus {
    public static void main(String[] args) {
        Autobus a = new Autobus();
        a.uvozPutnika(0);
        a.uvozPutnika(19);
        a.uvozPutnika(49);
        
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("autobus.txt")));
            for (int i = 0; i < (a.brSlobodnihMesta()+ a.brZauzetihMesta()); i++) {
                if (a.sediste[i])
                    out.println("Sedište broj " + (i+1) + " je slobodno.");
                else 
                    out.println("Sedište broj " + (i+1) + " je zauzeto.");
            }
            out.close();
        }
        catch (Exception e) {
            System.out.println("Greška: " + e.getMessage());
        }
    }
}
