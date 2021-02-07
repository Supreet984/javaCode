import java.util.Scanner;
import java.util.*;

class Marks{

void student(){

int a[5],i;
string name;
float percentage;
int rollnumber;
sum=0;

System.out.print("Enter name of student ");
name=sc.next;

System.out.print("roll number ");
roll number=sc.nextInt();

for(i=0;i<5;i++){
a[i]=sc.nextInt();
sum=sum+a[i];

}
percentage=sum/5;
System.out.print("The percentage is "+percentage);
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

Marks student1 = new Marks();
student1.student();
}
}
