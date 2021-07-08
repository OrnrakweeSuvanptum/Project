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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Sales extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField burger;
	private JTextField spagetti;
	private JTextField chickenchop;
	
	private JTextField carrot;
	private String s, s1,s2,s3,s4,s5;
	private JTextField apple;
	private JTextField orange;
	
	

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Sales() { //contructor without argument
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel.setBounds(10, 11, 700, 428);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(27, 11, 650, 47);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("MENU PRICE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(231, 11, 169, 25);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBounds(206, 79, 468, 202);
		panel.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 448, 177);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"Burger", "spagetti", "Chicken Chop", "Carrot", "Apple", "Orange"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Burger");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 90, 63, 18);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Spagetti");
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 120, 60, 17);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Chicken Chop");
		lblNewLabel_1_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(10, 145, 90, 14);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("Carrot");
		lblNewLabel_1_4.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(10, 192, 46, 20);
		panel.add(lblNewLabel_1_4);
		
		burger = new JTextField();
		burger.setBounds(110, 92, 86, 20);
		panel.add(burger);
		burger.setColumns(10);
		
		spagetti = new JTextField();
		spagetti.setColumns(10);
		spagetti.setBounds(110, 117, 86, 20);
		panel.add(spagetti);
		
		chickenchop = new JTextField();
		chickenchop.setColumns(10);
		chickenchop.setBounds(110, 142, 86, 20);
		panel.add(chickenchop);
		
		
		
		carrot = new JTextField();
		carrot.setColumns(10);
		carrot.setBounds(110, 192, 86, 20);
		panel.add(carrot);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						burger.getText(),
						spagetti.getText(),
						chickenchop.getText(),
						
						carrot.getText(),
						apple.getText(),
						orange.getText(),
						
												
				});
				
							
				 				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Sales Information Update confirmed", "Thank you",
								JOptionPane.OK_OPTION);
					}
				}
				
				//How to read data in table
				
				for (int i = 0 ; i < model.getRowCount() ; i++) { //use i - read only the current update of row/data
			        // null or not Integer will throw exception
			        s = String.valueOf(model.getValueAt(i, 0));
			        s1 = String.valueOf(model.getValueAt(i, 1));
			        s2 = String.valueOf(model.getValueAt(i, 2));
			        s3 = String.valueOf(model.getValueAt(i, 3));
			        s4 = String.valueOf(model.getValueAt(i, 4));
			        s5 = String.valueOf(model.getValueAt(i, 5));
			        
				}
				
				
				try {
					order fr = new order(s,s1,s2,s3,s4,s5); //open customer page using constructor with 5 arguments
					fr.setVisible(true);
				} catch (Exception ee) {
					ee.printStackTrace();
				}
				
				
			
			}
		});
			
		btnNewButton.setBounds(34, 318, 120, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Apple");
		lblNewLabel_1_4_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		lblNewLabel_1_4_1.setBounds(10, 219, 63, 18);
		panel.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Orange");
		lblNewLabel_1_4_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		lblNewLabel_1_4_2.setBounds(10, 243, 63, 18);
		panel.add(lblNewLabel_1_4_2);
		
		apple = new JTextField();
		apple.setColumns(10);
		apple.setBounds(110, 217, 86, 20);
		panel.add(apple);
		
		orange = new JTextField();
		orange.setColumns(10);
		orange.setBounds(110, 241, 86, 20);
		panel.add(orange);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\muhammad ikram hazim\\Documents\\restaurant 2.0\\src\\gui\\OrderData.txt");
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
		btnUpload.setBounds(176, 319, 120, 23);
		panel.add(btnUpload);
		
		
	}
}
