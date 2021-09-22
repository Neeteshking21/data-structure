package com.neetesh.graph;

import java.lang.reflect.Array;

public class FloodFill {
    public static void main(String[] args) {
        int image[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };

        flood(image, 0, 0, 3);

        for(int[] i : image){
            for(int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
        {
            // Code here
            int target = image[sr][sc];
            flood(image, sr, sc, newColor);

            return image;
        }

        static void floodFill(int[][] image, int x, int y, int target, int newColor){
            if(x < 0 || x >= image.length ||  y < 0 || y >= image[x].length )
                return;

            if(target != image[x][y]) return;

            image[x][y] = newColor;

            floodFill(image, x, y+1, target, newColor);
            floodFill(image, x, y-1, target, newColor);
            floodFill(image, x-1, y, target, newColor);
            floodFill(image, x+1, y, target, newColor);
        }
        static void flood(int screen[][], int x, int y, int newC)
        {
            int prevC = screen[x][y];
            if(prevC==newC) return;
            floodFill(screen, x, y, prevC, newC);
        }
}
