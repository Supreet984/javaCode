import java.util.Scanner;
import java.util.*;

class Marks{

void student(){

int i;
  int[] a= new int[5];
String name;
float percentage;
int rollNumber, sum=0;

Scanner sc = new Scanner(System.in);

System.out.print("Enter a name");
name=sc.next();

System.out.print("roll number");
rollNumber=sc.nextInt();

System.out.print("enter marks of 5 subjects");
for(i=0;i<5;i++){
a[i]=sc.nextInt();
sum+=a[i];
}
percentage=sum/5;
System.out.print("Percentage is "+percentage);
}
}

class Main{

public static void main(String...args){

Marks student1 = new Marks();

student1.student();

}
}