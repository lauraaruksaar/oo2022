package isikukood;
import kujundid.Kolmnurk;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {
    //alt + enter -->  classpath 4 / 5.8
    @Test
    public void kontrollin_kas_on_naisterahvas_kui_isikukoodi_alguses_on_4() {
        IsikukoodEE ee = new IsikukoodEE("4513111234");
        assertEquals(false,ee.isMale());
    }

    @Test
    public void kontrollin_kas_on_synniaasta_on_1951_kui_isikukoodi_keskel_on_51() {
        IsikukoodLV lv = new IsikukoodLV("120388-51237");
        assertEquals(false,lv.getBirthYear());
    }

    @Test
    public void kontrollin_kas_kujundi_pindala_arvutatakse_korrektselt() {
        Kolmnurk kolmnurk = new Kolmnurk(5.0, 6.0, 7.0);
        assertEquals(18,kolmnurk.arvutaYmbermoot(),0.1);
    }
}
