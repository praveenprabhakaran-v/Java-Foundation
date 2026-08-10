import java.util.Scanner;

public class countingDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int digits = sc.nextInt();

        int count = 0;
        while (digits > 0){
            digits = digits / 10;
            count = count + 1;
            //count += 1; 
        }
        System.out.println("number of digits: " + count);

    }
}