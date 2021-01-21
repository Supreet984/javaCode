import java.util.*;

class pattern{
int i,j,k=1;
void natural(){
for(i=4;i>=1;i--){
  for(j=1;j<=(4-i);j++)
{
System.out.print(" ");
}
for(k=1;k<=i;k++)
{
System.out.print("*");
}
System.out.print("\n");
}
}
}
class Main{
public static void main(String...args){

Scanner sc = new Scanner(System.in);

pattern numb = new pattern();

numb.natural();
}
}