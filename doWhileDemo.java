import java.util.Scanner;
import java.util.*;
class Calculator{
void calc()
{ float res=0;
char more='y';
Scanner sc = new Scanner(System.in);
 do{
	System.out.println("Enter two numbers");
     	int number = sc.nextInt();
	int number2 = sc.nextInt();
	System.out.println("Enter your choice");
    	System.out.println("+ for Addition");
    	System.out.println("- for Substraction");
    	System.out.println("* for multiplication");
    	System.out.println("/ for Division");
	char choice= sc.next().charAt(0);
	switch(choice)
	{ case '+': res=number+number2;
       		   break;	
	case '-':  res=number-number2;
      		   break;
	case '*':  res=number*number2;
     		    break;
	case '/':  res=number/number2;
       		  break;
	default:System.out.print("Incorrect Choice");
	
	}
	System.out.print("The result is"+res);
	System.out.print("Want to use one more time?");
         more = sc.next().charAt(0);
  }while(more == 'y');


}
}
class Main{
public static void main(String...args)
{  
     Calculator calcs = new Calculator();
        calcs.calc();
		
}
}