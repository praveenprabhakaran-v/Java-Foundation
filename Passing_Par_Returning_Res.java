public class Passing_Par_Returning_Res {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println(getMax(a, b));
    }
    public static int getMax(int a, int b){
        if (a > b)
            return a;
        else
            return b;
    }
}
