import java.util.Scanner;
import java.util.*;

class Student{

public
String name;
int Class;
int rollNo;


Student(String name, int Class, int rollNo ) {
this.name=name;
this.Class= Class;
this.rollNo=rollNo;
System.out.print(" parameterised Construtor called");
}
}



class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);


Student student1 = new Student("Helper", 11, 884);

System.out.println("Student details");
System.out.println("Name: "+student1.name);
System.out.println("Class: "+student1.Class);
System.out.println("rollno: "+student1.rollNo);

}
}