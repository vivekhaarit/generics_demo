package com.mytestlab;

import java.io.Serializable;

class Demo <X,Y,Z> {
    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;
    public Demo(X[] myXArray,Y[] myYArray,Z[] myZArray){
        this.myXArray=myXArray;
        this.myYArray=myYArray;
        this.myZArray=myZArray;
    }

    public static void main(String[] args) {
        Integer integerArray[]={1,2,3};
        Double doubleArray[]={1.1,2.2,3.3};
        Character charArray[]={'a','b','c'};

        printIntegerArray(integerArray);
        printIntegerArray(charArray);
        printIntegerArray(doubleArray);

        new Demo <Integer,Double,Character> (integerArray,doubleArray,charArray).toPrint();

    }
    private void toPrint(){
        printIntegerArray(myXArray);
        printIntegerArray(myYArray);
        printIntegerArray(myZArray);
    }
    private static <T> void printIntegerArray(T[] integerArray){
        for (T num:integerArray) {
            System.out.println("Integer no is: "+num);
        }
        System.out.println("----------------------------");
    }

}
