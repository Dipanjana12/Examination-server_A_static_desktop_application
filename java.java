package server;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class java extends JFrame implements ActionListener{
JRadioButton jrb[]=new JRadioButton[4];
JLabel ques,decision,jrb0,jrb1,jrb2,jrb3;JButton submit,skip;
ButtonGroup bg;JLabel bg1;
static int count=0;
static int qstatus=0;
java(){bg1=new JLabel();add(bg1);
bg1.setBounds(0,0,1000,1000);
JPanel jp=new JPanel();
jp.setLayout(null);
	ques=new JLabel();
	ques.setBounds(100,100,500,50);
	add(ques);
		//RADIO BUTTON
	jrb[0]=new JRadioButton();
	jrb[1]=new JRadioButton();
	jrb[2]=new JRadioButton();
	jrb[3]=new JRadioButton();
System.out.println("woring 1");
	jrb[0].setBounds(100,180,40,40);
	jrb[1].setBounds(100,220,40,40);
	jrb[2].setBounds(100,260,40,40);
	jrb[3].setBounds(100,300,40,40);

	 bg=new ButtonGroup();
	bg.add(jrb[0]);
	bg.add(jrb[1]);
	bg.add(jrb[2]);
	bg.add(jrb[3]);
	
	add(jrb[0]);
	add(jrb[1]);
	add(jrb[2]);
	add(jrb[3]);
					//RADIO FIXED
System.out.println("working2");
	
			//label
		jrb0=new JLabel();jrb0.setBounds(150,165,900,40);
		jrb1=new JLabel();jrb1.setBounds(150,210,900,40);
		jrb2=new JLabel();jrb2.setBounds(150,255,900,40);
		jrb3=new JLabel();jrb3.setBounds(150,295,900,40);
	add(jrb0);
	add(jrb1);
	add(jrb2);
	add(jrb3);

			//buttons
		submit=new JButton("Submit");
		skip=new JButton("Skip");
		submit.setBounds(100,320,100,40);
	add(submit);
		skip.setBounds(200,320,100,40);
	
		



		getContentPane().add(jp);
add(jp,BorderLayout.NORTH);
jp.setSize(1000,1000);
setVisible(true);setSize(1200,1200);
setTitle("JAVA");
submit.addActionListener(this);

//setLayout(null);
addWindowListener(new WindowAdapter()
{
 public void windowClosing(WindowEvent e)
 {
 new Mainpage();
 }
}
);}
 void ques(){
if(qstatus==0){
ques.setText("Q 1 - What is the size of byte variable?");
jrb0.setText("A - 8 bit");
jrb1.setText("B - 16 bit");
jrb2.setText("C - 32 bit");
jrb3.setText("D - 64 bit");
}
if(qstatus==1){
ques.setText("Q 2 - What is the default value of double variable?");
jrb0.setText("A - 0.0d");
jrb1.setText("B - 0.0f");
jrb2.setText("C - 0");
jrb3.setText("D - not defined");
}
if(qstatus==2){
ques.setText("Q 3 - Which of the following is false about String?");
jrb0.setText("A - String is immutable.");
jrb1.setText("B - String can be created using new operator.");
jrb2.setText("C - String is a primary data type");
jrb3.setText("D - None of the above.");
}
if(qstatus==3){
ques.setText("Q 4 - What is Encapsulation?");
jrb0.setText("A - Encapsulation is a technique to define different methods of same type.");
jrb1.setText("B - Encapsulation is the ability of an object to take on many forms.");
jrb2.setText("C - Encapsulation is the technique of making the fields in a class private and providing access to the fields via public methods.");
jrb3.setText("D - None of the above.");
}
if(qstatus==4){
ques.setText("Q 5 - What is JRE?");
jrb0.setText("A - JRE is a java based GUI application.");
jrb1.setText("B - JRE is an application development framework.");
jrb2.setText("C - JRE is an implementation of the Java Virtual Machine which executes Java programs.");
jrb3.setText("D - None of the above.");
}
if(qstatus==5){
ques.setText("Q 6- Static binding uses which information for binding?");
jrb0.setText("A - type.");
jrb1.setText("B - object.");
jrb2.setText("C - Both of the above.");
jrb3.setText("D - None of the above.");
}
if(qstatus==6){
ques.setText("Q 7- What is a class in java?");
jrb0.setText("A - A class is a blue print from which individual objects are created. A class can contain fields and methods to describe the behavior of an object.");
jrb1.setText("B - class is a special data type.");
jrb2.setText("C - class is used to allocate memory to a data type.");
jrb3.setText("D - none of the above.");
}
if(qstatus==7){
ques.setText("Q 8 - What happens when thread's yield() method is called?");
jrb0.setText("A - Thread returns to the ready state.");
jrb1.setText("B - Thread returns to the waiting state.");
jrb2.setText("C - Thread starts running.");
jrb3.setText("D - None of the above.");
}
if(qstatus==8){
ques.setText("Q 9 - What is runtime polymorphism?");
jrb0.setText("A - Runtime polymorphism is a process in which a call to an overridden method is resolved at runtime rather than at compile-time.");
jrb1.setText("B - Runtime polymorphism is a process in which a call to an overloaded method is resolved at runtime rather than at compile-time.");
jrb2.setText("C - Both of the above.");
jrb3.setText("D - None of the above.");
}
if(qstatus==9){
ques.setText("Q 10 - Which of the following is a marker interface?");
jrb0.setText("A - serializable");
jrb1.setText("B - comparable");
jrb2.setText("C - cloneable");
jrb3.setText("D - none of the above.");
}
	jrb[0].setBounds(100,180,20,20);
	jrb[1].setBounds(100,220,20,20);
	jrb[2].setBounds(100,260,20,20);
	jrb[3].setBounds(100,300,20,20);








}
public void check(){
if(qstatus==0){//done
if(jrb[0].isSelected()){System.out.println(count);
count++;}
}
if(qstatus==1){//done
if(jrb[0].isSelected()){System.out.println(count);
count++;}
}
if(qstatus==2){
if(jrb[0].isSelected()){System.out.println(count);
count++;}
}
if(qstatus==3){
if(jrb[0].isSelected()){System.out.println(count);
count++;}
}
if(qstatus==4){//done
if(jrb[2].isSelected()){System.out.println(count);
count++;}
}
if(qstatus==5){
if(jrb[0].isSelected()){System.out.println(count);
count++;}
}
if(qstatus==6){
if(jrb[0].isSelected()){System.out.println(count);
count++;}
}
if(qstatus==7){
if(jrb[0].isSelected()){System.out.println(count);
count++;}
}
if(qstatus==8){
if(jrb[0].isSelected()){System.out.println(count);
count++;}
}
if(qstatus==9){//done
if(jrb[0].isSelected()){System.out.println(count);
count++;}}






}



public static void main(String []args){
java j=new java();
j.ques();

}
public void actionPerformed(ActionEvent ae){
if(ae.getSource()==submit){check();
bg.clearSelection();
qstatus++;
ques();

if(qstatus==10){JOptionPane.showMessageDialog(submit, "your score is"+count);
submit.setEnabled(false);
}
}
if(ae.getSource()==skip){
	qstatus++;
	ques();
}

}


}