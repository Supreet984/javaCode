import java.util.*;

class Pattern{
int a,i;
void naturals(){
for(i=1;i<=10;i++){
	for(int j=1;j<=i;j++)
	{ System.out.print(j);
	}
System.out.print("\n");
}
}
}

class Main{
public static void main(String...args){

Pattern number = new Pattern();
 number.naturals();
}
}
