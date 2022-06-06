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
import javax.swing.JTextField;

public class Admin extends JFrame implements ActionListener
{

	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1;
	
	Admin(){
		
		JPanel jp=new JPanel();
		getContentPane().add(jp);jp.setLayout(null);
		
		l1=new JLabel("Enter question for exam:");
		l2=new JLabel("Question");
		l3=new JLabel("Option 1");
		l4=new JLabel("Option 2");
		l5=new JLabel("Option 3");
		l6=new JLabel("Option 4");
		l7=new JLabel("Answer");
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		t6=new JTextField();
		b1=new JButton("Submit");
		
		l1.setBounds(50, 30, 200, 50);
		l2.setBounds(50, 70, 100, 50);
		t1.setBounds(120, 90, 250, 20);
		l3.setBounds(50, 100, 100, 50);
		t2.setBounds(120, 120, 250, 20);
		l4.setBounds(50, 130, 100, 50);
		t3.setBounds(120, 150, 250, 20);
		l5.setBounds(50, 160, 100, 50);
		t4.setBounds(120, 180, 250, 20);
		l6.setBounds(50, 190, 100, 50);
		t5.setBounds(120,210, 250, 20);
		l7.setBounds(50, 220, 100, 50);
		t6.setBounds(120, 240, 250, 20);
		b1.setBounds(50, 280, 100, 30);
		
		
		jp.add(l1);
		jp.add(l2);
		jp.add(t1);
		jp.add(l3);
		jp.add(t2);
		jp.add(l4);
		jp.add(t3);
		jp.add(l5);
		jp.add(t4);
		jp.add(l6);
		jp.add(t5);
		jp.add(l7);
		jp.add(t6);
		jp.add(b1);
		
		
		setSize(1000,600);
		setVisible(true);
		setLayout(null);
		setTitle("Admin Question");
		
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
			String s2=t2.getText();
			String s3=t3.getText();
			String s4=t4.getText();
			String s5=t5.getText();
			String s6=t6.getText();
			 if(s1 != null && s2 != null && s3 != null && s4 != null && s5 != null && s6 != null)
  			{
			try{
        		Class.forName("oracle.jdbc.driver.OracleDriver");
        		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sam");
        		PreparedStatement ps = con.prepareStatement("insert into OBJECTIVES values(?,?,?,?,?,?)");
        		 ps.setString(1, s1);

                 ps.setString(2, s2);

                 ps.setString(3, s3);

                 ps.setString(4, s4);

                 ps.setString(5, s5);

                 ps.setString(6, s6);

                 ResultSet rs = ps.executeQuery();

                 
                 
                if(rs.next()){
                	 JOptionPane.showMessageDialog(b1, "Data Saved Successfully");
                	 t1.setText("");
                	 t2.setText("");
                	 t3.setText("");
                	 t4.setText("");
                	 t5.setText("");
                	 t6.setText("");
                	 
                 }
                
                 
        	}
        	catch (Exception ex) {

        		System.out.println(ex);
        	}
			}
			 else
  			{
  				JOptionPane.showMessageDialog(b1, "Fill all textfields");
  				 t1.setText("");
              	 t2.setText("");
              	 t3.setText("");
              	 t4.setText("");
              	 t5.setText("");
              	 t6.setText("");
  			}
			
		}
	}
		
		
		
		
	

	
}
