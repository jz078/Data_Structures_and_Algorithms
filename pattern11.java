//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1
package Pattern_Printing;

public class pattern11 {

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if( (i + j) % 2 == 0) System.out.printf("1 ");
                if( (i + j) % 2 != 0) System.out.printf("0 ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPattern(5);
    }
}