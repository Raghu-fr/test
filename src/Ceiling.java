public class Ceiling{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,20,30,40};
        int ans = ceiling(arr,7);
        System.out.println(ans + "," + arr[ans]);
    }
    public static int ceiling(int arr[], int target){

       if(target > arr[arr.length-1] || target < arr[0]){
           return -1;
       }

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }

        return start;
    }
}