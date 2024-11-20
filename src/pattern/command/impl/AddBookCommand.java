package pattern.command.impl;

import model.GestioneCatalogo;
import model.Libro;
import pattern.command.iface.Command;

import java.util.Scanner;

public class AddBookCommand implements Command {

    private final GestioneCatalogo g;
    private final Scanner scanner;


    public AddBookCommand(GestioneCatalogo g, Scanner scanner) {
        this.g = g;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("Inserisci il titolo del libro:");
        String titolo = scanner.nextLine();
        System.out.println();
        System.out.println("Inserisci il nome dell'autore:");
        String autore = scanner.nextLine();
        System.out.println();
        System.out.println("Inserisci l'anno di publicazione:");
        int annoDiPublicazione = scanner.nextInt();
        System.out.println();

        g.aggiungiLibro(new Libro(titolo, autore, annoDiPublicazione));
    }
}
