public class proov {
    public static void main(String[] args) {

        System.out.println(prindiTsukkel(5));
        System.out.println(korrutamine(2,4));
        System.out.println(aeg(90,90));
    }

    public static int prindiTsukkel(int kordadeArv){
        int i = 0;
        while (i < kordadeArv) {
            System.out.println(i);
            i++;
        }
        return i;
    }

    public static int korrutamine(int esimeneArv, int teineArv){
        return esimeneArv * teineArv;

    }

    public static float aeg(int kiirus, int kaugus){
        return kaugus / kiirus;
    }

}