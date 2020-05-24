import controller.BefizetesController;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import javax.xml.bind.JAXBException;

import static org.junit.Assert.assertEquals;

public class BefizetesTest {

    BefizetesController underTest = new BefizetesController();
    @BeforeEach
    void setUp() {

        underTest = new BefizetesController();
    }

    @Test
    public void Befizetes() throws JAXBException {
        assertEquals(true, underTest.befizetes_(100, "ser-980"));
    }

    @Test
    public void Befizetes2() throws JAXBException {
        assertEquals(false, underTest.befizetes_(100, "ser-"));
    }
}
