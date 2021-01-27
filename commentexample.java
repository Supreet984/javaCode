import java.util.Scanner;
import java.util.*;

class A extends B
{
void check(){
b=10;
System.out.print(b);
mouse();
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

/*
This is commented line 
*/
// This is single line comment

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

}
}

