package com.neetesh.graph;

import java.util.*;

public class Main {

    private static int V;
    private static ArrayList<ArrayList<Integer>> adj;

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

    static void bfsRec(ArrayList<ArrayList<Integer>> adj, int src, boolean[] isVisit){

        if(!isVisit[src]){
            System.out.print(src + " ");
            isVisit[src] = true;
            for(int ele: adj.get(src)){
                bfsRec(adj, ele, isVisit);
            }
        }else return;

    }

    static ArrayList<Integer>  dfs(int src){
        boolean isVisit[] = new boolean[V];
        ArrayList<Integer> arr = new ArrayList<Integer>(V);
        return dfsUtil(src, isVisit,arr);
    }

    static ArrayList<Integer> dfsUtil(int src, boolean[] isVisit, ArrayList<Integer> arr){

        arr.add(src);
        isVisit[src] = true;

        for(int ele: adj.get(src)){
            if(!isVisit[ele])
                dfsUtil(ele, isVisit, arr);
        }
        return arr;
    }

    static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int src){
        boolean isVisit[] = new boolean[V];
        for(int i=0;i<V;i++){
            isVisit[i] = true;
            for(int j=0; j<adj.get(j).size(); j++){
                if(isCyclicUtill(adj, isVisit, adj.get(i).get(j)))
                    return true;
            }
            isVisit[i] = false;
        }
        return false;
    }

    static boolean isCyclicUtill(ArrayList<ArrayList<Integer>> adj, boolean[] isVisit, int src){
//        boolean FLAG = false;
        if(isVisit[src]) return true;

        isVisit[src] = true;
        for(int i=0; i<adj.get(src).size(); i++){
            if(isCyclicUtill(adj, isVisit, adj.get(src).get(i)))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Vertices and Node");
//        int v = sc.nextInt();
          V= 5;
         adj = new ArrayList<ArrayList<Integer>>(V);

        for(int i=0;i<V;i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        bfs(adj, 0);
        boolean[] isVisit = new boolean[V];
        System.out.println();
        bfsRec(adj, 0, isVisit);
        System.out.println("DFS ");
        for(int ele: dfs(0))
            System.out.print(" "+ele);
        System.out.println();
        if(isCyclic(adj, 0) == true)
            System.out.println("Graph is Cyclic ");
        else System.out.println("Graph isn't cyclic");
        }
}
