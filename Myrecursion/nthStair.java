// Only recursion based question

package Myrecursion;

public class nthStair {
    public static void main(String[] args){
        int n = 8;
        System.out.println(numberOfJumps(n));
        
    }

    static int numberOfJumps(int n){
        if(n == 0 || n==1) return 1;
        if(n < 0) return 0;

        return numberOfJumps(n-1) + numberOfJumps(n-2) + numberOfJumps(n-3);
    }
}
