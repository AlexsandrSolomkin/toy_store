package main.dataProducts.workDataProducts;

import java.io.Serializable;

/**
 * Writable
 */
public interface Writable<T> {
    /**
     * Метод для записи данных в файл
     * 
     * @param serializable - объект для записи
     * @param filePath     - путь к файлу, в который сделать запись
     * @return
     */
    boolean write(T serializable, String filePath);

    /**
     * Метод загрузки данных из файла
     * 
     * @param filePath - расположение файла
     * @return - данные в файле
     */
    Object read(String filePath);
}
