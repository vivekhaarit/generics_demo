package com.mytestlab;

import java.io.Serializable;

class Demo <T> {
    T[] myArray;
    public Demo(T[] myArray){
        this.myArray=myArray;
    }

    public static void main(String[] args) {
        Integer integerArray[]={1,2,3};
        Double doubleArray[]={1.1,2.2,3.3};
        Character charArray[]={'a','b','c'};

        printIntegerArray(integerArray);
        printIntegerArray(charArray);
        printIntegerArray(doubleArray);

        new Demo<Integer>(integerArray).toPrint();
        new Demo<Double>(doubleArray).toPrint();
        new Demo<Character>(charArray).toPrint();

    }
    private void toPrint(){
        printIntegerArray(myArray);
    }
    private static <T> void printIntegerArray(T[] integerArray){
        for (T num:integerArray) {
            System.out.println("Integer no is: "+num);
        }
        System.out.println("----------------------------");
    }

}
