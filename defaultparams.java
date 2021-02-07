import java.util.Scanner;
import java.util.*;
class Calculator{
float calc(int number, char choice, int number2=5)
{ float res;
 switch(choice)
{ 
case '+': res=number+number2;
          break;
case '-':  res=number-number2;
         break;
case '*':  res=number*number2;
         break;
case '/':  res=number/number2;
         break;
default:System.out.print("Incorrect Choice");
	return 0;
}
return res;

}
}
class Main{
public static void main(String...args)
{

     Scanner sc = new Scanner(System.in);
     Calculator calcs = new Calculator();
     System.out.println("Enter two numbers");
     int number = sc.nextInt();

     int number2 = sc.nextInt();
	    System.out.println("Enter your choice");
    System.out.println("+ for Addition");
    System.out.println("- for Substraction");
    System.out.println("* for multiplication");
    System.out.println("/ for Division");
		char choice= sc.next().charAt(0);

        float result= calcs.calc(number,choice);
		System.out.print("The result is"+result);
}
}