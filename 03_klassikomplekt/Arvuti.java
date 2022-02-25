public class Arvuti {
    Info info;
    int maksusmus;

    public Arvuti(Info info, int maksusmus) {
        this.info = info;
        this.maksusmus = maksusmus;
    }

    public String getInfo() {
        return "Arvuti on parameetritega " + this.info + ". Maksusmus on: " + this.maksusmus;
    }
}
