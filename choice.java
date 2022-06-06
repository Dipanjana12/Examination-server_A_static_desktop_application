package server;



import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class choice extends JFrame implements ActionListener{
JButton javabtn,cbtn,cppbtn;
JLabel top,bottom;
choice(){
//top=new JLabel();
JPanel jp=new JPanel();
getContentPane().add(jp);jp.setLayout(null);
//top.setBounds(0,0,1000,1000);
//ImageIcon icon=new ImageIcon("F:/java project/questions.jpg");
//icon.setBounds(0,0,1000,1000);
//Image img=icon.getImage();
//Image newImage=img.getScaledInstance(top.getWidth(),top.getHeight(),Image.SCALE_SMOOTH);
//ImageIcon bcg=new ImageIcon(newImage);


//add(top);
//top.setIcon(bcg);
javabtn=new JButton("Java");
cppbtn=new JButton("C++");
cbtn=new JButton("C");
javabtn.setBounds(200,300,100,100);
cbtn.setBounds(400,300,100,100);
cppbtn.setBounds(600,300,100,100);

jp.add(javabtn);
jp.add(cbtn);
jp.add(cppbtn);

setSize(1000,600);
setVisible(true);
setLayout(null);
setTitle("choose Test");
add(jp,BorderLayout.NORTH);
javabtn.addActionListener(this);
cbtn.addActionListener(this);
cppbtn.addActionListener(this);

addWindowListener(new WindowAdapter()
{
 public void windowClosing(WindowEvent e)
 {
 System.exit(0);
 }
}
);
}

/*
public static void main(String []args){
new choice();}
*/

public void actionPerformed(ActionEvent ae){
if(ae.getSource()==javabtn){
setVisible(false);
java j=	new java();
j.ques();
}
else if(ae.getSource()==cppbtn){
	setVisible(false);
	cpp a=new cpp();
	a.ques();}
else{setVisible(false); 
	new c();
}

}


}