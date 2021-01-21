import java.util.*;

class Palindrome{

void ispalindrome(int a){
     int reverse=0;
    int remainder=0;
   int y=a;
    

while(y>0){
    remainder = y%10;
    reverse = reverse*10+remainder;
    y=y/10;

}
if(f==a)
{
  System.out.print("Number is a palindrome");
}
else{
 System.out.print("Not palindrome");
}
}
}
class Main{
  
   public static void main(String...args){
  int a;
 Scanner sc = new Scanner(System.in);
System.out.print("Enter a number");
  a = sc.nextInt();

Palindrome num = new Palindrome();
num.ispalindrome(a);

}
}