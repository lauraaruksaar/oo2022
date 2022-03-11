public class Human1 {
    String nimi;
    int vanus;
    double pikkus;
    boolean mees;

    public Human1(String nimi, int vanus, double pikkus, boolean mees) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.pikkus = pikkus;
        this.mees = mees;
    }

    //public void sayHello(){
        //System.out.println(nimi + " Hello");
    //}
    //to ---> võtan toString() --> enter
    @Override
    public String toString() {
        return "Inimese andmed:" +
                "nimi:" + nimi +
                ", vanus:" + vanus +
                ", pikkus:" + pikkus +
                ", mees=" + mees + "."
                ;
    }
}
