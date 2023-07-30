package main.mvp.ui;

import main.mvp.presenter.Presenter;

public interface View {
    void print(String text);
    void start();
    
    void setPresenter(Presenter presenter);

    void addProduct();
    void getProduct();
    void getInfoWinner();
    void setProbability();
    void prizeDrawing();
    void writeDataInFile();
    void exitWorkProgramm();
}
