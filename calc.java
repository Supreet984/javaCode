import java.util.Scanner;
import java.util.*;

class Numbers{

float numb(int number,int number1, char choice){

float res=0;
switch(choice)
{
case '+': res=number+number1;
          break;

case '-': res=number-number1;
          break;

case '*': res=number*number1;
          break;

case '/': res=(float)number/number1;
          break;

default: System.out.println("incorrect choice");
         break;

}
return res;
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter two numbers ");
int number=sc.nextInt();
int number2=sc.nextInt();

System.out.print("Enter your choice ");

System.out.println("+ for addition ");
System.out.print("- for subtraction");
System.out.print("* for multiplication");
System.out.print("/ for division");

char choice=sc.next().charAt(0);


Numbers numb1 = new Numbers();
float result = numb1.numb(number,number2,choice);
System.out.print(result);
}
}
