public class Array {
    public static void main(String[] args) {
        // int[]a;
        // a = new int[3];

        // int[]a = new int[3];
        
        // int[]a = {10,20, 30}

        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        System.out.println("Length: " + a.length);
        System.out.println(a[1]);

        a[1] = 200;
        System.out.println(a[1]);


    }
}
