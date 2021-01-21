import java.util.Scanner;
import java.util.*;

class numbers{

void numb(int number,int[] arr){
int i;
int flag=0;
for(i=0;i<arr.length;i++)
{
if(flag==1){
arr[i-1]=arr[i];
}
if(arr[i]==number){
flag=1;
}
}
for(i=0;i<10;i++){
System.out.print(arr[i]);
}
}
}

class Main{

public static void main(String...args){
int i;
Scanner sc = new Scanner(System.in);
int[] arr = new int[10];
System.out.print("enter an array");
for(i=0;i<10;i++){
arr[i]=sc.nextInt();
}

int number;
System.out.print("enter a number");
number=sc.nextInt();

numbers numb1 = new numbers();
numb1.numb(number,arr); 

}
}