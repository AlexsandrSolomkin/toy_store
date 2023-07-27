package main.dataProducts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import main.product.Product;

public class DataProductsList implements Iterable<Product> {
    private List<Product> productList;

    public DataProductsList() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return new ProductIterator(productList);
    }

    // public DataProductsList(List<T> productList) {
    // this.productList = productList;
    // }

    // public boolean addProduct(T product){
    // if(product == null){
    // return false;
    // }

    // if (!productList.contains(product)) {
    // productList.add(product);
    // return true;
    // }
    // return false;
    // }

    // public String getInfo() {
    //     StringBuilder sInfo = new StringBuilder();
    //     sInfo.append("На складе: ");
    //     sInfo.append(productList.size());
    //     sInfo.append(" товары: \n");
    //     for (Product product : productList) {
    //         sInfo.append(product.toString());
    //         sInfo.append("\n");
    //     }
    //     return sInfo.toString();
    // }
}
