import java.util.Scanner;
import java.util.*;

class Parent{

void show(){

System.out.print("Parent show ");

}
}

class Child extends Parent{

void show(){


System.out.print("Child show ");
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