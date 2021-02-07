import java.util.Scanner;
import java.util.*;

class CalcArea{

float Area(float radius){
float a;


a=(float)3.14*radius*radius;
return a;
}

float Area(int side){
float r;

r=side*side;
return r;
}

float Area(int length,int breadth){
float b;

b=length*breadth;
return b;

}
}

class Main{
public static void main(String...args){

int c;
float radius;
int side;
int length,breadth;
Scanner sc = new Scanner(System.in);

System.out.print("Enter your choice ");
System.out.print("1 for circle ");
System.out.print("2 for square ");
System.out.print("3 for rectangle ");

 c=sc.nextInt();

CalcArea calculator = new CalcArea();

float result=0;

if(c==1)
{
System.out.print("enter a radius ");
radius=sc.nextInt();
result = calculator.Area(radius);
}
else if(c==2)
{
System.out.print("enter side of square ");
side=sc.nextInt();
result = calculator.Area(side);
}
else{
System.out.print("enter side of rectangle ");
length=sc.nextInt();
breadth=sc.nextInt();
result = calculator.Area(length,breadth);
}

System.out.print("The result is "+result);
}
}
