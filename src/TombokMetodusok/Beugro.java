
package TombokMetodusok;

public class Beugro {
    public static void main(String[] args) {
        for (int i = 3; i >= -3; i--) {
//            int abs = i;
//            if(i < 0){
//                abs *= -1; 
//            }
            //System.out.printf("%d = %d\n", i , abs);
            System.out.printf("|%2d| = %d\n", i , Math.abs(i));
        }
        System.out.println("");
        
        final int M = 10;
        int[] tomb = new int[M];
        for (int i = 0; i < M; i++) {
            //tomb[i] = (int)(Math.random());//0
            //tomb[i] = (int)(Math.random()*10);//0..9
            //tomb[i] = (int)(Math.random()*(99-10+1)+10);//10..99
            //tomb[i] = (int)(Math.random()*45);//0..44
            //tomb[i] = (int)(Math.random()*45)*2;//0..88
            tomb[i] = (int)(Math.random()*45)*2+11;//11..99
        }
        
        //biztos legyen páros:
        tomb[M/2]++;  // tömb közepén található elem értékét növeli eggyel.
        
        for (int i = 0; i < M; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println("");
        
        int i = 0;
        while(!(tomb[i] % 2 == 0)){
            i++;
        }
        System.out.println("az 1. páros: " + tomb[i]);
    }
}
