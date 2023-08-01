package main.mvp.ui.commands;

import main.mvp.ui.View;

public class ReadDataInFile implements Command{
    private View view;

    public ReadDataInFile(View view) {
        this.view = view;
    }

    @Override
    public String getDescription() {
        return "Чтение файла";
    }

    @Override
    public void execute() {
        view.readDataInFile();
    }
}