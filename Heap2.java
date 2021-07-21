import java.util.ArrayList;

public class Heap2 {
    ArrayList<Integer> arr = new ArrayList<>();
    void insert(int element){
        int n = arr.size()+1;
        arr.set(n, element);
        int i=n;
        while(i>1){
            int parent = i/2;
            if(arr.get(parent) < arr.get(n)){
                int temp = arr.get(n);
                arr.set(n, arr.get(parent));
                arr.set(parent, temp);
                i = parent;
            }
            else{
                return;
            }
        } 

    }
}
