import java.util.Scanner;
import java.util.*;

class Numbers{

void insertionsort(int[] arr){

int i,j;
int n=arr.length;

for(i=1;i<n;i++){

int key=arr[i];
j=i-1;

while(j>=0 && arr[j]>key)
{
arr[j+1] = arr[j];
j=j-1;
}
arr[j

}
for(i=0;i<arr.length;i++)
{
System.out.print(arr[i]);
}
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

int[] arr = new int[10];
System.out.print("Enter the number ");

for(int i=0;i<arr.length;i++){

arr[i]=sc.nextInt();

}
Numbers numb1 = new Numbers();
numb1.insertionsort(arr);
}
}