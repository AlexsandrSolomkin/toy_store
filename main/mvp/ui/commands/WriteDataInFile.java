package main.mvp.ui.commands;

import main.mvp.ui.View;

public class WriteDataInFile implements Command{
    private View view;

    public WriteDataInFile(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Запись данных в файл";
    }

    @Override
    public void execute() {
        view.writeDataInFile();
    }
}
