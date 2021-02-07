import java.util.Scanner;
import java.util.*;


class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the string ");
String string1=sc.next();

System.out.print("Enter the index ");
int index = sc.nextInt();

char c = string1.charAt(index);
System.out.print(c);


}
}
 