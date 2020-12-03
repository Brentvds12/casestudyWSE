package fact.it.supermarktproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import fact.it.supermarktproject.model.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SupermarktTests {

    /**
     * Test of constructor en getters
     */
    @Test
    public void testConstructorEnGetters() {
        Supermarkt delhaize = new Supermarkt("Delhaize");
        assertEquals("Delhaize", delhaize.getNaam());
    }

    /**
     * Test of setNaam method, of class Supermarkt.
     */
    @Test
    public void testSetNaam() {
        Supermarkt colruyt = new Supermarkt("Colruyt");
        colruyt.setNaam("Colruyt");
        assertEquals("Colruyt", colruyt.getNaam());
    }

    /**
     * check constructor of supermarkt + adding of afdelingen check if you can
     * find an afdeling by name
     */
    @Test
    public void checkToevoegenAfdelingenEnOphalenAantal() {
        Supermarkt aldi = new Supermarkt("Aldi");
        assertEquals(0, aldi.getAantalAfdelingen());
        Afdeling fruit = new Afdeling("fruit");
        aldi.voegAfdelingToe(fruit);
        assertEquals(1, aldi.getAantalAfdelingen());
        Afdeling brood = new Afdeling("brood");
        aldi.voegAfdelingToe(brood);
        assertEquals(2, aldi.getAantalAfdelingen());
        Afdeling[] lijst = new Afdeling[2];
        lijst[0] = fruit;
        lijst[1] = brood;
        assertArrayEquals(lijst, aldi.getAfdelingen().toArray());
    }

    /**
     * before a Klant can make his reservations, he has to register to the
     * Supermarkt as result of this registration he will receive a klantenkaartnr
     *  (simply the how maniest klant he is)
     */
    @Test
    public void testRegistreerKlant() {
        Klant k1 = new Klant("Donald", "Duck");
        Supermarkt spar = new Supermarkt("Spar");
        spar.registreerKlant(k1);
        assertEquals(1, k1.getKlantenkaartnr());
        Klant k2 = new Klant("Mickey", "Mouse");
        spar.registreerKlant(k2);
        assertEquals(2, k2.getKlantenkaartnr());
    }

}
