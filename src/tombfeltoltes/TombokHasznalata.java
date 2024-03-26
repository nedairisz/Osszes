/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tombfeltoltes;

/**
 *
 * @author user
 */
public class TombokHasznalata {
    public static void main(String[] args) {
        //indexek:     0       1        2
        //pyLista = ["egy", "kettő", "három"]
        
        String[] tomb = {"egy", "kettő", "három"};
        
        /* memória címet írja ki, nem a tartalmat: */
        System.out.println("tomb = " + tomb);
        
        /* a tömb mérete nem változtatható: */
        //tomb = {"nulla", "egy", "kettő", "három"};
        
        System.out.println("A tömb elemei:");
        for(int i=0; i < tomb.length; i++){
            /*d != java.lang.String IllegalFormatConversionException*/
            //System.out.printf("[%d. index] = %d\n", i, tomb[i]);
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        
        /* deklarálásnál a méret megadása és később feltöltve */
        /* mérete nem változhat, de új tömb lehet: */
        tomb = new String[4];//megadom az új méretet
        System.out.println("az üres tömb: ");//minden elem értéke: null
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("[%d. index]=%s\n", i, tomb[i]);
        }
        
        tomb[2] = "zwei";
        System.out.println("részben - németül- feltöltött tömb: ");
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("[%d. index]=%s\n", i, tomb[i]);
        }
        
        System.out.println("vegyesen feltöltött tömb: ");
        tomb[0] = "null";
        tomb[1] = "one";
        tomb[3] = "three";
         /*ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4*/
        //tomb[4] = "";
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("[%d. index]=%s\n", i, tomb[i]);
        }
        
        System.out.println("teljesen -angolul- feltöltött tömb: ");
        tomb[0] = "null";
        tomb[1] = "one";
        tomb[2] = "two";
        tomb[3] = "three";
        /*ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4*/
        //tomb[4] = "";

        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("[%d. index]=%s\n", i, tomb[i]);
        }
        
        System.out.println("\"null\" vagy null ?");
        /* String == REFERENCIA */
        if("null" == null){
            System.out.println("egyezik");
        }else{
            System.out.println("nem egyezik");
        }
        
        /* le sem fordítható: */
        /* ÉRTÉK == REFERENCIA */
        //if(0 == null){
    }
}
