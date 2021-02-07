import java.util.Scanner;
import java.util.*;

class Student{

public
String name;
int Class;
int rollNo;


Student() {
name= "Util ganguly";
Class= 12;
rollNo=984;
System.out.print("Construtor called");
}
protected 
void finalize()  {
System.out.print("Destructor is called");
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);


Student student1 = new Student();

System.out.println("Student details");
System.out.println("Name: "+student1.name);
System.out.println("Class: "+student1.Class);
System.out.println("rollno: "+student1.rollNo);
student1.finalize();

}
}