import java.util.Scanner;
public class Calculator
{
    private int num1;
    private int num2;
    
    public Calculator (int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int add()
    {
        return num1 + num2;
    }
    
    public int subtract()
    {
        return num1 - num2;
    }
    
    public int divide()
    {
        return num1 / num2;
    }
    
    public int multiply()
    {
        return num1 * num2;
    }
    
    public void calculate()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add(+), subtract(-), multiply(*), or divide(/)?");
        String op = input.nextLine();
        if (op.equals("+"))
        {
            System.out.println(num1 + " + " + num2 + " = " + add());
        } else if (op.equals("-"))
        {
            System.out.println(num1 + " - " + num2 + " = " + subtract());
        } else if (op.equals("*"))
        {
            System.out.println(num1 + " * " + num2 + " = " + multiply());
        } else if (op.equals("/"))
        {
            System.out.println(num1 + " / " + num2 + " = " + divide());
        }
    }
}
