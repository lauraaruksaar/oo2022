public class Sõiduk {
    String automark;
    String värv;
    int kütusekuluSajale;
    boolean auto;

        public Sõiduk(String automark, String värv, int kütusekuluSajale, boolean auto) {
            this.automark = automark;
            this.värv = värv;
            this.kütusekuluSajale = kütusekuluSajale;
            this.auto = auto;
        }

        public void KütusekuluHinnaKalkolaator(float teekonnaPikkus, float kütuseühikuHind){
            System.out.println(((teekonnaPikkus * kütusekuluSajale) / 100) * kütuseühikuHind);

        }
    @Override
    public String toString() {
        return "Sõiduk{" +
                "automark='" + automark + '\'' +
                ", värv=" + värv +
                ", kütusekuluSajale=" + kütusekuluSajale +
                ", sõidukitüüp=" + auto +
                '}';
    }
}
