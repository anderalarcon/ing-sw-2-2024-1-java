package Semana8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListaElementosTest {

    private ListaElementos lista;

    @Before
    public void setUp() {
        lista = new ListaElementos();
    }

    @Test
    public void agregarTest() {
        lista.agregarElemento("adidas");
        assertNotNull(lista);
    }

    @Test
    public void contieneTest() {
        lista.agregarElemento("adidas");
        boolean resultado = lista.contieneElemento("adidas");
        assertTrue(resultado);
    }

}
