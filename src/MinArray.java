public class MinArray {
    public static void Minimum(int[] arr){
        int Min = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){
            if (Min > arr[i]){
                Min = arr[i];
            }
        }
        System.out.println(Min);

    }
    public static void main(String[] args) {
        int[] array  = {10, 49, 30, 29};
        Minimum(array);
    }
    
}