import java.util.Scanner;

public class Calculator{
  public static void main (String[] args){
    
    Scanner reader = new Scanner(System.in);
    
    System.out.println ("Insert a number:");
      int number1 = reader.nextInt();
    
    System.out.println ("insert a operator (+, -, * or /): ");
    String operator = reader.next();
    
    System.out.println ("Insert the last number: ");
    int number2 = reader.nextInt();
    
    if (operator.equals("+")) {
      int result = number1+number2;
      System.out.println (number1+operator+number2+"="+result);
      
      } else if (operator.equals("-")){
      int result = number1-number2;
      System.out.println (number1+operator+number2+"="+result);
      
      } else if (operator.equals("*")){
      int result = number1*number2;
      System.out.println (number1+operator+number2+"="+result);
      
      } else if (operator.equals("/")){
      int result = number1/number2;
      System.out.println (number1+operator+number2+"="+result);
      
      } else {
      System.out.println ("Invalid Operation!");
      }
    }
  }
