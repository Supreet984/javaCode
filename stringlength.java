import java.util.Scanner;
import java.util.*;

class Stringlength{

void comparelength(String string1,String string2){

int length = string1.length();

int breadth = string2.length();

System.out.println("The length of string is "+length);
System.out.println("The length of string is "+breadth);

}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the string ");

String string1 = sc.next();

System.out.println("Enter the string ");
String string2 = sc.next();

Stringlength obj1 = new Stringlength();
obj1.comparelength(string1,string2);

}
}