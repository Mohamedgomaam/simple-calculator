package wow;
import java.util.*;
public class project_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		Project c=new Project();
		Scanner s=new Scanner(System.in);
		do {
System.out.println("enter number 1 for addition");
System.out.println("enter number 2 for subtraction");
System.out.println("enter number 3 for multiplication");
System.out.println("enter number 4 for divion");
System.out.println("enter number 5 for reminder of divion");
System.out.println("enter number 6 for exponential function");
System.out.println("enter number 7 for natural exponential function ");
System.out.println("enter number 8 for logaritmic function");
System.out.println("enter number 9 for trigonometric functions");
System.out.println("enter number 10 to get the factorial for any number");
System.out.println("enter number 11 to change between Degrees and Radians ");
System.out.println("enter number 12 to change number to binary or octal or Hexadecimal or decimal");
System.out.println("enter number 13 for and AND ,OR ,Xor ,NOt logical operations");
System.out.println("enter number 0 to exit");
x=s.nextInt();
if(x==1) 
{
c.addition();
}
else if(x==2) 
{
c.subtraction();	
}
else if(x==3) 
{
c.multiplication();	
}
else if(x==4)
{
c.division();	
}
else if(x==5) 
{
c.reminderofdivision();	
}
else if(x==6) 
{
c.exponential_function();
}
else if(x==7)
{
c.Natural_Exponential_Function();	
}
else if(x==8)
{
c.log();	
}
else if(x==9)
{
c.trigonometric_functions();
}
else if(x==10) 
{
c.factorial();	
}
else if(x==11) 
{
c.angle();	
}
else if(x==12) 
{
c.change_number();	
}
else if(x==13)
{
c.logical();	
}
		}
		while(x!=0);

	
		double xwww=8;
		int yy=(int)xwww;
		
	}

	
	
}
