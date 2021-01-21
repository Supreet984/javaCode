import java.util.*;

class Numb{
int i,j;
void natural(){
for(i=1;i<=4;i++){
     for(j=4;j>=i;j--){
 System.out.print("*");
 }
System.out.print("\n");
}
}
}

class Main{
public static void main(String...args){

Numb numbers = new Numb();
 numbers.natural();
}
}