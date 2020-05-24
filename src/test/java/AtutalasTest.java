import controller.AtutalasController;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import javax.xml.bind.JAXBException;

import static org.junit.Assert.assertEquals;

public class AtutalasTest {
    AtutalasController underTest = new AtutalasController();
    @BeforeEach
    void setUp() {

        underTest = new AtutalasController();
    }
    @Test
    public void atutalas() throws JAXBException {
        assertEquals(true, underTest.atutalas_("ser-100", "ser-980", 50));
    }
}
