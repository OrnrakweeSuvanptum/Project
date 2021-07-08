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
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class FinanceManage extends JFrame {

	private JPanel contentPane;
	private JFrame frame ;
	private JTextField BillField;
	private JTextField AddsField;
	private JTextField ManSalaryField;
	private JTextField SalesField;
	private JTable table;
	private JTextField ProLossField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinanceManage frame = new FinanceManage();
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
	public FinanceManage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1058, 626);
		contentPane.add(panel);
		panel.setBackground(new Color(218, 165, 32));
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(165, 42, 42)));
		panel.setLayout(null);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_1_2.setBackground(new Color(218, 165, 32));
		panel_1_2.setBounds(19, 21, 1019, 69);
		panel.add(panel_1_2);
		
		JLabel lblFinanceManagement = new JLabel(" FINANCE MANAGEMENT");
		lblFinanceManagement.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\finance management.png"));
		lblFinanceManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinanceManagement.setForeground(Color.BLACK);
		lblFinanceManagement.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblFinanceManagement.setBounds(282, 10, 464, 47);
		panel_1_2.add(lblFinanceManagement);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(178, 34, 34)));
		panel_3_1.setBackground(new Color(218, 165, 32));
		panel_3_1.setBounds(452, 101, 586, 391);
		panel.add(panel_3_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 566, 371);
		panel_3_1.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 215, 0));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Bill", "Advertising", "Salary", "Sales", "Net Profit"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(19, 128, 423, 345);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_1_1.setBackground(new Color(218, 165, 32));
		
		JLabel billLabel = new JLabel("BILL COST");
		billLabel.setFont(new Font("Bell MT", Font.BOLD, 13));
		billLabel.setBounds(20, 87, 115, 28);
		panel_1_1.add(billLabel);
		
		JLabel lblAdvertisingCost = new JLabel("ADVERTISING COST");
		lblAdvertisingCost.setFont(new Font("Bell MT", Font.BOLD, 13));
		lblAdvertisingCost.setBounds(20, 125, 158, 28);
		panel_1_1.add(lblAdvertisingCost);
		
		JLabel lblManagerSalary = new JLabel("MANAGER SALARY");
		lblManagerSalary.setFont(new Font("Bell MT", Font.BOLD, 13));
		lblManagerSalary.setBounds(20, 163, 158, 28);
		panel_1_1.add(lblManagerSalary);
		
		JLabel lblSales = new JLabel("SALES");
		lblSales.setFont(new Font("Bell MT", Font.BOLD, 13));
		lblSales.setBounds(20, 201, 115, 28);
		panel_1_1.add(lblSales);
		
		BillField = new JTextField();
		BillField.setBackground(new Color(255, 228, 196));
		BillField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		BillField.setBounds(191, 88, 181, 28);
		panel_1_1.add(BillField);
		BillField.setColumns(10);
		
		AddsField = new JTextField();
		AddsField.setBackground(new Color(255, 228, 196));
		AddsField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		AddsField.setColumns(10);
		AddsField.setBounds(191, 126, 181, 28);
		panel_1_1.add(AddsField);
		
		ManSalaryField = new JTextField();
		ManSalaryField.setBackground(new Color(255, 228, 196));
		ManSalaryField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		ManSalaryField.setColumns(10);
		ManSalaryField.setBounds(191, 165, 181, 26);
		panel_1_1.add(ManSalaryField);
		
		SalesField = new JTextField();
		SalesField.setBackground(new Color(255, 228, 196));
		SalesField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		SalesField.setColumns(10);
		SalesField.setBounds(191, 202, 181, 28);
		panel_1_1.add(SalesField);
		
		JButton profitLossButton = new JButton("PROFIT / LOSS");
		profitLossButton.setBackground(SystemColor.activeCaption);
		profitLossButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bill;
				double ads;
				double salary;
				double sales;
				double cost;
				double net;
				
				bill = Double.parseDouble(BillField.getText());
				ads = Double.parseDouble(AddsField.getText());
				salary = Double.parseDouble(ManSalaryField.getText());
				sales = Double.parseDouble(SalesField.getText());
				
				cost = bill+ads+salary;
				net = sales - cost ;
				
				ProLossField.setText(Double.toString(net));
				
			}
		});
		profitLossButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		profitLossButton.setBounds(114, 297, 158, 38);
		panel_1_1.add(profitLossButton);
		
		JLabel lblProfitloss = new JLabel("PROFIT/LOSS");
		lblProfitloss.setFont(new Font("Bell MT", Font.BOLD, 13));
		lblProfitloss.setBounds(20, 239, 115, 28);
		panel_1_1.add(lblProfitloss);
		
		ProLossField = new JTextField();
		ProLossField.setBackground(new Color(255, 228, 196));
		ProLossField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		ProLossField.setColumns(10);
		ProLossField.setBounds(191, 240, 181, 28);
		panel_1_1.add(ProLossField);
		
		JLabel AccNameLabel = new JLabel("NAME ");
		AccNameLabel.setBounds(20, 10, 105, 31);
		panel_1_1.add(AccNameLabel);
		AccNameLabel.setFont(new Font("Bell MT", Font.BOLD, 13));
		
		JLabel nameaccLabel = new JLabel("HUZAI ");
		nameaccLabel.setBounds(191, 13, 172, 25);
		panel_1_1.add(nameaccLabel);
		nameaccLabel.setFont(new Font("Bell MT", Font.BOLD, 13));
		
		JLabel DepartmentLabel_1 = new JLabel("DEPARTMENT");
		DepartmentLabel_1.setBounds(20, 60, 105, 31);
		panel_1_1.add(DepartmentLabel_1);
		DepartmentLabel_1.setFont(new Font("Bell MT", Font.BOLD, 13));
		
		JLabel AccPosLabel_1 = new JLabel("MANAGEMENT");
		AccPosLabel_1.setBounds(191, 60, 133, 31);
		panel_1_1.add(AccPosLabel_1);
		AccPosLabel_1.setFont(new Font("Bell MT", Font.BOLD, 13));
		
		JLabel GenderLabel_2 = new JLabel("STAFF ID");
		GenderLabel_2.setBounds(20, 35, 105, 31);
		panel_1_1.add(GenderLabel_2);
		GenderLabel_2.setFont(new Font("Bell MT", Font.BOLD, 13));
		
		JLabel Genderacclbl = new JLabel("huzai12345");
		Genderacclbl.setBounds(191, 35, 105, 31);
		panel_1_1.add(Genderacclbl);
		Genderacclbl.setFont(new Font("Bell MT", Font.BOLD, 13));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(462, 502, 576, 69);
		panel.add(panel_3);
		panel_3.setForeground(new Color(0, 0, 0));
		panel_3.setBackground(new Color(218, 165, 32));
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_3.setLayout(null);
		
		JButton ADDfButton_1 = new JButton("ADD");
		ADDfButton_1.setBackground(SystemColor.activeCaption);
		ADDfButton_1.setBounds(88, 21, 105, 38);
		panel_3.add(ADDfButton_1);
		ADDfButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						BillField.getText(),
						AddsField.getText(),
						ManSalaryField.getText(),
						SalesField.getText(),
						ProLossField.getText(),
			
		});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System", JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
		
		ADDfButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton UploadButton = new JButton("UPLOAD");
		UploadButton.setBackground(SystemColor.activeCaption);
		UploadButton.setBounds(203, 21, 105, 38);
		panel_3.add(UploadButton);
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\HP\\eclipse-workspace\\Assignment3\\src\\Finance.txt");
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
		
		JButton nextButton_1 = new JButton("NEXT");
		nextButton_1.setBounds(317, 21, 105, 38);
		panel_3.add(nextButton_1);
		nextButton_1.setBackground(SystemColor.activeCaption);
		nextButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton ExitButton = new JButton("EXIT");
		ExitButton.setBounds(432, 21, 98, 38);
		panel_3.add(ExitButton);
		ExitButton.setBackground(SystemColor.activeCaption);
		ExitButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeD frame = new HomeD();
				frame.setVisible(true);
			}
		});
					
	}

}