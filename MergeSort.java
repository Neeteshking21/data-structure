
public class MergeSort{
    public static void main(String[] args){
        int [] arr= {5,7,3,1,8,4,2};
        int left = 0, right=arr.length+1, mid= (left+right)/2;
        Merge(arr, left, mid, right);
      //   for(int i=0; i<arr.length; i++)
      //    System.out.println(arr[i]);
     }

     static void Merge(int arr[], int left, int mid, int right){
        int i = left, j=mid+1,k=0;
        int arr2[] = new int[left+ right +1];
         while(i<=mid && j<=right){
            if(arr[i]> arr[j]){
               arr[k] = arr[j];
               j++;
               k++;
            }
            else{
               arr[k] = arr[i];
               i++;
               k++;
            }
         }
         
            while(j<=right){
               arr2[k] = arr[j];
               j++;
               k++;
            }
         
         
            while(i<=mid){
               arr2[k] = arr[i];
               i++;
               k++;
            }
         
     }
}