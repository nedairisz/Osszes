/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feladatok;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Beka {
    static Scanner sc = new Scanner(System.in);
    
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_GREEN = "\u001B[32m";
    public static void main(String[] args) {
        String beka = "🐸";//beka.length() --> 2 karakter
        String level = "__";//levél, amin a breki ülhet
        String[] jatekter = {beka, beka, beka, level};
        
        /* MEGJELENÍTÉS */
        //játékelemek:
        System.out.print(ANSI_GREEN);
        for (int i = 0; i < jatekter.length; i++) {
            System.out.printf("%2s ", jatekter[i]);
        }
        System.out.println(ANSI_RESET);//sortörés
        //választási opciók:
        for (int i = 0; i < jatekter.length; i++) {
            System.out.printf("%-2s ", i+1);
        }
        System.out.println("");//sortörés
        
        /* BEKÉRÉS */
        //nincs ellenőrizve a bevitel!
        System.out.print("Melyikkel lépsz (1..4): ");
        int hely = sc.nextInt();
        
        /* MOZGATÁS */
        /* megoldásnak NEM JÓ, mert csak megjelenít,
         * de NEM ALGORITMIZÁLVA!!!
        */
        if(hely == 1 || hely == 4){
            System.out.println("Ezzel nem léphetsz!");
        }else if(hely == 2){
            jatekter[0] = beka;
            jatekter[1] = level;
            jatekter[2] = beka;
            jatekter[3] = beka;
        }else if(hely == 3){
            jatekter[0] = beka;
            jatekter[1] = beka;
            jatekter[2] = level;
            jatekter[3] = beka;
        }
        
        
        /* MEGJELENÍTÉS */
        //játékelemek:
        System.out.print(ANSI_GREEN);
        for (int i = 0; i < jatekter.length; i++) {
            System.out.printf("%2s ", jatekter[i]);
        }
        System.out.println(ANSI_RESET);//sortörés
        //választási opciók:
        for (int i = 1; i < jatekter.length; i++) {
            System.out.printf("%-2s ", i);
        }
        System.out.println("");//sortörés
    }
}
