//*********
// *******
//  *****
//   ***
//    *
package Pattern_Printing;

public class pattern8 {

    public static void printPattern(int n) {
        for (int i = n; i >= 1; i--) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
