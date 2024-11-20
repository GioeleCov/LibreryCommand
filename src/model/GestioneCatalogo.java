package model;

import java.util.ArrayList;
import java.util.List;

public class GestioneCatalogo {

    private final List<Libro> listaLibri;

    public GestioneCatalogo() {
        this.listaLibri = new ArrayList<>();
    }

    public void aggiungiLibro(Libro libro) {
        listaLibri.add(libro);
    }

    public void visualizzaCatalogo() {
        System.out.println("Catalogo dei libri:");
        for (Libro l : listaLibri) {
            System.out.println(l);
        }
    }

    public void cercaTitoloDelLibro(String titolo) {
        for (Libro l : listaLibri) {
            if (l.getTitolo().contains(titolo)) {
                System.out.println(l);
                return;
            }
        }

        System.out.println("model.Libro non trovato\n");
    }
}
