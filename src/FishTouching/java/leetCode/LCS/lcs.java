package FishTouching.java.leetCode.LCS;

public class lcs {
    private char[] x;
    private char[] y;

    public int LongestCommonSequence (int n, int m){
        if (n < 0 || m < 0) {
            return 0;
        }

        if (x[n] == y[m]) {
//            System.out.println("n:  "+ x[n] +" m : "+ y[m]);
            return LongestCommonSequence(n - 1, m - 1) + 1;
        }

        return max(LongestCommonSequence(n - 1, m), LongestCommonSequence(n, m - 1));

    }

    private int max(int a, int b){
        if (a >=  b){
            return a;
        }
        return b;
    }

    public void setX(char[] x) {
        this.x = x;
    }

    public void setY(char[] y) {
        this.y = y;
    }
}
