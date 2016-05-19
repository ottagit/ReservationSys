package train_booking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;


public class SignUp extends Connect{
	
	//variable declaration
	
	private JPanel jpane;
	private JButton cancel;
	private JButton btn1, btn2;
	private JLabel lbl1, lbl2, lbl3;
	private JPasswordField jpaswd;
	private JTextField jtfield;
	JFrame frame;
	Main M;
	
	//Created a new form Sign_up
	
	public SignUp()
	{
		initComponents();
	}
	
	/*This method is called from within the 
	 * constructor to initialize the form
	 * 
	 */
	private void initComponents()
	{
		frame = new JFrame(); 
		jpane = new JPanel();
		cancel = new JButton();
		btn1 = new JButton();
		btn2 = new JButton();
		lbl1 = new JLabel();
		lbl2 = new JLabel();
		lbl3 = new JLabel();
		jpaswd = new JPasswordField();
		jtfield = new JTextField();
		
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		frame.setTitle("Sign Up");
		frame.setMaximumSize(new Dimension(400,300));
		frame.setMinimumSize(new Dimension(400,300));
		frame.setPreferredSize(new Dimension(400,300));
		frame.setLayout(null);
		
		jpane.setMaximumSize(new Dimension(400,300));
		jpane.setMinimumSize(new Dimension(400,300));
		jpane.setPreferredSize(new Dimension(400,300));
		jpane.setLayout(null);
		
		btn1.setBackground(new Color(204,255,102));
		btn1.setText("Register");
		
		//Register Mouse Listener
		btn1.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me)
			{
				btn1MouseClicked(me);
			}
		});
		
		//Register ActionListener
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				btn1ActionPerformed(ae);
			}
		});
		
		jpane.add(btn1);
		btn1.setBounds(140, 150, 90, 32);
		
		lbl1.setBackground(new Color(204,255,102));
		lbl1.setText("User Name");
		jpane.add(lbl1);
		lbl1.setBounds(60, 60, 70, 25);
		
		cancel.setBackground(new Color(204,255,102));
		cancel.setText("Cancel");
		cancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				cancelActionPerformed(ae);
			}
		});
		jpane.add(cancel);
		cancel.setBounds(250, 150, 88, 32);
		
		jpaswd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				jpaswdActionPerformed(ae);
			}
		});
		jpane.add(jpaswd);
		jpaswd.setBounds(140, 110, 200, 32);
		
		lbl2.setBackground(new Color(204,255,102));
		lbl2.setText("Password");
		jpane.add(lbl2);
		lbl2.setBounds(60, 110, 63, 22);
		
		btn2.setBackground(new Color(204,255,102));
		btn2.setText("main");
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				btn2ActionPerformed(ae);
			}
		});
		jpane.add(btn2);		
		btn2.setBounds(140, 190, 90, 32);
		
		jtfield.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				jtfieldActionPerformed(ae);
			}
		});
		jpane.add(jtfield);
		jtfield.setBounds(140, 60, 200, 31);
		
		lbl3.setIcon(new ImageIcon("/home/otta/workspace/ReservationSys/src/Logo/Logoo.png"));
		jpane.add(lbl3);
		lbl3.setBounds(0, 0, 400, 310);
		
		frame.add(jpane);
		jpane.setBounds(0, -5, 400, 310);
		
		/*
		 * This method sizes the frame so that all its contents
		 * are at or above their preferred size
		 */
		frame.pack();
		
		
	}
	
	private void jtfieldActionPerformed(ActionEvent ae){
		//Handling code goes here
	}
	
	private void btn2ActionPerformed(ActionEvent ae){
		frame.dispose();//Destroys the current window
		M = new Main();
		jpane.setVisible(true);
		
		//Handling code goes here
	}
	
	private void cancelActionPerformed(ActionEvent ae){
		jtfield.setText("");
		jpaswd.setText("");
		
		//Handling code goes here
	}

	private void btn1ActionPerformed(ActionEvent ae){
		//Handling code goes here
	}
	
	private void jpaswdActionPerformed(ActionEvent ae){
		//Handling code goes here
	}
	
	private void btn1MouseClicked(MouseEvent me){
		
		String sql = "insert into User(Username, Password) values(?,?)";
		
		try{
			ps = con.prepareStatement(sql);
			ps.setString(1, jtfield.getText());
			ps.setString(2,String.valueOf(jpaswd.getPassword()));
			ps.execute();
			JOptionPane.showMessageDialog(null, "Saved");
			
			frame.dispose();
			//Passenger pass = new Passenger();
			//pass.setVisible(true);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
		
		//Handling code goes here
	}
	
	/*
	 * @param args the command line arguments
	 */
	
	public static void main(String args[]){
		//Set the NImbus look and feel
		try{
		for(LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
			if("Nimbus".equals(info.getName())){
				UIManager.setLookAndFeel(info.getClassName());
				break;
			}
		 }
		}
		catch(ClassNotFoundException e){
			java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null,e);
		}
		catch(InstantiationException ie){
			java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null,ie);
		}
		catch(IllegalAccessException iae){
			java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null,iae);
		}
		catch(UnsupportedLookAndFeelException ue){
			java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null,ue);	
		}
		
		//Create and display the form
		
		
	}
}
