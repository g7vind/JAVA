import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.text.DecimalFormat; 
class di implements ActionListener
{
	JFrame jf;
	JButton b1;
	JTextField f1,f2,res;
	JPanel p1,p2,p3,p4,p5;
	JLabel l1,l2,l3,l4;
	DecimalFormat dec;
	double a,b,c;
	di()
	{
		jf=new JFrame("Division");
		jf.setLayout(new GridLayout(3,1));
		b1=new JButton("Divide");
		dec=new DecimalFormat("0.00"); 
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		l1=new JLabel("Enter numbers : ");
		f1=new JTextField("1st num",5);
		f2=new JTextField("2nd num",5);
		l2=new JLabel("   /   ");
		l3=new JLabel("Result  :  ");
		l4=new JLabel("Message Box");
		res=new JTextField("Result",5);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,0,25));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,0,25));
		p3.setLayout(new GridLayout(2,1));
		p4.setLayout(new FlowLayout(FlowLayout.CENTER,0,25));
		p5.setLayout(new FlowLayout(FlowLayout.CENTER,0,25));
		f1.setHorizontalAlignment(JTextField.CENTER);
		f2.setHorizontalAlignment(JTextField.CENTER);
		res.setHorizontalAlignment(JTextField.CENTER);
		b1.addActionListener(this);
		p1.add(l1);
		p1.add(f1);
		p1.add(l2);
		p1.add(f2);
		p2.add(b1);
		p3.add(p4);
		p3.add(p5);
		p4.add(l3);
		p4.add(res);
		p5.add(l4);
		jf.add(p1);
		jf.add(p2);
		jf.add(p3);
		jf.setSize(600,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			try
			{
				a=Double.parseDouble(f1.getText());
				b=Double.parseDouble(f2.getText());
				if(b==0)
				{
					throw new ArithmeticException();
				}
				else if(a%1!=0 || b%1!=0)
				{
					throw new NumberFormatException();
				}
				else
				{
					c=a/b;
					String s=String.valueOf(dec.format(c));
					res.setText(s);
				}
				l4.setText("");
			}
			catch(Exception e)
			{
				res.setText("ERROR");
				l4.setText(""+e);
			}
		
		}
	}
}
class div
{
	public static void main(String[] args)
	{
		new di();
	}
}
