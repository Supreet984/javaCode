import java.util.Scanner;
import java.util.*;

class Search{

void linearsearch(int item,int[] arr){
int pos=0;
for(i=0;i<10;i++){
 if(arr[i] == item)
{
 pos = i+1;
break;
}
}
if(pos >0){
System.out.print("item found at position"+pos);
}
else{
System.out.print("not found");
}
}
}

class Main{
public static void main(String...args){
int i;
Scanner sc = new Scanner(System.in);

int[] arr = new int[10];
System.out.print("Enter the array");

for(i=0;i<10;i++){ 
a[i]=sc.nextInt();
}
System.out.print("Enter the element to search in the array");

int item;
item=sc.nextInt();

Search obj = new Search();
obj.linearsearch(item,arr);



}
}
