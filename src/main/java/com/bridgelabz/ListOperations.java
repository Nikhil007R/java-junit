package com.bridgelabz;

import java.util.List;

public class ListOperations {

    public static void addElement(List<Integer> list , int element){
        list.add(element);
    }

    public static void removeElement(List<Integer> list, int element){
        list.remove(element);
    }

    public static int getSize(List<Integer> list){
        return list.size();
    }

    public static void main(String[] args) {

    }
}
