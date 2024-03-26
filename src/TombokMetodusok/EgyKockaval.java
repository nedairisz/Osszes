
package TombokMetodusok;

import java.util.Random;
import java.util.Scanner;

public class EgyKockaval {
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        
        System.out.print("dobások száma: ");
        int dobasokSzama = sc.nextInt();
        int[] dobasok = new int[7];//0..6 -> 1..6
        
        for (int i = 0; i < dobasokSzama; i++) {
            int dobas;
            dobas = (int)(Math.random() * 6) +1;
            dobas = rnd.nextInt(6)+1;
            dobas = rnd.nextInt(1, 7);
            dobasok[dobas]++;
        }
        System.out.printf("Statisztika %d dobásnál 1 hatopldalú kockával:\n", dobasokSzama);
        
        for (int i = 1; i < dobasok.length; i++) {
            System.out.printf("%d volt %5d darab\n", i, dobasok[i]);
        }
        System.out.println("");
    }
}
