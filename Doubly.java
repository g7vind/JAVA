import java.util.*;
class node
{
	int data;
	node nxt;
	node prev;
	node(int data,node nxt,node prev)
	{
		this.data=data;
		this.nxt=nxt;
		this.prev=prev;
	}
}
class Doubly
{
	public static void main(String[] args)
	{
		node head,tail,temp;
		head=tail=null;
		int ch,item;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("\nMenu");
			System.out.print("\n1.Insert at begin");
			System.out.print("\n2.Delete at begin");
			System.out.print("\n3.Display");
			System.out.print("\n4.Exit");
			System.out.print("\nEnter your choice : ");
			ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("\nInsert at begin");
				System.out.print("Enter the value to insert : ");
				item=sc.nextInt();
				node new1 = new node(item,null,null);
				if(head==null)
				{
					tail=head=new1;
				}
				else
				{
					new1.nxt=head;
					head=new1;
				}
			}
			else if(ch==2)
			{
				System.out.println("\nDeletion");
				if(head==null && tail==null)
				{
					System.out.println("Linkedlist is empty");
				}
				else if(head==tail)
				{
					System.out.println("Element deleted : "+head.data);
					head=tail=null;
				}
				else
				{
					System.out.println("Element deleted : "+head.data);
					head=head.nxt;
					head.prev=null;
				}
			}
			else if(ch==3)
			{
				System.out.println("\nDisplay");
				if(head==null && tail==null)
				{
					System.out.println("Linkedlist is empty");
				}
				else
				{
					temp=head;
					System.out.println("The elements in linked list is/are : ");
					while(temp!=null)
					{
						System.out.print("\t"+temp.data);
						temp=temp.nxt;
					}
					System.out.println("\n");	
				}
			}
			else
			{
				System.out.println("Exited Successfully");
				System.exit(0);	
			}
			
			
		}
	}
}
