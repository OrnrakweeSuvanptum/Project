package TravelTransport;

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
		setBounds(100, 100, 832, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(34, 139, 34)));
		panel.setBackground(new Color(152, 251, 152));
		panel.setBounds(0, 0, 816, 467);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(34, 139, 34)));
		panel_1.setBackground(new Color(144, 238, 144));
		panel_1.setBounds(10, 11, 796, 69);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CUSTOMER REGISTRATION");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(157, 11, 442, 47);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(34, 139, 34)));
		panel_2.setBackground(new Color(152, 251, 152));
		panel_2.setBounds(10, 91, 282, 216);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel NameLabel_1 = new JLabel("NAME");
		NameLabel_1.setFont(new Font("Bell MT", Font.BOLD, 12));
		NameLabel_1.setBounds(10, 53, 57, 21);
		panel_2.add(NameLabel_1);
		
		NametextField = new JTextField();
		NametextField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		NametextField.setBackground(new Color(192, 192, 192));
		NametextField.setBounds(104, 53, 168, 20);
		panel_2.add(NametextField);
		NametextField.setColumns(10);
		
		JLabel ICNumberLabel_1_1 = new JLabel("I/C NUMBER");
		ICNumberLabel_1_1.setFont(new Font("Bell MT", Font.BOLD, 12));
		ICNumberLabel_1_1.setBounds(10, 85, 75, 21);
		panel_2.add(ICNumberLabel_1_1);
		
		ICNumbertextField = new JTextField();
		ICNumbertextField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		ICNumbertextField.setColumns(10);
		ICNumbertextField.setBackground(Color.LIGHT_GRAY);
		ICNumbertextField.setBounds(104, 85, 168, 20);
		panel_2.add(ICNumbertextField);
		
		JLabel ContactNumberLabel_1_1_1 = new JLabel("PHONE NO.");
		ContactNumberLabel_1_1_1.setFont(new Font("Bell MT", Font.BOLD, 12));
		ContactNumberLabel_1_1_1.setBounds(10, 117, 75, 21);
		panel_2.add(ContactNumberLabel_1_1_1);
		
		PhoneNotextField = new JTextField();
		PhoneNotextField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		PhoneNotextField.setColumns(10);
		PhoneNotextField.setBackground(Color.LIGHT_GRAY);
		PhoneNotextField.setBounds(104, 117, 168, 20);
		panel_2.add(PhoneNotextField);
		
		JLabel NoOfPassengerLabel_1_1_1_1 = new JLabel("PASSENGER");
		NoOfPassengerLabel_1_1_1_1.setFont(new Font("Bell MT", Font.BOLD, 12));
		NoOfPassengerLabel_1_1_1_1.setBounds(10, 151, 75, 21);
		panel_2.add(NoOfPassengerLabel_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(192, 192, 192));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"NO. OF PASSENGER", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setFont(new Font("Bell MT", Font.BOLD, 12));
		comboBox.setBounds(104, 150, 168, 22);
		panel_2.add(comboBox);
		
		JLabel PackagesLabel_1_1_1_1_1 = new JLabel("PACKAGES");
		PackagesLabel_1_1_1_1_1.setFont(new Font("Bell MT", Font.BOLD, 12));
		PackagesLabel_1_1_1_1_1.setBounds(10, 184, 75, 21);
		panel_2.add(PackagesLabel_1_1_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT YOUR PACKAGE", "1", "2", "3"}));
		comboBox_1.setFont(new Font("Bell MT", Font.BOLD, 11));
		comboBox_1.setBackground(new Color(192, 192, 192));
		comboBox_1.setBounds(104, 183, 168, 22);
		panel_2.add(comboBox_1);
		
		JButton PackagesButton = new JButton("VIEW PACKAGES");
		PackagesButton.setBounds(70, 11, 147, 23);
		panel_2.add(PackagesButton);
		PackagesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TypeOfPackages TOP = new TypeOfPackages();
				TOP.setModalExclusionType(null);
	            TOP.setVisible(true);
	            dispose(); 
			}
		});
		PackagesButton.setFont(new Font("Bell MT", Font.BOLD, 12));
		PackagesButton.setBackground(new Color(192, 192, 192));
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(34, 139, 34)));
		panel_5.setBackground(new Color(152, 251, 152));
		panel_5.setBounds(10, 402, 796, 54);
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
		ResetButton.setFont(new Font("Bell MT", Font.BOLD, 15));
		ResetButton.setBackground(new Color(192, 192, 192));
		ResetButton.setBounds(254, 11, 89, 32);
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
		DeleteButton.setFont(new Font("Bell MT", Font.BOLD, 15));
		DeleteButton.setBackground(new Color(192, 192, 192));
		DeleteButton.setBounds(116, 11, 118, 32);
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
		AddButton.setFont(new Font("Bell MT", Font.BOLD, 15));
		AddButton.setBackground(new Color(192, 192, 192));
		AddButton.setBounds(10, 11, 89, 32);
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
		UploadButton.setFont(new Font("Bell MT", Font.BOLD, 15));
		UploadButton.setBackground(new Color(192, 192, 192));
		UploadButton.setBounds(364, 11, 118, 32);
		panel_5.add(UploadButton);
		
		JButton BackButton = new JButton("BACK");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserMenu UM = new UserMenu();
				UM.setModalExclusionType(null);
	            UM.setVisible(true);
	            dispose(); 
			}
		});
		BackButton.setFont(new Font("Bell MT", Font.BOLD, 15));
		BackButton.setBackground(new Color(192, 192, 192));
		BackButton.setBounds(641, 11, 97, 32);
		panel_5.add(BackButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(34, 139, 34)));
		panel_3.setBackground(new Color(152, 251, 152));
		panel_3.setBounds(301, 91, 505, 300);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 485, 278);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"NAME", "I/C NUMBER", "PHONE NO.", "NO. OF PASSENGER", "TYPE OF PACKAGES"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(107);
		table.getColumnModel().getColumn(4).setPreferredWidth(117);
		table.setFont(new Font("Bell MT", Font.BOLD, 12));
		table.setBackground(new Color(152, 251, 152));
		scrollPane.setViewportView(table);
	}
}
