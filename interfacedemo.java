import java.util.Scanner;
import java.util.*;

interface Area {

static int calculatearea(){
return 0;

}


}

class Areaofsquare implements Area{

int calculatearea(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the side of square ");
int side=sc.nextInt();
int area=side*side;

System.out.print("The area is "+area);
return area;
}
}
class Areaofrectangle implements Area{
int calculatearea(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the length and breadth of rectangle ");
int length=sc.nextInt();
int breadth=sc.nextInt();
int area = length*breadth;

System.out.print("The area is "+area);

return area;
}
}
class Main{
public static void main(String...args){
int c;
Scanner sc = new Scanner(System.in);

System.out.print("Enter your choice ");
System.out.print("1 for square ");
System.out.print("2 for rectangle ");
c = sc.nextInt();

Areaofrectangle a1 = new Areaofrectangle ();
Areaofsquare a2 = new Areaofsquare();

if(c==1){
a1.calculatearea();
}

else if(c==2){
a2.calculatearea();
}


}
}