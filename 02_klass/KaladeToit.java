public class KaladeToit {
    int lusikatToitu;

    public KaladeToit(int lusikatToitu){
        this.lusikatToitu = lusikatToitu;
    }

    public int ToiduKogus(int kalad) {
        if (kalad > 0 && kalad <= 2){
            lusikatToitu = 1;
        } else if (kalad > 2 && kalad <= 5){
            lusikatToitu = 2;
        } else {
            lusikatToitu = 3;
        }
        return lusikatToitu;
    }
}
