import java.util.Scanner;
import java.util.*;

class Main{


public static void main(String...args){


int i,j;
Scanner sc = new Scanner(System.in);

int[][] demo = new int[3][4];

System.out.println("Enter an array ");

for(i=0;i<3;i++){

for(j=0;j<4;j++){

demo [i][j] = sc.nextInt();
}
}

for(i=0;i<3;i++){

for(j=0;j<4;j++){
System.out.print(demo[i][j]+"\t");
}
System.out.print("\n");
}
}
}