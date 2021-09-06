
public class ceilingOfTargetNum{
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16};
        int target = 11;
        int start = 0;
        int end= arr.length-1;
        System.out.println(end);
        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]>target){
                end = mid;
                } else if(arr[mid]<target){
                    start = mid+1;
                }
                else {
                    System.out.println(arr[mid]);
                }
                
        }
            System.out.println(arr[start]);
            System.out.println(arr[end]);

    }
}