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
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JFrame frame ;
	private JTextField MonthField;
	private JTextField NumWorkField;
	private JTextField NumMonthField;
	private JTextField TaxField;
	private JTextField netField;
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
		setBounds(100, 100, 871, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 160, 122));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(205, 92, 92)));
		panel.setBounds(10, 11, 835, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel EmployeeLabel = new JLabel("EMPLOYEE SECTION");
		EmployeeLabel.setBounds(245, 11, 407, 42);
		EmployeeLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		panel.add(EmployeeLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 235, 205));
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_1.setBounds(10, 86, 388, 90);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel IDEmployeeLabel = new JLabel("STAFF ID    :");
		IDEmployeeLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 15));
		IDEmployeeLabel.setBounds(20, 23, 91, 29);
		panel_1.add(IDEmployeeLabel);
		
		JLabel lblStaffName = new JLabel("NAME          :");
		lblStaffName.setFont(new Font("Sitka Subheading", Font.BOLD, 15));
		lblStaffName.setBounds(20, 50, 91, 29);
		panel_1.add(lblStaffName);
		
		JLabel IDLabel = new JLabel("280405");
		IDLabel.setFont(new Font("Footlight MT Light", Font.BOLD, 15));
		IDLabel.setBounds(121, 24, 139, 23);
		panel_1.add(IDLabel);
		
		JLabel NameSLabel = new JLabel("NUR SYAHIRAH");
		NameSLabel.setFont(new Font("Footlight MT Light", Font.BOLD, 15));
		NameSLabel.setBounds(121, 51, 139, 23);
		panel_1.add(NameSLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_1_1.setBackground(new Color(255, 235, 205));
		panel_1_1.setBounds(10, 178, 388, 247);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel MonthStaffLabel = new JLabel("SALARY PER HOUR");
		MonthStaffLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 12));
		MonthStaffLabel.setBounds(24, 33, 185, 33);
		panel_1_1.add(MonthStaffLabel);
		
		JLabel WorkStaffLabel_1 = new JLabel("NUMBER OF HOURS WORK");
		WorkStaffLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 12));
		WorkStaffLabel_1.setBounds(24, 77, 185, 33);
		panel_1_1.add(WorkStaffLabel_1);
		
		JLabel lblNumberOfDay = new JLabel("NUMBER OF DAY WORK");
		lblNumberOfDay.setFont(new Font("Sitka Subheading", Font.BOLD, 12));
		lblNumberOfDay.setBounds(24, 121, 185, 33);
		panel_1_1.add(lblNumberOfDay);
		
		MonthField = new JTextField();
		MonthField.setBounds(193, 37, 154, 20);
		panel_1_1.add(MonthField);
		MonthField.setColumns(10);
		
		NumWorkField = new JTextField();
		NumWorkField.setColumns(10);
		NumWorkField.setBounds(193, 81, 154, 20);
		panel_1_1.add(NumWorkField);
		
		NumMonthField = new JTextField();
		NumMonthField.setColumns(10);
		NumMonthField.setBounds(193, 125, 154, 20);
		panel_1_1.add(NumMonthField);
		
		JLabel TaxLabel = new JLabel("TAX");
		TaxLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 12));
		TaxLabel.setBounds(24, 165, 185, 33);
		panel_1_1.add(TaxLabel);
		
		JLabel NetSalaryLabel = new JLabel("NET SALARY");
		NetSalaryLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 12));
		NetSalaryLabel.setBounds(24, 209, 185, 33);
		panel_1_1.add(NetSalaryLabel);
		
		TaxField = new JTextField();
		TaxField.setColumns(10);
		TaxField.setBounds(193, 165, 154, 20);
		panel_1_1.add(TaxField);
		
		netField = new JTextField();
		netField.setColumns(10);
		netField.setBounds(193, 209, 154, 20);
		panel_1_1.add(netField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 235, 205));
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_2.setBounds(402, 278, 443, 147);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton netButton = new JButton("NET SALARY");
		netButton.setBounds(10, 90, 131, 40);
		panel_2.add(netButton);
		netButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tax;
				double Tax;
				double salaryperhour ;
				double NumWork;
				double NumDays;
				double netsalary;
				double Salary;
				
				salaryperhour = Double.parseDouble(MonthField.getText());
				NumWork = Double.parseDouble(NumWorkField.getText());
				NumDays = Integer.parseInt(NumMonthField.getText());
				tax = Double.parseDouble(TaxField.getText());
				
				Salary = (salaryperhour*NumWork)*NumDays;
				Tax = Salary*tax;
				netsalary = Salary - Tax ;
				
				netField.setText(Double.toString(netsalary));
				
				
			}
		});
		netButton.setFont(new Font("Bodoni MT", Font.BOLD, 12));
		
		JButton NextButton_1 = new JButton("NEXT");
		NextButton_1.setBounds(292, 90, 131, 40);
		panel_2.add(NextButton_1);
		NextButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance frame = new Finance();
				frame.setVisible(true);
				
			}
		});
		NextButton_1.setFont(new Font("Bodoni MT", Font.BOLD, 12));
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MonthField.setText("");
				NumWorkField.setText("");
				NumMonthField.setText("");
				TaxField.setText("");
				netField.setText("");
				
			}
		});
		ResetButton.setFont(new Font("Bodoni MT", Font.BOLD, 12));
		ResetButton.setBounds(151, 90, 131, 40);
		panel_2.add(ResetButton);
		
		JButton AddButton = new JButton("ADD REC");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
				MonthField.getText(),
				NumWorkField.getText(),
				NumMonthField.getText(),
				TaxField.getText(),
				netField.getText(),
				
		});
				
		if(table.getSelectedRow() == -1 ) {
			if(table.getRowCount() == 0 ) {
				JOptionPane.showMessageDialog(null,"Membership Update confirmed", "Membership Management System", JOptionPane.OK_OPTION);
			}
		}}
			}
		);
		
		AddButton.setFont(new Font("Bodoni MT", Font.BOLD, 12));
		AddButton.setBounds(10, 31, 131, 40);
		panel_2.add(AddButton);
		
		JButton UploadButton = new JButton("UPLOAD");
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\Asus\\eclipse-workspace\\Assignment3\\src\\Employee.txt");
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
		UploadButton.setFont(new Font("Bodoni MT", Font.BOLD, 12));
		UploadButton.setBounds(151, 31, 131, 40);
		panel_2.add(UploadButton);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 235, 205));
		panel_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_3.setBounds(402, 86, 443, 189);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 423, 167);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Salary/hour", "Work/hour", "Work/day", "Tax", "Net Pro/Loss"
			}
		));
		scrollPane.setViewportView(table);
	}

}
