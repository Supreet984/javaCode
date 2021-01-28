import java.util.Scanner;
import java.util.*;

class Student{

public
String name;
int Class;
int rollNo;

Student(Student S){

name = S.name;
Class = S.Class;
rollNo = S.rollNo;
System.out.print(" copy Construtor called");
}

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
Student student2 = new Student(student1);

System.out.println("Student details");
System.out.println("Name: "+student2.name);
System.out.println("Class: "+student2.Class);
System.out.println("rollno: "+student2.rollNo);

}
}