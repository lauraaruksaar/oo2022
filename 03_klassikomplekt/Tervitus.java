public class Tervitus {
    Human human;
    String tervitus;

    public Tervitus(Human human, String tervitus){
        this.human = human;
        this.tervitus = tervitus;
    }

    public String inimeseInfo(){
        return this.human + this.tervitus + ", meeldiv tutvuda!";
    }
}
