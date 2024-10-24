public class SearchInRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = rotatedArray(arr,8);
        if(ans == -1){
            System.out.println("Element not present in the array");
        }
        else{
            System.out.println("Element present at:" + ans);
        }
    }
    public static int rotatedArray(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[start]<=arr[mid]){
                if(arr[start] <= target && target<=arr[mid]){
                    return binarySearch(arr,start,mid,target);
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[end]){
                    return binarySearch(arr,mid,end,target);
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int start,int end,int target){

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
