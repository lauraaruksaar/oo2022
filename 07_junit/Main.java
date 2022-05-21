public class Main {
    public static void main(String[] args) {
        LoomaOmadus loom = new Loom("kass", "Miisu", "must", 11, "178607638462193", 2018);
        LoomaOmadus loom2 = new Loom("koer", "Bertta", "kirju", 11, "647382946501647", 2020);
        LoomaOmadus loom3 = new Loom("rott", "Remi", "sinakashall", 1, "", 2022);


        System.out.println("Varjupaiga loom on " + loom.getliik() + ". Tema nimi on " + loom.getnimi() + ", tema värv on " + loom.getvarv() + " ja tema vanus on " + loom.getvanus() + " aastat.");
        System.out.println(loom.kasteebmjau());
        System.out.println(loom.kiibistatud());
        System.out.println(loom.vaktsineerimine());
        System.out.println(" ");

        System.out.println("Varjupaiga loom on " + loom2.getliik() + ". Tema nimi on " + loom2.getnimi() + ", tema värv on " + loom2.getvarv() + " ja tema vanus on " + loom2.getvanus() + " aastat.");
        System.out.println(loom2.kasteebmjau());
        System.out.println(loom2.kiibistatud());
        System.out.println(loom2.vaktsineerimine());
        System.out.println("");

        System.out.println("Varjupaiga loom on " + loom3.getliik() + ". Tema nimi on " + loom3.getnimi() + ", tema värv on " + loom3.getvarv() + " ja tema vanus on " + loom3.getvanus() + " aastat.");
        System.out.println(loom3.kasteebmjau());
        System.out.println(loom3.kiibistatud());
        System.out.println(loom3.vaktsineerimine());
    }
}
