import java.io.*;

public class Pyramid {

    public static void main(String[] args) {
            Console c =System.console(); 
            int rows = Integer.parseInt(c.readLine("Enter a number for making a pyramid "));

        //     for (int i = 0; i < n; ++i) {

        //         for (int j = 0; j < i; ++j) {
        //             System.out.print("  ");

        //         }
        //           System.out.println("* ");
        //         }

        // } 
        int  k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();

        }
    }
}
