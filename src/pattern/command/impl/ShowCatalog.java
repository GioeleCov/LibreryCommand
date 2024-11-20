package pattern.command.impl;

import model.GestioneCatalogo;
import pattern.command.iface.Command;

import java.util.Scanner;

public class ShowCatalog implements Command {

    private final GestioneCatalogo g;
    private final Scanner scanner;


    public ShowCatalog(GestioneCatalogo g, Scanner scanner) {
        this.g = g;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        g.visualizzaCatalogo();
    }
}
