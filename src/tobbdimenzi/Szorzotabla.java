
package tobbdimenzi;


public class Szorzotabla {
    public static void main(String[] args) {
        final int MERET = 5;
        /* létrehozás: */
        int[][] tabla = new int[MERET+1][MERET+1];
        
        /* feltöltés: */
        for (int sor = 0; sor <= MERET; sor++) {  //Az sor változó az aktuális sor sorszámát fogja tartalmazni.
            for (int oszl = 0; oszl <= MERET; oszl++) { //Az oszl változó az aktuális oszlop sorszámát fogja tartalmazni.
                tabla[sor][oszl] = sor*oszl;
                /*Ebben a sorban a tabla tömb adott elemét inicializáljuk a szorzótáblában szereplő értékkel. 
                Az aktuális sor és oszlop sorszámát megszorozzuk egymással, és az eredményt eltároljuk a megfelelő helyen a tabla tömbben.*/
            }
        }
        
        /* megjelenítés: */
        for (int i = 0; i <= MERET; i++) {
            for (int j = 0; j <= MERET; j++) {
                System.out.printf("%4d", tabla[i][j]); //Ez a sor kiírja a tabla tömb aktuális i sorát és j oszlopát. 
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
