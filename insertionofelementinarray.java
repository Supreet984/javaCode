import java.util.Scanner;
import java.util.*;

class numbers{

void numb(int number,int[] arr,int pos){
int i;
for(i=10;i>pos;i--)
{
arr[i]=arr[i-1];
}
arr[pos]=number;
for(i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}

class Main{

public static void main(String...args){
int i;
Scanner sc = new Scanner(System.in);
int[] arr = new int[11];
System.out.print("enter an array");
for(i=0;i<10;i++){
arr[i]=sc.nextInt();
}

int number;
System.out.print("enter a number");
number=sc.nextInt();

System.out.print("enter a position");
int position=sc.nextInt();

numbers numb1 = new numbers();
numb1.numb(number,arr, position); 

}
}