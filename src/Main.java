import controller.ShellController;
import model.GestioneCatalogo;

public class Main {

    public static void main(String[] args) {
        GestioneCatalogo g = new GestioneCatalogo();
        ShellController shellController = new ShellController(g);
        shellController.handleShellLoop();
    }
}