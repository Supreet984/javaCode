
import java.util.Scanner;
import java.util.*;

class Parent{

void show(){

System.out.println("parentsShow ");
}
}

class Child extends Parent{

void show(){

System.out.println("childsShow ");
super.show();
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

Parent obj1 = new Parent();
obj1.show();

Child obj2 = new Child();
obj2.show();

}
}