//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *
package Pattern_Printing;

public class pattern1 {
    public static void printPattern(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5, 5);
    }
}


