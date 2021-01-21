import java.util.Scanner;
import java.util.*;

class numbers{
void bubblesort(int[] arr){
int temp=0;
for(int i=0;i<9;i++){

for(int j=i+1;j<10;j++){

if(arr[i]>arr[j]){

temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;
}
}
}
System.out.print("Second largest element is "+arr[arr.length-2]);
}

}


class Main{
public static void main(String...args){
Scanner sc = new Scanner(System.in);

int[]arr = new int[10];
System.out.print("Enter the number");

for(int i=0;i<10;i++){

arr[i]=sc.nextInt();

}
numbers numb1 = new numbers();
numb1.bubblesort(arr);

}
}