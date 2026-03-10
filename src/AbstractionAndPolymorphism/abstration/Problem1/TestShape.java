package AbstractionAndPolymorphism.abstration.Problem1;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        Square square = new Square(30);

        System.out.println("The area of Circle is: "+circle.calculateArea());
        System.out.println("The area of Square is: "+square.calculateArea());
    }
}
