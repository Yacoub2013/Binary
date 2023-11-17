package org.example;

public interface BinaryOperation {
    int SIZE = 1024;

    //   1. проверка элемента с заданным индексом;
    boolean checkIndex(int index);

    // 2.установка (в true) элемента с заданным индексом;
    void setTrue(int index);

    // 3.установка элемента с заданным индексом заданным логическим значением
    void elementIndex(int index,boolean a);

    // 4.сброс (в false) элемента с заданным индексом
    void setFalse(int index);

    // 5.инвертирование элемента с заданным индексом;
    void revers (int index);

    // 6.метод, возвращающий количество элементов, установленных в true;
    int quantityTrue ();

}
