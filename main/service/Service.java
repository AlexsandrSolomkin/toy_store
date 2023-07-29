package main.service;

import java.util.ArrayList;

import main.dataProducts.DataProductsList;
import main.product.Product;

public class Service {
    private int id;
    private DataProductsList dataProductsList;

    public Service(DataProductsList productsList) {
        this.dataProductsList = productsList;
    }

    public Service() {
        this(new DataProductsList());
    }

    public void addProduct(String name, int probability, int all) {
        Product product = new Product(id++, name, probability, all);
        dataProductsList.addProduct(product);
    }

    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Товары на складе:\n");

        for (Product product : dataProductsList) {
            stringBuilder.append("\n=============================");
            stringBuilder.append("\nid: ")
                    .append(product.getId())
                    .append("\nНаименование: ")
                    .append(product.getName())
                    .append("\nВес 1 ед.: ")
                    .append(product.getProbability())
                    .append("\nКол-во: : ")
                    .append(product.getAll());
            stringBuilder.append("\n=============================");
        }
        return stringBuilder.toString();
    }

    public void setProbability(int index, int value){
        dataProductsList.setProbability(index, value);
    }
// -----------------------------------------------------------------------
    public int randomPrizeIndex(){
        int sumAllProbality = 0;
        ArrayList<Integer> randomPrize = new ArrayList<>();
        int answerPrizeIndex = 0;

        for (Product product : dataProductsList) {
            sumAllProbality += product.getProbability();
        }

        int randomInt = (int) (Math.random() * sumAllProbality);
        sumAllProbality = 0;

        for (Product product : dataProductsList) {
            sumAllProbality += product.getProbability();
            if (sumAllProbality >= randomInt){
                answerPrizeIndex = product.getId();
            }
        }

        return answerPrizeIndex;
    }
    // -----------------------------------------------------------------------
}
