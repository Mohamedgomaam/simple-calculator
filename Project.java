package wow;
import java.util.*;
public class Project {
	double e=2.718281828;
	Scanner s=new Scanner(System.in);

	public void addition() 
	{
		int y=0;
		double x=0;
		double n=0;
		boolean w=true;
		System.out.println("enter \n 1 for e then addition it \n 2 for log then addition it \n 3 for ln then addition it \n 4 for normal addition ");
		y=s.nextInt();
		if(y==1) {x=e;}
		else if(y==2) 
		{
			System.out.println("enter the argument");
			double c=s.nextDouble();
			x=Math.log10(c);
        }
		else if(y==3) 
		{
			System.out.println("enter the argument");
			double c=s.nextDouble();
			x=Math.log(c);
		}
		else if(y==4) {x=0;}
		
		do {
			System.out.println("enter number to add it");
			n=s.nextDouble();
			x+=n;
			System.out.println("if you want the result enter false or to contiue enter true");
			w=s.nextBoolean();
		   }
		   while(w==true);
		System.out.println("the result is : "+x);
	}
	public void subtraction() 
	{
		int y=0;
		double x=0;
		double n=0;
		boolean w=true;
		System.out.println("enter \n 1 for e then subtraction it \n 2 for log then subtraction it \n 3 for ln then subtraction it \n 4 for normal subtraction ");
		y=s.nextInt();
		if(y==1) {x=e;}
		else if(y==2) 
		{
			System.out.println("enter the argument");
			double c=s.nextDouble();
			x=Math.log10(c);
        }
		else if(y==3) 
		{
			System.out.println("enter the argument");
			double c=s.nextDouble();
			x=Math.log(c);
		}
		else if(y==4) {x=0;}
		
		do {
			System.out.println("enter number to sub it");
			n=s.nextDouble();
			x-=n;
			System.out.println("if you want the result enter False or to contiue enter true");
			w=s.nextBoolean();
		   }
		   while(w==true);
	System.out.println("the result is : "+x);
	}
	public void multiplication() 
	{
		int y=0;
		double x=0;
		double n=0;
		boolean w=true;
		System.out.println("enter \n 1 for e then multiplication it \n 2 for log then multiplication it\n 3 for ln then multiplication it \n 4 for normal multiplication ");
		y=s.nextInt();
		if(y==1) {x=e;}
		else if(y==2) 
		{
			System.out.println("enter the argument");
			double c=s.nextDouble();
			x=Math.log10(c);
        }
		else if(y==3) 
		{
			System.out.println("enter the argument");
			double c=s.nextDouble();
			x=Math.log(c);
		}
		else if(y==4) {x=1;}
		
		do {
			System.out.println("enter number to multi it");
			n=s.nextDouble();
			x*=n;
			System.out.println("if you want the result enter False or to contiue enter true");
			w=s.nextBoolean();
		   }
		   while(w==true);
	System.out.println("the result is : "+x);
	}
	public void division() 
	{
		int y=0;
		double x=0;
		double n=0;
		boolean w=true;
		System.out.println("enter \n 1 for e then division it \n 2 for log then division it\n 3 for ln then division it \n 4 for normal division ");
		y=s.nextInt();
		if(y==1) 
		{
			x=e;
			do {
				System.out.println("enter number to div it");
				n=s.nextDouble();
				x/=n;
				System.out.println("if you want the result enter False or to contiue enter true");
				w=s.nextBoolean();
			   }
			   while(w==true);
		System.out.println("the result is : "+x);
		}
		else if(y==2) 
		{
			System.out.println("enter the argument");
			double c=s.nextDouble();
			x=Math.log10(c);
			do {
				System.out.println("enter number to div it");
				n=s.nextDouble();
				x/=n;
				System.out.println("if you want the result enter False or to contiue enter true");
				w=s.nextBoolean();
			   }
			   while(w==true);
		System.out.println("the result is : "+x);
        }
		else if(y==3) 
		{
			System.out.println("enter the argument");
			double c=s.nextDouble();
			x=Math.log(c);
			do {
				System.out.println("enter number to div it");
				n=s.nextDouble();
				x/=n;
				System.out.println("if you want the result enter False or to contiue enter true");
				w=s.nextBoolean();
			   }
			   while(w==true);
		System.out.println("the result is : "+x);
		}
		else if(y==4) 
		{
			System.out.println("enter Numerator");
			x=s.nextDouble();
			System.out.println("enter denominator");
			double ww=s.nextDouble();
			double c=x/ww;
			System.out.println("the result is : "+c);
			System.out.println("enter 1 to divion more numbers");
			double a=s.nextDouble();
			if(a==1) 
			{
				do {
					System.out.println("enter number to div it");
					n=s.nextDouble();
					c/=n;
					System.out.println("if you want the result enter False or to contiue enter true");
					w=s.nextBoolean();
				   }
				   while(w==true);
				System.out.println("the result is : "+x);
			}
		}
		
		
	}
	public void reminderofdivision() 
	{
		int y=0;
		double x=0;
		double n=0;
		boolean w=true;
		System.out.println("enter \n 1 for e then reminder of division it \n 2 for log then reminder of division it\n 3 for ln then reminder of division it \n 4 for normal reminder of division ");
		y=s.nextInt();
		if(y==1) 
		{
			x=e;
				System.out.println("enter number to find the reminder");
				n=s.nextDouble();
				x%=n;
		System.out.println("the result is : "+x);	
		}
		else if(y==2) 
		{
			System.out.println("enter the argument");
			double c=s.nextDouble();
			x=Math.log10(c);
			
				System.out.println("enter number to find the reminder");
				n=s.nextDouble();
				x%=n;
		System.out.println("the result is : "+x);
        }
		else if(y==3) 
		{
			System.out.println("enter the argument");
			double c=s.nextDouble();
			x=Math.log(c);
			
				System.out.println("enter number to find the reminder");
				n=s.nextDouble();
				x%=n;
		System.out.println("the result is : "+x);
		}
		else if(y==4) 
		{
			System.out.println("enter Numerator");
			x=s.nextDouble();
			System.out.println("enter denominator");
			double ww=s.nextDouble();
			double c=x%ww;
			System.out.println("the result is : "+c);
	
		}
		
		
	}
	
