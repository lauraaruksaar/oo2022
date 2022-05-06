package com.company.teineosa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JoogiPudelTests {

    // punane -> alt enter -> add junit4 to classpath
    @Test
    public void arvutaKoguMassKuiJookiPole() {
        JoogiPudel joogipudel = new JoogiPudel(
                12.0, "Klaas", 20.0, 0.2);
        double mass = joogipudel.getMass();
        assertEquals(20.0, mass, 0.1);
    }

    @Test
    public void arvutaKoguMassKuiJookOn() {
        JoogiPudel joogipudel = new JoogiPudel(
                12.0, "Klaas", 20.0, 0.2);
        Jook coca = new Jook("Coca cola", 0.6, 1.4);
        joogipudel.jook = coca;
        double mass = joogipudel.getMass();
        assertEquals(21.4, mass, 0.1);
    }

    @Test
    public void arvutaKoguHindKuiJookiPole() {
        JoogiPudel joogipudel = new JoogiPudel(
                12.0, "Klaas", 20.0, 0.2);
        double hind = joogipudel.getKoguhind();
        assertEquals(0.2, hind, 0.1);
    }

    @Test
    public void arvutaKoguHindKuiJookOn() {
        JoogiPudel joogipudel = new JoogiPudel(
                12.0, "Klaas", 20.0, 0.2);
        Jook coca = new Jook("Coca cola", 0.6, 1.4);
        joogipudel.jook = coca;
        double hind = joogipudel.getKoguhind();
        assertEquals(1.04, hind, 0.1);
    }
}
