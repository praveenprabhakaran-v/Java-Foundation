import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;
        int x = Math.min(a, b);

        for(int i =1; i<=x; i++){
            if (a%i ==0 && b%i==0){
                ans = i;
            }
        }
        System.out.println(ans);
        sc.close();
    }
    
}

/*

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(findGCD(a, b));
        sc.close();
    }

    // Fast Euclidean Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

*/
/* 
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Convert to absolute values to handle negative inputs safely
        a = Math.abs(a);
        b = Math.abs(b);
        
        System.out.println(findGCD(a, b));
        sc.close();
    }

    public static int findGCD(int a, int b) {
        // Special case: if both are 0, GCD is undefined (conventionally returns 0)
        if (a == 0 && b == 0) return 0; 
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

*/