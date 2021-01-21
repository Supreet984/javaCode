import java.util.Scanner;
import java.util.*;

class Numbers{

void numb(int[] arr){

int i;
int max=0;

for(i=1;i<arr.length;i++)
{
if(arr[i]>max){
max=arr[i];
}
}
System.out.print("Maximum number is "+max);
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);


System.out.print("Enter an array of 10 elements");
int arr[] = new int[10];
for(int i=0;i<10;i++)
{
arr[i]=sc.nextInt();
}
Numbers numb1 = new Numbers();
numb1.numb(arr);

}
}