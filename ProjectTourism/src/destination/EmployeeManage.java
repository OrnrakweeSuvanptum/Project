package destination;

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
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class EmployeeManage extends JFrame {

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
					EmployeeManage frame = new EmployeeManage();
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
	public EmployeeManage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 629);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(165, 42, 42)));
		panel.setBackground(new Color(218, 165, 32));
		panel.setBounds(0, 0, 1066, 596);
		contentPane.add(panel);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_1_2.setBackground(new Color(218, 165, 32));
		panel_1_2.setBounds(23, 22, 1019, 69);
		panel.add(panel_1_2);
		
		JLabel lblEmployeeManagement = new JLabel(" EMPLOYEE MANAGEMENT");
		lblEmployeeManagement.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\employee management.png"));
		lblEmployeeManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeManagement.setForeground(Color.BLACK);
		lblEmployeeManagement.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblEmployeeManagement.setBounds(282, 10, 464, 47);
		panel_1_2.add(lblEmployeeManagement);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(178, 34, 34)));
		panel_3_1.setBackground(new Color(218, 165, 32));
		panel_3_1.setBounds(419, 101, 623, 398);
		panel.add(panel_3_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 603, 378);
		panel_3_1.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 215, 0));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Salary/hour", "Work/hour", "Work/day", "Tax", "Net Pro/Loss"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(21, 186, 388, 247);
		panel.add(panel_1_1);
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_1_1.setBackground(new Color(218, 165, 32));
		panel_1_1.setLayout(null);
		
		JLabel MonthStaffLabel = new JLabel("SALARY PER HOUR");
		MonthStaffLabel.setFont(new Font("Bell MT", Font.BOLD, 13));
		MonthStaffLabel.setBounds(10, 66, 133, 33);
		panel_1_1.add(MonthStaffLabel);
		
		JLabel WorkStaffLabel_1 = new JLabel("NUMBER OF HOURS WORK");
		WorkStaffLabel_1.setFont(new Font("Bell MT", Font.BOLD, 13));
		WorkStaffLabel_1.setBounds(10, 102, 179, 33);
		panel_1_1.add(WorkStaffLabel_1);
		
		JLabel lblNumberOfDay = new JLabel("NUMBER OF DAY WORK");
		lblNumberOfDay.setFont(new Font("Bell MT", Font.BOLD, 13));
		lblNumberOfDay.setBounds(10, 133, 167, 33);
		panel_1_1.add(lblNumberOfDay);
		
		MonthField = new JTextField();
		MonthField.setBackground(new Color(255, 228, 196));
		MonthField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		MonthField.setBounds(224, 72, 154, 20);
		panel_1_1.add(MonthField);
		MonthField.setColumns(10);
		
		NumWorkField = new JTextField();
		NumWorkField.setBackground(new Color(255, 228, 196));
		NumWorkField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		NumWorkField.setColumns(10);
		NumWorkField.setBounds(224, 108, 154, 20);
		panel_1_1.add(NumWorkField);
		
		NumMonthField = new JTextField();
		NumMonthField.setBackground(new Color(255, 228, 196));
		NumMonthField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		NumMonthField.setColumns(10);
		NumMonthField.setBounds(224, 139, 154, 20);
		panel_1_1.add(NumMonthField);
		
		JLabel TaxLabel = new JLabel("TAX");
		TaxLabel.setFont(new Font("Bell MT", Font.BOLD, 13));
		TaxLabel.setBounds(10, 169, 73, 33);
		panel_1_1.add(TaxLabel);
		
		JLabel NetSalaryLabel = new JLabel("SALARY");
		NetSalaryLabel.setFont(new Font("Bell MT", Font.BOLD, 13));
		NetSalaryLabel.setBounds(10, 195, 98, 33);
		panel_1_1.add(NetSalaryLabel);
		
		TaxField = new JTextField();
		TaxField.setBackground(new Color(255, 228, 196));
		TaxField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		TaxField.setColumns(10);
		TaxField.setBounds(224, 169, 154, 20);
		panel_1_1.add(TaxField);
		
		netField = new JTextField();
		netField.setBackground(new Color(255, 228, 196));
		netField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		netField.setColumns(10);
		netField.setBounds(224, 201, 154, 20);
		panel_1_1.add(netField);
		
		JLabel lblStaffName = new JLabel("NAME         ");
		lblStaffName.setBounds(10, 10, 91, 29);
		panel_1_1.add(lblStaffName);
		lblStaffName.setFont(new Font("Bell MT", Font.BOLD, 13));
		
		JLabel NameSLabel = new JLabel("AIN SYAZANA");
		NameSLabel.setBounds(224, 11, 154, 23);
		panel_1_1.add(NameSLabel);
		NameSLabel.setFont(new Font("Bell MT", Font.BOLD, 13));
		
		JLabel IDEmployeeLabel = new JLabel("STAFF ID    ");
		IDEmployeeLabel.setBounds(10, 31, 91, 29);
		panel_1_1.add(IDEmployeeLabel);
		IDEmployeeLabel.setFont(new Font("Bell MT", Font.BOLD, 13));
		
		JLabel IDLabel = new JLabel("ain12345");
		IDLabel.setBounds(224, 32, 139, 23);
		panel_1_1.add(IDLabel);
		IDLabel.setFont(new Font("Bell MT", Font.BOLD, 13));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(419, 509, 623, 61);
		panel.add(panel_2);
		panel_2.setBackground(new Color(218, 165, 32));
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_2.setLayout(null);
		
		JButton AddButton = new JButton("ADD ");
		AddButton.setBackground(SystemColor.activeCaption);
		AddButton.setBounds(51, 10, 95, 40);
		panel_2.add(AddButton);
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
		
		AddButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.setBackground(SystemColor.activeCaption);
		ResetButton.setBounds(159, 10, 90, 40);
		panel_2.add(ResetButton);
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MonthField.setText("");
				NumWorkField.setText("");
				NumMonthField.setText("");
				TaxField.setText("");
				netField.setText("");
				
			}
		});
		ResetButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton UploadButton = new JButton("UPLOAD");
		UploadButton.setBackground(SystemColor.activeCaption);
		UploadButton.setBounds(259, 10, 103, 40);
		panel_2.add(UploadButton);
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\HP\\eclipse-workspace\\Assignment3\\src\\Employee.txt");
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
		UploadButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton NextButton_1 = new JButton("NEXT");
		NextButton_1.setBackground(SystemColor.activeCaption);
		NextButton_1.setBounds(372, 10, 95, 40);
		panel_2.add(NextButton_1);
		NextButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinanceManage frame = new FinanceManage();
				frame.setVisible(true);
				
			}
		});
		NextButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();		//Exit button
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Home", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnExit.setBackground(SystemColor.activeCaption);
		btnExit.setBounds(477, 10, 95, 40);
		panel_2.add(btnExit);
		
		JButton netButton = new JButton("SALARY");
		netButton.setBounds(147, 537, 131, 33);
		panel.add(netButton);
		netButton.setBackground(SystemColor.activeCaption);
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
		netButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
	}
}