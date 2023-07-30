package main;

import main.mvp.presenter.Presenter;
import main.mvp.ui.ConsoleUI;
import main.mvp.ui.View;
import main.service.Service;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        Service service = new Service();
        new Presenter(view, service);
        view.start();
    }
}
