package Myrecursion;

import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int n = sc.nextInt();

        count(n);
    }

    static void count(int n){
        if(n == 0) return;
        count(n-1);
        System.out.println(n);
    }
}
