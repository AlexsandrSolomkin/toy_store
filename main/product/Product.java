package main.product;

public class Product {
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

    // @Override
    // public String toString(){
    //     StringBuilder info = new StringBuilder();
    //     info.append("\n===========ДАННЫЕ О ТОВАРЕ=========\n");
    //     info.append("id: ");
    //     info.append(id);
    //     info.append("Название: ");
    //     info.append(name);
    //     info.append("Модификатор выпадения: ");
    //     info.append(probability);
    //     info.append("Количество данного товара на складе: ");
    //     info.append(all);

    //     return info.toString();
    // }

}
