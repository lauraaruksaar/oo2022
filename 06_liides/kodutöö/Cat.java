package kodutöö;

public class Cat implements Pet {
    String name;
    int age;

    public Cat (String name, int age) {
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
        System.out.println("Kassi nimi: " + name);
    }

    @Override
    public void age() {
        System.out.println("Kassi vanus: " + age);
    }
}
