//* Failist loetakse kaks arvu ning väljastatakse nende jagamise tulemus.
//* Lisaks eelmisele kontrollitakse, et ei jagataks nulliga. Jagatava alla kirjutatakse vastuse esimese numbri korrutis jagajaga.
//* Joonistatakse kasutaja antud arvude kirjalik jagamine etappide kaupa, kus on näha, millised korrutamised ja jagamised töö käigus tekivad.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class KirjalikJagamine {
    public static void main(String[] args) throws IOException {
        String arv1 = failistLugemine().get(0);
        String arv2 = failistLugemine().get(1);
        int jagatav = Integer.parseInt(arv1);
        int jagaja = Integer.parseInt(arv2);
        Object vastus = jagamine();


        System.out.println(jagatav + " / " + jagaja + " = " + vastus);
        System.out.println(esimeseNumbriKorrutisJagajaga());
        System.out.println(väljaKirjutis());
    }


    public static String väljaKirjutis() throws IOException {
        String arv1 = failistLugemine().get(0);
        String arv2 = failistLugemine().get(1);
        int jagatav = Integer.parseInt(arv1);
        int jagaja = Integer.parseInt(arv2);
        int vastus = (int) jagamine();
        int jagamiseVastus = (int) jagamine();
        String numberString = "" + jagamiseVastus;
        char firstLetterchar = numberString.charAt(0);
        int firstDigit = Integer.parseInt("" + firstLetterchar);
        int korrutamisVastus = esimeseNumbriKorrutisJagajaga();

        return  "\n" + "Arvutus protsess:" +
                "\n" + "Jagatav: " + jagatav +
                "\n" + "Jagaja: " + jagaja +
                "\n" + "Tehe: " + jagatav + " / " + jagaja + " = " + vastus +
                "\n" + "\n" + "Vastuse esimene number: " + firstDigit +
                "\n" + "Jagaja: " + jagaja +
                "\n" + "Tehe: " + firstDigit + " * " + jagaja + " = " + korrutamisVastus;

    }

    public static int esimeseNumbriKorrutisJagajaga() throws IOException {
        String arv2 = failistLugemine().get(1);
        int jagaja = Integer.parseInt(arv2);
        int jagamiseVastus = (int) jagamine();
        String numberString = "" + jagamiseVastus;
        char firstLetterchar = numberString.charAt(0);
        int firstDigit = Integer.parseInt("" + firstLetterchar);
        int vastus = firstDigit * jagaja;
        return vastus;

    }

    public static Object jagamine() throws IOException {
        String arv1 = failistLugemine().get(0);
        String arv2 = failistLugemine().get(1);
        int jagatav = Integer.parseInt(arv1);
        int jagaja = Integer.parseInt(arv2);

        if (jagatav != 0 && jagaja != 0){
            return jagatav / jagaja;
        } else {
            return "Nulliga ei saa jagada";
        }
    }

    public static List<String> failistLugemine() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("numbrid.txt")
        );
        String rida = br.readLine();
        return List.of(rida.split(","));
    }


}
