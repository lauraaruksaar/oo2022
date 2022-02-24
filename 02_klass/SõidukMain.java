public class SõidukMain {
    public static void main(String[] args) {
        Sõiduk one = new Sõiduk("Hyundai", "Hall", 2, true );
        Sõiduk two = new Sõiduk("Honda", "valge", 3, true);

        System.out.println(one);
        System.out.println(two);

        one.KütusekuluHinnaKalkolaator(80,2);
        two.KütusekuluHinnaKalkolaator(80,1);

    }
}
