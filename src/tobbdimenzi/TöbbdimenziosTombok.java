
package tobbdimenzi;

public class TöbbdimenziosTombok {
    public static void main(String[] args) {
        final int SOR_DB = 3;
        final int OSZL_DB = 5;
        /* létrehozás: */
        int[][] negyzetes = new int[SOR_DB][OSZL_DB];
        
        /* közvetlen elérés: */
        negyzetes[1][2] = 1; // A 2.sor és 3.oszlop koordinátájú helyen 1 fog szerepelni
        
        /* megjelenítés: */
        System.out.println("négyzetes:");
        for (int sor = 0; sor < SOR_DB; sor++) {
            /* adott sorban lévő tömb memóriacíme: */
            //System.out.println(negyzetes[sor]);
            for (int oszl = 0; oszl < OSZL_DB; oszl++) {
                System.out.print(negyzetes[sor][oszl] + " "); //Ez a sor kiírja az adott sor és oszlop koordinátájának értékét a konzolra, szóközzel elválasztva.
            }
            System.out.println("");
        }
        System.out.println("");
        
        /* létrehozás: */
        int[][] fureszes = new int[7][];
        
        /* közvetlen elérés: */
        /* NullPointerException: */
        //fureszes[1][2] = 1;
        
        /* feltöltés: */
        for (int sor = 0; sor < fureszes.length; sor++) {
            /* adott sorban nincs semmi, null: */ 
            //System.out.println(fureszes[sor]);
            //for (int oszl = 0; oszl < 3; oszl++) {
                /* NullPointerException: */
                //System.out.println(fureszes[sor][oszl]);
                //fureszes[sor] = new int[3];//3 oszlop minden sorban
                //fureszes[sor] = new int[3+sor];//lépcsőzetes
                int db = (int)(Math.random()*5)+3;
                fureszes[sor] = new int[db];//fűrészes
                /* Ez a sor létrehoz egy új egész tömböt az adott sor indexű helyen a fureszes tömbben, amelynek mérete db. 
                Tehát minden sorban létrehoz egy új egész tömböt, amelynek mérete véletlenszerűen 3 és 7 között van. */
            //}
        }
        
        /* közvetlen elérés: */
        fureszes[1][2] = 1;
        fureszes[2][1] = 1;
        
        /* megjelenítés: */
        System.out.println("fűrészes:");
        int sorDb = fureszes.length; // "megfoja/lekéri" a fureszes tömb sorainak számát 
        for (int sor = 0; sor < sorDb; sor++) {
            int oszlDb = fureszes[sor].length; // Ez a sor meghatározza az aktuális sor oszlopainak számát.
            for (int oszl = 0; oszl < oszlDb; oszl++) {
                System.out.print(fureszes[sor][oszl] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
