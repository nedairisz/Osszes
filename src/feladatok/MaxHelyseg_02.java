package feladatok;

import java.util.Random;
import java.util.Scanner;

public class MaxHelyseg_02 {
    
    static Scanner sc = new Scanner(System.in, "latin2");
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        /* user meghatározza a helységek számát: */
        System.out.print("hány helység lesz: ");
        final int DB = sc.nextInt();
        sc.nextLine();//Az ENTER kiolvasása
        
        /* user feltölti a helységek tömböt az
        általa gondolt értékekkel
        */
        String[] helysegek = new String[DB];//üres tömb
        for (int i = 0; i < DB; i++) {
            System.out.print("hely neve: ");
            /* értékadás a tömb i. elemének: */
            helysegek[i] = sc.nextLine();
        }
        
        /* program generál véletlen értékeket a létszámhoz: */
        int[] letszamok = new int[DB];//üres tömb
        for (int i = 0; i < DB; i++) {
            /* értékadás a tömb i. elemének: */
            letszamok[i] = rnd.nextInt(850, 1_238);
        }
        
        //kiírás
        for (int i = 0; i < DB; i++) {
            String helys = helysegek[i];
            int letsz = letszamok[i];
            System.out.printf("%s: %d\n", helys, letsz);
        }
        
        /* TÉTELEK HASZNÁLATA */
        // maximumkiválasztás
        int m = 0;
        for (int i = 1; i < DB; i++) {
            if(letszamok[i] > letszamok[m]){
                m = i;
            }
        }
        String helys = helysegek[m];
        int letsz = letszamok[m];
        System.out.printf("A(z) %s rendelkezik a legtöbb lakossal (%d fő)!\n",helys, letsz);
        
        //eldöntés I.
        System.out.print("Van e pontosan 1000 fős helység: ");
        int i = 0;
        while(i < DB && !(letszamok[i] == 1000)){
            i++;
        }
        if(i < DB){
            System.out.println("van");
        }else{
            System.out.println("nincs");
        }
        
        //eldöntés II.
        System.out.print("Minden létszám > 1000: ");
        i = 0;
        while(i < DB && letszamok[i] > 1000){
            i++;
        }
        if(i >= DB){
            System.out.println("igen");
        }else{
            System.out.println("nem");
        }
    }
}
