//    *
//   ***
//  *****
// *******
//*********
//*********
// *******
//  *****
//   ***
//    *
package Pattern_Printing;

public class pattern9 {

    public static void printPattern(int n) {

//        upper half
        for (int i = 1; i <= n; i++) {

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

//        lower half
        for (int i = n - 1; i >= 1; i--) {

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
