package model;

public class Libro {

    private final String titolo;
    private final String autore;
    private final int annoPubblicazione;

    public Libro(String titolo, String autore, int annoPubblicazione) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    @Override
    public String toString() {
        return String.format("titolo: %s%n" +
                "autore: %s%n" +
                "anno di pubblicazione: %s%n",
                this.getTitolo(), this.getAutore(), this.getAnnoPubblicazione());
    }
}
