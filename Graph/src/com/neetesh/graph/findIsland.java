package com.neetesh.graph;

public class findIsland {

    private static int COLS = 5;
    private static int ROWS = 5;



    public int numIslands(char[][] grid) {
        // Code here
        return findIsland(grid);

    }
    static int findIsland(char[][] grid){
        // Declation
        ROWS = grid.length;
        COLS = grid[0].length;
        int count =0;
        boolean[][] isVisit = new boolean[ROWS][COLS];

        //   Traverse all the grid elements

        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                if(grid[i][j] == '1' && !isVisit[i][j]){
                    dfs(grid, i, j, isVisit);
                    ++count;

                }
            }
        }

        return count;
    }
    static void dfs(char [][]mat, int i, int j, boolean[][] isVisit ){
        isVisit[i][j] = true;

        int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
        int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };

        for (int k = 0; k < 8; ++k)
            if (isSafe(mat, i + rowNbr[k], j + colNbr[k], isVisit))
                dfs(mat, i + rowNbr[k], j + colNbr[k], isVisit);

    }

    static boolean isSafe(char[][] mat, int i, int j, boolean isVisit[][]){
//        System.out.println("i="+i + " j="+j);
//        int ele = mat[i][j];
        return ( (i>=0) && (i<ROWS) && (j>=0) && (j<COLS) && (mat[i][j] == '1')  && !isVisit[i][j]);
    }


    public static void main(String[] args) {
        char mat[][] = {
            {'1', '1', '0', '0', '0'},
            {'0', '1', '0', '0', '1'},
            {'1', '0', '0', '1', '1'},
            {'0', '0', '0', '0', '0'},
            {'1', '0', '1', '0', '1'}};

        findIsland fi = new findIsland();
        int num = fi.numIslands(mat);
        System.out.println(num);

    }

}
