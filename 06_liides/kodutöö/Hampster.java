package kodutöö;

public class Hampster implements Pet{
    String name;
    int age;

    public Hampster (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void play() {
        System.out.println( name + " mängib");
    }

    @Override
    public void eat() {
        System.out.println( name + " sööb");
    }

    @Override
    public void name() {
        System.out.println("Hamstri nimi: " + name);
    }

    @Override
    public void age() {
        System.out.println("Hamstri vanus: " + age);
    }
}
