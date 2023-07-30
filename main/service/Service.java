package main.service;

import main.dataProducts.DataProductsList;
import main.dataProducts.DataWinner;
import main.product.Product;
import main.product.Winner;


public class Service {
    private int id;
    private DataProductsList dataProductsList;
    private DataWinner dataWinner;

    public Service(DataProductsList productsList, DataWinner dataWinner) {
        this.dataProductsList = productsList;
        this.dataWinner = dataWinner;
    }

    public Service() {
        this(new DataProductsList(), new DataWinner());
    }

    public void addProduct(String name, int probability, int all) {
        Product product = new Product(id++, name, probability, all);
        dataProductsList.addProduct(product);
    }

    // public void addWinner(String name, Product prize) {
    //     Winner winner = new Winner(id++, name, prize);
    //     dataWinner.addWinner(winner);
    // }

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
    public void randomPrize(String nameWinner){
        int idProduct = randomPrizeId();
        Product prize = dataProductsList.getObject(idProduct);
        Winner winner = new Winner(id++, nameWinner, prize);
        dataWinner.addWinner(winner);

    }

    public int randomPrizeId(){
        int sumAllProbality = 0;

        Product firsProduct = (Product) dataProductsList.getObject(0);
        int answerPrizeId = firsProduct.getId();

        for (Product product : dataProductsList) {
            sumAllProbality += product.getProbability();
        }

        int randomInt = (int) (Math.random() * sumAllProbality) + 1;
        sumAllProbality = 0;

        for (Product product : dataProductsList) {
            sumAllProbality += product.getProbability();
            if (sumAllProbality >= randomInt){
                return answerPrizeId = product.getId();
            }
        }

        return answerPrizeId;
    }
    // -----------------------------------------------------------------------
}
