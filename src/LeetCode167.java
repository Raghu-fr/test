public class LeetCode167 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        for(int n: twoSum(arr,target)){
            System.out.println(n);
        }
    }
    public static int[] twoSum(int[] arr,int target){


        int[] ans = new int[2];

        for(int pointer1=0; pointer1<arr.length;pointer1++){
            for(int pointer2=1;pointer2<arr.length;pointer2++){
                if(arr[pointer1] + arr[pointer2] == target){
                    ans[0] = pointer1;
                    ans[1] = pointer2;

                    break;
                }
            }
        }

        return ans;
    }
}
