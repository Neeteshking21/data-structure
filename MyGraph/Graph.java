import java.util.*;


public class Graph {

    private int V;
    private LinkedList<Integer> arr[];

    Graph(int v){
        V = v;
        arr = new LinkedList[v];

        for(int i=0; i<v; i++)
            arr[i] = new LinkedList<Integer>();
    }

    public void addEdge(int source, int destination){
        arr[source].add(destination);
        arr[destination].add(source);
    }

    public void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        boolean[] isVisit = new boolean[V];
        q.add(v);

        while(!q.isEmpty()){
            int ele = q.poll();
            System.out.print(ele + " ");
            isVisit[ele] = true;
            for(int innerEle: arr[ele]){
                if(!isVisit[innerEle]){
                    isVisit[innerEle] = true; 
                    q.add(innerEle);}
            }
        }

    }

    public void dfsUtill(int i, boolean[] isVisit){
        isVisit[i] = true;
        System.out.print(i + " ");

        for(int ele: arr[i]){
            if(!isVisit[ele])
                dfsUtill(ele, isVisit);
        }
    }

    public void dfs(int v){
        boolean[] isVisit = new boolean[V];

        for(int i=0;i<V; i++){
            if(isVisit[i] == false)
                dfsUtill(i, isVisit);
        }
    }

    public static void main(String[] args) {
        Graph grp = new Graph(5);

        grp.addEdge(0, 1);
        grp.addEdge(1, 4);
        grp.addEdge(4, 3);
        grp.addEdge(3, 2);
        grp.addEdge(2, 0);

        grp.bfs(0);
        System.out.println();
        System.out.println("DFS");
        grp.dfs(0);
    }
}
