package Semana8;

import java.util.ArrayList;
import java.util.List;

public class ListaElementos {

    private List<String> elementos = new ArrayList<>();

    public void agregarElemento(String elemento) {
        elementos.add(elemento);
    }

    public boolean contieneElemento(String elemento) {
        return elementos.contains(elemento);
    }

}
