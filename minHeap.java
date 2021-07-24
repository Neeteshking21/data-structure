// import java.util.Scanner;
    
public class minHeap{
    public static void main(String[] args) {
        MyHeap myh = new MyHeap(5);
        myh.insert(10);
        myh.insert(50);
        myh.insert(20);
        myh.insert(40);
        myh.insert(30);

        myh.printHeap();
        
    }
}

class MyHeap{
    private static int[] heap;
    private int maxsize;
    private static int size;

    public MyHeap(int maxsize){
        this.maxsize = maxsize;
        size = 0;
        heap = new int[this.maxsize];
        // heap[0] = Integer.MAX_VALUE;
    }

    private static int parent(int current){
        return (current-1)/2;
    }

    private static void swap(int current, int parent){
        int temp = heap[current];
        heap[current] = heap[parent];
        heap[parent] = temp;
    }

    public void insert(int item){
        heap[size] = item;
        int current = size;
        while(heap[current] < heap[parent(current)]){
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }

    public void printHeap(){
       for(int i=0; i<size;i++)
       System.out.print(heap[i] +" ");  
    }

}