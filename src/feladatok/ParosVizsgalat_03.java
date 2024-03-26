package feladatok;

public class ParosVizsgalat_03 {
    //psvm tab
    public static void main(String[] args) {
        final int DB = (int)(Math.random()*(25-15+1)+15);
        int[] paratlanok = new int[DB];
        
        /* feltöltés: */
        for (int i = 0; i < DB; i++) {
            //int szam = (int)(Math.random()*(100-11+1)+11);//szam--
            int szam = (int)(Math.random()*(99-10+1)+10);//szam++
            if(szam % 2 == 0){
                //szam--;
                szam++;
            }
            paratlanok[i] = szam;
        }
        
        /* legyen benne 1 páros: 
         * így lehet, hogy 100-as érték is lesz benne!
        */
        paratlanok[(int)(Math.random()*paratlanok.length)]++;
        
        /* kiírás: */
        for (int i = 0; i < DB; i++) {
            System.out.print(paratlanok[i] + " ");
        }
        System.out.println("");
        
        //kiválasztás
        int i = 0;
        while(!(paratlanok[i] % 2 == 0)){
            i++;
        }
        System.out.println("páros elem: " + paratlanok[i]);
    }
}
