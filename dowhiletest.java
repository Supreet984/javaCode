import java.util.*;
class Calculator{
void calc()
{ float res=1;
 do{
	System.out.println(res++);
  }while(res<11);
}
}
class Main{
public static void main(String...args)
{  
     Calculator calcs = new Calculator();
        calcs.calc();		
}
}