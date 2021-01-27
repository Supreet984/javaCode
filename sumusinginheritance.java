import java.util.Scanner;
import java.util.*;

class A extends B{

void calculator(int a,int b){
int result = addition(a,b);
System.out.print(result);
}
}

class B{

int addition(int a,int b){
return a+b;

}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter two numbers ");

int numb1=sc.nextInt();
int numb2=sc.nextInt();

A obj = new A();
obj.calculator(numb1,numb2);

}
}