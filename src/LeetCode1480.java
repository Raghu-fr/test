public class LeetCode1480 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        sumOf1DArray(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static int[] sumOf1DArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
}
