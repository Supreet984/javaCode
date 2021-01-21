import java.util.Scanner;
import java.util.*;

class Numb{

void numbers(int number,int[] arr){

int count=0;
for(int i=0;i<arr.length;i++){
     if(arr[i]%number==0){
 count++;
}
}
System.out.print("The multiples of a number is"+count);
}
}

class Main{
public static void main(String...args){
Scanner sc = new Scanner(System.in);

int arr[]=new int[10];
for(int i=0;i<10;i++){
arr[i]=sc.nextInt(); 
}
int number;
System.out.print("Enter a number");
number=sc.nextInt();

Numb multiple = new Numb();
multiple.numbers(number, arr); 

}
}