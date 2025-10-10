package Array;

public class area {
    public static void printArea( int side){
       int area = side*side;
        System.out.println( "The area of square is: " +area);
    }

    public static void main(String[] args) {
       printArea(4);
       printArea(2);
       printArea(17);
    }
}
