package pattern.command.impl;

import model.GestioneCatalogo;
import pattern.command.iface.Command;

import java.util.Scanner;

public class ResearchBookByTitleCommand implements Command {

    private final GestioneCatalogo g;
    private final Scanner scanner;


    public ResearchBookByTitleCommand(GestioneCatalogo g, Scanner scanner) {
        this.g = g;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("Inserisci il titolo del libro che desideri cercare:");
        String titoloLibro = scanner.nextLine();
        System.out.println();
        g.cercaTitoloDelLibro(titoloLibro);
    }
}
