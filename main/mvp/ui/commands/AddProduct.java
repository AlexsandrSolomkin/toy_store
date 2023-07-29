package main.mvp.ui.commands;

import main.mvp.ui.ConsoleUI;

public class AddProduct implements Command{
    private ConsoleUI consoleUI;

    public AddProduct(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    @Override
    public String getDescription() {
        return "Добавление товара";
    }

    @Override
    public void execute() {
        consoleUI.addProduct();
    }
    
}
