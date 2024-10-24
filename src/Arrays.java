
public class Arrays {
    public static void main(String[] args) {
        int arr[] = {-15,1,2,3,4,5,6,7,8,9,10};
        PrintArray(arr);
        RemoveEven(arr);
        RemoveOdd(arr);
        ReverseArray(arr);
        MinValue(arr);
        SecondMax(arr);

    }

    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void RemoveEven(int arr[]){
        int oddCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                oddCount++;
            }
        }
        int ans[] = new int[oddCount];
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                ans[idx] =  arr[i] ;
                idx++;
            }
        }
        PrintArray(ans);
    }

    public static void RemoveOdd(int arr[]){
        int evenCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                evenCount++;
            }
        }
        int ans[] = new int[evenCount];
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                ans[idx] =  arr[i] ;
                idx++;
            }
        }
        PrintArray(ans);

    }

    public static void ReverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        PrintArray(arr);

    }

    public static void MinValue(int arr[]){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void SecondMax(int arr[]){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] < max && arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }

}
