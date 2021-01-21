import java.util.Scanner;
import java.util.*;

class Number{

void numb1(){
Scanner sc = new Scanner(System.in);
char more;
int flag=1;
int i,n;
do {

System.out.print("Enter a number");
n=sc.nextInt();
for(i=2;i<n;i++){
  if(n%i==0){
flag=1;
break;
}
}
if(flag==0){
System.out.print("Prime number");
}
else{
System.out.print("Not prime number");
}
	System.out.print("Want to use one more time?");
         more = sc.next().charAt(0);
}while(more == 'y');
}
}
class Main{
public static void main(String...args){

Number num = new Number();
num.numb1();
}
}
