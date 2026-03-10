package equals;

public class equalsAndHashCodeTest {
    public static void main() {
        Person person1 = new Person("Jiya", 21, "1234");
        Person person2 = new Person("Jiya", 21, "1234");

        if(person1 == person2) {
            System.out.println("Equal");
        }else  {
            System.out.println("Not Equal");
        }

        if(person1.equals(person2)) {
            System.out.println("Equal");
        }else  {
            System.out.println("Not Equal");
        }
    }
}
