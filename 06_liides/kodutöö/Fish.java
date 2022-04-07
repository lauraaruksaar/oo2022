package kodutöö;

public class Fish implements Pet{
    String name;
    int age;

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void play() {
        System.out.println(name + " mängib");
    }

    @Override
    public void eat() {
        System.out.println(name + " sööb");
    }

    @Override
    public void name() {
        System.out.println("Kala nimi: " + name);
    }

    @Override
    public void age() {
        System.out.println("Kala vanus: " + age);
    }
}
