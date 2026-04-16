public class CalculatorObj {
    public static void main (String[] args){
        
    }
    public double sum (double a, double b){
            return a + b;
        }
    public double sub (double a, double b){
            return a - b;
        }
    public double div (double a, double b){
            if (b == 0){
                return 0;
            } else {
                return a / b;
            }
        }
    public double mult (double a, double b){
            return a * b;
        }
}
