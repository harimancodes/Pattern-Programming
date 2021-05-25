import java.util.*;

public class HollowFullPyramid {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            if (i == 0)
                System.out.print("*");
            else if (i == n - 1) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < 2; j++) {
                    System.out.print("*");
                    for (int k = 0; k <(i*2-1); k++) {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
