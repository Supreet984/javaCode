import java.util.Scanner;
import java.util.*;

class Comparestring{

void student(String string1, String string2){

int result = string1.compareTo(string2);

if(result<0){
System.out.print("string2 is greater "+string2);
}

else if(result == 0){
System.out.print("Both are equal "+string2+string1);
}

else{
System.out.print("string1 is greater "+string1);
}

}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the string ");
String string1=sc.next();

System.out.print("Enter the 2nd string ");
String string2=sc.next();


Comparestring obj1 = new Comparestring();
obj1.student(string1,string2);

}
}