public class AbsoluteValue {


    public static void main(String[] args) {
        int[] arr = {1,4,5,7,14,20,21,25,26,32,35,37,39,41,43,47,49};
        int[] ans= rangeOfInfiniteArray(arr,24);
        int result = binarySearchInRange(arr,24,ans[0],ans[1]);
        System.out.println(result);


    }

    public static int[] rangeOfInfiniteArray(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            start = end;
            end = end*2;
        }
        int[] ans = new int[2];
        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    public static int absoluteValueWithBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;


        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return 0;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        int ceil = start;
        int floor = end;


        if (floor < 0){
            return Math.abs(target - arr[ceil]);
        }
        else if(ceil > arr.length-1){
            return Math.abs(target - arr[floor]);
        }
        else{
            int ceil_diff = Math.abs(target - arr[ceil]);
            int floor_diff = Math.abs(target - arr[floor]);
            return Math.min(ceil_diff,floor_diff);
        }
    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = end-1;
            }
        }
        return -1;
    }

    public static int binarySearchInRange(int[] arr,int target, int start, int end){

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return target;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static int firstOccurrenceBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = end-1;
            }
        }
        return ans;
    }

    //havent finished the whole code yet but yea, need some tweaking.

}
