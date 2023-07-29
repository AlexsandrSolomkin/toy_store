package main.mvp.presenter;

import main.mvp.ui.View;
import main.service.Service;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addProduct(String nameP, int probabilityP, int allP) {
        System.out.println("Добавление товара");
    }
}
