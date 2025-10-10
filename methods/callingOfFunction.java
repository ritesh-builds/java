package methods;

public class callingOfFunction {
    public static void Rishika(){
        System.out.println("Rishika");
        Ishika();
    }
    public static void Ishika(){
        System.out.println("Ishika");
        Ritesh();
    }
    public static void Ritesh(){
        System.out.println("Ritesh");
//        Rishika();  This calling make infinite call.
    }
    public static void main(String[] args) {
//        function calling itself.
        Rishika();
    }
}
