package main.dataProducts;

import java.util.Iterator;
import java.util.List;

import main.product.Product;

public class ProductIterator implements Iterator<Product> {
    private int index;
    private List<Product> productsList;

    public ProductIterator(List<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    public boolean hasNext() {
        return index < productsList.size();
    }

    @Override
    public Product next() {
        return productsList.get(index++);
    }

}
