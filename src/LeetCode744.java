public class LeetCode744 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g','j','p'};
        System.out.println(nextGreatestLetter(arr, 'p'));

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        if(target >= letters[letters.length-1] || target < letters[0]){
            return letters[0];
        }

        while (start <= end) {
            int mid = (start + end)/2;
            if (target >= letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start];
    }


}