	public void trigonometric_functions() 
	{
		
		System.out.println("if you want the measure in degrees enter 1 \n if you want in Radians enter 2 ");
		int x=s.nextInt();
		System.out.println("enter \n 1 for sin(x) \n 2 for cos(x) \n 3 for tan(x) \n 4 for sinh(x) \n 5 for cosh(x) \n 6 for tanh(x) \n 7 for sin(x) inverse \n 8 for cos(x) inverse \n 9 for tan(x) inverse \n 10 for sinh(x) inverse \n 11 for cosh(x) inverse \n 12 for tanh(x) inverse ");
		int u=s.nextInt();
		if(u==1) sin(x);
		else if(u==2) cos(x);
		else if(u==3) tan(x);
		else if(u==4) sinh(x);
		else if(u==5) cosh(x);
		else if(u==6) tanh(x);
		else if(u==7) sininverse(x);
		else if(u==8) cosinverse(x);
		else if(u==9) taninverse(x);
		else if(u==10)sinhinverse(x);
		else if(u==11)coshinverse(x);
		else if(u==12)tanhinverse(x);
		}
	
	public void sin(int t) 
	{
		if(t==1) {
		System.out.println("enter to angle");
		double x=s.nextDouble();
		if(x%180==0) {System.out.println("the result in degree is : "+0);}
		 else if((360+x)%30==0) {System.out.println("the result in degree is : "+0.5);}
		else 
		{
			double ss=Math.sin(Math.toRadians(x));
			System.out.println("the result in degree is : "+ss);
		}
		}
		else if(t==2) 
		{
			System.out.println("enter to angle");
			double x=s.nextDouble();
			double ss=Math.sin(x);
			System.out.println("the result in degree is : "+ss);	
		}
	}
	public void cos(int t) 
	{
		if(t==1) {
		System.out.println("enter to angle");
		double x=s.nextDouble();
		double a=x/90;
		if(a==1 || a==3 || a==5 || a==7 || a==9 || a==11 || a==13 || a==15 || a==17 || a==19 || a==21 || a==23 || a==25 || a==37 || a==29) { System.out.print("the result in degree is : "+0);}
		else if (x==120 ||x==420 ||x==300 ||x==480 ||x==600 ||x==660 ||x==780) {double c=Math.cos(Math.toRadians(0.5));}
		else {
			double c=Math.cos(Math.toRadians(x));
			System.out.println("the result in degree is : "+c);
		}
		}
		else if(t==2) 
		{
			System.out.println("enter to angle");
			double x=s.nextDouble();
			double c=Math.cos(x);
			System.out.println("the result in degree is : "+c);
		}
	}
	
