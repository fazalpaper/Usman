package usman;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class rrr extends JPanel {
	private JTextField txtAzizUrRehman;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_5;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Create the panel.
	 */
	public rrr() {
		setBackground(new Color(255, 215, 0));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Basic Detail");
		lblNewLabel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(152, 251, 152)));
		lblNewLabel.setBounds(10, 0, 430, 24);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name ");
		lblNewLabel_1.setBounds(34, 31, 46, 14);
		add(lblNewLabel_1);
		
		txtAzizUrRehman = new JTextField();
		txtAzizUrRehman.setBounds(28, 46, 188, 20);
		add(txtAzizUrRehman);
		txtAzizUrRehman.setColumns(10);
		
		JLabel lblFatherName = new JLabel("Father Name");
		lblFatherName.setBounds(237, 31, 182, 14);
		add(lblFatherName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(231, 46, 188, 20);
		add(textField_1);
		
		JLabel lblOfficerId = new JLabel("Officer ID");
		lblOfficerId.setBounds(140, 71, 112, 14);
		add(lblOfficerId);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(137, 84, 115, 20);
		add(textField_2);
		
		JLabel lblCnicNo = new JLabel("CNIC No");
		lblCnicNo.setBounds(262, 69, 46, 14);
		add(lblCnicNo);
		
		textField_3 = new JTextField();
		textField_3.setText("3530266108383");
		textField_3.setColumns(10);
		textField_3.setBounds(262, 84, 99, 20);
		add(textField_3);
		
		JLabel lblAddress = new JLabel("Present Address");
		lblAddress.setBounds(34, 111, 171, 14);
		add(lblAddress);
		
		JLabel lblPermanentAddress = new JLabel("Permanent Address");
		lblPermanentAddress.setBounds(237, 111, 182, 14);
		add(lblPermanentAddress);
		
		JLabel lblQulification = new JLabel("Qulification");
		lblQulification.setBounds(34, 169, 171, 14);
		add(lblQulification);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(28, 184, 150, 20);
		add(textField_6);
		
		JLabel lblTelephoneNo = new JLabel("Telephone No");
		lblTelephoneNo.setBounds(194, 169, 157, 14);
		add(lblTelephoneNo);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(188, 184, 122, 20);
		add(textField_7);
		
		JLabel lblDateOfJoining = new JLabel("Date of Joining");
		lblDateOfJoining.setBounds(34, 207, 87, 14);
		add(lblDateOfJoining);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(28, 222, 102, 20);
		add(textField_8);
		
		JLabel lblDateOfJoining_1 = new JLabel("Date of Joining ");
		lblDateOfJoining_1.setBounds(146, 207, 87, 14);
		add(lblDateOfJoining_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(140, 222, 112, 20);
		add(textField_9);
		
		JLabel lblServiceGroup = new JLabel("Service Group");
		lblServiceGroup.setBounds(34, 249, 93, 14);
		add(lblServiceGroup);
		
		JLabel label = new JLabel("Officer ID");
		label.setBounds(35, 69, 46, 14);
		add(label);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(29, 84, 99, 20);
		add(textField_10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(128, 128, 128)));
		textArea.setBounds(29, 124, 188, 38);
		add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBorder(new LineBorder(new Color(128, 128, 128)));
		textArea_1.setBounds(237, 124, 188, 38);
		add(textArea_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(28, 265, 105, 20);
		add(textField_5);
		
		JLabel lblServiceGroupType = new JLabel("Service Group type");
		lblServiceGroupType.setBounds(148, 248, 104, 14);
		add(lblServiceGroupType);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(142, 264, 110, 20);
		add(textField_11);
		
		JLabel lblBasicPayScale = new JLabel("Basic Pay Scale");
		lblBasicPayScale.setBounds(270, 248, 91, 14);
		add(lblBasicPayScale);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(264, 264, 105, 20);
		add(textField_12);

	}
}
