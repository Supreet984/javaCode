import java.util.Scanner;
import java.util.*;

class Factorial
{
  public static void main(String...args)
 
{   
    int i, fact=1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number");
    int a = sc.nextInt();
   
    for(i=a;i>1;i--)
{   
    fact=fact*i;
}
  System.out.print("Factorial is "+fact);

}
}
