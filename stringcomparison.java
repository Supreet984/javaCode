import java.util.Scanner;
import java.util.*;

class Stringcomparison{

void comparestrings(String string1,String string2){

if(string1.equals(string2)){

System.out.print("Strings are equals ");

}

else{
System.out.print("Strings are not equal ");
}

}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter first string ");
String string1=sc.next();

System.out.print("Enter second string ");
String string2=sc.next();

Stringcomparison obj1 = new Stringcomparison();
obj1.comparestrings(string1,string2);

}
}