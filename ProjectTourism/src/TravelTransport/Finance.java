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

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField NametextField;
	private JTextField IDtextField;
	private JTextField PositiontextField;
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
					Finance frame = new Finance();
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
	public Finance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(34, 139, 34)));
		panel.setBackground(new Color(152, 251, 152));
		panel.setBounds(0, 0, 842, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(34, 139, 34)));
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBounds(10, 11, 822, 60);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel StaffSalaryLabel = new JLabel("STAFF SALARY");
		StaffSalaryLabel.setForeground(new Color(0, 100, 0));
		StaffSalaryLabel.setHorizontalAlignment(SwingConstants.CENTER);
		StaffSalaryLabel.setFont(new Font("Bell MT", Font.BOLD, 30));
		StaffSalaryLabel.setBounds(236, 11, 300, 38);
		panel_1.add(StaffSalaryLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(34, 139, 34)));
		panel_2.setBackground(new Color(144, 238, 144));
		panel_2.setBounds(10, 82, 297, 130);
		panel.add(panel_2);
		
		JLabel StaffNameNewLabel = new JLabel("STAFF NAME");
		StaffNameNewLabel.setFont(new Font("Bell MT", Font.BOLD, 12));
		StaffNameNewLabel.setBounds(10, 11, 79, 26);
		panel_2.add(StaffNameNewLabel);
		
		JLabel StaffIDNewLabel = new JLabel("STAFF ID");
		StaffIDNewLabel.setFont(new Font("Bell MT", Font.BOLD, 12));
		StaffIDNewLabel.setBounds(10, 50, 79, 20);
		panel_2.add(StaffIDNewLabel);
		
		NametextField = new JTextField();
		NametextField.setText("Enter Name\r\n");
		NametextField.setHorizontalAlignment(SwingConstants.CENTER);
		NametextField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		NametextField.setColumns(10);
		NametextField.setBackground(Color.LIGHT_GRAY);
		NametextField.setBounds(99, 11, 188, 26);
		panel_2.add(NametextField);
		
		IDtextField = new JTextField();
		IDtextField.setText("Enter ID\r\n");
		IDtextField.setHorizontalAlignment(SwingConstants.CENTER);
		IDtextField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		IDtextField.setColumns(10);
		IDtextField.setBackground(Color.LIGHT_GRAY);
		IDtextField.setBounds(99, 48, 188, 26);
		panel_2.add(IDtextField);
		
		JLabel StaffPositionNewLabel = new JLabel("POSITION");
		StaffPositionNewLabel.setFont(new Font("Bell MT", Font.BOLD, 12));
		StaffPositionNewLabel.setBounds(10, 90, 79, 21);
		panel_2.add(StaffPositionNewLabel);
		
		PositiontextField = new JTextField();
		PositiontextField.setText("Enter Position\r\n");
		PositiontextField.setHorizontalAlignment(SwingConstants.CENTER);
		PositiontextField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		PositiontextField.setColumns(10);
		PositiontextField.setBackground(Color.LIGHT_GRAY);
		PositiontextField.setBounds(99, 85, 188, 26);
		panel_2.add(PositiontextField);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(34, 139, 34)));
		panel_3.setBackground(new Color(152, 251, 152));
		panel_3.setBounds(10, 213, 297, 181);
		panel.add(panel_3);
		
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
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(34, 139, 34)));
		panel_5.setBackground(new Color(152, 251, 152));
		panel_5.setBounds(10, 405, 822, 45);
		panel.add(panel_5);
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NametextField.setText("");
				IDtextField.setText("");
				PositiontextField.setText("");
				txtPerHour.setText("");
				txtInHour.setText("");
				txtPerMonth.setText("");
				txtEnterTax.setText("");
				txtSalary.setText("");
				txtNetSalary.setText("");
			}
		});
		ResetButton.setFont(new Font("Bell MT", Font.BOLD, 15));
		ResetButton.setBackground(Color.LIGHT_GRAY);
		ResetButton.setBounds(242, 11, 89, 27);
		panel_5.add(ResetButton);
		
		JButton DeleteButton = new JButton("DELETE");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Finance", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Finance", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		DeleteButton.setFont(new Font("Bell MT", Font.BOLD, 15));
		DeleteButton.setBackground(Color.LIGHT_GRAY);
		DeleteButton.setBounds(120, 11, 112, 27);
		panel_5.add(DeleteButton);
		
		JButton AddButton = new JButton("ADD");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						NametextField.getText(),
						IDtextField.getText(),
						PositiontextField.getText(),
						
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
		AddButton.setBackground(Color.LIGHT_GRAY);
		AddButton.setBounds(29, 11, 81, 27);
		panel_5.add(AddButton);
		
		JButton UploadButton = new JButton("UPLOAD");
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\user\\Desktop\\UUM\\SEM 2\\PROG II\\Assignment 3\\src\\FinanceFile.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n____________________________________________________________________________\n");
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
		UploadButton.setBackground(Color.LIGHT_GRAY);
		UploadButton.setBounds(341, 11, 112, 27);
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
		BackButton.setBackground(Color.LIGHT_GRAY);
		BackButton.setBounds(694, 11, 97, 27);
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
		CalculateButton.setFont(new Font("Bell MT", Font.BOLD, 15));
		CalculateButton.setBackground(Color.LIGHT_GRAY);
		CalculateButton.setBounds(463, 11, 150, 27);
		panel_5.add(CalculateButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(34, 139, 34)));
		panel_4.setBackground(new Color(152, 251, 152));
		panel_4.setBounds(320, 82, 512, 310);
		panel.add(panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 492, 288);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Staff ID", "Staff Name", "Position", "Day Work/Month", "Net Salary"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.setBackground(new Color(152, 251, 152));
		scrollPane.setViewportView(table);
	}

}
