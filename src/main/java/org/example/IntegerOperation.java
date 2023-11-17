package org.example;


public class IntegerOperation implements BinaryOperation{

    int [] array = new int[SIZE/32];


    //   1. проверка элемента с заданным индексом;
    @Override
    public boolean checkIndex(int index) {
        int indexArray = index / 32; // номер индекса где лежит искомое значение
        int bit = index % 32; // вбираем нужный нам бит из 32-х битов
        int element = array[indexArray];
        int mask = 1<<bit;
        return (element&mask) == mask;
    }

    @Override
    public void setTrue(int index) {
        int indexArray = index / 32; // номер индекса где лежит искомое значение
        int bit = index % 32; // вбираем нужный нам бит из 32-х битов
        int mask = 1<<bit;
        array[indexArray]=array[indexArray] | mask;


    }

    @Override
    public void elementIndex(int index, boolean a) {
        int indexArray = index / 32; // номер индекса где лежит искомое значение
        int bit = index % 32; // вбираем нужный нам бит из 32-х битов
        int mask = 1<<bit;
        if(a==true){
            array[indexArray]=array[indexArray] | mask;
        }else{
            array[indexArray]=array[indexArray] & ~mask ;
        }


    }

    @Override
    public void setFalse(int index) {
        int indexArray = index / 32; // номер индекса где лежит искомое значение
        int bit = index % 32; // вбираем нужный нам бит из 32-х битов
        int mask = 1<<bit;
        array[indexArray]=array[indexArray] & ~mask ;

    }

    @Override
    public void revers(int index) {
        int indexArray = index / 32; // номер индекса где лежит искомое значение
        int bit = index % 32; // вбираем нужный нам бит из 32-х битов
        int mask = 1<<bit;
        array[indexArray]=array[indexArray] ^ mask;

    }

    @Override
    public int quantityTrue() {
       int a=0;
        for(int i=0;i<SIZE;i++){
            if(checkIndex(i)){
                a++;
            }
        }


       return a;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
            for(int i=0;i<SIZE;i++){
                sb.append(checkIndex(i)? 1:0).append(" ");
            }

        sb.append("]");
        return sb.toString();
    }
}
