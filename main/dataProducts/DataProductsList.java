package main.dataProducts;

import java.util.ArrayList;

public class DataProductsList<T> {
    private ArrayList<T> producList;

    public DataProductsList(ArrayList<T> producList) {
        this.producList = producList;
    }

    public ArrayList<T> getProducList() {
        return producList;
    }

    public void setProducList(ArrayList<T> producList) {
        this.producList = producList;
    }
}
