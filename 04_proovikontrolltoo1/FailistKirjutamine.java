import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FailistKirjutamine {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(
                new FileWriter("valjund1.txt")
        );
        pw.println("TereTere");
        pw.print(" Juku");
        pw.print(" kuku");
        pw.close();
    }
}
