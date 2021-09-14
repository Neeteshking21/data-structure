package com.neetesh.recursion;

public class Main{
    public static void main(String[] args) {
        System.out.println(feb(5));
    }
    static int feb(int num){
        if(num<=1) return num;
        return feb(num-1) + feb(num-2);
    }
}