public class pyramid_In_While {
    public static void main(String[] args) {
        int rows = 5; 
        int i = 1; // Initializes the outer row tracker

        // Outer loop: manages rows
        while (i <= rows) {
            
            int j = 1; // Initializes spaces counter
            // Inner loop 1: prints leading spaces
            while (j <= rows - i) {
                System.out.print(" ");
                j++;
            }

            int k = 1; // Initializes stars counter
            // Inner loop 2: prints odd number of stars (2 * i - 1)
            while (k <= (2 * i - 1)) {
                System.out.print("*");
                k++;
            }

            System.out.println(); // Moves to the next line
            i++; // Increments row counter
        }
    }
}

