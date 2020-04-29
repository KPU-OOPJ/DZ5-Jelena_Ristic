**Napravite javne klase AutobusException, Autobus i WriteAutobus sa sledećim uslovima:**

a)	Klasa AutobusException predstavlja neproveravani izuzetak (nasleđuje klasu RuntimeException) i ima:
-	Javni konstruktor koji kao parametar prima poruku greške i poziva odgovarajući konstruktor nadklase prosleđujući mu parametar.

b)	Klasa Autobus koja ima: 
-	Atribut koji predstavlja niz sedišta u autobusu. Svako sedište može da bude slobodno ili zauzeto. Ako je slobodno, vrednost odgovarajućeg elementa niza je TRUE, a ako je zauzeto, onda je FALSE. Autobus ima tačno 50 sedišta. 
-	Konstruktor koji postavlja vrednost svih sedišta iz niza na slobodna (TRUE). 
-	Metodu za uvođenje putnika u autobus. Ova metoda prima kao ulazni argument broj sedišta na koje bi trebalo uvesti putnika (brojevi sedišta su od 0 do 49). Ako je sedište slobodno (TRUE), sedište postaje zauzeto (FALSE) a ako je već bilo zauzeto, baciti izuzetak klase AutobusException sa odgovarajućom porukom. 
-	Metodu koja proverava da li ima slobodnih mesta u autobusu. Metoda vraća TRUE ako ima slobodnih mesta, u suprotnom FALSE. 
-	Metodu koja vraća broj slobodnih mesta u autobusu. 
-	Metodu koja vraća broja zauzetih mesta u autobusu. 
-	Metodu koja ispisuje status svakog sedišta iz autobusa u obliku “Sedište broj ## je slobodno” ili “Sedište broj ## je zauzeto”. 

c)	Glavna klasa WriteAutobus koja kreira jedan objekat klase Autobus i uvodi u njega tri putnika: na prvo, dvadeseto i poslednje mesto u autobusu. Posle toga, koristeći klasu PrintWriter upisati podatke o statusu svih mesta u autobusu u tekstualni fajl “autobus.txt” u fomatu “Sedište broj ## je slobodno” ili “Sedište broj ## je zauzeto”.
