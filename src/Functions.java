import java.util.Scanner;

public class Functions {
    
    
    
    
    public static void main(String[] args) {
        sum();
    }
    
    
    
    
    
    
    static void sum(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int Num1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int Num2 = sc.nextInt();

        int Answer = Num1 + Num2;
        System.out.println("Result: "+ Answer);

    }
    
}

