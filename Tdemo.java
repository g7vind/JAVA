//wap 2 threads that displays all odd numbers betweern 1 and 100 and second thread displays all even numbers between 1 and 100
import java.util.*;
class A extends Thread
{
	int x;
	public void run()
	{
		while(true)
		{
			Random r = new Random();
			x=r.nextInt(100);
			System.out.println("The random number : "+x);
			if(x%2==0)
			{
					B t1 = new B(x);
					t1.start();
					try{
					
					t1.sleep(1000);
					}
					catch(Exception e){}
			}
			else
			{
				C t2= new C(x);
				t2.start();
				try{
					
					t2.sleep(1000);
					}
					catch(Exception e){}
		}
		}
	}
}
class B extends Thread
{
	int b;
	B(int x)
	{
		b=x;
	}
	public void run()
	{
		System.out.println("The random number is even");
		System.out.println(b+"^"+2+"="+(b*b));
		
	}
}
class C extends Thread
{
	int c;
	C(int x)
	{
		c=x;
	}
	public void run()
	{
		System.out.println("The random number is odd");
		System.out.println(c+"^"+3+"="+(c*c*c));
		
	}
}
class Tdemo
{
	public static void main(String[] args)
	{
	A a1 = new A();
	a1.start();
	}
}
