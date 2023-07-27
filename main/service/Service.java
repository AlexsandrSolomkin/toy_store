package main.service;

import java.util.ArrayList;
import java.util.List;

import main.dataProducts.DataProductsList;
import main.product.Product;

public class Service {
    private int id;
    private DataProductsList dataProductsList;
    // private List<DataProductsList> allDataProductsList;

    public Service(DataProductsList productsList) {
        this.dataProductsList = productsList;
        // allDataProductsList = new ArrayList<>();
        // allDataProductsList.add(productsList);
    }

    public Service() {
        this(new DataProductsList());
    }

    // public void addProductList(DataProductsList pList){
    //     // allDataProductsList.add(pList);
    //     dataProductsList.addProduct(pList);
    // }

    public void addProduct(String name, int probability, int all) {
        Product product = new Product(id++, name, probability, all);
        dataProductsList.addProduct(product);
    }

    public String getInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Товары на складе:\n");

        for (Product product: dataProductsList) {
            stringBuilder.append("\n=============================");
            stringBuilder.append("\nНаименование: ").append(product.getName())
                        .append("\nВес 1 ед.: ").append(product.getProbability())
                        .append("\nКол-во: : ").append(product.getAll());
            stringBuilder.append("\n=============================");

        }
        return stringBuilder.toString();
    }
}
