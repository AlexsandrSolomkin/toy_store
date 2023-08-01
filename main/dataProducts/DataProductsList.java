package main.dataProducts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import main.product.Product;

public class DataProductsList implements Iterable<Product>, Serializable {
    private List<Product> productList;

    public DataProductsList() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void getProduct(int index){
        productList.get(index);
    }

    public Product getObject(int index){
         return productList.get(index);
    }

    public void setProbability(int index, int value){
        Product newValue = productList.get(index);
        newValue.setProbability(value);
        productList.set(index, newValue);
    }

    public void delOneProduct(int index){
        Product newValue = productList.get(index);
        newValue.setAll(newValue.getAll() - 1);
        productList.set(index, newValue);
    }

    public void checkCountObject(int index){
        Product newValue = productList.get(index);
        if(newValue.getAll() == 0){
            productList.remove(index);
        }
    }

    @Override
    public Iterator<Product> iterator() {
        return new ObjectIterator(productList);
    }
}
