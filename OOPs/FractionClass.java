package OOPs;
class Fraction{
    int num;
    int den;
    Fraction(int num, int den){
        this.num = num;
        this.den = den;
    }
    void print(){
        System.out.println(num+"/"+den);
    }
    void add(Fraction f){
        num += num*f.den + den*f.num;
        den *= den * f.den;
    }
    void multiply(Fraction f){
        this.num = f.num * this.num;
        this.den = f.den * this.den;
    }
    void divide(Fraction f){
        this.num = f.den * num;
        this.den = f.num * den;
    }
    int hcf(int a, int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
    void simplify(){
        boolean isNegative = (num*den < 0) ? true : false;
        num = Math.abs(num);
        den = Math.abs(den);
        int gcd = hcf(num,den);
        num = num/gcd;
        den = den/gcd;
        if(isNegative) num = -num;
    }
}
public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        f1.print();

        Fraction f2 = new Fraction(1,2);
        f2.print();

        f1.add(f2);
        f1.print();

        f1.multiply(f2);
        f1.print();

        f1.divide(f2);
        f1.print();
    }
}
