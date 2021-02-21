import java.util.Scanner;
import java.util.*;

class Employee{
String name;
int id;
int salary;
String designation;

Employee(Employee A){

name=A.name;
id=A.id;
salary=A.salary;
designation=A.designation;
}

Employee(int id,String name,int salary,String designation){
this.id=id;
this.name=name;
this.salary=salary;
this.designation=designation;
}

Employee(){
id=1;
name="util";
salary=100000;
designation="manager";
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);


Employee util = new Employee();
System.out.print("Enter your name ");
String name=sc.next();


System.out.print("Enter your id ");
int id=sc.nextInt();

System.out.print("Enter your salary per annum ");
int salary=sc.nextInt();

System.out.print("Enter your designation ");
String designation=sc.next();


Employee emp2 = new Employee(id,name,salary,designation);

Employee emp3 = new Employee(emp2);

System.out.println("object from default constructor ");
System.out.print(util.name+"\t"+util.id+"\t"+util.salary+"\t"+util.designation+"\t");

System.out.print("object from paramatrized constructor ");
System.out.print(emp2.id+"\t"+emp2.name+"\t"+emp2.salary+"\t"+emp2.designation+"\t");

System.out.print("object from copy constructor ");
System.out.print(emp3.id+"\t"+emp3.name+"\t"+emp3.salary+"\t"+emp3.designation+"\t");

}
}