package com.mytestlab;

import java.io.Serializable;

class Demo {
    public static void main(String[] args) {
        Integer integerArray[]={1,2,3};
        Double doubleArray[]={1.1,2.2,3.3};
        Character charArray[]={'a','b','c'};

        printIntegerArray(integerArray);
        printIntegerArray(charArray);
        printIntegerArray(doubleArray);
    }

    private static <T> void printIntegerArray(T[] integerArray){
        for (T num:integerArray) {
            System.out.println("Integer no is: "+num);
        }
        System.out.println("----------------------------");
    }

}
