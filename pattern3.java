//1
//12
//123
//1234
//12345
package Pattern_Printing;

public class pattern3 {

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}


