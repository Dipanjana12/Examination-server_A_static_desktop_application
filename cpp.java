package server;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cpp extends JFrame implements ActionListener{
JRadioButton jrb[]=new JRadioButton[5];
JLabel ques,decision,jrb0,jrb1,jrb2,jrb3;JButton submit,skip;
ButtonGroup bg;
static int count=0;
static int qstatus=0;
cpp(){
JPanel jp=new JPanel();
	ques=new JLabel();
	ques.setBounds(100,100,800,50);

					//RADIO BUTTON
	jrb[0]=new JRadioButton();
	jrb[1]=new JRadioButton();
	jrb[2]=new JRadioButton();
	jrb[3]=new JRadioButton();

	jrb[0].setBounds(100,180,20,20);
	jrb[1].setBounds(100,220,20,20);
	jrb[2].setBounds(100,260,20,20);
	jrb[3].setBounds(100,300,20,20);

bg=new ButtonGroup();
	bg.add(jrb[0]);
	bg.add(jrb[1]);
	bg.add(jrb[2]);
	bg.add(jrb[3]);
	
	
					//RADIO FIXED

	
			//label
		jrb0=new JLabel();jrb0.setBounds(150,165,600,40);
		jrb1=new JLabel();jrb1.setBounds(150,210,600,40);
		jrb2=new JLabel();jrb2.setBounds(150,255,600,40);
		jrb3=new JLabel();jrb3.setBounds(150,295,600,40);
	

			//buttons
		submit=new JButton("Submit");
		skip=new JButton("Skip");
		submit.setBounds(100,350,100,40);
		
		skip.setBounds(200,350,100,40);
	
		add(ques);
		add(jrb[0]);
		add(jrb[1]);
		add(jrb[2]);
		add(jrb[3]);
		add(jrb0);
		add(jrb1);
		add(jrb2);
		add(jrb3);
		add(submit);submit.addActionListener(this);
jp.setLayout(null);getContentPane().add(jp);
add(jp,BorderLayout.NORTH);
setSize(1100,1100);

setTitle("C++");
setVisible(true);
setLayout(null);
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
ques.setText("Q 1 - A trigraph character begins with");
jrb0.setText("A - #");
jrb1.setText("B - ##");
jrb2.setText("C - ?");
jrb3.setText("D - ??");jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==1){
ques.setText("Q 2 - Choose the respective delete operator usage for the expression ‘ptr=new int[100]’.");
jrb0.setText("A - delete ptr;");
jrb1.setText("B - delete ptr[];");
jrb2.setText("C - delete[] ptr;");
jrb3.setText("D - []delete ptr;");jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==2){
ques.setText("Q 3 - Runtime polymorphism is done using.");
jrb0.setText("A - Function overloading");
jrb1.setText("B - Virtual classes");
jrb2.setText("C - Virtual functions");
jrb3.setText("D - Friend function");jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==3){
ques.setText("Q 4 - Choose the Object oriented programming language from below.");
jrb0.setText("A - C++");
jrb1.setText("B - Small talk");
jrb2.setText("C - Simula");
jrb3.setText("D - All the above.");jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==4){
ques.setText("Q 5 - Which operator is used to resolve the scope of the global variable?");
jrb0.setText("A - ->");
jrb1.setText("B - .");
jrb2.setText("C - *");
jrb3.setText("D - ::");jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==5){
ques.setText("Q 6 - (i) ‘ios’ is the base class of ‘istream’ (ii) All the files are classified into only 2 types. (1) Text Files (2) Binary Files.");
jrb0.setText("A - Only (i) is true");
jrb1.setText("B - Only (ii) is true");
jrb2.setText("C - Both (i) & (ii) are true");
jrb3.setText("D - Both (i) & (ii) are false");jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==6){
ques.setText("Q 7 - A C++ program statements can be commented using");
jrb0.setText("A - Single line comment");
jrb1.setText("B - Multi line comment");
jrb2.setText("C - Either (a) or (b)");
jrb3.setText("D - Both (a) and (b).");jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==7){
ques.setText("Q 8 - What is the size of ‘int’?");
jrb0.setText("A - 2");
jrb1.setText("B - 4");
jrb2.setText("C - 8");
jrb3.setText("D - Compiler dependent");jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==8){
ques.setText("Q 9 - Following is the invalid inclusion of a file to the current program. Identify it");
jrb0.setText("A - #include <file>");
jrb1.setText("B - #include \"file\" ");
jrb2.setText("C - #include < file");
jrb3.setText("D - All of the above are invalid");jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
if(qstatus==9){
ques.setText("Q 10 - i) Exceptions can be traced and controlled using conditional statements.ii) For critical exceptions compiler provides the handler");
jrb0.setText("A - Only (i) is true");
jrb1.setText("B - Only (ii) is true");
jrb2.setText("C - Both (i) & (ii) are true");
jrb3.setText("D - Both (i) && (ii) are false");
jrb[0].setBounds(100,180,20,20);
jrb[1].setBounds(100,220,20,20);
jrb[2].setBounds(100,260,20,20);
jrb[3].setBounds(100,300,20,20);
}
	

}
void check(){
if(qstatus==0){//done
if(jrb[2].isSelected()){
count++;}
}
if(qstatus==1){//done
if(jrb[2].isSelected()){
count++;}
}
if(qstatus==2){
if(jrb[2].isSelected()){
count++;}
}
if(qstatus==3){//done
if(jrb[3].isSelected()){
count++;}
}
if(qstatus==4){//done
if(jrb[3].isSelected()){
count++;}
}
if(qstatus==5){//done
if(jrb[2].isSelected()){
count++;}
}
if(qstatus==6){// not done
if(jrb[3].isSelected()){
count++;}
}
if(qstatus==7){//done
if(jrb[3].isSelected()){
count++;}
}
if(qstatus==8){
if(jrb[2].isSelected()){
count++;}
}
if(qstatus==9){//done
if(jrb[1].isSelected()){
count++;}
}



}


/*
public static void main(String []args){

//etExtendedState(MAXIMIZED_BOTH);
cpp la=new cpp();
la.ques();

}*/
public void actionPerformed(ActionEvent ae){
if(ae.getSource()==submit){check();
qstatus++;ques();bg.clearSelection();

if(qstatus==10){
	JOptionPane.showMessageDialog(getOwner(), "score is"+count);
submit.setEnabled(false);
}

}

if(ae.getSource()==skip){
	qstatus++;ques();
}

}


}