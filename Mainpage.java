package server;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Eserver.adminlogin;

public class Mainpage extends JFrame implements ActionListener  {

	JButton b1,b2;
	
	public Mainpage() {
		
		JPanel jp=new JPanel();
		getContentPane().add(jp);jp.setLayout(null);

		b1=new JButton("Student Login");
		b2=new JButton("Admin Login");
		b1.setBounds(200,200,200,150);
		b2.setBounds(500,200,200,150);
		
		jp.add(b1);
		jp.add(b2);
		
		setSize(1000,600);
		setVisible(true);
		setLayout(null);
		setTitle("Examination Server");
		
		add(jp,BorderLayout.NORTH);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
		{
		 public void windowClosing(WindowEvent e)
		 {
		 System.exit(0);
		 }
		}
		);
		
	}
	
	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == b1)
		{
			setVisible(false);
			new Studentlogin();
			
		}
		if(ae.getSource() ==b2)
		{
			setVisible(false);
			new Adminlogin();
		}

		
		
	}

	public static void main(String[] args) {
		new Mainpage();
		
	}
}
