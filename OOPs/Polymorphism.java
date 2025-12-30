package OOPs;

public class Polymorphism {
    public static class dog{
        void speak(){
            System.out.println("bow bow");
        }
    }
    public static class cat{
        void speak(){
            System.out.println("mew mew");
        }
    }
    public static class lion{
        void speak(){
            System.out.println("rorrrrrrrrrrr");
        }
    }
    public static class human{
        void speak(){
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        human h = new human();
        dog d = new dog();
        cat c = new cat();
        lion l = new lion();

        h.speak();
        d.speak();
        c.speak();
        l.speak();
    }
}
