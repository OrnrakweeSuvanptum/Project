package destination;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class CustomerRegistration extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField NametextField;
	private JTextField ICNumbertextField;
	private JTextField PhoneNotextField;
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
		setBounds(100, 100, 1113, 629);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(165, 42, 42)));
		panel.setBackground(new Color(218, 165, 32));
		panel.setBounds(0, 0, 1099, 592);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_1.setBackground(new Color(218, 165, 32));
		panel_1.setBounds(23, 21, 1058, 69);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" CUSTOMER REGISTRATION");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\customer registration.png"));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(282, 10, 477, 47);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_2.setBackground(new Color(218, 165, 32));
		panel_2.setBounds(23, 183, 354, 235);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel NameLabel_1 = new JLabel("NAME");
		NameLabel_1.setFont(new Font("Bell MT", Font.BOLD, 13));
		NameLabel_1.setBounds(10, 25, 75, 21);
		panel_2.add(NameLabel_1);
		
		NametextField = new JTextField();
		NametextField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		NametextField.setBackground(new Color(255, 228, 196));
		NametextField.setBounds(176, 25, 168, 20);
		panel_2.add(NametextField);
		NametextField.setColumns(10);
		
		JLabel ICNumberLabel_1_1 = new JLabel("I/C NUMBER");
		ICNumberLabel_1_1.setFont(new Font("Bell MT", Font.BOLD, 13));
		ICNumberLabel_1_1.setBounds(10, 85, 116, 21);
		panel_2.add(ICNumberLabel_1_1);
		
		ICNumbertextField = new JTextField();
		ICNumbertextField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		ICNumbertextField.setColumns(10);
		ICNumbertextField.setBackground(new Color(255, 228, 196));
		ICNumbertextField.setBounds(176, 85, 168, 20);
		panel_2.add(ICNumbertextField);
		
		JLabel ContactNumberLabel_1_1_1 = new JLabel("PHONE NUMBER");
		ContactNumberLabel_1_1_1.setFont(new Font("Bell MT", Font.BOLD, 13));
		ContactNumberLabel_1_1_1.setBounds(10, 117, 138, 21);
		panel_2.add(ContactNumberLabel_1_1_1);
		
		PhoneNotextField = new JTextField();
		PhoneNotextField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		PhoneNotextField.setColumns(10);
		PhoneNotextField.setBackground(new Color(255, 228, 181));
		PhoneNotextField.setBounds(176, 117, 168, 20);
		panel_2.add(PhoneNotextField);
		
		JLabel ListOfDestination_1_1_1_1 = new JLabel("LIST OF DESTINATION");
		ListOfDestination_1_1_1_1.setFont(new Font("Bell MT", Font.BOLD, 13));
		ListOfDestination_1_1_1_1.setBounds(10, 151, 156, 21);
		panel_2.add(ListOfDestination_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 228, 181));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1. Natural Areas", "2. Beach Areas", "3. Towns and Cities"}));
		comboBox.setFont(new Font("Bell MT", Font.BOLD, 12));
		comboBox.setBounds(176, 150, 168, 22);
		panel_2.add(comboBox);
		
		JLabel ListOfRentalLabel_1_1_1_1_1 = new JLabel("LIST OF RENTAL");
		ListOfRentalLabel_1_1_1_1_1.setFont(new Font("Bell MT", Font.BOLD, 13));
		ListOfRentalLabel_1_1_1_1_1.setBounds(10, 184, 116, 21);
		panel_2.add(ListOfRentalLabel_1_1_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1. 6 Seater Car (RM 100)", "2. 4 Seater Car (RM 50)", "3. Motobike (RM 30)"}));
		comboBox_1.setFont(new Font("Bell MT", Font.BOLD, 12));
		comboBox_1.setBackground(new Color(255, 228, 181));
		comboBox_1.setBounds(176, 183, 168, 22);
		panel_2.add(comboBox_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_5.setBackground(new Color(218, 165, 32));
		panel_5.setBounds(387, 514, 694, 54);
		panel.add(panel_5);
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NametextField.setText("");
				ICNumbertextField.setText("");
				PhoneNotextField.setText("");
				
				comboBox.setSelectedItem("NO. OF PASSENGER");
				comboBox_1.setSelectedItem("SELECT YOUR PACKAGE");
			}
		});
		ResetButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ResetButton.setBackground(SystemColor.activeCaption);
		ResetButton.setBounds(307, 11, 89, 32);
		panel_5.add(ResetButton);
		
		JButton DeleteButton = new JButton("DELETE");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Customer Registration", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Customer Registration", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		DeleteButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		DeleteButton.setBackground(SystemColor.activeCaption);
		DeleteButton.setBounds(164, 11, 118, 32);
		panel_5.add(DeleteButton);
		
		JButton AddButton = new JButton("ADD");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						NametextField.getText(),
						ICNumbertextField.getText(),
					    PhoneNotextField.getText(),
						comboBox.getSelectedItem(),
						comboBox_1.getSelectedItem(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Data Update Confirmed", "Customer Registration Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		AddButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		AddButton.setBackground(SystemColor.activeCaption);
		AddButton.setBounds(46, 11, 89, 32);
		panel_5.add(AddButton);
		
		JButton UploadButton = new JButton("UPLOAD");
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\user\\Desktop\\UUM\\SEM 2\\PROG II\\Assignment 3\\src\\CustomerRegistrationFile.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		UploadButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		UploadButton.setBackground(SystemColor.activeCaption);
		UploadButton.setBounds(418, 11, 118, 32);
		panel_5.add(UploadButton);
		
		JButton BackButton = new JButton("EXIT");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();  //Action for Exit Button
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Login", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		BackButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BackButton.setBackground(SystemColor.activeCaption);
		BackButton.setBounds(560, 11, 97, 32);
		panel_5.add(BackButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(178, 34, 34)));
		panel_3.setBackground(new Color(218, 165, 32));
		panel_3.setBounds(387, 106, 694, 398);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 674, 378);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"NAME", "I/C NUMBER", "PHONE NO.", "LIST OF DESTINATION", "LIST OF RENTAL"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(107);
		table.setFont(new Font("Bell MT", Font.BOLD, 12));
		table.setBackground(new Color(255, 215, 0));
		scrollPane.setViewportView(table);
	}
}