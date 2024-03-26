
package MetodusokGyakorlasa;

import java.util.Scanner;


public class Bmi {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        bmiFeladat();
    }

    private static void bmiFeladat() {
        kiir("BMI kiszámítása");
        int m = beker("Testmagasság (cm)[100;200]",100,200);
        int t = beker("Testtömeg (kg)[40;150]",40,150);
        double bmi = bmiSzamit(t,m);
        ertekeles(bmi, t,m);
    }

    private static void kiir(String szoveg) {
        System.out.print(szoveg);   
    }

    private static int beker(String szoveg, int also, int felso) {
        kiir(szoveg);
        int szam = sc.nextInt();
        while (szam < also || szam > felso){
        szam = sc.nextInt();
        }
        return szam;
    }

    private static double bmiSzamit(int t, int m) {
       return t/Math.pow(m/100.0, 2);
    }

    private static void ertekeles(double bmi, int t, int m) {
        String szoveg = "Ön " + m + " cm magas és "+t+" kg tömegű,\nígy BMI indexe: "+(double)((int)(bmi*100))/100+",\n";
        if (bmi < 20){
            szoveg+="Tehát ön sovány testalkatú";
        }
        else if (25 > bmi && bmi >= 20){
            szoveg+="Tehát ön normál testalkatú";
        }
        else if (30 > bmi && bmi >= 25){
            szoveg+="Tehát ön túlsúlyos testalkatú";
        }
        else if (40 > bmi && bmi >= 30){
            szoveg+="Tehát ön elhízott testalkatú";
        }else{
        szoveg += "Kórosan elhízott";
        }
        kiir(szoveg);
    }
}
