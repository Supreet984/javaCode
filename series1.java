import java.util.Scanner;
import java.util.*;

class Number{

void series(int numb){
int i;
float num=0;
float sum;
sum=0;

for(i=1;i<=numb;i++){
 num=(float)1/i;
 sum+=num;
}
System.out.print(sum);
}
}

class Main{
public static void main(String...args){
Scanner sc = new Scanner(System.in);
System.out.print("enter a number");
int numb = sc.nextInt();

Number arcs = new Number();

arcs.series(numb);
}
}
