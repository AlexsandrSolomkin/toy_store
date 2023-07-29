package main.mvp.ui.commands;

import main.mvp.ui.View;

public class PrizeDrawing implements Command{
    private View view;

    public PrizeDrawing(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Разыграть произвольный товар";
    }

    @Override
    public void execute() {
        view.prizeDrawing();
    }
}
