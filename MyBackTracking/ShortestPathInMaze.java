package MyBackTracking;
public class ShortestPathInMaze {
    public static void main(String[] args) {
        int a[][] = {
            {1,1,1,1,1,0,0,1,1,1},
            {0,1,1,1,1,1,0,1,0,1},
            {0,0,1,0,1,1,1,0,0,1},
            {1,0,1,1,1,0,1,1,0,1},
            {0,0,0,1,0,0,0,1,0,1},
            {1,0,1,1,1,0,0,1,1,0},
            {0,0,0,0,1,0,0,1,1,0},
            {0,1,1,1,1,1,1,1,0,0},
            {1,1,1,1,1,0,0,1,1,1},
            {0,0,1,0,0,1,1,0,0,1}                                                   
        };
    }

    static int shortestPath(int a[][], int i, int j, int x, int y){
        int rows = a.length;
        int cols = a[0].length;

        boolean[][] vis = new boolean[rows][cols];


        return shortestPath(a, i, j, x, y , vis);
    }
    static int shortestPath(int a[][], int i, int j, int x, int y, boolean[][] vis){
        int rows = a.length;
        int cols = a[0].length;

        // boolean[][] vis = new boolean[rows][cols];
        return 1;
    }
}
