import java.util.Scanner;
import java.util.*;

class Number{

void numbs(int num){

if(num%2==0){
System.out.print("Even");
}
else{
System.out.print("Odd");
}
}
}
class Main{
public static void main(String...args)
{
  Scanner sc = new Scanner(System.in);
  Number num = new Number();
 System.out.println("Enter a number");
 int number=sc.nextInt();
 num.numbs(number);
}

}