package usman;



import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main_screen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		try{UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
		catch(Exception e){}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_screen frame = new main_screen();
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
	
	
	
	second_screen seccreen = new second_screen();
	
	
	public main_screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(main_screen.class.getResource("/icon/Image File-104.png")));
		label_3.setBounds(651, 216, 110, 129);
		contentPane.add(label_3);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(main_screen.class.getResource("/icon/Gender Neutral User-104.png")));
		label_2.setBounds(86, 216, 110, 129);
		contentPane.add(label_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(main_screen.class.getResource("/icon/MS Word-100 (1).png")));
		lblNewLabel_4.setBounds(358, 216, 110, 129);
		contentPane.add(lblNewLabel_4);
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				seccreen.setVisible(true);
				dispose();
			}
		});
		button.setBounds(309, 384, 202, 31);
		contentPane.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(590, 384, 202, 31);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			//	getContentPane().add(t);
			//	t.setBounds(20, 20, 500, 300);
				
			}
		});
		btnNewButton.setBounds(37, 384, 202, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblWordDocument = new JLabel("Word Document");
		lblWordDocument.setHorizontalTextPosition(SwingConstants.CENTER);
		lblWordDocument.setHorizontalAlignment(SwingConstants.CENTER);
		lblWordDocument.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWordDocument.setBounds(299, 151, 228, 40);
		contentPane.add(lblWordDocument);
		
		JLabel lblNewLabel_3 = new JLabel("Manual Entry");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(24, 151, 228, 40);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(0, 0, 884, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(0, 58, 884, 4);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 11));
		lblNewLabel_2.setBorder(new MatteBorder(0, 0, 0, 1, (Color) Color.GRAY));
		lblNewLabel_2.setBounds(37, 182, 242, 254);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setBorder(new MatteBorder(0, 0, 0, 1, (Color) Color.GRAY));
		label.setBounds(306, 182, 242, 254);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBorder(null);
		label_1.setBounds(579, 151, 242, 285);
		contentPane.add(label_1);
		
		JLabel lblScannedDocument = new JLabel("Scanned Document");
		lblScannedDocument.setHorizontalTextPosition(SwingConstants.CENTER);
		lblScannedDocument.setHorizontalAlignment(SwingConstants.CENTER);
		lblScannedDocument.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblScannedDocument.setBounds(576, 151, 228, 40);
		contentPane.add(lblScannedDocument);
	}
}
