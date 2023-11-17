package org.example;

public class Main {
    public static void main(String[] args) {
    BinaryOperation bo = new BooleanImpi();
                   bo = new IntegerOperation();
            bo.setTrue(10);
            bo.setTrue(1);
            bo.setTrue(0);
            bo.elementIndex(2,true);
            System.out.println(bo);
            bo.elementIndex(2,false);
            System.out.println(bo);
        System.out.println("Check Index: "+ bo.checkIndex(10));
        System.out.println("Quantity true: "+ bo.quantityTrue());
        System.out.println(bo);
    bo.setFalse(10);
    bo.setFalse(0);
        System.out.println(bo);
    bo.revers(10);
    bo.revers(2);
        System.out.println(bo);
    bo.revers(10);
    bo.revers(2);
        System.out.println(bo);
    }
}