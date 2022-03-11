public class Main1 {
    public static void main(String[] args) {
        Info info = new Info("ds", "dd", "dsd", 1 , 1);
        Arvuti arvuti = new Arvuti(info,3424);
        String arvutiInfo = arvuti.getInfo();
        System.out.println(arvutiInfo);
    }
}
