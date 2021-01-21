import java.util.Scanner;
import java.util.*;

class fibonacciseries{

void terms(int n){

int i,r,r1,r2;
r=0;r1=1;
System.out.print(r+" ");
System.out.print(r1+" ");
for(i=2;i<n;i++){
r2=r1+r;
System.out.print(r2+" ");
r=r1;
r1=r2;
}
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

int numb;
System.out.print("Enter a number");

numb=sc.nextInt();

fibonacciseries numbers = new fibonacciseries();

numbers.terms(numb);


}
}
