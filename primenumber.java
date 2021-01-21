import java.util.Scanner;
import java.util.*;

class Number{

void numbs(int a){
int flag=0;
for(int i=2;i<a;i++){
if(a%i==0){

 flag=1;
break;
}
}
if(flag==0)
{System.out.print("Prime number");
}
else{
System.out.print("Not prime number");
}
}
}
class Main{
public static void main(String...args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number");

  Number num = new Number();

 int number=sc.nextInt();
 num.numbs(number);
}

}