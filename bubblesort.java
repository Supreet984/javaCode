import java.util.Scanner;
import java.util.*;

class Numbers{

void bubblesort(int [] arr){

int temp;
int i,j;
n=arr.length;

for(i=0;i<n-1;i++){

for(j=0;j<n-1-i;j++){


if(arr[j]>arr[j+1]){


temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
for(i=0;i<arr.length;i++){

System.out.println(arr[i]);

}
}
}

class Main{

public static void main(String...args){

Scanner sc = new Scanner(System.in);

int [] arr = new int[10];

System.out.println("Enter the number ");

for(int i=0;i<arr.length;i++){

arr[i]=sc.nextInt();

}

Numbers numb1 = new Numbers();
numb1.bubblesort(arr);
}
}