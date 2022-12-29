import java.io.*;
class disp_file
{
	public static void main(String[] args)
	{
		int ch;
		try
		{	
			FileInputStream f1 = new FileInputStream("f11.txt");
			FileOutputStream f2 = new FileOutputStream("f2.txt");
			do
			{
				ch=f1.read();
				f2.write((char)ch);
			}while(ch!=-1);
			f1.close();
			f2.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
