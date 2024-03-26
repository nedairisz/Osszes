package tombfeltoltes;

import java.util.Scanner;

public class Bekeres {

    //static Scanner sc = new Scanner(System.in, "utf-8");
    //static Scanner sc = new Scanner(System.in, "latin1");//iso-8859-1
    //static Scanner sc = new Scanner(System.in, "iso-8859-2");//latin2
    //static Scanner sc = new Scanner(System.in, "windows-1250");
    static Scanner sc = new Scanner(System.in, "latin2");//iso-8859-2
    
    public static void main(String[] args) {
        /* 1.: programba drótozva: */
        //final int DB = 3;
        
        /* 2.: user dönti el: */
        System.out.print("név db: ");
        final int DB = sc.nextInt();
        String[] nevek = new String[DB];
        sc.nextLine();//Az ENTER kiolvasása
        
        /* feltöltés: */
        for (int i = 0; i < DB; i++) {
            System.out.printf("név (%d/%d): ", i+1, DB);
            String nev = sc.nextLine();
            nevek[i] = nev;
        }
        
        /* kiírás: */
        for (int i = 0; i < DB; i++) {
            System.out.println(nevek[i]);
        }
    }
    
}
