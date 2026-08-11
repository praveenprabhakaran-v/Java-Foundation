import java.util.Scanner;

public class PyramidPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for(int i =1; i <= rows; i++){

            for(int j = 1; j<=rows - i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k<=(2*i+1); k++){
                System.out.print("*");
            }

            System.out.println();


        }


    }
}
/*
public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5; // Height of the pyramid

        // Outer loop handles the rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop 1: Prints leading spaces to center the pyramid
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Inner loop 2: Prints the stars for each row
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            // Moves cursor to the next line after completing a row
            System.out.println();
        }
    }
}

*/