	public void tan(int d) 
	{
		if(d==1) {
		System.out.println("enter to angle");
		double x=s.nextDouble();
		double a=90+x/90;
		if(x%90==0) {
			System.out.println("the result in degree is : "+ 0);
		}
		else 
		{
			double t=Math.tan(Math.toRadians(x));
			System.out.println("the result in degree is : "+ t);
		}
		}
		else if(d==2)
		{
			System.out.println("enter to angle");
			double x=s.nextDouble();
			double t=Math.tan(x);
			System.out.println("the result in degree is : "+ t);
		}
	}
	
	public void sinh(int t) 
	{
		System.out.println("enter to angle");
		double x=s.nextDouble();
		double sh=Math.sinh(x);
		System.out.println("the result in degree is : "+ sh);	
	}
	public void cosh(int t) 
	{
		System.out.println("enter to angle");
		double x=s.nextDouble();
		double ch=Math.cosh(x);
		System.out.println("the result in degree is : "+ ch);	
	}
	public void tanh(int t) 
	{
		System.out.println("enter to angle");
		double x=s.nextDouble();
		double th=Math.tanh(x);
		System.out.println("the result in degree is : "+ th);	
	}
	public void sininverse(int t) 
	{
		if(t==1) {
		System.out.println("enter to angle");
		double x=s.nextDouble();
		double as =Math.toDegrees(Math.asin(x)); 
		System.out.println("the result is : "+ as);
		}
		else if(t==2) 
		{
			System.out.println("enter to angle");
			double x=s.nextDouble();
			double as =Math.asin(x); 
			System.out.println("the result is : "+ as);	
		}
	}	
	public void cosinverse(int t) 
	{
		if(t==1) {
		System.out.println("enter to angle");
		double x=s.nextDouble();
		double ac =Math.toDegrees(Math.acos(x)); 
		System.out.println("the result is : "+ ac);
		}
		else if(t==2) 
		{
			System.out.println("enter to angle");
			double x=s.nextDouble();
			double ac =Math.acos(x); 
			System.out.println("the result is : "+ ac);
		}
		}
	public void taninverse(int t) 
	{
		if(t==1) {
		System.out.println("enter to angle");
		double x=s.nextDouble();
		double at =Math.toDegrees(Math.asin(x)); 
		System.out.println("the result is : "+ at);
		}
		else if(t==2) 
		{
			System.out.println("enter to angle");
			double x=s.nextDouble();
			double at =Math.asin(x); 
			System.out.println("the result is : "+ at);
		}	
	}
	public void sinhinverse(int t) 
	{
		System.out.println("enter to angle");
		double x=s.nextDouble();
		double ash=Math.log(x + Math.sqrt(x*x + 1.0));
		System.out.println("the result is : "+ ash);
	}
	public void coshinverse(int t) 
	{
		System.out.println("enter to angle");
		double x=s.nextDouble();
		double ach=Math.log(x + Math.sqrt(x*x - 1.0));
		System.out.println("the result is : "+ ach);
	}
	public void tanhinverse(int t) 
	{
		System.out.println("enter to angle");
		double x=s.nextDouble();
		double ath=0.5*Math.log( (x + 1.0) / (x - 1.0));
		System.out.println("the result is : "+ ath);
	}
	
	public void exponential_function() 
	{
		double x=0;
		double y=0;
		
		System.out.println("enter 1 for root and 2 for normal base and power function");
		x=s.nextInt();
		if(x==1) root();
		else
		{
		System.out.println("enter the base");
		x=s.nextDouble();
		System.out.println("enter the power");
		y=s.nextDouble();
		System.out.println("the result :" + Math.pow(x, y));
		}
	}

	public void root() 
	{
		double x,y=0;
		System.out.println("enter the base");
		x=s.nextDouble();
		System.out.println("enter the root degree");
		y=s.nextDouble();
		y=Math.pow(y, -1);
		System.out.println("the result :" + Math.pow(x, y));
	}
	
