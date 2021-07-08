package TourismBusinessCompany;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JToolBar;
import javax.swing.JTextArea;
import javax.swing.DropMode;

public class Employee extends JFrame {

	private JFrame frame;
	private JPanel contentPane;
	private JTextField StaffNameField;
	private JTextField StaffIDField;
	private JTextField PositionField;
	private JTable table;
	private JTextField WagesperhoursField;
	private JTextField WorkhoursField;
	private JTextField NumofdaysworkField;
	private JTextField SalaryField;
	private JTextField TaxField;
	private JTextField NetsalaryField;
	private JTextField AgeField;

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
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1166, 713);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem EmployeeMenuItem = new JMenuItem("Employee");
		EmployeeMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		EmployeeMenuItem.setFont(new Font("Arial Black", Font.BOLD, 15));
		menuBar.add(EmployeeMenuItem);
		
		JMenuItem AdsMenuItem = new JMenuItem("Advertisement");
		AdsMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				dispose();
				Advertisement ads = new Advertisement();
				ads.setModalExclusionType(null);
				ads.setVisible(true);
			}
		});
		AdsMenuItem.setFont(new Font("Arial Black", Font.BOLD, 13));
		menuBar.add(AdsMenuItem);
		
		JMenuItem PromotionMenuItem = new JMenuItem("Promotion ");
		PromotionMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Promotion promo = new Promotion();
				promo.setModalExclusionType(null);
				promo.setVisible(true);
			}
		});
		PromotionMenuItem.setFont(new Font("Arial Black", Font.BOLD, 15));
		menuBar.add(PromotionMenuItem);
		
		JMenuItem AdminPageMenuItem = new JMenuItem("Admin Page");
		AdminPageMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Admin adm = new Admin();
				adm.setModalExclusionType(null);
				adm.setVisible(true);
			}
		});
		
		JMenuItem PackagePriceMenuItem = new JMenuItem("Package Price");
		PackagePriceMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				PackagePrice PP = new PackagePrice();
				PP.setModalExclusionType(null);
				PP.setVisible(true);
			}
		});
		PackagePriceMenuItem.setFont(new Font("Arial Black", Font.BOLD, 12));
		menuBar.add(PackagePriceMenuItem);
		AdminPageMenuItem.setFont(new Font("Arial Black", Font.BOLD, 15));
		menuBar.add(AdminPageMenuItem);
		
		JMenuItem ExitMenuItem = new JMenuItem("Exit");
		ExitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tourism Business Company", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		
		});
		ExitMenuItem.setFont(new Font("Arial Black", Font.BOLD, 15));
		menuBar.add(ExitMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("");
		menuBar.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 100, 0));
		panel.setBackground(new Color(0, 255, 255));
		panel.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 7), null));
		panel.setBounds(0, 0, 1147, 644);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_1.setBounds(25, 18, 1097, 72);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel TitleLabel = new JLabel("EMPLOYEE MANAGEMENT ");
		TitleLabel.setForeground(new Color(0, 100, 0));
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		TitleLabel.setBounds(10, 11, 1077, 50);
		panel_1.add(TitleLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_1_1.setBackground(Color.CYAN);
		panel_1_1.setBounds(25, 96, 407, 273);
		panel.add(panel_1_1);
		
		JLabel StaffNameLabel = new JLabel("Staff Name");
		StaffNameLabel.setForeground(new Color(0, 100, 0));
		StaffNameLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		StaffNameLabel.setBounds(30, 27, 98, 23);
		panel_1_1.add(StaffNameLabel);
		
		JLabel StaffIDLabel = new JLabel("Staff ID");
		StaffIDLabel.setForeground(new Color(0, 100, 0));
		StaffIDLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		StaffIDLabel.setBounds(30, 72, 76, 23);
		panel_1_1.add(StaffIDLabel);
		
		JLabel ShiftLabel = new JLabel("Shift");
		ShiftLabel.setForeground(new Color(47, 79, 79));
		ShiftLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		ShiftLabel.setBounds(30, 150, 47, 23);
		panel_1_1.add(ShiftLabel);
		
		JLabel PositionLabel = new JLabel("Position ");
		PositionLabel.setForeground(new Color(47, 79, 79));
		PositionLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		PositionLabel.setBounds(30, 188, 86, 23);
		panel_1_1.add(PositionLabel);
		
		StaffNameField = new JTextField();
		StaffNameField.setBackground(new Color(175, 238, 238));
		StaffNameField.setHorizontalAlignment(SwingConstants.CENTER);
		StaffNameField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		StaffNameField.setBounds(179, 29, 154, 20);
		panel_1_1.add(StaffNameField);
		StaffNameField.setColumns(10);
		
		StaffIDField = new JTextField();
		StaffIDField.setBackground(new Color(175, 238, 238));
		StaffIDField.setHorizontalAlignment(SwingConstants.CENTER);
		StaffIDField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		StaffIDField.setColumns(10);
		StaffIDField.setBounds(179, 73, 154, 20);
		panel_1_1.add(StaffIDField);
		
		PositionField = new JTextField();
		PositionField.setBackground(new Color(175, 238, 238));
		PositionField.setHorizontalAlignment(SwingConstants.CENTER);
		PositionField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		PositionField.setColumns(10);
		PositionField.setBounds(179, 189, 154, 20);
		panel_1_1.add(PositionField);
		
		JLabel GenderLabel = new JLabel("Gender");
		GenderLabel.setForeground(new Color(0, 100, 0));
		GenderLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		GenderLabel.setBounds(30, 226, 86, 23);
		panel_1_1.add(GenderLabel);
		
		JLabel AgeLabel = new JLabel("Age");
		AgeLabel.setForeground(new Color(47, 79, 79));
		AgeLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		AgeLabel.setBounds(30, 110, 47, 23);
		panel_1_1.add(AgeLabel);
		
		AgeField = new JTextField();
		AgeField.setBackground(new Color(175, 238, 238));
		AgeField.setHorizontalAlignment(SwingConstants.CENTER);
		AgeField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		AgeField.setColumns(10);
		AgeField.setBounds(179, 109, 154, 20);
		panel_1_1.add(AgeField);
		
		JRadioButton rdbtnMorning = new JRadioButton("Morning");
		rdbtnMorning.setBackground(new Color(175, 238, 238));
		rdbtnMorning.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnMorning.setBounds(154, 150, 90, 23);
		panel_1_1.add(rdbtnMorning);
		
		JRadioButton rdbtnNight = new JRadioButton("Night");
		rdbtnNight.setBackground(new Color(175, 238, 238));
		rdbtnNight.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnNight.setBounds(269, 150, 76, 23);
		panel_1_1.add(rdbtnNight);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnMale.setBackground(new Color(175, 238, 238));
		rdbtnMale.setBounds(154, 228, 90, 23);
		panel_1_1.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnFemale.setBackground(new Color(175, 238, 238));
		rdbtnFemale.setBounds(269, 228, 90, 23);
		panel_1_1.add(rdbtnFemale);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		panel_2.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_2.setBounds(452, 96, 670, 272);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			
		});
		scrollPane.setBounds(10, 11, 650, 250);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(175, 238, 238));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Staff Name", "Staff ID", "Age", "Shift", "Position", "Gender", "Net salary"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_3.setBounds(25, 374, 407, 255);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel WagesLabel = new JLabel("Wages per hours");
		WagesLabel.setForeground(new Color(0, 100, 0));
		WagesLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		WagesLabel.setBounds(30, 27, 157, 23);
		panel_3.add(WagesLabel);
		
		JLabel WorkHoursLabel = new JLabel("Work hours");
		WorkHoursLabel.setForeground(new Color(0, 100, 0));
		WorkHoursLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		WorkHoursLabel.setBounds(30, 66, 109, 23);
		panel_3.add(WorkHoursLabel);
		
		JLabel NumofDaysLabel = new JLabel("Number of days work");
		NumofDaysLabel.setForeground(new Color(0, 100, 0));
		NumofDaysLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		NumofDaysLabel.setBounds(30, 103, 184, 23);
		panel_3.add(NumofDaysLabel);
		
		JLabel SalaryLabel = new JLabel("Salary");
		SalaryLabel.setForeground(new Color(0, 100, 0));
		SalaryLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		SalaryLabel.setBounds(30, 138, 69, 23);
		panel_3.add(SalaryLabel);
		
		JLabel TaxLabel = new JLabel("Tax");
		TaxLabel.setForeground(new Color(0, 100, 0));
		TaxLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		TaxLabel.setBounds(30, 172, 109, 23);
		panel_3.add(TaxLabel);
		
		JLabel NetSalaryLabel = new JLabel("Net Salary");
		NetSalaryLabel.setForeground(new Color(0, 100, 0));
		NetSalaryLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		NetSalaryLabel.setBounds(30, 206, 109, 23);
		panel_3.add(NetSalaryLabel);
		
		WagesperhoursField = new JTextField();
		WagesperhoursField.setBackground(new Color(175, 238, 238));
		WagesperhoursField.setHorizontalAlignment(SwingConstants.CENTER);
		WagesperhoursField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		WagesperhoursField.setBounds(255, 30, 109, 20);
		panel_3.add(WagesperhoursField);
		WagesperhoursField.setColumns(10);
		
		WorkhoursField = new JTextField();
		WorkhoursField.setBackground(new Color(175, 238, 238));
		WorkhoursField.setHorizontalAlignment(SwingConstants.CENTER);
		WorkhoursField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		WorkhoursField.setColumns(10);
		WorkhoursField.setBounds(255, 69, 109, 20);
		panel_3.add(WorkhoursField);
		
		NumofdaysworkField = new JTextField();
		NumofdaysworkField.setBackground(new Color(175, 238, 238));
		NumofdaysworkField.setHorizontalAlignment(SwingConstants.CENTER);
		NumofdaysworkField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		NumofdaysworkField.setColumns(10);
		NumofdaysworkField.setBounds(255, 106, 109, 20);
		panel_3.add(NumofdaysworkField);
		
		SalaryField = new JTextField();
		SalaryField.setBackground(new Color(175, 238, 238));
		SalaryField.setHorizontalAlignment(SwingConstants.CENTER);
		SalaryField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		SalaryField.setColumns(10);
		SalaryField.setBounds(255, 140, 109, 20);
		panel_3.add(SalaryField);
		
		TaxField = new JTextField();
		TaxField.setBackground(new Color(175, 238, 238));
		TaxField.setHorizontalAlignment(SwingConstants.CENTER);
		TaxField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		TaxField.setColumns(10);
		TaxField.setBounds(255, 174, 109, 20);
		panel_3.add(TaxField);
		
		NetsalaryField = new JTextField();
		NetsalaryField.setBackground(new Color(175, 238, 238));
		NetsalaryField.setHorizontalAlignment(SwingConstants.CENTER);
		NetsalaryField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		NetsalaryField.setColumns(10);
		NetsalaryField.setBounds(255, 209, 109, 20);
		panel_3.add(NetsalaryField);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 255, 255));
		panel_4.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_4.setBounds(452, 374, 368, 255);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JTextArea PayslipField = new JTextArea();
		PayslipField.setBounds(10, 11, 348, 233);
		panel_4.add(PayslipField);
		PayslipField.setBackground(new Color(175, 238, 238));
		PayslipField.setForeground(new Color(0, 100, 0));
		PayslipField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 255, 255));
		panel_5.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_5.setBounds(830, 374, 292, 255);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JButton PayslipButton = new JButton("PAYSLIP");
		PayslipButton.setBounds(41, 174, 204, 24);
		panel_5.add(PayslipButton);
		PayslipButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = StaffNameField.getText();
				String ID = StaffIDField.getText();
				String position = PositionField.getText();
				String wages = WagesperhoursField.getText();
				String hours = WorkhoursField.getText();
				String numOfdays = NumofdaysworkField.getText();
				String tax = TaxField.getText();
				String salary = SalaryField.getText();
				String netSalary = NetsalaryField.getText();
				
				PayslipField.setText(PayslipField.getText() + "\n");
				PayslipField.setText(PayslipField.getText() + "\tSalary Pay Slip" + "\n");
				PayslipField.setText(PayslipField.getText() + "Staff Name: " + name + "\n");
				PayslipField.setText(PayslipField.getText() + "Staff ID: " + ID + "\n");
				PayslipField.setText(PayslipField.getText() + "Position: " + position + "\n");
				PayslipField.setText(PayslipField.getText() + "Wages per hours: RM" + wages + "\n");
				PayslipField.setText(PayslipField.getText() + "Work Hours: " + hours + "hours" + "\n");
				PayslipField.setText(PayslipField.getText() + "Number of days work: " + numOfdays + "days" + "\n");
				PayslipField.setText(PayslipField.getText() + "Tax: RM" + tax + "\n");
				PayslipField.setText(PayslipField.getText() + "Salary: RM" + salary + "\n");
				PayslipField.setText(PayslipField.getText() + "Net salary: RM" + netSalary);
				
			}
		});
		PayslipButton.setForeground(new Color(47, 79, 79));
		PayslipButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		PayslipButton.setBackground(new Color(0, 206, 209));
		
		JButton AddButton = new JButton("ADD");
		AddButton.setBounds(41, 28, 204, 24);
		panel_5.add(AddButton);
		AddButton.setForeground(new Color(47, 79, 79));
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Shift, Gender;
				if(rdbtnMorning.isSelected()) {
					Shift = rdbtnMorning.getText();
				}
				else {
					Shift = rdbtnNight.getText();
				}
				
				if(rdbtnMale.isSelected()) {
					Gender = rdbtnMale.getText();
				}
				else {
					Gender = rdbtnFemale.getText();
				}
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
					
						StaffNameField.getText(),
						StaffIDField.getText(),
						AgeField.getText(),
						Shift,
						PositionField.getText(),
						Gender,
						NetsalaryField.getText(),
						
								
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System",
								JOptionPane.OK_OPTION);
					}
				}
					
			}
		});
		AddButton.setBackground(new Color(0, 206, 209));
		AddButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StaffNameField.setText("");
				StaffIDField.setText("");
				rdbtnMorning.setSelected(false);
				rdbtnNight.setSelected(false);
				AgeField.setText("");
				PositionField.setText("");
				rdbtnMale.setSelected(false);
				rdbtnFemale.setSelected(false);
				WagesperhoursField.setText("");
				WorkhoursField.setText("");
				NumofdaysworkField.setText("");
				TaxField.setText("");
				SalaryField.setText("");
				NetsalaryField.setText("");
				PayslipField.setText("");
			}
		});
		ResetButton.setBounds(41, 64, 204, 24);
		panel_5.add(ResetButton);
		ResetButton.setForeground(new Color(47, 79, 79));
		ResetButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		ResetButton.setBackground(new Color(0, 206, 209));
		
		JButton DeleteButton = new JButton("DELETE");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					if(table.getSelectedRow()==-1) {
						if(table.getRowCount()==0) {
							JOptionPane.showMessageDialog(null,"No data to delete",
									"Membership Management System", JOptionPane.OK_OPTION);
						}else {
							JOptionPane.showMessageDialog(null,"Select a row to delete",
									"Tourism Business Company", JOptionPane.OK_OPTION);
						}
					}else {
						model.removeRow(table.getSelectedRow());
					}
				}
		});
		DeleteButton.setBounds(41, 101, 204, 24);
		panel_5.add(DeleteButton);
		DeleteButton.setForeground(new Color(47, 79, 79));
		DeleteButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		DeleteButton.setBackground(new Color(0, 206, 209));
		
		JButton CalButton = new JButton("CALCULATE");
		CalButton.setBounds(41, 137, 204, 24);
		panel_5.add(CalButton);
		CalButton.setForeground(new Color(47, 79, 79));
		CalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tax a = new EMP();
				double tax = a.tax(); 
				double Tax;
				double wages;
				double workHours;
				int numOfdays;
				double salary;
				double netSalary;
				
				wages = Double.parseDouble(WagesperhoursField.getText());
				workHours = Double.parseDouble(WorkhoursField.getText());
				numOfdays = Integer.parseInt(NumofdaysworkField.getText());
			
				
				salary = (wages*workHours)*numOfdays;
				Tax = salary*tax;
				netSalary = salary - Tax;
				
				SalaryField.setText(Double.toString(salary));
				TaxField.setText(Double.toString(Tax));
				NetsalaryField.setText(Double.toString(netSalary));
				
			}
		});
		CalButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		CalButton.setBackground(new Color(0, 206, 209));
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\User\\OneDrive\\Documents\\A202\\PROGRAMMING 2\\Assignment 3\\src\\Employee.txt");
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
			
			
		});
		btnUpload.setBounds(41, 210, 204, 24);
		panel_5.add(btnUpload);
		btnUpload.setForeground(new Color(47, 79, 79));
		btnUpload.setBackground(new Color(0, 206, 209));
		btnUpload.setFont(new Font("Arial Black", Font.BOLD, 20));
	}
}
