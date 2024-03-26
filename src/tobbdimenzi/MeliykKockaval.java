
package tobbdimenzi;

public class MeliykKockaval {
    public static void main(String[] args) {
        final int DOBAS_DB = 1000;
        final int KOCKA_OLDAL = 6;
        int[][] dobasok = new int[KOCKA_OLDAL + 1][KOCKA_OLDAL + 1];
        
        /* feltöltés: */
        for (int i = 0; i < DOBAS_DB; i++) {
            int dobas1 = (int)(Math.random()*KOCKA_OLDAL)+1;
            int dobas2 = (int)(Math.random()*KOCKA_OLDAL)+1;
            dobasok[dobas1][dobas2]++;
        }
        
        /* megjelenítés: */
        for (int i = 0; i <= KOCKA_OLDAL; i++) {
            for (int j = 0; j <= KOCKA_OLDAL; j++) {
                System.out.printf("%3d", dobasok[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
