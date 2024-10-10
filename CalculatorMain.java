import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What would you like your first number to be?");
        int num1 = input.nextInt();
        
        System.out.println("What would you like your second number to be?");
        int num2 = input.nextInt();
        
        Calculator calculator = new Calculator(num1, num2);
        
        calculator.calculate();
    }
}
