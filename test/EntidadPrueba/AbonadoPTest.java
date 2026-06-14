package EntidadPrueba;

import java.time.LocalDate;
import static junit.framework.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AbonadoPTest {

    static AbonadoP c1;

    public AbonadoPTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        c1 = new AbonadoP("Anonimus", 1212);
        System.out.println("INGRESO de abonado del bien");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println(LocalDate.now().minusDays(1) + " Modem rotos reparados, Abonados Felices");
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    //punto 5
    @Test
    public void testValidarpsw() {
        int contra = 123456;

        assertTrue(c1.validarIngreso(contra));
    }

    //punto 6
    @Test
    public void testValidarEmail() {
        String email = "abc@abc.com";

        assertTrue(email.contains("@") && email.contains(".") && email.length() < 20);
    }

    //punto 7
    @Test
    public void testCambiarPass() {
        String nuevaContra = "1234";

        c1.cambioPassword(nuevaContra);

        assertEquals(1234, c1.getContraseña());
    }
    
    //putno 8
    @Test (timeout=30)
    public void testDelay(){
        c1.delay(45);
    }
    
    //punto 9 
    @Test
    public void testAbonadosDiferentes(){
        AbonadoP c1 = new AbonadoP ("Juan",1111);
        AbonadoP c2 = new AbonadoP ("Pepe", 2222);
        
        c1.abonadosDiferentes(c2);
        
        assertNotSame("misma persona", c1, c2);
    }
            
}
