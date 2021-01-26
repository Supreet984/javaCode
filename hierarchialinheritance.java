import java.util.Scanner;
import java.util.*;

class A extends C
{
void check(){
//b=10;
//System.out.print(b);
inC();
}
}

class B extends C
{
public
int b;
void mouse(){
System.out.print("english");
inC();
}
}

class C
{
public
void inC(){
System.out.print("maths");
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);
A obj = new A();
obj.check();

B obj1 = new B();
obj1.mouse(); 
}
}

