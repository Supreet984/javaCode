import java.util.Scanner;
import java.util.*;

class Numbers{

void numb(int[] arr){
int sum=0;
for(int i=0;i<arr.length;i++){
   
sum=sum+arr[i];
}
System.out.print("The addition of number is"+sum);
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the number ");
int arr[]=new int[10];
for(int i=0;i<10;i++)
{
arr[i]=sc.nextInt();
}


Numbers numb1 = new Numbers();
numb1.numb(arr);
}
}