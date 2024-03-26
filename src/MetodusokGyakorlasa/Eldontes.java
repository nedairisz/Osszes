
package MetodusokGyakorlasa;

import java.util.Random;

public class Eldontes {
    
    private static Random rnd = new Random();

    /* sortörés platform függetlenül: */
    private static final String SEP = System.lineSeparator();

    public static void main(String[] args) {
        eldontesFeladatok();
    }

    private static void eldontesFeladatok() {
        int[] szamok = feltolt(4);
        konzolraIr(vesszovelElvalaszt(szamok) + SEP);

        vanBennePrim(szamok);
        mindPrim(szamok);
    }

    private static int[] feltolt(int db) {
        int[] tomb = new int[db]; //Az int[] tomb rész meghatározza, hogy az tomb változó egy egész számokat tartalmazó tömb lesz. Az new int[db] rész létrehozza a tömböt, és megadja a tömb méretét, amely a db változó értékével lesz megegyező. Ezzel a sorral egy üres tömb jön létre, amely megfelelő méretű ahhoz, hogy tárolja az db méretű egész számokat.
        for (int i = 0; i < db; i++) {
            tomb[i] = rnd.nextInt(Integer.MAX_VALUE); //véletlenszerű egész számot generál a 0 és Integer.MAX_VALUE között
        }
        /* DEBUG */
        tomb[0] = 11;
        tomb[1] = 19;
        tomb[2] = 2;
        tomb[3] = 2;
        /* DEBUG vége */

        return tomb;
    }

    private static String vesszovelElvalaszt(int[] tomb) {
        String kimenet = tomb[0] + "";
        for (int i = 1; i < tomb.length; i++) {
            kimenet += ", " + tomb[i];
        }

        return kimenet;
    }
    
    private static boolean primE(int szam) {
            if (szam < 2) {
                return false;
            } else {
                int i = 2;
                while (i <= Math.sqrt(szam) && !(szam % i == 0)) {
                    i++;
                }
                return i > Math.sqrt(szam);
            }
        }
    
    private static void konzolraIr(String uzenet) {
        System.out.print(uzenet);
    }
    
    private static void vanBennePrim(int[] tomb) {
        /*
        int i = 0; 
        int N = tomb.length; */
        int i = 0, N = tomb.length;
        while (i < N && !(primE(tomb[i]))) {  //igaz ha nem prím
        }
        String kimenet = i < N ? "Van" : "NINCS";
        /*String kimenet;
        if (i < N) {
            kimenet = "Van";
        } else {
            kimenet = "NINCS";
        }*/
        kimenet += " benne prím";
        konzolraIr(kimenet + SEP);
    }

    private static void mindPrim(int[] tomb) {
        int i = 0, N = tomb.length;
        while (i < N && (primE(tomb[i]))) {  //igaz ha prím
            i++;
        }
        String kimenet = i >= N ? "Mind" : "Nem mind";
        kimenet += " prím";
        konzolraIr(kimenet + SEP);
    }
    
    

    
}
