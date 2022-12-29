import java.util.*;
class TokDemo
{
	public static void main(String[] args)
	{
		int s=0,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a line of integers : ");
		String u=sc.nextLine();
		StringTokenizer st = new StringTokenizer(u);
		System.out.print("\nThe integers are : ");
		while(st.hasMoreTokens())
		{
			i=Integer.parseInt(st.nextToken());
			System.out.print(" "+i);
			s=s+i;
		}
		System.out.print("\nThe sum : "+s+"\n");
	}
}
