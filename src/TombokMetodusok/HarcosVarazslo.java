
package TombokMetodusok;


public class HarcosVarazslo {
    public static void main(String[] args) {
        final int MERET = 3; 
        
        for (int i = 0; i < 10; i++) {
            int harPoz = (int)(Math.random()*MERET);//0,1,2
            int varPoz = (int)(Math.random()*MERET);//0,1,2
            /* elágazáshoz, sztringművelethez: */
            //String palya = "___";
            /* tömbhöz: */
            String[] palya = {"_", "_", "_"};
            if (harPoz == varPoz) {
                /* csak elágazásokkal: */
//                if (harPoz == 0) {
//                    palya = "X__";
//                } else {
//                    palya = harPoz == 1 ? "_X_" : "__X";
//                }

                /* String műveletekkel: */
//                palya = palya.substring(0, harPoz) + "X" + palya.substring(harPoz+1);
                
                /* tömbbel: */
                palya[harPoz] = "X";
            } else {
                /* csak elágazásokkal: */
//                if (harPoz == 0) {
//                    if (varPoz == 1) {
//                        palya = "HV_";
//                    } else { //else if (varPoz == 2){
//                        palya = "H_V";
//                    }
//                } else if (harPoz == 1) {
//                    if (varPoz == 0) {
//                        palya = "VH_";
//                    } else { //else if (varPoz == 2){
//                        palya = "_HV";
//                    }
//                } else { //else if(harPoz == 2)
//                    if (varPoz == 0) {
//                        palya = "V_H";
//                    } else { //else if (varPoz == 1){
//                        palya = "_VH";
//                    }
//                }

                /* String műveletekkel: */
//                palya = palya.substring(0, harPoz) + "H" + palya.substring(harPoz+1);
//                palya = palya.substring(0, varPoz) + "V" + palya.substring(varPoz+1);
                /* tömbbel: */
                palya[harPoz] = "H";
                palya[varPoz] = "V";

            }
            /* KIÍRÁSOK: */
            /* elágazáshoz, sztring műveletekhez: */
//            System.out.println(palya);
            /* tömbhöz: */
            for (int j = 0; j < palya.length; j++) {
                System.out.print(palya[j]);
            }
            System.out.println("");
        }
    }
}
