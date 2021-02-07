import java.util.Scanner;
import java.util.*;

class Marks{
void student(){

int i;
String name;
float marks;
int rollnumber;
sum=0;

System.out.print("Enter a name ");
name=sc.next();

System.out.print("roll number");
rollnumber=sc.nextInt();

System.out.print("enter marks of 5 subjects ");
for(i=0;i<5;i++){

a[i]=sc.nextInt();
sum+=a[i];
}
marks=sum/5;
System.out.print("marks is "+marks);

}
}

class Main {
public static void main(String...args){

Scanner sc = new Scanner(System.in);
int[] arr = new int[5];

Marks student1 = new Marks();
student1.student();
}
}