package main.product;

import java.io.Serializable;

public class Product implements Serializable{
    private int id;
    private String name;
    private int probability;
    private int all;

    public Product(int id, String name, int probability, int all) {
        this.id = id;
        this.name = name;
        this.probability = probability;
        this.all = all;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }
}
