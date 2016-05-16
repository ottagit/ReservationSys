package train_booking;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;

public class Login extends Connect implements ActionListener {

	JFrame f;
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;//view shows something was typed but does not show original characters
	JButton b1,b2;
	Main M;
	
	Login()
	{
	f=new JFrame("Login");
	f.setLayout(null);
	f.setBackground(Color.GRAY);
	l1=new JLabel("User Name");
	l1.setForeground(Color.black);
	l1.setBounds(50,50,100,30);
	l2=new JLabel("Password");
	l2.setForeground(Color.black);
	l2.setBounds(50,80,100,30);
	t1=new JTextField(10);
	t1.setForeground(Color.blue);
	t1.addActionListener(this);
	t1.setBounds(150,50,100,30);
	t2=new JPasswordField(10);
	t2.setForeground(Color.blue);
	t2.setEchoChar('*');//sets the echo character for this JPasswordField
	t2.addActionListener(this);
	t2.setBounds(150,80,100,30);
	b1=new JButton("Ok");
	b1.setForeground(Color.blue);
	b1.addActionListener(this);
	b1.setBounds(50,120,100,30);
	b2=new JButton("Cancel");
	b2.setForeground(Color.blue);
	b2.addActionListener(this);
	b2.setBounds(180,120,100,30);

	b1.setMnemonic('O');
	b2.setMnemonic('C');

	f.add(l1);
	f.add(l2);
	f.add(t1);
	f.add(t2);
	f.add(b1);
	f.add(b2);
	f.setBounds(300,300,300,200);
	f.setResizable(false);
	f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		Object source = e.getSource();
		
		if(source==b1)
		{
			try
			{
		        
		        String struname = t1.getText();
		        char[] strpass = t2.getPassword();
		      
				//password = String.valueOf(strpass);
				
				if(struname.length()==0||strpass.length==0)//change from length() to length
				{
				JOptionPane.showMessageDialog(null,"Fields are empty");//pop up user prompt
				}
				else
				{
				stt = con.createStatement();
				String username = "";
			    String password = "";
				
				String sql = "SELECT * from User WHERE Username =? AND Password = ?";
				ps = con.prepareStatement(sql);
				//+ "'AND Password='"+ String.valueOf(t2.getPassword())+"'");
				ps.setString(1, t1.getText());
				ps.setString(2,String.valueOf(strpass));
				rs = ps.executeQuery();
				
				//while(rs.next())
				if(rs.next())
				{
					//username = rs.getString(1);
					//password = rs.getString(2);
					
				//}
				
				//stt.close();
				/*if(!username.equals(t1.getText()) || !password.equals(t2.getPassword()))
				{
					JOptionPane.showMessageDialog(null, "Invalid username or password", "Try Again", JOptionPane.ERROR_MESSAGE);
					
					t1.setText("");
					t2.setText("");
					t1.requestFocus(true);
					
				}*/
				//if(username.equals(struname)){
					//if(password.equals(strpass))
				//}
				//else
				//{
					JOptionPane.showMessageDialog(null, "Succesfully Login", "Success", JOptionPane.INFORMATION_MESSAGE);
					
					f.setVisible(false);
					M = new Main();
				}
				
				//}
				else{
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Try Again", JOptionPane.ERROR_MESSAGE);
					
					t1.setText("");
					t2.setText("");
					t1.requestFocus(true);
				}
	
		}
			}
		
		catch(SQLException ex)
			{
					System.out.println("Exception description " + ex);
			}
		finally
		{
			//Must be executed in reverse order of method calls
			System.out.println("A must execution.");
		}
		}
		
		if(source==b2)
		{
			f.setVisible(false);
			System.exit(0);
		}
	}

}
