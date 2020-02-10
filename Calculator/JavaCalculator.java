import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JavaCalculator extends JFrame
{
int a,b,c;
JTextField tf1,tf2,tf3;
JButton btn1,btn2,btn3,btn4,btn5,b6;
JLabel lab1,lab2,lab3;
public JavaCalculator()
{
JPanel jp=new JPanel(new GridLayout(6,2));
lab1=new JLabel("Firn number");
lab2=new JLabel("Second number");
lab3=new JLabel("Result");
tf1=new JTextField(20);
tf2=new JTextField(20);
tf3=new JTextField(20);
JButton[] b=new JButton[6];
jp.add(lab1);
jp.add(tf1);
jp.add(lab2);
jp.add(tf2);
jp.add(lab3);
jp.add(tf3);
String[] st={"+","-","*","/","%","CLEAR"};
for(int i=0;i<b.length;i++)
{
	b[i]=new JButton(st[i]);
	jp.add(b[i]);
	b[i].addActionListener(new bActionListener());
}
add(jp);
setLayout(new FlowLayout());
setSize(600,600);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[])
{
new JavaCalculator();
}
public class bActionListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
if(e.getActionCommand()=="CLEAR")
{
tf1.setText(" ");
tf2.setText(" ");
tf3.setText(" ");
}
if(e.getActionCommand()=="+")
{
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
c=a+b;
tf3.setText(Integer.toString(c));
}
if(e.getActionCommand()=="-")
{
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
c=a-b;
tf3.setText(Integer.toString(c));
}
if(e.getActionCommand()=="*")
{
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
c=a*b;
tf3.setText(Integer.toString(c));
}
if(e.getActionCommand()=="/")
{
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
c=a/b;
tf3.setText(Integer.toString(c));
}
if(e.getActionCommand()=="%")
{
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
c=a%b;
tf3.setText(Integer.toString(c));
}
}
}
}



