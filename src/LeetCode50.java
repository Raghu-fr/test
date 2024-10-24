public class LeetCode50 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(myPow(x,20));
    }
    public static int myPow(double x,int n){
        double y = Math.pow(x,n);
        return (int)y;
    }
}
