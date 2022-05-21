public class Loom implements LoomaOmadus{

    String liik;
    String nimi;
    String varv;
    int vanus;
    String kiibinumber;
    int viimanevaktsiin;


    public Loom(String liik, String nimi, String varv, int vanus, String kiibinumber, int viimanevaktsiin) {
        this.liik = liik;
        this.nimi = nimi;
        this.varv = varv;
        this.vanus = vanus;
        this.kiibinumber = kiibinumber;
        this.viimanevaktsiin = viimanevaktsiin;
    }


    @Override
    public String getliik() {
        return liik;
    }

    @Override
    public String getnimi() {
        return nimi;
    }

    @Override
    public String getvarv() {
        return varv;
    }

    @Override
    public int getvanus() {
        return vanus;
    }

    @Override
    public String getkiibinumber() {
        return kiibinumber;
    }

    @Override
    public int getviimanevaktsiin() {
        return viimanevaktsiin;
    }

    @Override
    public String vaktsineerimine() {
        int aastad = (2022 - viimanevaktsiin);
        String vastus;
        if (aastad > 1) vastus = "Peab vaktsineerima";
        else vastus = "ei pea vaktsineerima";
        return vastus;
    }

    @Override
    public String kasteebmjau() {
        String haalitsus;
        if (liik == "kass") haalitsus = "Teeb mjau!";
        else haalitsus = "Ei tee mjau!";
        return haalitsus;
    }

    @Override
    public String kiibistatud() {
        String kiip;
        if(kiibinumber.length() == 15) kiip = "kiip olemas";
        else kiip = "ei ole kiipi";
        return kiip;
    }



}