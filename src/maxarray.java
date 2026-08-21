public class maxarray {
    public static void maximum(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        int[] array  = {10, 49, 30, 29};
        maximum(array);
    }
    
}
