import java.util.Scanner;
import java.util.*;

class Student{

public
String name;
int rollnumber;
float[] marks = new float[5];
float sum=0;
float percentage;
int i;

Student(String name,int rollnumber,float[] marks ) {
this.name=name;
this.rollnumber=rollnumber;

for(i=0;i<5;i++)
{
this.marks[i]=marks[i];
}
  calculatepercentage();
}
void calculatepercentage(){

for(i=0;i<5;i++){
sum=sum+marks[i];
percentage=(sum/5);


}
}
}
class Main{
public static void main(String...args){
int i;


Scanner sc = new Scanner(System.in);


float[] marks = new float[5];

System.out.print("Enter your name ");
String name=sc.next();
System.out.print("Enter roll number ");

int rollnumber=sc.nextInt();
System.out.print("Enter your marks ");

for(i=0;i<5;i++){

marks[i]=sc.nextFloat();
}

Student student1 = new Student(name,rollnumber,marks);

System.out.println(student1.name);
System.out.println(student1.rollnumber);
System.out.println(student1.percentage);

}
}

