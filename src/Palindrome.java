public class Palindrome {
    public static void main(String[] args) {
       boolean s = palindrome(506);
        System.out.println(s);
    }
    public static boolean palindrome(int num){
        int j = num;
        int rem = 0;
        int rev = 0;

        while(num > 0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num /10;
        }
        if(j == rev){
            return true;
        }
        else{
            return false;
        }
    }
}

