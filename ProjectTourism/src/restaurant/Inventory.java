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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;


import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Inventory extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField Icode;
	private JTextField Iname;
	private JTextField tarikh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory();
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
	public Inventory() {
		setTitle("Inventory");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 878, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 191, 255)));
		panel_1.setBounds(10, 30, 844, 594);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 191, 255)));
		panel_1_1.setBounds(21, 21, 802, 72);
		panel_1.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inventory System");
		lblNewLabel.setBackground(new Color(224, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		lblNewLabel.setBounds(10, 10, 790, 52);
		panel_1_1.add(lblNewLabel);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 191, 255)));
		panel_1_1_1.setBounds(21, 97, 802, 235);
		panel_1.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Item Code");
		lblNewLabel_1.setBounds(22, 32, 82, 20);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		panel_1_1_1.add(lblNewLabel_1);
		
		Icode = new JTextField();
		Icode.setBounds(134, 32, 143, 23);
		panel_1_1_1.add(Icode);
		Icode.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Item Name");
		lblNewLabel_1_1.setBounds(22, 96, 82, 20);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		panel_1_1_1.add(lblNewLabel_1_1);
		
		Iname = new JTextField();
		Iname.setBounds(134, 100, 143, 23);
		Iname.setColumns(10);
		panel_1_1_1.add(Iname);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Quantity");
		lblNewLabel_1_1_1.setBounds(460, 32, 82, 20);
		lblNewLabel_1_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		panel_1_1_1.add(lblNewLabel_1_1_1);
		
		JSpinner Iquantity = new JSpinner();
		Iquantity.setBounds(598, 32, 137, 27);
		Iquantity.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		panel_1_1_1.add(Iquantity);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Date");
		lblNewLabel_1_1_1_1.setBounds(460, 96, 82, 20);
		lblNewLabel_1_1_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		panel_1_1_1.add(lblNewLabel_1_1_1_1);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 191, 255));
		panel.setBounds(10, 167, 782, 58);
		panel_1_1_1.add(panel);
		panel.setLayout(null);
		
		JButton AddRecordButton = new JButton("ADD RECORD");
		AddRecordButton.setBounds(10, 15, 130, 27);
		panel.add(AddRecordButton);
		AddRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
					Icode.getText(),
					Iname.getText(),
					Iquantity.getValue(),
					tarikh.getText(),
						
						
						
										});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Inventory Update confirmed", "Inventory Management System",
								JOptionPane.OK_OPTION);
					}
				}

			}
		});
		AddRecordButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Icode.setText(" ");
				Iname.setText(" ");
				Iquantity.getValue();
				tarikh.setText(" ");

				
				
			}
		});
		
		ResetButton.setBounds(169, 15, 130, 27);
		panel.add(ResetButton);
		ResetButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		
		JButton DeleteButton = new JButton("DELETE");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Inventory System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Inventory Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		DeleteButton.setBounds(321, 15, 130, 27);
		panel.add(DeleteButton);
		DeleteButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		
		JButton ExitButton = new JButton("EXIT");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Inventory System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		ExitButton.setBounds(478, 15, 130, 27);
		panel.add(ExitButton);
		ExitButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\muhammad ikram hazim\\Documents\\restaurant 2.0\\src\\gui\\InventoryData.txt");
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
		btnUpload.setBounds(631, 15, 130, 27);
		panel.add(btnUpload);
		
		tarikh = new JTextField();
		tarikh.setColumns(10);
		tarikh.setBounds(598, 100, 143, 23);
		panel_1_1_1.add(tarikh);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 191, 255)));
		panel_1_1_1_1.setBounds(21, 342, 802, 235);
		panel_1.add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 782, 215);
		panel_1_1_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Item Code", "Item Name", "Quantity", "Date"
			}
		));
		scrollPane.setViewportView(table);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Admin");
		mnNewMenu.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Employee");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				employee RegSys = new employee(); //calling another frame/window
				
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
