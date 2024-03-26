
package TombokMetodusok;

public class KettoKockavalCsillaggal {
    public static void main(String[] args) {
        int[] dobasok = new int[13];//0..12 --> 2..12
        int db = 50;
        /* feltöltés: */
        for (int i = 0; i < 50; i++) {
            int dobas = (int)(Math.random()*11) + 2;
            dobasok[dobas]++;
        }
        
        /* maximum kiválasztás: */
        //a dobások gyakoriságainak tömbjében keresi meg azt az indexet, ahol a legnagyobb érték található.
        int maxIndex = 0;
        for (int i = 1; i < dobasok.length; i++) {
            if(dobasok[i] > dobasok[maxIndex]){
                maxIndex = i;
            }
        }
        int maxErtek = dobasok[maxIndex];
        
        /* megjelenítés: */
        final int MAX_CSILLAG = 40;
        for (int i = 2; i < dobasok.length; i++) {
            System.out.print(i + " ");
            int elofordulas = dobasok[i];
            double cs = (double)elofordulas / maxErtek * MAX_CSILLAG;
            for (int j = 0; j < cs; j++) {
                System.out.print("*");
            }
            System.out.println(" (" + elofordulas + " db)");
        }
    }
}
