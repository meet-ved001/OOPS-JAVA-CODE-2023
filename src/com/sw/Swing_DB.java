package com.sw;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class DatabaseDemo implements ActionListener
{
JFrame frame;
JLabel l1,l2,l3,msg;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4;
public DatabaseDemo()
{
frame=new JFrame("DataBase Demo");
frame.setLayout(new GridLayout(6, 2));
frame.setSize(500, 300);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
l1=new JLabel(" Enter SID   : ");
l2=new JLabel(" Enter SName : ");
l3=new JLabel(" Enter City  : ");
msg=new JLabel("");

t1=new JTextField(15);
t2=new JTextField(15);
t3=new JTextField(15);

b1=new JButton("Insert");
b2=new JButton("Update");
b3=new JButton("Delete");
b4=new JButton("Display");

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

frame.add(l1);
frame.add(t1);
frame.add(l2);
frame.add(t2);
frame.add(l3);
frame.add(t3);

frame.add(b1);
frame.add(b2);
frame.add(b3);
frame.add(b4);
frame.add(msg);
}
@Override
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int sid=Integer.parseInt(t1.getText().toString());
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
System.out.println("Connection Established...");
Statement st=cn.createStatement();
String qry="insert into student values("+sid+",'"+t2.getText().toString()+"','"+t3.getText().toString()+"')";
int x=st.executeUpdate(qry);
if(x>0)
{
msg.setText("Record inserted....");
}
else
{
msg.setText("Record not inserted...");
}
cn.close();
} catch (Exception e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}

}
else if(e.getSource()==b2)
{
int sid=Integer.parseInt(t1.getText().toString());
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
System.out.println("Connection Established...");
Statement st=cn.createStatement();
String qry="update student set sname='"+t2.getText().toString()+"',city='"+t3.getText().toString()+"' where sid="+sid+"";
int x=st.executeUpdate(qry);
if(x>0)
{
msg.setText("Record Updated....");
}
else
{
msg.setText("Record not Updated...");
}
cn.close();
} catch (Exception e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
}
else if(e.getSource()==b3)
{
int sid=Integer.parseInt(t1.getText().toString());
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
System.out.println("Connection Established...");
Statement st=cn.createStatement();
String qry="delete from student where sid="+sid+"";
int x=st.executeUpdate(qry);
if(x>0)
{
msg.setText("Record Deleted....");
}
else
{
msg.setText("Record not Deleted...");
}
cn.close();
} catch (Exception e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
}
else if(e.getSource()==b4)
{

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
System.out.println("Connection Established...");
Statement st=cn.createStatement();
String qry="select * from student";
ResultSet rs=st.executeQuery(qry);
while(rs.next())
{
System.out.println("Sid is..   "+rs.getInt(1));
System.out.println("Sname is.. "+rs.getString("sname"));
System.out.println("City is.. "+rs.getString("city"));
System.out.println();
}
cn.close();
} catch (Exception e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
}

}
}
public class Swing_DB
{
public static void main(String[] args)
{
new DatabaseDemo();
}
}
