package ExceptionHandeling.Calculator;

public class CustomExceptions extends  Exception {
    private double degree;
    public CustomExceptions(double degree) {
        this.degree = degree;
    }

    @Override
    public String getMessage() {
        return "Temperature is too high: "+degree;
    }
    public static void main(String[] args) {
        try {
            double temp = 120;
            if(temp > 100){
                throw new CustomExceptions(temp);
           }
           
        } catch (CustomExceptions e) {
            System.out.println(e.getMessage());
        }
    }
}
