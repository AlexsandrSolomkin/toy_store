package main.mvp.ui.commands;

import main.mvp.ui.View;

public class AddProduct implements Command{
    private View view;

    public AddProduct(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Добавление товара";
    }

    @Override
    public void execute() {
        view.addProduct();
    }
}
