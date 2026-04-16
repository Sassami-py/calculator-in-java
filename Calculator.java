import java.util.Scanner;

public class Calculator{
  public static void main (String[] args){
          Scanner reader = new Scanner(System.in);
      
      while (true){
    
    System.out.println ("Insert 'end' in 'operator' wen you decide to exit the program.");
    System.out.println ("Insert a number:");
      double number1 = reader.nextDouble();
    
    System.out.println ("insert a operator (+, -, * or /): ");
    String operator = reader.next();
    
    System.out.println ("Insert the last number: ");
    double number2 = reader.nextDouble();
    
    if (operator.equals("+")) {
      double result = number1+number2;
      System.out.println (number1+" + "+number2+" = "+result);
      
      } else if (operator.equals("-")){
      double result = number1-number2;
      System.out.println (number1+" - "+number2+" = "+result);
      
      } else if (operator.equals("*")){
      double result = number1*number2;
      System.out.println (number1+" * "+number2+" = "+result);
      
      } else if (operator.equals("/")){
          if (number2 == 0){
              System.out.println ("Invalide division. Impossible divide by 0!");
          } else {
              double result = number1/number2;
              System.out.println (number1+" / "+number2+" = "+result);
          }
      } else {
          System.out.println ("Exiting the system.");
      break;
      }
      }
    }
  }
