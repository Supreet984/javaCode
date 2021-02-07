import java.util.Scanner;
import java.util.*;

class Parent{

void show(){

System.out.println("parentsShow ");
}
}

class Child extends Parents{

void show(){

System.out.println("childsShow ");
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

Parent obj1 = new Parent();
obj1.Show();

Child obj2 = new Child();
obj2.Show();

}
}