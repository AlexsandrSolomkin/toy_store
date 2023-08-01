package main.product;

import java.io.Serializable;

public class Winner implements Serializable{
    private int winnerId;
    private String nameW;
    private Product prizeW;
    
    public Winner(int winnerId, String nameW, Product prizeW) {
        this.winnerId = winnerId;
        this.nameW = nameW;
        this.prizeW = prizeW;
    }

    public int getWinnerId() {
        return winnerId;
    }
    
    public String getNameW() {
        return nameW;
    }

    public void setNameW(String nameW) {
        this.nameW = nameW;
    }

    public Product getPrizeW() {
        return prizeW;
    }

    public void setPrizeW(Product prizeW) {
        this.prizeW = prizeW;
    }
}
