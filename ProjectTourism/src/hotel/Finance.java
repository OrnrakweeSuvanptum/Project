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
		setBounds(100, 100, 873, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 160, 122));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(205, 92, 92)));
		panel.setBounds(10, 11, 837, 65);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel FinanceLabel = new JLabel("FINANCE SECTION");
		FinanceLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		FinanceLabel.setBounds(263, 11, 355, 43);
		panel.add(FinanceLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 235, 205));
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_1.setBounds(10, 81, 427, 144);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel AccNameLabel = new JLabel("NAME ");
		AccNameLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 15));
		AccNameLabel.setBounds(20, 22, 105, 31);
		panel_1.add(AccNameLabel);
		
		JLabel PositionLabel_1 = new JLabel("POSITION");
		PositionLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 15));
		PositionLabel_1.setBounds(20, 64, 105, 31);
		panel_1.add(PositionLabel_1);
		
		JLabel GenderLabel_2 = new JLabel("GENDER");
		GenderLabel_2.setFont(new Font("Sitka Subheading", Font.BOLD, 15));
		GenderLabel_2.setBounds(20, 106, 105, 31);
		panel_1.add(GenderLabel_2);
		
		JLabel nameaccLabel = new JLabel(":  ZAQUAN SHAH");
		nameaccLabel.setFont(new Font("Footlight MT Light", Font.BOLD, 14));
		nameaccLabel.setBounds(131, 24, 172, 25);
		panel_1.add(nameaccLabel);
		
		JLabel AccPosLabel_1 = new JLabel(":  ACCOUNTANT");
		AccPosLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 15));
		AccPosLabel_1.setBounds(130, 64, 133, 31);
		panel_1.add(AccPosLabel_1);
		
		JLabel Genderacclbl = new JLabel(":  MALE");
		Genderacclbl.setFont(new Font("Sitka Subheading", Font.BOLD, 15));
		Genderacclbl.setBounds(131, 106, 105, 31);
		panel_1.add(Genderacclbl);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 857, 437);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(446, 81, 401, 345);
		panel_2.add(panel_1_1);
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_1_1.setBackground(new Color(255, 235, 205));
		
		JLabel billLabel = new JLabel("BILL COST");
		billLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 12));
		billLabel.setBounds(20, 29, 115, 28);
		panel_1_1.add(billLabel);
		
		JLabel lblAdvertisingCost = new JLabel("ADVERTISING COST");
		lblAdvertisingCost.setFont(new Font("Sitka Subheading", Font.BOLD, 12));
		lblAdvertisingCost.setBounds(20, 73, 158, 28);
		panel_1_1.add(lblAdvertisingCost);
		
		JLabel lblManagerSalary = new JLabel("MANAGER SALARY");
		lblManagerSalary.setFont(new Font("Sitka Subheading", Font.BOLD, 12));
		lblManagerSalary.setBounds(20, 119, 158, 28);
		panel_1_1.add(lblManagerSalary);
		
		JLabel lblSales = new JLabel("SALES");
		lblSales.setFont(new Font("Sitka Subheading", Font.BOLD, 12));
		lblSales.setBounds(20, 164, 115, 28);
		panel_1_1.add(lblSales);
		
		BillField = new JTextField();
		BillField.setBounds(191, 28, 181, 20);
		panel_1_1.add(BillField);
		BillField.setColumns(10);
		
		AddsField = new JTextField();
		AddsField.setColumns(10);
		AddsField.setBounds(191, 75, 181, 20);
		panel_1_1.add(AddsField);
		
		ManSalaryField = new JTextField();
		ManSalaryField.setColumns(10);
		ManSalaryField.setBounds(191, 121, 181, 20);
		panel_1_1.add(ManSalaryField);
		
		SalesField = new JTextField();
		SalesField.setColumns(10);
		SalesField.setBounds(191, 163, 181, 20);
		panel_1_1.add(SalesField);
		
		JButton profitLossButton = new JButton("PROFIT / LOSS");
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
		profitLossButton.setFont(new Font("Bodoni MT", Font.BOLD, 11));
		profitLossButton.setBounds(42, 263, 124, 38);
		panel_1_1.add(profitLossButton);
		
		JButton nextButton_1 = new JButton("NEXT");
		nextButton_1.setFont(new Font("Bodoni MT", Font.BOLD, 11));
		nextButton_1.setBounds(191, 263, 105, 38);
		panel_1_1.add(nextButton_1);
		
		JLabel lblProfitloss = new JLabel("PROFIT/LOSS");
		lblProfitloss.setFont(new Font("Sitka Subheading", Font.BOLD, 12));
		lblProfitloss.setBounds(20, 205, 115, 28);
		panel_1_1.add(lblProfitloss);
		
		ProLossField = new JTextField();
		ProLossField.setColumns(10);
		ProLossField.setBounds(191, 207, 181, 20);
		panel_1_1.add(ProLossField);
		
		JButton ExitButton = new JButton("EXIT");
		ExitButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
			}
		});
		ExitButton.setBounds(302, 311, 89, 23);
		panel_1_1.add(ExitButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 235, 205));
		panel_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_3.setBounds(10, 229, 427, 197);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 407, 103);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Bill", "Advertising", "Salary", "Sales", "Net Profit"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton ADDfButton_1 = new JButton("ADD");
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
		
		ADDfButton_1.setFont(new Font("Bodoni MT", Font.BOLD, 12));
		ADDfButton_1.setBounds(99, 136, 105, 38);
		panel_3.add(ADDfButton_1);
		
		JButton UploadButton = new JButton("UPLOAD");
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\Asus\\eclipse-workspace\\Assignment3\\src\\Finance.txt");
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
		UploadButton.setBounds(214, 136, 105, 38);
		panel_3.add(UploadButton);
					
	}

}
