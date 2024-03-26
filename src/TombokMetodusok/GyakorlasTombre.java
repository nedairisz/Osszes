
package TombokMetodusok;

public class GyakorlasTombre {
    
    public static void main(String[] args) {
        final int M = 9;
        //String szo = "abc";//3 elemű char tömb
        //String[] betuk = {"a", "\n", " ", ""};
        char[] betuk = {'a', '\n', ' '};//üres nem lehet
        
        /* ha nincs megadva új méret, akkor:
        ArrayIndexOutOfBoundsException: 
        Index 3 out of bounds for length 3
        */
        //betuk = {'x','x','x','x','x'};//csak inicializáláskor
        betuk = new char[M];
        betuk[0] = 'x';
        betuk[1] = 'x';
        betuk[2] = 'x';
        betuk[3] = 'x';
        betuk[4] = 'x';
        
        System.out.print("tömb hossza:" + betuk.length);
        System.out.println(" (az üreseket nem írja ki)");
        /* az üreseket nem írja ki betuk.length-nél sem! */
        for (int i = 0; i < M; i++) {
            System.out.print(betuk[i] + " ");
        }
        System.out.println("");
        
        System.out.println("3*3-as mátrix, rendezve:");
        /* megjelenítés: */
        for (int i = 0; i < M; i++) {
            if(i != 0 && i % 3 == 0){
                System.out.println("");
            }
            System.out.print(betuk[i] + " ");
        }
        System.out.println("");
        
        System.out.println("3*3-as mátrix, fix-keverve:");
        /* keverés kézzel: */
        int[] sorrend = {7,8,3,2,4,6,5,0,1};
        /* megjelenítés: */
        for (int i = 0; i < M; i++) {
            if(i != 0 && i % 3 == 0){
                System.out.println("");
            }
            System.out.print(betuk[sorrend[i]] + " ");
        }
        System.out.println("");
        
        System.out.println("3*3-as mátrix, din-keverve:");
        for (int i = 0; i < M; i++) {
            sorrend[i] = i;//{0,1,2,3,4,5,6,7,8};
        }
        /* keverés algoritmikusan: */
        for (int i = 0; i < M; i++) {
            //csere:
            int t = (int)(Math.random()*M);
            int tmp = sorrend[i];
            sorrend[i] = sorrend[t];
            sorrend[t] = tmp;
        }
        /* megjelenítés: */
        for (int i = 0; i < M; i++) {
            if(i != 0 && i % 3 == 0){
                System.out.println("");
            }
            System.out.print(betuk[sorrend[i]] + " ");
        }
        System.out.println("");
    }
}
