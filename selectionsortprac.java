import java.util.Scanner;
import java.util.*;

class Numbers{

void numb(int[] arr){

int i,j;
int temp;

for(i=0;i<10;i++){

for(j=i;j<10;j++){

if(arr[i]>arr[j]){

temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;

}
}
}
for(i=0;i<10;i++){
System.out.println(arr[i]);
}

}
}






class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);


int [] arr = new int[10];

System.out.println("enter the number ");

for(int i=0;i<arr.length;i++){

arr[i] = sc.nextInt();

}

Numbers numb1 = new Numbers();
numb1.numb(arr);

}
}

