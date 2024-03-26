
package TombokMetodusok;


public class Magyarazat_StringMethods {
    
    public static void main(String[] args) {
        /* a, b, c betűkből hány féle sorrend rakható össze?
        abc , acb, bac, bca, cab, cba azaz 3! = 1*2*3 = 6
        H, _, V betűkből is 6 féle + X__, _X_, __X még 3, összesen 9 féle
        */
        
        /* indexek:       0123456 */
        String eredeti = "abc.12x";
        int hossz = eredeti.length();//7
        boolean vanBennePont = eredeti.contains(".");
        System.out.println("van benne \".\" : " + vanBennePont);

        boolean kezdAbc = eredeti.startsWith("abc");
        boolean vege2x = eredeti.endsWith("2x");
        System.out.println("abc-vel kezdődik: " + kezdAbc);
        System.out.println("2x a vége: " + vege2x);
        
        System.out.println("első: " + eredeti.charAt(0));
        /* StringIndexOutOfBoundsException: String index out of range: 7 */
        //System.out.println("utolsó: " + eredeti.charAt(hossz));
        System.out.println("utolsó: " + eredeti.charAt(hossz - 1));
        
//        eredeti = eredeti.substring(1);
//        System.out.println(eredeti);//bc.12x
        
        String uj = eredeti.substring(1);//bc.12x
        uj = eredeti.substring(0);//abc.12x
        uj = eredeti.substring(1);//bc.12x
        uj = eredeti.substring(4);//12x
        System.out.println(uj);
        
        uj = eredeti.substring(0, 3);//abc
        System.out.println(uj);//abc
        uj = eredeti.substring(4, 6);
        System.out.println(uj);//12
        uj = eredeti.substring(3, 3);//üres rész-sztring
        uj = eredeti.substring(0, 0);//üres rész-sztring
        System.out.println(uj);//semmit nem ír ki
        /* StringIndexOutOfBoundsException: begin 3, end 0, length 6 */
        //uj = eredeti.substring(3, 0);// EXCEPTION
        
        uj = eredeti.substring(3);//.12x
        uj = eredeti.substring(eredeti.indexOf("."));//.12x
        System.out.println(uj);
        
        int k = eredeti.indexOf(".") + 1;
        int v = eredeti.length() - 1;
        //uj = eredeti.substring(k);//12x
        uj = eredeti.substring(k, v);//12
        System.out.println(uj+2);//122
        /* csak kompatibilis típusok között lehet cast-olni */
        //int szam = (int)uj;//nem komp. típusok
        int szam = Integer.parseInt(uj);
        System.out.println(szam+2);//14

        uj = eredeti.replaceAll("12x", "hu");
        System.out.println(uj);//abc.hu
    }
}
