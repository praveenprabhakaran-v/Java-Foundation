import java.util.Scanner;

public class MathFunctionGreatestofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        int num_3 = sc.nextInt();

        int answer = Math.max(num_1,(Math.max(num_2, num_3)));
        System.out.println("Largest among 3 input is: "+ answer);
    }
    
}
