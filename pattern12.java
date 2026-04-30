//1      1
//12    21
//123  321
//12344321
package Pattern_Printing;

public class pattern12 {

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
//            numbers
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d", j);
            }

//            spaces
            for (int j = i + 1; j <= n; j++) {
                System.out.print(" ");
            }

//            spaces
            for (int j = i + 1; j <= n; j++) {
                System.out.print(" ");
            }

//            numbers
            for (int j = i; j >= 1; j--) {
                System.out.printf("%d", j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}

