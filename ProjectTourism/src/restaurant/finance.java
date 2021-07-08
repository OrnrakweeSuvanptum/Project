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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class finance extends JFrame {

	private JPanel contentPane;
	private JTextField w1;
	private JTextField w2;
	private JTextField w3;
	private JTextField w4;
	private JTextField ts;
	private JTextField oc;
	private JTextField np;
	private JTable table;
	
	String opc;
	String itotalSale;
	String inetProfit;
	double[]week=new double[20];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					finance frame = new finance();
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
	public finance() {
		setTitle("Finance");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 935, 627);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 23, 917, 564);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_1.setBounds(10, 10, 897, 76);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Finance System");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 40));
		lblNewLabel_3.setBounds(10, 10, 877, 56);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_2.setBounds(10, 96, 331, 450);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 191, 255));
		panel_3.setBounds(10, 10, 311, 41);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sale");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lblNewLabel.setBounds(23, 0, 266, 41);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Week 1");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 83, 65, 29);
		panel_2.add(lblNewLabel_1);
		
		w1 = new JTextField();
		w1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		w1.setBounds(122, 86, 168, 29);
		panel_2.add(w1);
		w1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Week 2");
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 137, 65, 29);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Week 3");
		lblNewLabel_1_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(10, 188, 65, 29);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Week 4");
		lblNewLabel_1_3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(10, 236, 65, 29);
		panel_2.add(lblNewLabel_1_3);
		
		w2 = new JTextField();
		w2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		w2.setColumns(10);
		w2.setBounds(122, 140, 168, 29);
		panel_2.add(w2);
		
		w3 = new JTextField();
		w3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		w3.setColumns(10);
		w3.setBounds(122, 191, 168, 29);
		panel_2.add(w3);
		
		w4 = new JTextField();
		w4.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		w4.setColumns(10);
		w4.setBounds(122, 239, 168, 29);
		panel_2.add(w4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 191, 255));
		panel_4.setBounds(10, 297, 311, 140);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		ts = new JTextField();
		ts.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		ts.setBounds(113, 61, 168, 29);
		panel_4.add(ts);
		ts.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Total Sales");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lblNewLabel_2.setBounds(6, 59, 97, 29);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Net Profit");
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(6, 98, 97, 29);
		panel_4.add(lblNewLabel_2_1);
		
		np = new JTextField();
		np.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		np.setColumns(10);
		np.setBounds(113, 100, 168, 29);
		panel_4.add(np);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Operation Cost");
		lblNewLabel_1_3_1.setBounds(6, 20, 104, 29);
		panel_4.add(lblNewLabel_1_3_1);
		lblNewLabel_1_3_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		
		oc = new JTextField();
		oc.setBounds(113, 22, 168, 29);
		panel_4.add(oc);
		oc.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		oc.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_5.setBounds(351, 97, 556, 296);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 536, 276);
		panel_5.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Week 1", "Week 2", "Week 3", "Week 4", "Total Sales", "Op Cost", "Net Profit"
			}
		));
		table.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
		scrollPane.setViewportView(table);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(224, 255, 255));
		panel_6.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_6.setBounds(351, 403, 556, 140);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    OperationCost g = new financeOC();//interface
				double op = g.OpCost();
				week[0]=Double.parseDouble(w1.getText());
				week[1]=Double.parseDouble(w2.getText());
				week[2]=Double.parseDouble(w3.getText());
				week[3]=Double.parseDouble(w4.getText());
				
				
				week[5]=week[0]+week[1]+week[2]+week[3];
				opc=String.format("RM %.2f", op);
				itotalSale=String.format("RM %.2f", week[5]);
				inetProfit=String.format("RM %.2f", week[5]-op);
				
				oc.setText(opc);
				ts.setText(itotalSale);
				np.setText(inetProfit);
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						w1.getText(),
						w2.getText(),
						w3.getText(),
						w4.getText(),
						ts.getText(),
						op,
						np.getText(),
						
						
						
										});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Finance Update confirmed", "finance Management System",
								JOptionPane.OK_OPTION);
					}
				}

			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		btnNewButton.setBounds(24, 23, 116, 31);
		panel_6.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w1.setText(" ");
				w2.setText(" ");
				w3.setText(" ");
				w4.setText(" ");
				oc.setText(" ");
				ts.setText("0");
				np.setText("0");
				
			}
		});
		btnReset.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		btnReset.setBounds(213, 23, 116, 31);
		panel_6.add(btnReset);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Finance Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Finance Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		btnDelete.setBounds(387, 23, 116, 31);
		panel_6.add(btnDelete);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		btnPrint.setBounds(24, 82, 116, 31);
		panel_6.add(btnPrint);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\muhammad ikram hazim\\Documents\\restaurant 2.0\\src\\gui\\FinanceData.txt");
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
		btnUpload.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		btnUpload.setBounds(213, 82, 116, 31);
		panel_6.add(btnUpload);
		
		JButton btnNewButton_2_1 = new JButton("Exit");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Finance Management System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_2_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		btnNewButton_2_1.setBounds(387, 82, 116, 31);
		panel_6.add(btnNewButton_2_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Admin");
		mnNewMenu.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
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
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Inventory");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			Inventory RegSys = new Inventory(); //calling another frame/window
				
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
