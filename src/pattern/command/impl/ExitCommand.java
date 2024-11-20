package pattern.command.impl;

import controller.ShellController;
import pattern.command.iface.Command;

public class ExitCommand implements Command {

    public ExitCommand() {

    }

    @Override
    public void execute() {
        System.out.println("A presto!");
        ShellController.setExit(true);
    }
}
