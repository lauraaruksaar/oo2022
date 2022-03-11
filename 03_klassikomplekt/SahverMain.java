
public class SahverMain {
    public static void main(String[] args) {
        Ladu ladu = new Ladu("tatar", "või", "hakkliha", "sai");
        Sahver sahver = new Sahver(ladu, 5);
        String sahvriInfo = sahver.laoSeis();
        System.out.println(sahvriInfo);
    }
}
