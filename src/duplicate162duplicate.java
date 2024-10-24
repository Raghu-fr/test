public class duplicate162duplicate {
    public static int[] twoSum(int[] numbers, int target) {


        int[] ans = new int[2];

        for(int pointer1 = 1;pointer1 < numbers.length; pointer1++){
            for(int pointer2 = 2;pointer2 < numbers.length; pointer2++){
                if(numbers[pointer1] + numbers[pointer2] == target){
                    ans[0] = pointer1;
                    ans[1] = pointer2;
                    break;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        for(int n: twoSum(arr,target)){
            System.out.println(n);
        }
    }
}
