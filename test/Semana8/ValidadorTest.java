package Semana8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidadorTest {

    Validador validador = new Validador();

    @Test
    public void correoTest() {
        boolean resultado = validador.validarCorreoElectronico("andersonachata@gmail.com");
        assertTrue(resultado);
    }

    @Test
    public void numeroTest() {
        boolean resultado = validador.validarNumeroTelefono("913872010");
        assertTrue(resultado);
    }

}
