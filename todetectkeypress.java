import java.util.Scanner;
import java.util.*;

class Subject{

void press(int number)
{
switch(number)
{
case 1: System.out.print("0 is pressed ");
        break;

case 2: System.out.print("1 is pressed ");
        break;

case 3: System.out.print("2 is pressed ");
        break;

case 4: System.out.print("3 is pressed ");
        break;

case 5: System.out.print("4 is pressed ");
        break;

case 6: System.out.print("5 is pressed ");
        break;

case 7: System.out.print("6 is pressed ");
        break;

case 8: System.out.print("7 is pressed ");
        break;

case 9: System.out.print("8 is pressed ");
        break;

case 10: System.out.print("9 is pressed ");
        break;

default: System.out.print("Incorrect choice ");
}
}
}

class Main{

public static void main(String...args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the number ");
int number = sc.nextInt();

Subject subject1 = new Subject();
subject1.press(number);

}
}