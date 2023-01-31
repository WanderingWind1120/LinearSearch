package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    Integer[] array = {5,56,4,3,4};
    int index = linearSearch(array,56);
        System.out.println(index);
    }
    private static <thing> int linearSearch (thing[] array, thing data){
        for (int i = 0; i <= array.length-1; i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }
}