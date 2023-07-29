package main.mvp.ui.commands;

import main.mvp.ui.View;

public class ExitWorkProgramm implements Command{
    private View view;

    public ExitWorkProgramm(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Завершить работу";
    }

    @Override
    public void execute() {
        view.exitWorkProgramm();
    }
    
}
