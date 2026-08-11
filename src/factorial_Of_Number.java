import java.util.Scanner;

public class factorial_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while(n > 0){
            i = i*n;
            n--;
        }
        System.out.println("result:"+ i);
    }
    
}
