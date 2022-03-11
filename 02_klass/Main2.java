public class Main2 {
    public static void main(String[] args) {
        Human1 one = new Human1("Johannes", 19, 187, true );
        Human1 two = new Human1("Triin", 20, 168, false);
        Tervitus tervitus = new Tervitus(one, " Tere");
        Tervitus tervitus1 = new Tervitus(two, " Kena lõunat");
        String inimeseInfo = tervitus.inimeseInfo();
        String inimeseInfo1 = tervitus1.inimeseInfo();
        System.out.println(inimeseInfo);
        System.out.println(inimeseInfo1);





    }
}
