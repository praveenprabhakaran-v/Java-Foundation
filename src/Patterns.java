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
