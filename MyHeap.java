
import java.util.Scanner;

public class MyHeap{

    public static void main(String[] args){
        Heap2 myhp = new Heap2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element for insertion");
        int ele = sc.nextInt();
        myhp.insert(ele);
    }   

}
