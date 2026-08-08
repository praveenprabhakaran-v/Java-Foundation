import java.util.Scanner;

public class Greatest0fThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        int num_3 = sc.nextInt();

        if(num_1>= num_2 && num_1>=num_3)
            System.out.println("Number 1 is greater");
        else if (num_2>= num_1 && num_2>=num_3) {
            System.out.println("Number 2 is greater");
        }else{
            System.out.println("Number 3 is greater");
        }
    }
}
