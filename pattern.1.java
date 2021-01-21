import java.util.*;

class pattern{
int i,j,k;
void natural(){
for(i=1;i<=4;i++){
  for(j=1;j<=(4-i);j++)
{ System.out.print(" ");
}
for(k=j;k<=4;k++)
{ System.out.print("*");
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