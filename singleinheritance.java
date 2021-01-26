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

class B 
{
public
int b;
void mouse(){
System.out.print("english");
}
}


class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);
A obj = new A();
obj.check();

}
}

