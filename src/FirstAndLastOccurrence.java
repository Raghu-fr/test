public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 10, 10, 10, 10, 10, 10,23,25,29,29};
        int target = 10;
//        int resF = firstOccurrence(arr, target);
//        System.out.println(resF);
//        int resL = lastOccurrence(arr,target);
//        System.out.println(resL);
//        int res = fistAndLastOccurrence(arr,target, false);
//        System.out.println(res);

        int[] ans = new int[2];
        ans[0] = firstOccurrence(arr,target);
        ans[1] = lastOccurrence(arr,target);

        for(int n : ans){
            System.out.print(n + " ");
        }
    }

    public static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static int fistAndLastOccurrence(int[] arr,int target,boolean isFirst){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                if(isFirst){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}
