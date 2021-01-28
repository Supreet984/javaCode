import java.util.Scanner;
import java.util.*;

class calc extends calculator {

void calculate(int number1,int number2,choice){
int result=0;

switch(choice){

case '+':  result = addition(number1,number2);
break;

case '-':  result = subtraction(number1,number2);
break;

case '*':  result = multiplication(number1,number2);
break;

case '/':  result = division(number1,number2);
break;

default:  System.out.print("Incorrect choice ");

}
}
}

class calculator {
public
int addition(int number1,int number2){
return number1+number2;
}

int subtraction(int number1,int number2){
return number1-number2;
}

int multiplication(int number1,int number2){
return number1*number2;
}

int division(int number1,int number2){
return number1/number2;

}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter two numbers");


int number1 = sc.nextInt();
int number2 = sc.nextInt();

System.out.print("Enter your choice +,-,*,/");

char choice = sc.next.charAt(0);

calc object = new calc();
object.calculate(number1,number2,choice);

}
}