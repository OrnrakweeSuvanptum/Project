package restaurant;

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
import javax.swing.RowFilter;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class employee extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField id;
	private JTextField nama;
	private JTable table;
	private JTextField salary;
	private JTextField noic;
	private JTextField umur;
  	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employee frame = new employee();
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
	public employee() {
		setTitle("Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1237, 764);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 191, 255)));
		panel.setBounds(10, 30, 1206, 687);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 191, 255)));
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(27, 30, 1153, 114);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Employee Management System");
		lblNewLabel.setBackground(new Color(224, 255, 255));
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 47));
		lblNewLabel.setBounds(10, 21, 1133, 76);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 191, 255)));
		panel_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1.setBounds(27, 162, 327, 372);
		panel.add(panel_1_1);
		
		JLabel Id = new JLabel("Emp ID");
		Id.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		Id.setBounds(23, 46, 67, 19);
		panel_1_1.add(Id);
		
		JLabel name = new JLabel("Name");
		name.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		name.setBounds(23, 90, 113, 19);
		panel_1_1.add(name);
		
		JLabel role = new JLabel("Role");
		role.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		role.setBounds(23, 278, 67, 19);
		panel_1_1.add(role);
		
		id = new JTextField();
		id.setBounds(122, 45, 164, 19);
		panel_1_1.add(id);
		id.setColumns(10);
		
		nama = new JTextField();
		nama.setColumns(10);
		nama.setBounds(122, 89, 164, 19);
		panel_1_1.add(nama);
		
		JComboBox jawatan = new JComboBox();
		jawatan.setModel(new DefaultComboBoxModel(new String[] {"Select Role", "Chef", "Waiter", "Casher", "Worker"}));
		jawatan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		jawatan.setBounds(122, 278, 164, 21);
		panel_1_1.add(jawatan);
		
		JLabel gaji = new JLabel("Salary");
		gaji.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		gaji.setBounds(23, 326, 67, 19);
		panel_1_1.add(gaji);
		
		salary = new JTextField();
		salary.setColumns(10);
		salary.setBounds(122, 328, 164, 19);
		panel_1_1.add(salary);
		
		JLabel ic = new JLabel("IC");
		ic.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		ic.setBounds(23, 138, 96, 19);
		panel_1_1.add(ic);
		
		JLabel age = new JLabel("Age");
		age.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		age.setBounds(23, 181, 113, 21);
		panel_1_1.add(age);
		
		JLabel name_1_2 = new JLabel("Gender");
		name_1_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		name_1_2.setBounds(23, 232, 113, 22);
		panel_1_1.add(name_1_2);
		
		noic = new JTextField();
		noic.setColumns(10);
		noic.setBounds(122, 140, 164, 19);
		panel_1_1.add(noic);
		
		umur = new JTextField();
		umur.setColumns(10);
		umur.setBounds(122, 183, 164, 19);
		panel_1_1.add(umur);
		
		JComboBox gender = new JComboBox();
		gender.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		gender.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gender.setBounds(122, 233, 164, 21);
		panel_1_1.add(gender);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 191, 255)));
		panel_1_2.setBackground(new Color(224, 255, 255));
		panel_1_2.setBounds(27, 544, 1153, 122);
		panel.add(panel_1_2);
		
		
		JButton PrintButton = new JButton("PRINT");
		PrintButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		PrintButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		PrintButton.setBounds(490, 45, 130, 39);
		panel_1_2.add(PrintButton);
		
		JButton AddRecordButton = new JButton("ADD RECORD");
		AddRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						id.getText(),
						nama.getText(),
						noic.getText(),
						umur.getText(),
						gender.getSelectedItem(),
						jawatan.getSelectedItem(),
						salary.getText(),
						
						
						
										});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Employee Update confirmed", "Employee Management System",
								JOptionPane.OK_OPTION);
					}
				}

			}
		});
		AddRecordButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		AddRecordButton.setBounds(45, 45, 130, 39);
		panel_1_2.add(AddRecordButton);
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText(" ");
				nama.setText(" ");
				noic.setText(" ");
				umur.setText(" ");
				gender.setSelectedItem("Make a selection");
				jawatan.setSelectedItem("Make a salection");
				salary.setText("0");
				
							}
		});
		
		ResetButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		ResetButton.setBounds(270, 45, 130, 39);
		panel_1_2.add(ResetButton);
		
		JButton DeleteButton = new JButton("DELETE");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		DeleteButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		DeleteButton.setBounds(723, 45, 130, 39);
		panel_1_2.add(DeleteButton);
		
		JButton ExitButton = new JButton("EXIT");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Employee Management System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		ExitButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		ExitButton.setBounds(960, 45, 130, 39);
		panel_1_2.add(ExitButton);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 191, 255)));
		panel_1_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1_1.setBounds(365, 162, 818, 372);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 802, 301);
		panel_1_1_1.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Emp ID", "Name", "IC", "Age", "Gender", "Role", "Salary"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setBounds(265, 321, 130, 39);
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\muhammad ikram hazim\\Documents\\restaurant 2.0\\src\\gui\\EmployeenData.txt");
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
		btnUpload.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		panel_1_1_1.add(btnUpload);
		
		JButton btnUpload_1 = new JButton("UPDATE");
		btnUpload_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(id.getText(),i,0);
			    	model.setValueAt(nama.getText(),i,1);
			    	model.setValueAt(noic.getText(),i,2);
			    	model.setValueAt(umur.getText(),i,3);
			    	model.setValueAt(gender.getSelectedItem(),i,4);
			    	model.setValueAt(jawatan.getSelectedItem(),i,5);
			    	model.setValueAt(salary.getText(),i,6);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpload_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		btnUpload_1.setBounds(462, 321, 130, 39);
		panel_1_1_1.add(btnUpload_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Admin");
		mnNewMenu.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Inventory");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Inventory RegSys = new Inventory(); //calling another frame/window
				RegSys.setVisible(true);
			}
		});
		mntmNewMenuItem.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Finance");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				finance RegSys = new finance(); //calling another frame/window
				
	            RegSys.setVisible(true);
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Dashboard");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Admin RegSys = new Admin(); //calling another frame/window
				
	            RegSys.setVisible(true);
			}
		});
		mntmNewMenuItem_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 13));
		mnNewMenu.add(mntmNewMenuItem_2);
	}
}
