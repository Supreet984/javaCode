import java.util.Scanner;
import java.util.*;

class Numbers{

void numb(){

float res=0;
char choice='Y';
int number;
int number2;

while(choice=='Y' || choice=='y'){
Scanner sc = new Scanner(System.in);
System.out.print("Enter two numbers ");
 number=sc.nextInt();
 number2=sc.nextInt();

System.out.print("Enter your choice ");

System.out.println("+ for addition ");
System.out.println("- for subtraction");
System.out.println("* for multiplication");
System.out.println("/ for division");

char operation=sc.next().charAt(0);
switch(operation)
{
case '+': res=number+number2;
          break;

case '-': res=number-number2;
          break;

case '*': res=number*number2;
          break;

case '/': res=(float)number/number2;
          break;

default: System.out.println("incorrect choice");
         break;

}
 System.out.print(res);
 System.out.println("Do you want to calculate more ");
 choice=sc.next().charAt(0);
}
}
}
class Main{
public static void main(String...args){




Numbers numb1 = new Numbers();
 numb1.numb();

}
}
