import controller.BefizetesController;
import controller.KivetelController;
import org.junit.jupiter.api.BeforeEach;

import javax.xml.bind.JAXBException;

import static org.junit.Assert.assertEquals;

public class KivetelTest {
    KivetelController underTest = new KivetelController();
    @BeforeEach
    void setUp() {

        underTest = new KivetelController();
    }

    public void kivetel() throws JAXBException {
        assertEquals(true, underTest.kivetel_(100, "ser-980"));
    }

    public void kivetel2() throws JAXBException {
        assertEquals(false, underTest.kivetel_(100, "ser"));
    }
}
