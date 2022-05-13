import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {

    @Test
    public void kontrolliAT2heArvu() {
        int vastus = Main.t2htedeEsinemiseArv("pere",'a');
        assertEquals(0,vastus);

    }
    @Test
    public void kontrolliPT2heArvu() {
        int vastus = Main.t2htedeEsinemiseArv("pere",'p');
        assertEquals(1,vastus);

    }
    @Test
    public void kontrolliET2heArvu() {
        int vastus = Main.t2htedeEsinemiseArv("pere",'e');
        assertEquals(2,vastus);

    }

    @Test
    public void kontrolliAT2heEsinemiseArvuLauses() {
        int vastus2 = Main.aT2heEsinemineLauses("Koosta automaattest lause a-tähtede arvu kontrolli õigsuse kohta.");
        assertEquals(8,vastus2);

    }
}
