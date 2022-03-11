
public class KaladeAkvaarium {
    int akvaarium;
    KaladeToit lusikatToitu;

    public KaladeAkvaarium(int akvaarium, KaladeToit lusikatToitu) {
        this.akvaarium = AkvaariumiSuurus(2);
        this.lusikatToitu = lusikatToitu;

    }

    public int AkvaariumiSuurus(int kalad) {

        if (kalad > 0 && kalad <= 2){
            akvaarium = 20;
        } else if (kalad > 2 && kalad <= 5){
            akvaarium = 60;
        } else {
            akvaarium = 80;
        }
        return akvaarium;
    }

    public String vajalikTeave() {
        return "Antud arvule kaladele on vaja akvaariumit suuruses " + this.akvaarium + " liitrit ja süüa tuleb anda " + this.lusikatToitu + " lusikat";
    }
}
