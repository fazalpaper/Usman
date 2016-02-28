package usman;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class test extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		
		setBounds(100, 100, 450, 300);
		putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
	//	setBackground(new Color(0.5f,1.0f,1.0f,0.0f));
		BasicInternalFrameTitlePane titlePane = 
		(BasicInternalFrameTitlePane) ((BasicInternalFrameUI) getUI()).
	      getNorthPane();
			remove(titlePane);
	}

	

}
