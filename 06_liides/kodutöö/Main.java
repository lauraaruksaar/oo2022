package kodutöö;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Mirri", 5);
        Hampster hampster = new Hampster("RJ", 1);
        Fish fish = new Fish("Dubu", 1);
        cat.name();
        cat.age();
        cat.eat();

        hampster.name();
        hampster.eat();
        hampster.play();

        fish.name();
        fish.age();
        fish.eat();
    }
}