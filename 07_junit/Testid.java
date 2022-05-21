import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Testid {
    @Test
    public void Kontrolli_kas_loom_teeb_mjau(){
        Loom loom = new Loom("kass", "Miisu", "must", 11, "178607638462193", 2018);
        assertEquals("Teeb mjau!", loom.kasteebmjau());
    }

    @Test
    public void Kontrolli_kas_on_kiibistatud(){
        Loom loom2 = new Loom("koer", "Bertta", "kirju", 11, "647382946501647", 2020);
        assertEquals("kiip olemas", loom2.kiibistatud());
    }

    @Test
    public void kas_on_vaja_vaktsineerida(){
        Loom loom = new Loom("kass", "Miisu", "must", 11, "178607638462193", 2018);
        assertEquals("Peab vaktsineerima", loom.vaktsineerimine());
    }

}
