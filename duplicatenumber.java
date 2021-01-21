import java.util.Scanner;
import java.util.*;

class Numb{
void numbers(int[] arr){

int count=0;
int flag;

int[] arr2 = new int[10];
for(int i=0;i<10;i++){
flag=0;
for(int j=0;j<count;j++){

if(arr[i] == arr2[j]) {

System.out.println("Duplicate numbers is "+arr[i]);
flag=1;
}
}
if(flag!=1){
arr2[count++] = arr[i];
}
}
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

int[] arr = new int[10];

System.out.print("Enter the values");
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
Numb numbers1 = new Numb();
numbers1.numbers(arr);
}
}