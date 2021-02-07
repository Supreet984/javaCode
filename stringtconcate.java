import java.util.Scanner;
import java.util.*;


class Concattened{

void stringconcate(String string1,String string2){

String result =string1.concat(string2);

System.out.print("Strings are concat "+result);

}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the first string ");
String string1=sc.next();

System.out.print("Enter the second string ");
String string2=sc.next();

Concattened obj1 = new Concattened();
obj1.stringconcate(string1,string2);

}
}