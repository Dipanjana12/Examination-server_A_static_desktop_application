package server;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Adminlogin extends JFrame implements ActionListener {

	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField p1;
	JButton b1;
	
	 Adminlogin() {

		 JPanel jp=new JPanel();
			getContentPane().add(jp);jp.setLayout(null);

			l1=new JLabel("Admin Login");
			l2=new JLabel("Name");
			l3=new JLabel("Password");
			t1=new JTextField(10);
			p1=new JPasswordField();
			b1=new JButton("Submit");
			
			l1.setBounds(50, 30, 200, 50);
			l2.setBounds(50, 70, 100, 50);
			t1.setBounds(120, 80, 150, 20);
			l3.setBounds(50, 110, 100, 50);
			p1.setBounds(120, 120, 150, 20);
			b1.setBounds(50, 180, 100, 30);
			
			jp.add(l1);
			jp.add(l2);
			jp.add(t1);
			jp.add(l3);
			jp.add(p1);
			jp.add(b1);
			
			setSize(1000,600);
			setVisible(true);
			setLayout(null);
			setTitle("Admin Login");
			
			add(jp,BorderLayout.NORTH);
			b1.addActionListener(this);
			
			
			addWindowListener(new WindowAdapter()
			{
			 public void windowClosing(WindowEvent e)
			 {
			 System.exit(0);
			 }
			}
			);

		
	}
	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==b1){
			
			String s1=t1.getText();
	   	    char[] s2=p1.getPassword();
	   	    String s3=new String(s2);
	   	    
	   	    if(s1!=null && s3!=null){
	   	    	
	   	    	try{
	   	    	Class.forName("oracle.jdbc.driver.OracleDriver");
	   	    	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sam");
	   	    	String query="SELECT * FROM ADMIN WHERE(name = ? AND Password = ?)";
	   	    	PreparedStatement ps=con.prepareStatement(query);
	   	    	ps.setString(1, s1);
	   	    	ps.setString(2, s3);
	   	    	ResultSet rs=ps.executeQuery();
	   	 	if (rs.next()) {

				
				setVisible(false);
				new Admin();
				
				
				

			} else {
				JOptionPane.showMessageDialog(b1,"invalid username nd password");
				t1.setText("");
				p1.setText("");
			}

	   	    	
	   	    		
	   	    		
	   	    		
	   	    	}
	   	    	catch (Exception ae) {
					System.out.println(ae);
				}
	   	    	
	   	    	
	   	    	
	   	    	
	   	    }
	   	
		
		
		
		}
		

		
		
	}

	
}
