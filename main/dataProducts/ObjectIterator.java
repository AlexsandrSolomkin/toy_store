package main.dataProducts;

import java.util.Iterator;
import java.util.List;

public class ObjectIterator<T> implements Iterator<T> {
    private int index;
    private List<T> objectList;

    public ObjectIterator(List<T> objectList) {
        this.objectList = objectList;
    }

    @Override
    public boolean hasNext() {
        return index < objectList.size();
    }

    @Override
    public T next() {
        return objectList.get(index++);
    }

}