	public void Natural_Exponential_Function() 
	{
		double x,y=0;
		System.out.println("enter 1 to but e");
		x=s.nextDouble();
		if(x==1) 
		{
			System.out.println("enter 1 to add power");
			System.out.println("enter 2 to use root");
			System.out.println("enter 3 to adtion");
			System.out.println("enter 4 to subtraction");
			System.out.println("enter 5 to divion");
		  y=s.nextDouble();
		}
		if(y==1) pe();
		else if(y==2) roote();
		else if(y==3) we();
		else if(y==4) sube();
		else if(y==5) die();
	}
	
	public void die() 
	{
		boolean w=true;
		double y=0,x=e;
		do {
	System.out.println("enter number to divion it with e ");
		y=s.nextDouble();
		x=x/y;
		System.out.println("if you want to exit enter false or to contiue enter true");
		w=s.nextBoolean();
		}
		while(w==true);
		System.out.println( "the result :" + x);
		
	}
	
	public void sube() 
	{
		double y=0;
		boolean m=true;
		double sum=e;
		do {
			System.out.println("enter number to subtraction with e ");
			y=s.nextDouble();
			sum-=y;
			System.out.println("enter false yo exit and true to continue");
			m=s.nextBoolean();
		}
		 while(m==true);
		System.out.println("the result :" + sum);
	}
	
	public void we() 
	{
		double x,y=0;
		 boolean m=true;
		double sum=e;
		do {
			System.out.println("enter number to submution with e ");
			y=s.nextDouble();
			sum+=y;
			System.out.println("enter false yo exit and true to continue ");
			m=s.nextBoolean();
		}
		 while(m==true);
		System.out.println("the result :" + sum);
	}
	
	public void pe() 
	{
		double y=0;
		System.out.println("enter the power");
		y=s.nextDouble();
		System.out.println("the result :" + Math.pow(e, y));
		
	}
	
	public void roote()
	{
		double y=0;
		System.out.println("enter root degree");
		y=s.nextDouble();
		y=Math.pow(y, -1);
		System.out.println("the result :" + Math.pow(e, y));
	}
	
	public void log()
	{
		int x,q=0;
		double y,c=0;
	
		System.out.println("for log enter 1 for ln enter 2");
	x=s.nextInt();
	if(x==1) 
	{
		System.out.println("enter argument for log");
		c=s.nextDouble();
		y=Math.log10(c);
	System.out.println("for mutl enter 1 \n and for addition enter 2  \n and for submution enter 3 \n and for divid enter 4 \n and exit enter 5 ");
	q=s.nextInt();
	if(q==1)  multilog(y);
	else if(q==2) addilog(y);
	else if(q==3) sublog(y);
	else if(q==4) divlog(y);
	else if(q==5) {System.out.println("the result :" + y);}
	}
	
	else if(x==2)
	{
		System.out.println("enter argument for ln");
		c=s.nextDouble();
		y=Math.log(c);
	System.out.println("for mutl enter 1 \n and for addition enter 2  \n and for submution enter 3 \n and for divid enter 4 \n and exit enter 5");	
	q=s.nextInt();
	if(q==1) multilog(y);
	else if(q==2) addilog(y);
	else if(q==3) sublog(y);
	else if(q==4) divlog(y);
	else if(q==5) {System.out.println("the result :" + y);}
	}
	}
	
	public void multilog(double x) 
	{
		boolean w=true;
		double y,q=0;
		do {
	System.out.println("enter number to multi it with the logarithem");
	 y=s.nextDouble();
	 q+=y;
	System.out.println("if you want to exit enter false or to contiue enter true");
	w=s.nextBoolean();
		}
		while(w==true);
	System.out.println("the result :" + (x*q));
	}
	
