import java.util.*;

public class HashSetInbuild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> myhs = new HashSet<>();
        /*
            add(element);
            contains(element):- returns true if exist
            remove(element)
            isEmpty():- returns true if hashSet is empty
            size(); returns size of HashSet

            // Problems that can be solve easily by hashSet
            1.Count Distinct Elements
            2.Union of two arrays
            3. Intersection of two arrays
        
        myhs.add(10);
        myhs.add(20);
        myhs.add(30);
        myhs.add(40);
        myhs.add(50);

        if(myhs.contains(20))
            System.out.println("20 is Exist");
        System.out.println(myhs);
        myhs.remove(20);

        if(myhs.isEmpty())
            System.out.println("Empty");
        else   System.out.println("Not empty");
        
        System.out.println(myhs);
        System.out.println("Size is:" + myhs.size());
        
        ===============================================================================
        ===============================================================================        

        // 1.Count distinct Elements
        
        
        System.out.println("Enter Elements in hashSet");
        for(int i=0; i<=5;i++)  
            myhs.add(sc.nextInt());

        System.out.println("Distinct Elements: "+myhs.size());

    ================================================================================
    ================================================================================

        2. Union of Two arrays
        
        System.out.println("Enter Elements in hashSet");
        int[] a = {1,2,3,4,5,6};
        int[] b = {2,4,6,8,10}
        for(int x: a)  
            myhs.add(x);
        
        for(int y: b)
            myhs.add(y);

        for(int z: myhs)
            System.out.print(z +" ");
            */

     /*================================================================================
     ================================================================================

        3. Intersection of two arrays


        int[] a = {1,2,3,4,5,6};
        int[] b = {2,4,6,8,10};
        int Intersection = 0;
        for(int x: a)  
            myhs.add(x);
        
        for(int y: b){
            if(myhs.contains(y)){
                Intersection++;
                myhs.remove(y);
            }
        }

        System.out.println(Intersection);
        */
    }
}
