public class Main {
    public static void main(String[] args) {
        Human one = new Human("Johannes", 19, 187, true );
        Human two = new Human("Jüri", 212, 2123, true);

        System.out.println(one);
        System.out.println(two);

        one.sayHello();
        two.sayHello();

        // main meetod 1 class
        // uus klass, kus on vähemalt 2 muutujat, vähemalt 1 funktsioon, toString() funktsioom
        // main meetodis on seda vähemalt 2 korda välja kutsutud
        // funktsiooni välja kutsuda
    }
}
