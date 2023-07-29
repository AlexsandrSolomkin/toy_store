package main.mvp.ui.commands;

import main.mvp.ui.View;

public class GetInfoProducts implements Command{
    private View view;

    public GetInfoProducts(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Показать информацию о товарах";
    }

    @Override
    public void execute() {
        view.getProduct();
    }
}
