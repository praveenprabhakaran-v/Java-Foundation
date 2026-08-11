import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;

        while (i <= 5){
            int j =1;
            while (j <= 5){
                System.out.print("$");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}

/*
How it works :-
The outer while loop (i) controls the 5 rows.
The inner while loop (j) controls the 5 $ symbols in each row.
System.out.print("$") stays on the same line.
System.out.println() moves the cursor to the next line after each row.
*/

