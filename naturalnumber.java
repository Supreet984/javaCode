import java.util.Scanner;
import java.util.*;

class Numbers
{
public
int a,i;
void naturalnumber(){
for(a=1;a<=i;a++)
{
System.out.print(a+" is natural number");
}
}
}
class Main{
public static void main(String...args){
Scanner sc = new Scanner(System.in);
Numbers num = new Numbers();
System.out.print("Enter a number");
 num.i= sc.nextInt();
num.naturalnumber();
}
}  