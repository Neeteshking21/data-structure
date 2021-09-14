package com.neetesh.graph;

import java.util.*;

public class Main {

    private static int V;

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int src, int dest){
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }

    static void bfs(ArrayList<ArrayList<Integer>> adj, int src){
        boolean[] isVisit = new boolean[V];
        Queue<Integer> que= new LinkedList<Integer>();

        isVisit[src] = true;
        que.add(src);

        while(!que.isEmpty()){
            int ele = que.poll();
            System.out.print(ele + " ");
            for(int n: adj.get(ele)){
                if(!isVisit[n]){
                    que.add(n);
                    isVisit[n] = true;
                }
            }
        }
    }

    static void bfsRec(){
        
    }
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Vertices and Node");
//        int v = sc.nextInt();
        V= 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for(int i=0;i<V;i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);

        bfs(adj, 0);
        }
}
