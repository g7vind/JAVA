class First
{
	public void show(String msg)
	{
		System.out.println("["+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.print("]\n");
	}
}
class Second extends Thread
{
	First fobj;
	String msg;
	Second(First f,String s)
	{
		msg=s;
		fobj=f;
		start();
	}
	public void run()
	{
		synchronized(fobj)
		{
			fobj.show(msg);
		}
	}
}
class sync
{
	public static void main(String[] args)
	{
		First fnew=new First();
		Second s1=new Second(fnew,"First");
		Second s2=new Second(fnew,"Second");
		Second s3=new Second(fnew,"Third");
	}
}
