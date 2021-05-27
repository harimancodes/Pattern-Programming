import java.util.Scanner;

public class InvertedHalfHollowPyramid {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the value of n : ");
       int n=sc.nextInt();
       for (int i = n-1; i >=0; i--) {
       
        if (i == 0)
            System.out.print("*");
        else if (i == n-1) {
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
