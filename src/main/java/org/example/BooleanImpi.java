package org.example;



public class BooleanImpi implements BinaryOperation {

    private boolean[] array = new boolean[SIZE];

    @Override
    public boolean checkIndex(int index) {
        return array[index];
    }

    @Override
    public void setTrue(int index) {
        array[index] = true;

    }

    @Override
    public void elementIndex(int index, boolean a) {
        if(a==true){
            array[index] = true;
        }else
            array[index] = false;

    }

    @Override
    public void setFalse(int index) {
        array[index]=false;
    }
    @Override
    public void revers(int index) {
        array[index] =!array[index];
    }

    @Override
    public int quantityTrue() {
        int a=0;
        for(int i=0;i<SIZE;i++){
            if(array[i] ){
                a++;
            }
        }
        return a;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for(int i=0;i<SIZE;i++){
            sb.append(array[i]? 1:0).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}
