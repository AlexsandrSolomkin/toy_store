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
        service.addProduct(nameP, probabilityP, allP);
        System.out.println("Добавление товара");
    }

    public void setProbability(int index, int value){
        service.setProbability(index, value);
        System.out.println("Вес изменен");
    }

    public void getProduct() {
        view.print(service.getInfo());
    }
}
