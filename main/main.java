package main;

import main.dataProducts.DataProductsList;
import main.product.Product;
import main.service.Service;

class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addProduct("товар 1", 3, 1);
        service.addProduct("товар 3", 1, 2);
        service.addProduct("товар 2", 4, 3);
        service.addProduct("товар 4", 6, 4);

        System.out.println(service.getInfo());



        // System.out.println("Магазин игрушек");

        // DataProductsList<Product> dataProductsList = new DataProductsList<>();

        // // =================================ЗАНЕСЕНИЕ ИНФОРМАЦИИ О
        // ТОВАРЕ===============================
        // // Product toy = new Product(0, "toy1", 0, 0);

        // dataProductsList.addProduct(new Product(0, null, 0, 0));

        // System.out.println(dataProductsList.toString());
        // //
        // =============================================================================================
    }
}