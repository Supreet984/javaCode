import java.util.Scanner;
import java.util.*;

class Main{
public static void main(String...args){

int i,j;
Scanner sc = new Scanner(System.in);
int[][] demo = new int[3][4];
int[] arr = new int[3];
int[]Sumcol = new int[4];
System.out.println("Enter an array");

for(i=0;i<3;i++){

for(j=0;j<4;j++){

demo[i][j] = sc.nextInt();
}
}

for(i=0;i<3;i++){

for(j=0;j<4;j++){

arr[i]=arr[i]+demo[i][j];

}
}

for(i=0;i<3;i++){
System.out.print(arr[i]+"\t");
}
}
}