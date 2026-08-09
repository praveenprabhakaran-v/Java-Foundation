public class swaptwonumbers{
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("swapped a: " + a);
        System.out.println("Swapped b: "+ b);
    }
}