package main.mvp.ui.commands;

import main.mvp.ui.View;

public class GetInfoWinner implements Command{
    private View view;

    public GetInfoWinner(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Показать информацию о победителях";
    }

    @Override
    public void execute() {
        view.getInfoWinner();
    }
}
