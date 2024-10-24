import java.util.Arrays;

public class BinarySearch {
    //leetcode 704
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(arr,5));
        System.out.println(search(arr,10));
        System.out.println(binarySearchWithLibrary(arr,5));
        int ans = Arrays.binarySearch(arr,5);
        System.out.println(ans);

    }

public static int search(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                return ans;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return ans;
}
public static int binarySearchWithLibrary(int[] arr,int target){
        return Arrays.binarySearch(arr,target);
    }
}
