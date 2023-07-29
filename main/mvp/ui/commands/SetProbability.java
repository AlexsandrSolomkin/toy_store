package main.mvp.ui.commands;

import main.mvp.ui.View;

public class SetProbability implements Command{
    private View view;

    public SetProbability(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Изменить вес товара";
    }

    @Override
    public void execute() {
        view.setProbability();
    }
}
