package main.dataProducts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import main.product.Winner;

public class DataWinner implements Iterable<Winner>, Serializable{
    private List<Winner> winnerList;

    public DataWinner() {
        winnerList = new ArrayList<>();
    }

    public void addWinner(Winner winner) {
        winnerList.add(winner);
    }

    public void getWinner(int index){
        winnerList.get(index);
    }

    public Object getObject(int index){
         return winnerList.get(index);
    }

    @Override
    public Iterator<Winner> iterator() {
        return new ObjectIterator(winnerList);
    }
}
