package PowXn;

public class Solution {
    public static void main(String[] args) {
        System.out.println(myPow(-1.0000000000001, -2147483648));
        System.out.println(Math.pow(1.0000000000001, -2147483648));
    }
    private static double myPow(double x, int n){
        if(x == 1d){
            return 1d;
        }
        if(n == Integer.MAX_VALUE && x == -1d){
            return -1d;
        }
        if(n == Integer.MIN_VALUE && x == -1d){
            return 1d;
        }
        if(n > 0){
            double store = x;
            for(int i = 1; i < n; i++){
                x *= store;
            }
            return x;
        } else if (n < 0){
            double temp = 1 / x;
            double store = temp;
            int range;
            if(n == Integer.MIN_VALUE){
                range = Integer.MAX_VALUE;
            } else {
                range = Math.abs(n);
            }
            for(int i = 1; i < range; i++){
                temp *= store;
            }
            return temp;
        } else {
            return 1d;
        }
    }
}
