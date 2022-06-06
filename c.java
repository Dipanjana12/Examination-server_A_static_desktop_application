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




public class c extends JFrame implements ActionListener{
JRadioButton jrb[]=new JRadioButton[5];
JLabel ques,jrb0,jrb1,jrb2,jrb3;
JButton submit,skip;
ButtonGroup bg;
static int count=0;
static int qstatus=0;
c(){JPanel jp=new JPanel();
jp.setLayout(null);

	ques=new JLabel();
	ques.setBounds(100,100,800,50);
	//add(ques);
					//RADIO BUTTON
	jrb[0]=new JRadioButton();
	jrb[1]=new JRadioButton();
	jrb[2]=new JRadioButton();
	jrb[3]=new JRadioButton();
	jrb[4]=new JRadioButton();
	jrb[0].setBounds(100,180,20,20);
	jrb[1].setBounds(100,220,20,20);
	jrb[2].setBounds(100,260,20,20);
	jrb[3].setBounds(100,300,20,20);

	bg=new ButtonGroup();
	bg.add(jrb[0]);
	bg.add(jrb[1]);
	bg.add(jrb[2]);
	bg.add(jrb[3]);
	/*
	add(jrb[0]);
	add(jrb[1]);
	add(jrb[2]);
	add(jrb[3]);
		*/			//RADIO FIXED

	
			//label
		jrb0=new JLabel();jrb0.setBounds(150,165,600,40);
		jrb1=new JLabel();jrb1.setBounds(150,210,600,40);
		jrb2=new JLabel();jrb2.setBounds(150,255,600,40);
		jrb3=new JLabel();jrb3.setBounds(150,295,600,40);
		submit=new JButton("Submit");	
		submit.setBounds(100,350,100,40);
		skip=new JButton("Skip");
		skip.setBounds(200,350,100,40);
		//JButton b1=new JButton("s");
		//b1.setBounds(200,400,100,40);
/*	add(jrb0);
	add(jrb1);
	add(jrb2);
	add(jrb3);
	add(submit);
	add(skip);
	*/
	
	//.................
	
	    add(ques);
	    add(jrb[0]);
		
	    add(jrb[1]);
		add(jrb[2]);
		add(jrb[3]);
      	add(jrb0);
		add(jrb1);
		add(jrb2);
		add(jrb3);
		add(submit);
		
		//add(skip);
	//.............
//	add(b1);
	
	submit.addActionListener(this);
			//buttons
	skip.addActionListener(this);

	getContentPane().add(jp);		
		setVisible(true);
		setTitle("C");
		setExtendedState(MAXIMIZED_BOTH);
     setSize(900,900);
    //setVisible(true);
   setLayout(null);add(jp,BorderLayout.NORTH);
   addWindowListener(new WindowAdapter()
   {
    public void windowClosing(WindowEvent e)
    {
    new Mainpage();
    }
   }
   );}
 void ques(){
	 jrb[4].setSelected(true);
if(qstatus==0)
{
	
ques.setText("Q 1 - Identify the invalid constant used in fseek() function as ‘whence’ reference.");
jrb0.setText("A - SEEK_SET");
jrb1.setText("B - SEEK_CUR");
jrb2.setText("C - SEEK_BEG");
jrb3.setText("D - SEEK_END");
jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==1){
ques.setText("Q 2 - Which of the following is a logical OR operator?");
jrb0.setText("A - &");
jrb1.setText("B - &&");
jrb2.setText("C - ||");
jrb3.setText("D - None of the above");
jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==2){
ques.setText("Q 3 - Choose the correct order of evaluation,");
jrb0.setText("A - Relational Arithmetic Logical Assignment");
jrb1.setText("B - Arithmetic Relational Logical Assignment");
jrb2.setText("C - Logical Arithmetic Relational Assignment");
jrb3.setText("D - Assignment Arithmetic Logical Relational");
jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==3){
ques.setText("Q 4 - First operating system developed using C programming language.");
jrb0.setText("A - DOS");
jrb1.setText("B - Windows");
jrb2.setText("C - UNIX");
jrb3.setText("D - Mac.");
jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==4){
ques.setText("Q 5 - Choose the function that is most appropriate for reading in a multi-word string?");
jrb0.setText("A - strnset()");
jrb1.setText("B - scanf()");
jrb2.setText("C - strchr()");
jrb3.setText("D - gets()");
jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==5){
ques.setText("Q 6 - The types of linkages are,");
jrb0.setText("A - Internal linkage and External linkage");
jrb1.setText("B - Internal linkage, External linkage and None linkage");
jrb2.setText("C - Internal linkage and None linkage");
jrb3.setText("D - External linkage and None linkage");
jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==6){
ques.setText("Q 7 - Which header file supports the functions - malloc() and calloc()?");
jrb0.setText("A - stdlib.h");
jrb1.setText("B - memory.h");
jrb2.setText("C - math.h");
jrb3.setText("D - stdio.h");
jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==7){
ques.setText("Q 8- “Stderr” is a standard error.");
jrb0.setText("A - Yes");
jrb1.setText("B - Standard error streams");
jrb2.setText("C - Standard error types");
jrb3.setText("D - Standard error function");
jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==8){
ques.setText("Q 9 - The prototype of a function can be used to,");
jrb0.setText("A - Define a function");
jrb1.setText("B - Declare a function");
jrb2.setText("C - Erase a function");
jrb3.setText("D - None of the above");
jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==9){
ques.setText("Q 10 - The correct order of evaluation for the expression “z = x + y * z / 4 % 2 – 1”");
jrb0.setText("A - * / % = + -");
jrb1.setText("B - / * % - + =");
jrb2.setText("C - - + = * % /");
jrb3.setText("D - * / % + - =");
jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}/*
	jrb[0].setBounds(100,180,20,20);
	jrb[1].setBounds(100,220,20,20);
	jrb[2].setBounds(100,260,20,20);
	jrb[3].setBounds(100,300,20,20);
*/ }
void check(){
	
if(qstatus==0){//done
if(jrb[2].isSelected()){
	jrb[2].setBounds(100,260,20,20);
count++;}
}
if(qstatus==1){//done
if(jrb[2].isSelected()){
	jrb[2].setBounds(100,260,20,20);
count++;}
}
if(qstatus==2){
if(jrb[1].isSelected()){
count++;}
}
if(qstatus==3){//done
if(jrb[2].isSelected()){jrb[2].setBounds(100,260,20,20);
count++;}
}
if(qstatus==4){//done
if(jrb[3].isSelected()){
count++;}
}
if(qstatus==5){//done
if(jrb[1].isSelected()){
count++;}
}
if(qstatus==6){//done
if(jrb[0].isSelected()){
count++;}
}
if(qstatus==7){//done
if(jrb[1].isSelected()){
count++;}
}
if(qstatus==8){
if(jrb[1].isSelected()){
count++;}
}
if(qstatus==9){//done
if(jrb[3].isSelected()){	
	
count++;}



}
}

public static void main(String []args){
//JFrame jf=new JFrame();
//jf.setExtendedState(jf.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	
c la=new c();
la.ques();
}
public void actionPerformed(ActionEvent ae){
if(ae.getSource()==submit){check();
qstatus++;bg.clearSelection();
ques();
if(qstatus==10){JOptionPane.showMessageDialog(submit, "YOur Score is"+count);submit.setEnabled(false);}
}if(ae.getSource()==skip){
	qstatus++;ques();
}
}
}
