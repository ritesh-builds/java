package OOPs;
class ComplexNumber{
    int x;
    int y;
    ComplexNumber(int x, int y){
        this.x = x;
        this.y = y;
    }

    void print(){
        if(y >= 0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }
    void add(ComplexNumber z2){
        z2.x = 8;
    }
}
public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(1,2);
        z1.print();

        ComplexNumber z2 = new ComplexNumber(4,-9);
        z2.print();

        ComplexNumber z3 = new ComplexNumber(4,0);
        z3.print();
        z1.add(z2);
    }
}
