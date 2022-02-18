
public class Kodutöö_1 {
    public static void main(String[] args) {
        System.out.println(kõnniteeOlud("jääs"));

        System.out.println(täisÖöpäevadeArv(454));

        System.out.println(kolmnugaKontroll(3,10,12));

    }
    //Funktsioon1- Mitu minutit tuleb arvestada trammile minekuks.
    public static String kõnniteeOlud(String kõnnitee){
        if(kõnnitee.equals("jääs")){
            return "Varu trammile minekuks 10 minutit";
        } else {
            return "Varu trammile minekuks 7 minutit";
        }
    }
    //Funktsioon2- Mitu täis ööpäeva on antud tundides.
    public static double täisÖöpäevadeArv(int tundideArv) {
        return tundideArv / 24 ;
    }

    //Funktsioon3- Kas antud küljepikkustega kolmnurk eksisteerib.
    public static String kolmnugaKontroll(int külg1, int külg2, int külg3) {
        if(külg1 < külg2 + külg3 && külg2 < külg1 + külg3 && külg3 < külg1 + külg2){
            return "Kolmnurk eksisteerib"; //Kolnurgas iga kahe külje pikkuste summa on suurem kui kolmanda külje pikkus
        } else {
            return "Selliste küljepikkustega kolmunrka ei eksisteeri";
        }
    }
}

