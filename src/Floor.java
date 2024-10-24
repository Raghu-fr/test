public class Floor {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,13,25,48,79};
        int ans = Floor(arr,26);
        System.out.println(ans+ "," +arr[ans]);
    }

    public static int Floor(int arr[], int target){

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

        return end;
    }

}
