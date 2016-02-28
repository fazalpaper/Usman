package usman;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class ctest extends JFrame {

	private JPanel contentPane;
	 String minute;
	   String second;
	   Thread t,t1;
	   
	 public void paint(Graphics g){
	      Calendar cal = new GregorianCalendar();
	      String hour = String.valueOf(cal.get(Calendar.HOUR));
	      minute  = String.valueOf(cal.get(Calendar.MINUTE));
	      second = String.valueOf(cal.get(Calendar.SECOND));
	      g.drawString(hour + ":" + minute + ":" + second, 20, 30);
	   }
	 
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ctest frame = new ctest();
					frame.setVisible(true);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
//	@SuppressWarnings("static-access")
	public ctest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(64, 90, 274, 33);
		contentPane.add(label);
		
		 t1 = Thread.currentThread();
		 
		 
		 	int a=0;
		 	while(a < 10){
	         repaint();
	         try{
	            t1.sleep(1000);    
	         //   System.out.print("");
	            
	          Calendar cal = new GregorianCalendar();
	  	      String hour = String.valueOf(cal.get(Calendar.HOUR));
	  	      minute  = String.valueOf(cal.get(Calendar.MINUTE));
	  	      second = String.valueOf(cal.get(Calendar.SECOND));
	         
	            if(minute .equals("1")  && second .equals("5") )
	            {
	            	System.out.print("aziz");
	            	label.setText("Aziz");
	            }
	            
	            
	            
	            
	         }
	         catch(InterruptedException e){}
	      }
	}
}
