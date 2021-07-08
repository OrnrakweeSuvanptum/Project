package hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class CustomerRegistration extends JFrame {
	
	private JFrame frame ;

	private JPanel contentPane;
	private JTextField CustNameField;
	private JTextField CustNoField;
	private JTextField CustICField;
	private JComboBox Package;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRegistration frame = new CustomerRegistration();
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
	public CustomerRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 873, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 160, 122));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(205, 92, 92)));
		panel.setBounds(10, 11, 836, 58);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CUSTOMER REGISTRATION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel.setBounds(219, 11, 494, 36);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 235, 205));
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_1.setBounds(10, 76, 330, 348);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel CustNameLabel = new JLabel("NAME");
		CustNameLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		CustNameLabel.setBounds(28, 49, 126, 24);
		panel_1.add(CustNameLabel);
		
		JLabel CustNoLabel = new JLabel("PHONE NO.");
		CustNoLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		CustNoLabel.setBounds(28, 96, 126, 24);
		panel_1.add(CustNoLabel);
		
		JLabel CustICLabel = new JLabel("IC NO.");
		CustICLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		CustICLabel.setBounds(28, 146, 126, 24);
		panel_1.add(CustICLabel);
		
		JLabel CustPackLabel = new JLabel("PACKAGE");
		CustPackLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		CustPackLabel.setBounds(28, 193, 126, 24);
		panel_1.add(CustPackLabel);
		
		CustNameField = new JTextField();
		CustNameField.setBounds(132, 49, 161, 24);
		panel_1.add(CustNameField);
		CustNameField.setColumns(10);
		
		CustNoField = new JTextField();
		CustNoField.setColumns(10);
		CustNoField.setBounds(132, 96, 161, 24);
		panel_1.add(CustNoField);
		
		CustICField = new JTextField();
		CustICField.setColumns(10);
		CustICField.setBounds(132, 146, 161, 24);
		panel_1.add(CustICField);
		
		JComboBox ChoosePackage = new JComboBox();
		ChoosePackage.setModel(new DefaultComboBoxModel(new String[] {"Choose Package", "GRAND SUITE", "GRAND DELUXE", "STANDARD ROOM"}));
		ChoosePackage.setBounds(132, 192, 161, 25);
		panel_1.add(ChoosePackage);
		
		JButton PREpACKButton_1 = new JButton("PREVIEW PACKAGE");
		PREpACKButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Package frame = new Package();
				frame.setVisible(true);
			}
		});
		PREpACKButton_1.setFont(new Font("Bodoni MT", Font.BOLD, 13));
		PREpACKButton_1.setBounds(84, 276, 161, 33);
		panel_1.add(PREpACKButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 235, 205));
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_2.setBounds(350, 76, 496, 348);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 476, 175);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"NAME", "PHONE NUMBER", "IC NO.", "PACKAGE"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton CustADDButton = new JButton("ADD");
		CustADDButton.setFont(new Font("Bodoni MT", Font.BOLD, 15));
		CustADDButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
				CustNameField.getText(),
				CustNoField.getText(),
				CustICField.getText(),
				ChoosePackage.getSelectedItem(),
			
		});
				
		if(table.getSelectedRow() == -1 ) {
			if(table.getRowCount() == 0 ) {
				JOptionPane.showMessageDialog(null,"Membership Update confirmed", "Membership Management System", JOptionPane.OK_OPTION);
			}
		}}
			}
		);
		
				
		CustADDButton.setBounds(29, 276, 94, 33);
		panel_2.add(CustADDButton);
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustNameField.setText("");
				CustNoField.setText("");
				CustICField.setText("");
				ChoosePackage.setSelectedItem("Choose Package");
			}
		});
		ResetButton.setFont(new Font("Bodoni MT", Font.BOLD, 15));
		ResetButton.setBounds(140, 276, 111, 33);
		panel_2.add(ResetButton);
		
		JButton CustNextButton = new JButton("NEXT");
		CustNextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Promotion frame = new Promotion();
				frame.setVisible(true);
			}
		});
		CustNextButton.setFont(new Font("Bodoni MT", Font.BOLD, 15));
		CustNextButton.setBounds(380, 276, 94, 33);
		panel_2.add(CustNextButton);
		
		JButton btnNewButton = new JButton("UPLOAD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\Asus\\eclipse-workspace\\Assignment3\\src\\CustomerRegistration.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n____\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		}
			);
		
		btnNewButton.setFont(new Font("Bodoni MT", Font.BOLD, 14));
		btnNewButton.setBounds(263, 276, 107, 33);
		panel_2.add(btnNewButton);
	}
}