	public void addilog(double x)
	{
		boolean w=true;
		double y,q=0;
		do {
	System.out.println("enter number to addition it with the logarithem ");
		y=s.nextDouble();
		q+=y;
		System.out.println("if you want to exit enter false or to contiue enter true");
		w=s.nextBoolean();
		}
		while(w==true);
		System.out.println( "the result :" + (x+q));
	}
	public void sublog(double x)
	{
		boolean w=true;
		double y,q=0;
		do {
	System.out.println("enter number to subbmtion with the logarithem  ");
		y=s.nextDouble();
		q+=y;
		System.out.println("if you want to exit enter false or to contiue enter true");
		w=s.nextBoolean();
		}
		while(w==true);
		System.out.println( "the result :" + (x-q));
	}
	public void divlog(double x)
	{
		boolean w=true;
		double y=0;
		do {
	System.out.println("enter number to divion it with the logarithem ");
		y=s.nextDouble();
		x=x/y;
		System.out.println("if you want to exit enter false or to contiue enter true");
		w=s.nextBoolean();
		}
		while(w==true);
		System.out.println( "the result :" + x);
	}
	
	public void factorial() 
	{
		System.out.println("enter number to measure it's factorial");
		   int number=s.nextInt();
		 int i=number;
		 int m=1;
		 if(number==0) {System.out.println("the factorial is "+m);}
		 else { for(;i>=1;i--)
		          {
		        	 m=m*i; 
		          }
			System.out.println("the factorial is "+m);}
	}
	
	public void angle() 
	{
		System.out.println("enter 1 to change from Degrees to Radians ");
		System.out.println("enter 2 to change from Radians to Degrees ");
		int y=s.nextInt();
		if(y==1) 
		{
			System.out.println("Enter Angle");
			double a=s.nextDouble();
			double rad=(a*Math.PI)/180;
	         System.out.println("the angle in radian : " +rad);
		}
		else if(y==2) 
		{
			System.out.println("Enter Angle"); 
	         int b =s.nextInt();
	         double deg=(b*180)/Math.PI;
	         System.out.println("the Angle in degree : " +deg);
		}
	}
	
	public void change_number() 
	{
		System.out.println("from decimal to binary press 1 \n from binary to decimal press 2 \n from decimal to octal press 3 \n from octal to decimal press 4 \n from decimal to Hexadecimal press 5 \n from Hexadecimal to decimal press 6");
		int x=s.nextInt();
		if(x==1) 
		{
			System.out.println("Enter Number");
			int n=s.nextInt();
			String d=Integer.toBinaryString(n);
			System.out.println("binary of "+n +" is : "+d);
		}
		else if(x==2) 
		{
			System.out.println("Enter Number");
			String n=s.next();	
		   int decimal=Integer.parseInt(n,2);  
		   System.out.println("decimal of "+n+" is : " +decimal);
		}
		else if(x==3) 
		{
			System.out.println("Enter Number");
			int n=s.nextInt();
			String d=Integer.toOctalString(n);
			System.out.println("octal of "+n +" is : "+d);
		}
		else if(x==4) 
		{
			System.out.println("Enter Number");
			String n=s.next();	
		   int decimal=Integer.parseInt(n,8);  
		   System.out.println("decimal of "+n+" is : " +decimal);	
		}
		else if(x==5) 
		{
			System.out.println("Enter Number");
			int n=s.nextInt();
			String d=Integer.toHexString(n);
			System.out.println("Hexadecimal of "+n +" is : "+d);
		}
		else if(x==6)
		{
			System.out.println("Enter Number or Letter");
			String n=s.next();	
		   int decimal=Integer.parseInt(n,16);  
		   System.out.println("decimal of "+n+" is : " +decimal);
		}
	}
	public void logical() 
	{
		int f=0;
		System.out.println("enter number 1");
		int a=s.nextInt();
		System.out.println("enter number 2");
		int b=s.nextInt();
		do {
		System.out.println("for AND gate enter 1 \n for Or gate enter 2 \n for XOR gate enter 3 \n for NOT gate enter 4 \n enter 0 to exit");
		f=s.nextInt();
		if(f==1) 
		{
			int c=(a&b);
			System.out.println("the result is : "+c);
		}
		else if(f==2) 
		{
			int c=(a|b);
			System.out.println("the result is : "+c);
		}
		else if(f==3) 
		{
			int c=(a^b);
			System.out.println("the result is : "+c);	
		}
		else if(f==4) 
		{
			System.out.println("the result for number 1 : "+ ~a);
			System.out.println("the result for number 2 : "+ ~b);
		}
		}
		while(f!=0);
	}
	
	
	


}