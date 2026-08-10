/*
- non primitive data types are always references
- memory for non primitive datatype are stored in  heap memory
- non primitive types always have default values
example: int x; in np gives zero and bool always return false
 */

class points{
    int x;
    int y;
}
public class non_Primitive_Datatype{
    public static void main(String[] args) {
        
        points p1 = new points();

        p1.x = 10;
        p1.y = 22;
        
        System.out.println(p1.y);
        
        points p2 = p1;
        p2.y = 33;
        System.out.println(p2.y);


    }
}