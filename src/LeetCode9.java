public class LeetCode9 {
    public static void main(String[] args) {
        int n = 1871;
        int m = n;
        int rem = 0;
        int rev = 0;

        while(m>0){
            rem = m%10;
            rev = rev*10 + rem;
            m = m/10;
        }
        System.out.println(rev);
        if(n==rev){
            System.out.println("Palindromic number");
        }
        else{
            System.out.println("Not Palindromic");
        }
    }
}
