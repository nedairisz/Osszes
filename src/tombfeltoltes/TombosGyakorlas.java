/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tombfeltoltes;

/**
 *
 * @author user
 */
public class TombosGyakorlas {
    //psvm tab
    public static void main(String[] args) {
        /* TÖMBÖK LÉTREHOZÁSA */
        //-- ha deklaráláskor tudjuk az értékeket:
//        String[] nevek = {"Ede", "Pál", "Xénia"};
//        int[] korok = {22, 31, 19};
        
        //-- ha deklaráláskor NEM tudjuk az értékeket:
        final int TOMB_MERET = 3;
        String[] nevek;//deklarálás
        int[] korok;//deklarálás
        
        //nevek = new String[3];//inicializálás
        nevek = new String[TOMB_MERET];//inicializálás
        nevek[0] = "Ede";//értékadás
        nevek[1] = "Pál";//értékadás
        nevek[2] = "Xénia";//értékadás
        
        //korok = new int[3];
        korok = new int[TOMB_MERET];//inicializálás
        korok[0] = 101;//értékadás
        korok[1] = 9;//értékadás
        korok[2] = 21;//értékadás
        
        System.out.println("Versenyzők kora:");
        int osszKor = 0;
        //for (int i = 0; i < nevek.length; i++) {
        for (int i = 0; i < TOMB_MERET; i++) {
            String nev = nevek[i];
            int kor = korok[i];
            System.out.printf("%5s kora: %3d év\n", nev, kor);
            osszKor += kor;
        }
        
        /* int / int = int: */
        //double atlag = 1.0*osszKor / korok.length;
        double atlag = (double)osszKor / korok.length;
        
        /* d != java.lang.Double --> IllegalFormatConversionException: */
        //System.out.printf("a korok átlaga: %d\n", atlag);
        System.out.printf("a korok átlaga: %.2f év\n", atlag);
        
        /* osszKor továbbra is int: */
        //osszKor = 3.14;
    }
}
