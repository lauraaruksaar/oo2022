/*
Tähed

* Loo liides, mille ainus meetod saab sisendiks tähe ning väljastab selle tähe esinemise arvu. Loo realiseeriv klass sõna tarbeks.
    Koosta automaattestid töö kontrolliks näitamaks a, p ja e-tähtede arvu sõnas pere.

* Loo liidest realiseeriv klass Lause. Lauselt saab lisaks küsida sõnade arvu ning Sõna-klassi eksemplaride massiivi.
    Koosta rakendus, kus saab ette anda lause ning väljastatakse a-tähtede arv terves lauses ning igas sõnas eraldi.
    Koosta automaattest lause a-tähtede arvu kontrolli õigsuse kohta.

* Kõik lausetes leidunud eri sõnad lisatakse faili. Rakenduse väljundis näidatakse, millised sõnad on sisendlausest uued ning millised juba varem olemas olnud.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Sisesta täht, mida tahad sõnast leida");
        String word = "mesilane";
        Scanner scan = new Scanner(System.in);
        String sõna = scan.next();
        char c = sõna.charAt(0);

        int vastus = t2htedeEsinemiseArv(word, c);
        System.out.println("Sõnas esineb tähte " + c + ", " + vastus + " korda.");



        /*System.out.println("Sisesta lause, kust tahad leida a tähe esinemise arvu");
        Scanner scan2 = new Scanner(System.in);
        String sentence = scan2.next();*/
        String sentence = "siin lauses ei ole kolm a tähte";

        int vastus2 = aT2heEsinemineLauses(sentence);
        System.out.println("Lauses esineb a tähte " + vastus2 + " korda.");

        int vastus3 = s6naEsinemineLauses(sentence);
        System.out.println("Lauses on " + vastus3 + " sõna.");

        mituAT2hteOnIgaLauseS6nas(sentence);


        FileWriter writer = new FileWriter("s6nad.txt");
        writer.write(sentence);
        writer.close();
    }

    public static int t2htedeEsinemiseArv(String s6na, char t2ht) {
        int loendur = 0;
        for (int i = 0; i < s6na.length(); i++) {
            if (s6na.charAt(i) == t2ht) {
                loendur++;
            }
        }
        return loendur;
    }

    public static int s6naEsinemineLauses(String lause){
        String[] words = lause.split(" ");
        return words.length;
    }

    public static int aT2heEsinemineLauses(String lause){
        char aT2ht = 'a';
        int aT2heLoendur = 0;
        //lause = lause.replaceAll("\\s", "");
        for (int j = 0; j < lause.length(); j++) {
            if (lause.charAt(j) == aT2ht) {
                aT2heLoendur++;
            }
        }
        return aT2heLoendur;
    }

    public static void mituAT2hteOnIgaLauseS6nas(String str){
        char[] t2hed = str.toCharArray();
        for (int i = 0; i < t2hed.length; i++) {
            String s = "";
            while (i < t2hed.length && t2hed[i] == 'a') {
                s = s + t2hed[i];
                i++;
            }

            if (s.length() > 0)
                System.out.println(Arrays.toString(t2hed) + "->" + s.length());
        }
    }

}





