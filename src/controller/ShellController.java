package controller;

import model.GestioneCatalogo;
import pattern.command.iface.Command;
import pattern.command.impl.AddBookCommand;
import pattern.command.impl.ExitCommand;
import pattern.command.impl.ResearchBookByTitleCommand;
import pattern.command.impl.ShowCatalog;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShellController {

    private final GestioneCatalogo g = new GestioneCatalogo();
    private final Scanner scanner = new Scanner(System.in);
    private static boolean exit = false;
    private final Map<String, Command> commandMap;


    public ShellController() {
        this.commandMap = new HashMap<>();
        this.commandMap.put("1", new AddBookCommand(g, scanner));
        this.commandMap.put("2", new ShowCatalog(g, scanner));
        this.commandMap.put("3", new ResearchBookByTitleCommand(g, scanner));
        this.commandMap.put("4", new ExitCommand());
    }

    public static void setExit(boolean exit) {
        ShellController.exit = exit;
    }

    private void launchCommand(String input) {

        if (commandMap.get(input) != null) {
            Command command = commandMap.get(input);

            command.execute();
        }
    }


    public void handleShellLoop() {
        do {
            System.out.println("==========================");
            System.out.println("GESTIONE CATALOGO LIBRI");
            System.out.println("==========================");
            System.out.println("1. Aggiungi libro");
            System.out.println("2. Visualizza tutti i libri");
            System.out.println("3. Cerca un libro per titolo");
            System.out.println("4. Esci");
            System.out.println();
            System.out.print(">: ");

            String input = scanner.nextLine();
            System.out.println();
            launchCommand(input);


        }while (!exit);
    }

}
