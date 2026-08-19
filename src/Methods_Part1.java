public class Methods_Part1 {
    class point{int x, int y}
    public static void main(String[] args) {
        point p = new point();
        
        p.x = 5;
        p.y = 10;

        fun(p);
        System.out.println(p.x+ " " + p.y);
    }
    public static void fun(point p){
        p = new point();
        
        p.x = 10;
        p.y = 10;
    }
}
