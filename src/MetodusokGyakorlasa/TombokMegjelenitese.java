
package MetodusokGyakorlasa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class TombokMegjelenitese {
    public static void main(String[] args) throws IOException {
        tombokMegjelenitese();
    }

    private static void tombokMegjelenitese() throws IOException {
        konzolraEgysorban();
        konzolraTablazatban();
        fajlbaTablazatban();
    }
    
    private static char[] betukkelFeltolt(int db){
        char[] betuk = new char[db];
        for (int i = 0; i < db; i++) {
            betuk[i] = (char)(i+97);//ascii 97 --> a
        }
        return betuk;
    }

    private static String egymasutanSzokozzel(char[] tomb) {
        String kimenet = "";
        for (int i = 0; i < tomb.length; i++) {
            kimenet += tomb[i] + " ";
        }
        return kimenet;
    }
    
    private static String egymasutanVesszovel(char[] tomb) {
        String kimenet = tomb[0] + "";
        for (int i = 1; i < tomb.length; i++) {
            kimenet += ", " + tomb[i];
        }
        return kimenet;
    }
    
    private static String matrixForma(char[] tomb, int oszlop) {
        String kimenet = "";
        for (int i = 0; i < tomb.length; i++) {
            if(i != 0 && i % oszlop == 0){
                kimenet += "\n";
            }
            kimenet += tomb[i] + " ";
        }
        return kimenet;
    }
    
    private static String matrixForma(char[] tomb) {
        return matrixForma(tomb, 3);
    }
    
    /* nincs sortörés, a KEVESEBB AZ TÖBB elv miatt:
    ha kiírtuk, már nem lehet leszedni, 
    ahol kell, ott az uzenet átadásánál belerakunk szóközt
    */
    private static void konzolraIr(String uzenet) {
        System.out.print(uzenet);
    }

    private static void konzolraEgysorban() {
        konzolraIr("tömb elemei 1 sorban:\n");
        
        char[] betuk = {'a', 'b', 'c', 'd'};
        String kimenet;
        /* ahogy szeretném: szóközzel, vesszővel... */
        //kimenet = egymasutanSzokozzel(betuk);   
        kimenet = egymasutanVesszovel(betuk);
        konzolraIr(kimenet + "\n");
    }
    
    private static void konzolraTablazatban() {
        konzolraIr("tömb elemei táblázatban:\n");
        
        char[] betuk = betukkelFeltolt(7); 
        /* több sorban, külön változóval: */
        //String kimenet = matrixForma(betuk);
        //konzolraIr(kimenet + "\n");
        
        /* egy sorban, egymásba ágyazott metódusokkal: */
        konzolraIr(matrixForma(betuk) + "\n");
    }
    
    private static void fajlbaIr(String fajlNeve, String mit) throws IOException {
        Path hova = Paths.get(fajlNeve);
        Files.write(hova, mit.getBytes());
    }

    private static void fajlbaTablazatban() throws IOException {
        char[] betuk = betukkelFeltolt(17); 
        //String kimenet = egymasutanSzokozzel(betuk);
        String kimenet = matrixForma(betuk, 5) + "\n";
        fajlbaIr("betukMatrixban.txt", kimenet);
    }

    
}
