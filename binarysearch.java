import java.util.Scanner;
import java.util.*;

class Search{

void binarysearch(int item,int[] arr){
int mid=0;
int beg=0;
int end= arr.length;
int i;
int flag=0;

while(flag==0){
	mid= (beg+end)/2;
	if(arr[mid] == item)
	{ 
        flag=1;
        break;
}
else if(item>arr[mid]){
       beg=mid+1;
}
else{
    end=mid-1;
}

}
int res = mid+1;
if(flag!=0)
System.out.print("element is found at position"+res);
else {
System.out.print("item not found");
}
}
}
class Main{
public static void main(String...args){
int i;
Scanner sc = new Scanner(System.in);

int[] arr = new int[10];
System.out.print("Enter a sorted array");

for(i=0;i<10;i++){ 
arr[i]=sc.nextInt();
}
System.out.print("Enter the element to search in the array");

int item;
item=sc.nextInt();

Search obj = new Search();
obj.binarysearch(item,arr);



}
}