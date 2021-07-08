package restaurant;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerListModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Choice;

import javax.swing.DropMode;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class reservation extends JFrame {

	private JPanel contentPane;
	private JTextField resname;
	private JTextField resphone;
	private JTextField resic;
	private JTextField time;
	
	
	private JTable table;
	private JTextField ressize;
	private JTextField tarikh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reservation frame = new reservation();
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
	public reservation() {
		setTitle("Reservation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1056, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(224, 255, 255));
		panel_3.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_3.setBounds(10, 23, 1022, 684);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 100, 412, 566);
		panel_3.add(panel_1);
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 191, 255)));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("User Details");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_1.setBounds(147, 10, 98, 25);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cust Name");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 68, 84, 23);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 191, 255));
		panel_2.setBounds(10, 10, 392, 31);
		panel_1.add(panel_2);
		
		resname = new JTextField();
		resname.setColumns(10);
		resname.setBounds(124, 68, 262, 28);
		panel_1.add(resname);
		
		JLabel lblNewLabel_2_1 = new JLabel("Phone No");
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(10, 132, 84, 23);
		panel_1.add(lblNewLabel_2_1);
		
		resphone = new JTextField();
		resphone.setColumns(10);
		resphone.setBounds(125, 132, 261, 28);
		panel_1.add(resphone);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("IC No");
		lblNewLabel_2_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(10, 192, 84, 23);
		panel_1.add(lblNewLabel_2_1_1);
		
		resic = new JTextField();
		resic.setColumns(10);
		resic.setBounds(124, 192, 261, 28);
		panel_1.add(resic);
		
		
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(10, 291, 392, 31);
		panel_1.add(panel_2_1);
		panel_2_1.setBackground(new Color(0, 191, 255));
		
		JLabel lblNewLabel_1_1 = new JLabel("Time & Date");
		panel_2_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Date");
		lblNewLabel_2_1_1_1_1.setBounds(10, 417, 66, 31);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Time");
		lblNewLabel_2_1_1_1.setBounds(10, 353, 66, 31);
		panel_1.add(lblNewLabel_2_1_1_1);
		lblNewLabel_2_1_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		
		time = new JTextField();
		time.setBounds(124, 356, 262, 28);
		panel_1.add(time);
		time.setColumns(10);
		
		JButton Reserve = new JButton("Reserve");
		Reserve.setBounds(64, 489, 121, 37);
		panel_1.add(Reserve);
		Reserve.setForeground(new Color(0, 0, 0));
		Reserve.setBackground(new Color(0, 191, 255));
		Reserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						resname.getText(),
						resphone.getText(),
						resic.getText(),
						ressize.getText(),		
						time.getText(),
						tarikh.getText(),
						
						
						
						
										});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Reservation Update confirmed", "Reservation Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		Reserve.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(232, 489, 121, 37);
		panel_1.add(btnExit);
		btnExit.setBackground(new Color(0, 191, 255));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Reservation System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		
		ressize = new JTextField();
		ressize.setColumns(10);
		ressize.setBounds(124, 243, 261, 28);
		panel_1.add(ressize);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Size Party");
		lblNewLabel_2_1_1_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_2_1_1_2.setBounds(10, 243, 84, 23);
		panel_1.add(lblNewLabel_2_1_1_2);
		
		tarikh = new JTextField();
		tarikh.setColumns(10);
		tarikh.setBounds(124, 417, 262, 28);
		panel_1.add(tarikh);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(432, 100, 565, 566);
		panel_3.add(panel_1_1_1);
		panel_1_1_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_1_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 545, 436);
		panel_1_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Phone No", "IC No", "Size Party", "Time", "Date"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(224, 255, 255));
		panel_4.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_4.setBounds(10, 456, 545, 100);
		panel_1_1_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnUpload_2 = new JButton("Reset");
		btnUpload_2.setBounds(33, 35, 118, 33);
		panel_4.add(btnUpload_2);
		btnUpload_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resname.setText(" ");
				resphone.setText(" ");
				resic.setText(" ");
				ressize.setText(" ");
				time.setText(" ");
				tarikh.setText(" ");
				
				
				
			}
		});
		btnUpload_2.setForeground(Color.BLACK);
		btnUpload_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		btnUpload_2.setBackground(new Color(0, 191, 255));
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(219, 33, 121, 37);
		panel_4.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Reservation System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Reservation Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		btnDelete.setBackground(new Color(0, 191, 255));
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBounds(398, 33, 121, 37);
		panel_4.add(btnUpload);
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\muhammad ikram hazim\\Documents\\restaurant 2.0\\src\\gui\\ReservationData.txt");
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
		btnUpload.setForeground(Color.BLACK);
		btnUpload.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		btnUpload.setBackground(new Color(0, 191, 255));
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 18, 984, 72);
		panel_3.add(panel);
		panel.setBackground(new Color(224, 255, 255));
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reservation System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 31));
		lblNewLabel.setBounds(10, 10, 964, 52);
		panel.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("User");
		mnNewMenu.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Company Info");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyInfo RegSys = new CompanyInfo(); //calling another frame/window
				RegSys.setModalExclusionType(null);
	            RegSys.setVisible(true);
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		
	}
}
