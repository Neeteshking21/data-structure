package Myrecursion;

import java.util.*;

public class floodfill {
    public static void main(String[] args) {
        int [][] arr = {
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 0, 0},
            {1, 0, 0, 1, 1, 0, 1, 1},
            {1, 2, 2, 2, 2, 0, 1, 0},
            {1, 1, 1, 2, 2, 0, 1, 0},
            {1, 1, 1, 2, 2, 2, 2, 0},
            {1, 1, 1, 1, 1, 2, 1, 1},
            {1, 1, 1, 1, 1, 2, 2, 1}
        };

        fill(arr, 0, 0, 5, 1);
        printFloodFill(arr);
    }

    public static void fill(int [][] arr, int r, int c, int toFill, int preFill){
        int rows = arr.length;
        int cols = arr[0].length;

        if(r < 0 || r >= rows || c < 0 || c >= cols){
            return;
        }
        if( arr[r][c] != preFill)
            return;
        arr[r][c] = toFill;

        fill(arr, r-1, c, toFill, preFill);
        fill(arr, r+1, c, toFill, preFill);
        fill(arr, r, c-1, toFill, preFill);
        fill(arr, r, c+1, toFill, preFill);
    }
    static void printFloodFill(int  [][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            
            System.out.println();
        }
    }
}
