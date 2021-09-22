package com.neetesh.graph;


import java.util.*;

// Java program to find minimum steps to reach to
// specific cell in minimum moves by Knight

public class StepByKnight {

    static class cell{
        int x, y;
        int des;

        public cell(int x, int y, int des){
            this.x = x;
            this.y = y;
            this.des = des;
        }
    }

    static int minStepToReachTarget(int knightPos[], int targetPos[], int N){
        int[] X = {-1, -2, -1, -2, 1, 2, 1, 2};
        int[] Y = {-2, -1, 2, 1, -2, -1, 2, 1};
        Vector<cell> que = new Vector<cell>();
        que.add(new cell(knightPos[0], knightPos[1], 0));

        int x, y;
        boolean[][] isVisit = new boolean[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++)
                isVisit[i][j] = false;
        }

        isVisit[knightPos[0]][knightPos[1]] = true;

        while (!que.isEmpty()) {
            cell t = que.firstElement();
            que.remove(0);

            if (t.x == targetPos[0] && t.y == targetPos[1])
                return t.des;

            for (int i = 0; i < 8; i++) {
                x = t.x + X[i];
                y = t.y + Y[i];

                if (isInside(x, y, N) && !isVisit[x][y]) {
                    isVisit[x][y] = true;
                    que.add(new cell(x, y, t.des+1));
                }
            }
        }
        return Integer.MAX_VALUE;
    }
    static boolean isInside(int x, int y, int N){
        if(x>=1 && x<=N && y>=1 && y<=N)
            return true;
        return false;
    }

    public static void main(String[] args) {

        int N = 30;
        int knightPos[] = {1, 1};
        int targerPos[] = {30, 30};

        System.out.println(minStepToReachTarget(knightPos, targerPos, N));
    }

}
