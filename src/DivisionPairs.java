import java.util.Scanner;

public class DivisionPairs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i<=5; i++){
            System.out.println("Enter your pairs for "+i+"st iteration");

            int a = sc.nextInt();
            int b = sc.nextInt();

            if ( b != 0){
                System.out.println("Result: " +(a /b) );
            }else{
                System.out.println("cannot divide by zero");
            }
        }
    }
}