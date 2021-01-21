

import java.util.Scanner;
import java.util.*;

class numbers{
int numb=1;
void factorial(int arr[]){

for(int i=0;i<arr.length;i++){

for(int j=arr[i];j>1;j--){
numb=numb*j;
}
arr[i]=numb;
numb=1;
}

for(int i=0;i<5;i++)
{
System.out.println(arr[i]);
}
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter an array");
int arr[]=new int [5];


for(int i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}

numbers numb1 = new numbers();
numb1.factorial(arr);
}
}
