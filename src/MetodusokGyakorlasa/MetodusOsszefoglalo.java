package metodusosszefoglalo;

public class MetodusOsszefoglalo {

    public static void main(String[] args) {
        muveletek();
    }

    private static void muveletek() {
        nehanyOsszeadasKonzolon();
        egyKivonasKonzolon();
    }

    private static void nehanyOsszeadasKonzolon() {
        osszeadas2Szammal();
        osszeadas3Szammal();
        osszeadasTombbel();
    }

    private static void osszeadas3Szammal() {
        verzio1();
        verzio2();
        verzio3();
    }

    private static int osszeadas(int[] tomb) {
        int gy = 0;
        for (int i = 0; i < tomb.length; i++) {
            gy += tomb[i];
        }
        return gy;
    }

    private static int osszeadas(int a, int b) {
        //int a = 3;
        //int b = 4;
        //System.out.println(a+"+"+b+"="+(a+b));
        //kiir(a+"+"+b+"="+(a+b));
        
        //int osszeg = a+b;
        //return osszeg;
        
        //return a+b;
        return osszeadas(new int[]{a,b});
    }
    
    private static int osszeadas(int a, int b, int c) {
        //return a+b+c;
        return osszeadas(new int[]{a,b,c});
    }
    
    
    
    private static int kivonas(int a, int b) {
        //int a = 3;
        //int b = 4;
        //System.out.println(a+"-"+b+"="+(a-b));
        //kiir(a+"-"+b+"="+(a-b));
        
        return a-b;
    }
    
    static void kiir(String uzenet){
        //System.out.println(uzenet);
        System.out.print(uzenet);
    }


    static String egyenletOsszeallito(int[] tomb, String sep){
        String gy = "" + tomb[0]; //// Először inicializál egy üres Stringet (gy), majd hozzáadja a tomb első elemét. Az üres karakterláncot a "" + rész adja hozzá, ami szükséges a tomb[0]-hoz történő konvertáláshoz String típusra.
        for (int i = 1; i < tomb.length; i++) {
            gy += sep+tomb[i];
        }
        return gy;
    }

    static String egyenletOsszeallito(int[] tomb){
        return egyenletOsszeallito(tomb, "+");
    }
    
    

    private static void verzio1() {
        int osszeg = osszeadas(1, 2);
        //String kimenet = "%d+%d".formatted(1,2);
        //osszeg = osszeadas(osszeg, 3);
        //kimenet += "+%d=%d".formatted(3,osszeg);
        //kiir(kimenet);
        String kimenet = egyenletOsszeallito(new int[]{1,2});
        kiir(kimenet + "=" + osszeg + "\n");
        
    }

    static void verzio2(){
        int a = 5, b = 6, c = 7;
        int osszeg = osszeadas(a, osszeadas(b, c));
        //String kimenet = "%d+%d+%d=%d".formatted(a,b,c,osszeg);
        //kiir(kimenet);
        
        String kimenet = egyenletOsszeallito(new int[]{a,b,c});
        kiir(kimenet + "=" + osszeg + "\n");
    }
    
    static void verzio3(){
        int a = 5, b = 6, c = 7;
        int osszeg = osszeadas(++a, b++, ++c);
        //String kimenet = "%d+%d+%d=%d".formatted(a,b,c,osszeg);
        //kiir(kimenet);
        
        String kimenet = egyenletOsszeallito(new int[]{a,b,c});
        kiir(kimenet + "=" + osszeg + "\n");
    }
    
    
    private static void osszeadasTombbel() {
        int[] szamok = new int[]{1,2,3,4,5};
        int osszeg = osszeadas(szamok);
        String kimenet = egyenletOsszeallito(szamok);
        kiir(kimenet + "=" + osszeg + "\n");
    }
    
    private static void osszeadas2Szammal() {
        int osszeg = osszeadas(3,4);
        //String kimenet = "%d+%d=%d".formatted(3,4,osszeg);
        //kiir(kimenet);
        
        String kimenet = egyenletOsszeallito(new int[]{3,4});
        kiir(kimenet + "=" + osszeg + "\n");
    }

    private static void egyKivonasKonzolon() {
        int a = 3, b = 4;
        //kiir("%d-%d=%d".formatted(a,b,kivonas(a,b)));
        
        String kimenet = egyenletOsszeallito(new int[]{a,b}, "-");
        kiir(kimenet + "=" + osszeadas(a,b) + "\n");
    }
    
    
}
