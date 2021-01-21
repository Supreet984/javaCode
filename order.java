import java.util.Scanner;
import java.util.*;

class Main{
public static void main(String...args)
{
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter three numbers");

 int a,b,c;
 
 a = sc.nextInt();
 b = sc.nextInt();
 c = sc.nextInt();

if(a>b)
{
if(b>c)
{
 System.out.print("Decreasing");
}
} 
else if(c>b){
System.out.print("Increasing");
}
else
System.out.print("No order");
 
  

}

}
