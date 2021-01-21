import java.util.Scanner;
import java.util.*;

class Table
{
void tables(int a)
{
  int i;
for(i=0;i<10;i++)
{
  System.out.println(a+"*"+i+"="+a*i);
}
}
}

class Main
{
  public static void main(String...args)
 { Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number to print its table");
   int num=sc.nextInt();
  
 Table tab1 = new Table();
 tab1.tables(num);}
}