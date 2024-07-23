import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
public class calculator extends Frame implements ActionListener
{
float z;
float num;
int flg=1;
int flag=1;
char op=0;
int fg=0,fgg=0;;
  JButton b1=new JButton("7");
  JButton b2=new JButton("8");
  JButton b3=new JButton("9");
  JButton b4=new JButton("4");
  JButton b5=new JButton("5");
  JButton b6=new JButton("6");
  JButton b7=new JButton("1");
  JButton b8=new JButton("2");
  JButton b9=new JButton("3");
  JButton b10=new JButton("0");
  JButton b11=new JButton(".");
  JButton b12=new JButton("+");
  JButton b13=new JButton("-");
  JButton b14=new JButton("*");
  JButton b15=new JButton("/");
  JButton b16=new JButton("=");
  JButton b17=new JButton("backspace");
  JButton b18=new JButton("c");
  JButton b19=new JButton("::");
  JButton b20=new JButton("x^4");
  JButton b21=new JButton("x^5");
  JButton b22=new JButton("x^2");
  JButton b23=new JButton("x^3");
  JButton b24=new JButton("mod");
  

  JTextField tx=new JTextField("");

public calculator()
{
  setTitle("My Calculator...");
  setLayout(null);
  setVisible(true);
  setSize(370,450);
  tx.setBounds(50,50,280,40);
  b17.setBounds(50,110,130,40);
  b18.setBounds(200,110,50,40);
  b19.setBounds(270,110,50,40);
  b24.setBounds(330,110,60,40);
  b1.setBounds(50,170,60,40);
  b2.setBounds(120,170,60,40);
  b3.setBounds(190,170,60,40);
  b12.setBounds(260,170,60,40);
  b4.setBounds(50,230,60,40);
  b5.setBounds(120,230,60,40);
  b6.setBounds(190,230,60,40);
  b13.setBounds(260,230,60,40);
  b7.setBounds(50,290,60,40);
  b8.setBounds(120,290,60,40);
  b9.setBounds(190,290,60,40);
  b14.setBounds(260,290,60,40);
  b10.setBounds(50,350,60,40);
  b11.setBounds(120,350,60,40);
  b16.setBounds(190,350,60,40);
  b15.setBounds(260,350,60,40);
  b20.setBounds(330,170,60,40);
  b21.setBounds(330,230,60,40);
  b22.setBounds(330,290,60,40);
  b23.setBounds(330,350,60,40);
tx.setFont(new Font("Courier New",Font.BOLD,14));
add(tx);
add(b17);
add(b18);
add(b1);
add(b2);
add(b3);
add(b12);
add(b4);
add(b5);
add(b6);
add(b13);
add(b7);
add(b8);
add(b9);
add(b14);
add(b10);
add(b11);
add(b16);
add(b15);
add(b19);

  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  b8.addActionListener(this);
  b9.addActionListener(this);
  b10.addActionListener(this);
  b11.addActionListener(this);
  b12.addActionListener(this);
  b13.addActionListener(this);
  b14.addActionListener(this);
  b15.addActionListener(this);
  b16.addActionListener(this);
  b17.addActionListener(this);
  b18.addActionListener(this);
  b19.addActionListener(this);
  b20.addActionListener(this);
  b21.addActionListener(this);
  b22.addActionListener(this);
  b23.addActionListener(this);
  b24.addActionListener(this);
  
}
public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource()==b1)
  {
     tx.setText(tx.getText()+"7");
     flag=1;
  }
if(ae.getSource()==b2)
{
tx.setText(tx.getText()+"8");
flag=1;
}
if(ae.getSource()==b3)
{
tx.setText(tx.getText()+"9");
flag=1;
}
if(ae.getSource()==b4)
{
tx.setText(tx.getText()+"4");
flag=1;
}
if(ae.getSource()==b5)
{
tx.setText(tx.getText()+"5");
flag=1;
}
if(ae.getSource()==b6)
{
tx.setText(tx.getText()+"6");
flag=1;
}
if(ae.getSource()==b7)
{
tx.setText(tx.getText()+"1");
flag=1;
}
if(ae.getSource()==b8)
{;
tx.setText(tx.getText()+"2");
flag=1;
}
if(ae.getSource()==b9)
{
tx.setText(tx.getText()+"3");
flag=1;
}
if(ae.getSource()==b10)
{
tx.setText(tx.getText()+"0");
flag=1;
}
if(ae.getSource()==b22)
{ 
if(flag==1)
{
	num=Float.parseFloat(tx.getText());
	tx.setText(""+(num*num));
	}
}
if(ae.getSource()==b23)
{ 
if(flag==1)
{
	num=Float.parseFloat(tx.getText());
	tx.setText(""+(num*num*num));
	}
}
if(ae.getSource()==b24)
{ 
if(flag==1)
{
	num=Float.parseFloat(tx.getText());
	tx.setText(""+(num%10));
	}
}
		
if(ae.getSource()==b11)
{
if(flg==1)
{
tx.setText(tx.getText()+".");
flg++;
}
}
if(ae.getSource()==b18)
{
tx.setText("0");
flg=1;
}
if(ae.getSource()==b17)
{
   if(tx.getText().length()!=0)
   {
	tx.setText(tx.getText().substring(0,tx.getText().length()-1));
   }
   flg=1;
}
if(ae.getSource()==b19)
{      
	    if(fg==1)
		{
	     setSize(410,450);
	     add(b20);
	     add(b21);
	     add(b22);
	     add(b23);
		 add(b24);
	     fg=0;
		 	b20.setVisible(true);
			b21.setVisible(true);
			b22.setVisible(true);
			b23.setVisible(true);
			b24.setVisible(true);
		}
	    else
		{
			setSize(370,450);
			fg=1;
			b20.setVisible(false);
			b21.setVisible(false);
			b22.setVisible(false);
			b23.setVisible(false);
			b24.setVisible(false);
		}

}
if(ae.getSource()==b20)
{
	num=Float.parseFloat(tx.getText());
	tx.setText(""+(num*num*num*num));
}
if(ae.getSource()==b21)
{
	num=Float.parseFloat(tx.getText());
	tx.setText(""+(num*num*num*num*num));
}
if(ae.getSource()==b12)
{
	if(tx.getText().trim().length()!=0)
	{
num=Float.parseFloat(tx.getText());
tx.setText("");
op='+';
flg=1;
}
}
if(ae.getSource()==b13)
{
	if(tx.getText().trim().length()!=0)
	{
num=Float.parseFloat(tx.getText());
tx.setText("");
op='-';
flg=1;
}
}
if(ae.getSource()==b14)
{
	if(tx.getText().trim().length()!=0)
	{
num=Float.parseFloat(tx.getText());
tx.setText("");
op='*';
flg=1;
}
}
if(ae.getSource()==b15)
{
	if(tx.getText().trim().length()!=0)
	{
num=Float.parseFloat(tx.getText());
tx.setText("");
op='/';
flg=1;
}
}
if(ae.getSource()==b16)
{
	if(tx.getText().trim().length()!=0)
	{ 
if(op=='+')
{
z=num+Float.parseFloat(tx.getText());
tx.setText(""+z);
}
if(op=='-')
{
z=num-Float.parseFloat(tx.getText());
tx.setText(""+z);
}
if(op=='*')
{
z=num*Float.parseFloat(tx.getText());
tx.setText(""+z);
}
if(op=='/')
{
z=num/Float.parseFloat(tx.getText());
tx.setText(""+z);
}
flg=0;
}
}
}
public static void main(String arg[])
{
    calculator obj=new calculator();
}
}