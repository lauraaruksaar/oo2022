public class Main {
    public static void main(String[] args) {
        Human one = new Human("Johannes", 19, 187, true );
        Human two = new Human("Triin", 20, 168, false);
        Tervitus tervitus = new Tervitus(one, " Tere");
        Tervitus tervitus1 = new Tervitus(two, " Kena lõunat");
        String inimeseInfo = tervitus.inimeseInfo();
        String inimeseInfo1 = tervitus1.inimeseInfo();
        System.out.println(inimeseInfo);
        System.out.println(inimeseInfo1);





    }
}
