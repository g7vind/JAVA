import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class p1 implements ActionListener
{
	JFrame j;
	JTextField f1,f2;
	JButton b1;
	JPanel p1,p2,p3;
	JLabel l1,l2;
	p1()
	{
		j=new JFrame("test");
		p2=new JPanel();
		p1=new JPanel();
		p3=new JPanel();
		l1=new JLabel("Enter text : ");
		l2=new JLabel("Abbreaviation : ");
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,0,25));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,0,25));
		p3.setLayout(new FlowLayout(FlowLayout.CENTER,0,25));
		j.setLayout(new GridLayout(3,1));
		j.add(p1);
		j.add(p2);
		j.add(p3);
		f1=new JTextField(20);
		f2=new JTextField(20);
		b1=new JButton("Click");
		f1.setHorizontalAlignment(JTextField.CENTER);
		f2.setHorizontalAlignment(JTextField.CENTER);
		p1.add(l1);
		p1.add(f1);
		p2.add(b1);
		p3.add(l2);
		b1.addActionListener(this);
		p3.add(f2);
		j.setSize(400,400);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String s =f1.getText();
			int i=0;
			StringBuffer sb=new StringBuffer();
			while(i<s.length())
			{
				char ch=s.charAt(i);
				if(Character.isUpperCase(ch))
				{
					sb.append(ch);
				}
				i++;
			}
			f2.setText(sb.toString());
			
		}
	}
}
class test
{
	public static void main(String[] args)
	{
		new p1();	
	}
}		
