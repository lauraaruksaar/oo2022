public class Sahver {
        Ladu ladu;
        int toodeteArv;


    public Sahver(Ladu ladu, int toodeteArv){
        this.ladu = ladu;
        this.toodeteArv = toodeteArv;

    }

    public String laoSeis() {
        return "Sahvris olevad toiduained [" + this.ladu + "]. Sahvris on kokku " + this.toodeteArv + " toodet.";
    }
}
