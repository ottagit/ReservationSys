package train_booking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main implements ActionListener {
	
	JFrame f;
	JButton b1,b2,b3,b4;
	Reservation r;
	Enquiry q;
	Cancellation c;
	JLabel imgL;
	ImageIcon img;
	Main()
	{
	img=new ImageIcon("/home/otta/workspace/ReservationSys/src/Logo/Logoo.png");
	imgL=new JLabel(img);
	imgL.setBounds(150,150,600,300);
	f=new JFrame("Main");
	f.getContentPane().setLayout(null);
	f.getContentPane().setBackground(Color.lightGray);
	b1=new JButton("Reservation Form");
	b1.addActionListener(this);
	b1.setBounds(150,390,210,60);
	b2=new JButton("PNR-enquiry");
	b2.addActionListener(this);
	b2.setBounds(150,490,210,60);
	b3=new JButton("Cancellation Form");
	b3.addActionListener(this);
	b3.setBounds(580,390,210,60);
	b4=new JButton("Exit");
	b4.addActionListener(this);
	b4.setBounds(580,490,210,60);

	b1.setBackground(Color.blue);
	b1.setForeground(Color.white);
	b2.setBackground(Color.BLUE);
	b2.setForeground(Color.white);
	b3.setBackground(Color.blue);
	b3.setForeground(Color.white);
	b4.setBackground(Color.blue);
	b4.setForeground(Color.white);

	b1.setMnemonic('R');
	b2.setMnemonic('P');
	b3.setMnemonic('C');
	b4.setMnemonic('E');

	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(imgL);
	f.setSize(800,600);
	f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==b1)
	{
	f.setVisible(false);
	r=new Reservation();
	}
	if(e.getSource()==b2)
	{
	f.setVisible(false);
	q=new Enquiry();
	}
	if(e.getSource()==b3)
	{
	f.setVisible(false);
	c=new Cancellation();
	}
	if(e.getSource()==b4)
	{
	f.setVisible(false);
	System.exit(0);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
