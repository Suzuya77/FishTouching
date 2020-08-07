package FishTouching.java.leetCode.LCS;

public class lcsTest {
    public static void main(String[] args) {
        lcs solution = new lcs();

        char[] a = new char[]{'D', 'E', '>', 'G', 'C', 'C', 'C', 'T', 'A', 'G', 'C', 'G', 'D', 'E', '>'};
        char[] b = new char[]{'D', 'E', '>', 'G', 'C', 'G', 'C', 'A', 'A', 'T', 'G', 'D', 'E', '>'};

//        char[] a = new char[]{'C', 'C', 'T', 'A', 'G', 'C'};
//        char[] b = new char[]{'G', 'C', 'A', 'A', 'T'};

        solution.setX(a);
        solution.setY(b);

        System.out.println(solution.LongestCommonSequence(a.length - 1, b.length - 1));
    }
}
