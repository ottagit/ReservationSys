package train_booking;

import java.awt.*;
import javax.swing.*;

public class Welcome implements Runnable{
	
	JFrame f;
	JLabel l1,l2,l3;
	Thread t;
	Login l;
	ImageIcon img;
	Welcome()
	{
	img=new ImageIcon("/logo_krc.png");
	t=new Thread(this);
	f=new JFrame("Welcome");
	f.getContentPane().setLayout(null);
	f.setBackground(Color.lightGray);
	l1=new JLabel("OnLine Reservation");
	l1.setBounds(250,300,900,50);
	l1.setFont(new Font("Courier new",Font.BOLD,30));
	l1.setForeground(Color.red);
	l2=new JLabel(" _By Osawa C Otta");
	l2.setFont(new Font("Courier new",Font.BOLD,20));
	l2.setBounds(350,380,800,40);
	l2.setForeground(Color.red);
	l3=new JLabel(img);
	l3.setBounds(0,0,1300,1000);
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.setSize(800,700);
	f.setVisible(true);
	t.start();
	}
	public void run()
	{
	int x=1;
	while(x<=5)
	{
	try
	{
	Thread.sleep(1000);
	}
	catch(Exception e)
	{}
	x++;
	}
	f.setVisible(false);
	l=new Login();
	}


}
