package train_booking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SignUp extends Connect{
	
	//variable declaration
	
	private JPanel jpane;
	private JButton cancel;
	private JButton btn1, btn2;
	private JLabel lbl1, lbl2, lbl3;
	private JPasswordField jpaswd;
	private JTextField jtfield;
	
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
		jpane = new JPanel();
		cancel = new JButton();
		btn1 = new JButton();
		btn2 = new JButton();
		lbl1 = new JLabel();
		lbl2 = new JLabel();
		lbl3 = new JLabel();
		jpaswd = new JPasswordField();
		jtfield = new JTextField();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Sign Up");
		setMaximumSize(new Dimension(400,300));
		setMinimumSize(new Dimension(400,300));
		setPreferredSize(new Dimension(400,300));
		setLayout(null);
		
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
		
		
		
		
		
	}
	

}
