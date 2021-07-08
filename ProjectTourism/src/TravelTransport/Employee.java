package TravelTransport;

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
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField StaffNametextField;
	private JTextField StaffIDtextField;
	private JTextField StaffPositiontextField;
	private JTextField txtPerHour;
	private JTextField txtInHour;
	private JTextField txtPerMonth;
	private JTextField txtEnterTax;
	private JTextField txtSalary;
	private JTextField txtNetSalary;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(152, 251, 152));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(34, 139, 34)));
		panel.setBounds(0, 0, 811, 462);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(34, 139, 34)));
		panel_1.setBackground(new Color(144, 238, 144));
		panel_1.setBounds(10, 11, 791, 59);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel EmployeeManagementNewLabel = new JLabel("EMPLOYEE MANAGEMENT");
		EmployeeManagementNewLabel.setForeground(new Color(34, 139, 34));
		EmployeeManagementNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		EmployeeManagementNewLabel.setFont(new Font("Bell MT", Font.BOLD, 25));
		EmployeeManagementNewLabel.setBounds(112, 11, 552, 37);
		panel_1.add(EmployeeManagementNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(144, 238, 144));
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(34, 139, 34)));
		panel_2.setBounds(10, 80, 297, 130);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel StaffNameNewLabel = new JLabel("STAFF NAME");
		StaffNameNewLabel.setFont(new Font("Bell MT", Font.BOLD, 12));
		StaffNameNewLabel.setBounds(10, 11, 79, 26);
		panel_2.add(StaffNameNewLabel);
		
		JLabel StaffIDNewLabel = new JLabel("STAFF ID");
		StaffIDNewLabel.setFont(new Font("Bell MT", Font.BOLD, 12));
		StaffIDNewLabel.setBounds(10, 50, 79, 20);
		panel_2.add(StaffIDNewLabel);
		
		StaffNametextField = new JTextField();
		StaffNametextField.setHorizontalAlignment(SwingConstants.CENTER);
		StaffNametextField.setText("Enter Name\r\n");
		StaffNametextField.setBackground(new Color(192, 192, 192));
		StaffNametextField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		StaffNametextField.setBounds(99, 11, 188, 26);
		panel_2.add(StaffNametextField);
		StaffNametextField.setColumns(10);
		
		StaffIDtextField = new JTextField();
		StaffIDtextField.setText("Enter ID\r\n");
		StaffIDtextField.setHorizontalAlignment(SwingConstants.CENTER);
		StaffIDtextField.setBackground(new Color(192, 192, 192));
		StaffIDtextField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		StaffIDtextField.setBounds(99, 48, 188, 26);
		panel_2.add(StaffIDtextField);
		StaffIDtextField.setColumns(10);
		
		JLabel StaffPositionNewLabel = new JLabel("POSITION");
		StaffPositionNewLabel.setFont(new Font("Bell MT", Font.BOLD, 12));
		StaffPositionNewLabel.setBounds(10, 90, 79, 21);
		panel_2.add(StaffPositionNewLabel);
		
		StaffPositiontextField = new JTextField();
		StaffPositiontextField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		StaffPositiontextField.setHorizontalAlignment(SwingConstants.CENTER);
		StaffPositiontextField.setText("Enter Position\r\n");
		StaffPositiontextField.setBackground(new Color(192, 192, 192));
		StaffPositiontextField.setBounds(99, 85, 188, 26);
		panel_2.add(StaffPositiontextField);
		StaffPositiontextField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(34, 139, 34)));
		panel_3.setBackground(new Color(152, 251, 152));
		panel_3.setBounds(10, 221, 297, 181);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel WagesPerHourNewLabel_1 = new JLabel("WAGES");
		WagesPerHourNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 12));
		WagesPerHourNewLabel_1.setBounds(10, 11, 79, 26);
		panel_3.add(WagesPerHourNewLabel_1);
		
		JLabel WorkHourNewLabel_1 = new JLabel("WORK HOUR");
		WorkHourNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 12));
		WorkHourNewLabel_1.setBounds(10, 36, 79, 26);
		panel_3.add(WorkHourNewLabel_1);
		
		JLabel DayWorkperMonthNewLabel_1 = new JLabel("DAY WORK");
		DayWorkperMonthNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 12));
		DayWorkperMonthNewLabel_1.setBounds(10, 61, 79, 26);
		panel_3.add(DayWorkperMonthNewLabel_1);
		
		JLabel TaxNewLabel = new JLabel("TAX");
		TaxNewLabel.setFont(new Font("Bell MT", Font.BOLD, 12));
		TaxNewLabel.setBounds(10, 90, 46, 21);
		panel_3.add(TaxNewLabel);
		
		txtPerHour = new JTextField();
		txtPerHour.setText("Per Hour");
		txtPerHour.setHorizontalAlignment(SwingConstants.CENTER);
		txtPerHour.setFont(new Font("Bell MT", Font.PLAIN, 12));
		txtPerHour.setColumns(10);
		txtPerHour.setBackground(Color.LIGHT_GRAY);
		txtPerHour.setBounds(99, 14, 188, 21);
		panel_3.add(txtPerHour);
		
		txtInHour = new JTextField();
		txtInHour.setText("In Hour");
		txtInHour.setHorizontalAlignment(SwingConstants.CENTER);
		txtInHour.setFont(new Font("Bell MT", Font.PLAIN, 12));
		txtInHour.setColumns(10);
		txtInHour.setBackground(Color.LIGHT_GRAY);
		txtInHour.setBounds(99, 39, 188, 21);
		panel_3.add(txtInHour);
		
		txtPerMonth = new JTextField();
		txtPerMonth.setText("Per Month");
		txtPerMonth.setHorizontalAlignment(SwingConstants.CENTER);
		txtPerMonth.setFont(new Font("Bell MT", Font.PLAIN, 12));
		txtPerMonth.setColumns(10);
		txtPerMonth.setBackground(Color.LIGHT_GRAY);
		txtPerMonth.setBounds(99, 64, 188, 21);
		panel_3.add(txtPerMonth);
		
		txtEnterTax = new JTextField();
		txtEnterTax.setText("Enter Tax");
		txtEnterTax.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterTax.setFont(new Font("Bell MT", Font.PLAIN, 12));
		txtEnterTax.setColumns(10);
		txtEnterTax.setBackground(Color.LIGHT_GRAY);
		txtEnterTax.setBounds(99, 90, 188, 21);
		panel_3.add(txtEnterTax);
		
		txtSalary = new JTextField();
		txtSalary.setText("Salary");
		txtSalary.setHorizontalAlignment(SwingConstants.CENTER);
		txtSalary.setFont(new Font("Bell MT", Font.PLAIN, 12));
		txtSalary.setColumns(10);
		txtSalary.setBackground(Color.LIGHT_GRAY);
		txtSalary.setBounds(99, 116, 188, 21);
		panel_3.add(txtSalary);
		
		txtNetSalary = new JTextField();
		txtNetSalary.setText("Net Salary");
		txtNetSalary.setHorizontalAlignment(SwingConstants.CENTER);
		txtNetSalary.setFont(new Font("Bell MT", Font.PLAIN, 12));
		txtNetSalary.setColumns(10);
		txtNetSalary.setBackground(Color.LIGHT_GRAY);
		txtNetSalary.setBounds(99, 142, 188, 21);
		panel_3.add(txtNetSalary);
		
		JLabel SalaryNewLabel = new JLabel("SALARY");
		SalaryNewLabel.setFont(new Font("Bell MT", Font.BOLD, 12));
		SalaryNewLabel.setBounds(10, 115, 79, 26);
		panel_3.add(SalaryNewLabel);
		
		JLabel lblNetSalary = new JLabel("NET SALARY");
		lblNetSalary.setFont(new Font("Bell MT", Font.BOLD, 12));
		lblNetSalary.setBounds(10, 142, 79, 21);
		panel_3.add(lblNetSalary);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(34, 139, 34)));
		panel_4.setBackground(new Color(152, 251, 152));
		panel_4.setBounds(317, 81, 484, 321);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 464, 299);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(152, 251, 152));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Staff Name", "Staff ID", "Position", "Day Work/Month", "Net Salary"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(93);
		scrollPane.setViewportView(table);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(34, 139, 34)));
		panel_5.setBackground(new Color(152, 251, 152));
		panel_5.setBounds(10, 406, 791, 45);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffNametextField.setText("");
				StaffIDtextField.setText("");
				StaffPositiontextField.setText("");
				txtPerHour.setText("");
				txtInHour.setText("");
				txtPerMonth.setText("");
				txtEnterTax.setText("");
				txtSalary.setText("");
				txtNetSalary.setText("");
			}
		});
		ResetButton.setFont(new Font("Bell MT", Font.BOLD, 15));
		ResetButton.setBackground(new Color(192, 192, 192));
		ResetButton.setBounds(223, 11, 89, 27);
		panel_5.add(ResetButton);
		
		JButton DeleteButton = new JButton("DELETE");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		DeleteButton.setFont(new Font("Bell MT", Font.BOLD, 15));
		DeleteButton.setBackground(new Color(192, 192, 192));
		DeleteButton.setBounds(101, 11, 112, 27);
		panel_5.add(DeleteButton);
		
		JButton AddButton = new JButton("ADD");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						StaffNametextField.getText(),
						StaffIDtextField.getText(),
						StaffPositiontextField.getText(),
						txtPerMonth.getText(),
						txtNetSalary.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Data Update Confirmed", "Employee Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		AddButton.setFont(new Font("Bell MT", Font.BOLD, 15));
		AddButton.setBackground(new Color(192, 192, 192));
		AddButton.setBounds(10, 11, 81, 27);
		panel_5.add(AddButton);
		
		JButton UploadButton = new JButton("UPLOAD");
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\user\\Desktop\\UUM\\SEM 2\\PROG II\\Assignment 3\\src\\Employee.txt");
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
		UploadButton.setBounds(322, 11, 112, 27);
		panel_5.add(UploadButton);
		
		JButton BackButton = new JButton("BACK");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMenu AM = new AdminMenu();
				AM.setModalExclusionType(null);
	            AM.setVisible(true);
	            dispose(); 
			}
		});
		BackButton.setFont(new Font("Bell MT", Font.BOLD, 15));
		BackButton.setBackground(new Color(192, 192, 192));
		BackButton.setBounds(641, 11, 97, 27);
		panel_5.add(BackButton);
		
		JButton CalculateButton = new JButton("CALCULATE");
		CalculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tax; 
				double Tax;
				double wages;
				double workHours;
				int numOfdays;
				double salary;
				double netSalary;
				
				wages = Double.parseDouble(txtPerHour.getText());
				workHours = Double.parseDouble(txtInHour.getText());
				numOfdays = Integer.parseInt(txtPerMonth.getText());
				tax = Double.parseDouble(txtEnterTax.getText());
				
				
				salary = (wages*workHours)*numOfdays;
				Tax = salary*tax;
				netSalary = salary - Tax;
				
				txtSalary.setText(Double.toString(salary));
				txtEnterTax.setText(Double.toString(Tax));
				txtNetSalary.setText(Double.toString(netSalary));
			}
		});
		CalculateButton.setBackground(new Color(192, 192, 192));
		CalculateButton.setFont(new Font("Bell MT", Font.BOLD, 15));
		CalculateButton.setBounds(444, 11, 150, 27);
		panel_5.add(CalculateButton);
	}
}
