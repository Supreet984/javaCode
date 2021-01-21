import java.util.Scanner;
import java.util.*;

class numbers{

void numb(int[] arr){

for(int i=0;i<arr.length;i++){
   if(arr[i]%2!=0){
System.out.print("Number is odd ");
}
else{
System.out.print("Number is even ");
}
}
}
}

class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a number");evenodd

int[] arr = new int[5];
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}

numbers multiple = new numbers();
multiple.numb( arr);

}
}