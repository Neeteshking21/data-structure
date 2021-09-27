package com.neetesh.graph;



public class dijkstraMatrix {

    private int V = 9;

    int minDistance(int[] dist, boolean[] visit){

        int min = Integer.MAX_VALUE, min_index = -1;
        for(int v=0; v<V; v++){
            if(visit[v] == false && dist[v]<=min){
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }

    void printSolution(int dist[])
    {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }

    void dijkstra(int[][] adj, int src){
        int dist[] = new int[V];
        boolean[] visit = new boolean[V];

        for(int i=0; i<V; i++){
            dist[i] = Integer.MAX_VALUE;
            visit[i] = false;
        }

        dist[src] = 0;

        for(int j=0; j<V-1; j++){
            int u = minDistance(dist, visit);

            visit[u] = true;

            for(int v=0;v<V; v++){
                if(!visit[v] && adj[u][j] !=0 && dist[u] != Integer.MAX_VALUE && dist[u] + adj[u][v]<dist[v])
                    dist[v] = dist[u] + adj[u][v];
            }
        }
        printSolution(dist);

    }

    public static void main(String[] args) {

        int[][] adj ={
                        { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                        { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                        { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                        { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                        { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                        { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                        { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                        { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                        { 0, 0, 2, 0, 0, 0, 6, 7, 0 }
                };

        dijkstraMatrix dij = new dijkstraMatrix();
        dij.dijkstra(adj, 0);

    }
}
