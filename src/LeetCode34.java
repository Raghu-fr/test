public class LeetCode34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(nums,target);
        for(int n:ans){
            System.out.println(n);
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                result[0] = mid;
                end = mid-1;  //finding first occurrence
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        start = 0;
        end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                result[1] = mid;
                start = mid+1;  //finding last occurrence
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return result;

    }
}


