public class Ladu {
    String kuivained;
    String piimatooted;
    String lihatooted;
    String pagaritooted;

    public Ladu(String kuivained, String piimatooted, String lihatooted, String pagaritooted){
        this.kuivained = kuivained;
        this.piimatooted = piimatooted;
        this.lihatooted = lihatooted;
        this.pagaritooted = pagaritooted;
    }

    @Override
    public String toString() {
        return
                "kuivained:'" + kuivained + '\'' +
                ", piimatooted:'" + piimatooted + '\'' +
                ", lihatooted:'" + lihatooted + '\'' +
                ", pagaritooted:" + pagaritooted;
    }
}
