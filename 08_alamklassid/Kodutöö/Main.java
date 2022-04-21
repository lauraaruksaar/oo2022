package Kodutöö;

public class Main {
    public static void main(String[] args) {

        Tulp tulp = new Tulp();
        tulp.nimi();
        tulp.fotosünteesi();
        tulp.õitseb();
        tulp.vajadused();
        tulp.värv();

        System.out.println("-------------------------------------------");

        Havisaba havisaba = new Havisaba();
        havisaba.nimi();
        havisaba.kasvuKeskkond();
        havisaba.fotosünteesi();
        havisaba.vajadused();
        havisaba.värv();

        System.out.println("-------------------------------------------");

        Kuusk kuusk = new Kuusk();
        kuusk.nimi();
        kuusk.vajadused();
        kuusk.vars();
        kuusk.värv();
        kuusk.fotosünteesi();

        System.out.println("-------------------------------------------");

        Piparmünt piparmünt = new Piparmünt();
        piparmünt.nimi();
        piparmünt.söödavus();
        piparmünt.fotosünteesi();
        piparmünt.värv();
        piparmünt.vajadused();





    }
}
