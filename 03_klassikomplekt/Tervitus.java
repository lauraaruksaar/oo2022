public class Tervitus {
    Human1 human;
    String tervitus;

    public Tervitus(Human1 human, String tervitus){
        this.human = human;
        this.tervitus = tervitus;
    }

    public String inimeseInfo(){
        return this.human + this.tervitus + ", meeldiv tutvuda!";
    }
}
