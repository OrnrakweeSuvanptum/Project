package TourismBusinessCompany;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class PackagePrice extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField SPackageField;
	private JTextField FPackageField;
	private String s, s1;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PackagePrice frame = new PackagePrice();
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
	public PackagePrice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 343);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem EmployeeMenuItem = new JMenuItem("Employee");
		EmployeeMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
				dispose();
				Employee emp = new Employee();
				emp.setModalExclusionType(null);
				emp.setVisible(true);
			}
		});
		EmployeeMenuItem.setFont(new Font("Arial Black", Font.PLAIN, 12));
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
		AdsMenuItem.setFont(new Font("Arial Black", Font.PLAIN, 8));
		menuBar.add(AdsMenuItem);
		
		JMenuItem PromotionMenuItem = new JMenuItem("Promotion");
		PromotionMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Promotion promo = new Promotion();
				promo.setModalExclusionType(null);
				promo.setVisible(true);
			}
		});
		PromotionMenuItem.setFont(new Font("Arial Black", Font.PLAIN, 11));
		menuBar.add(PromotionMenuItem);
		
		JMenuItem PPriceMenuItem = new JMenuItem("Package Price");
		PPriceMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		PPriceMenuItem.setFont(new Font("Arial Black", Font.PLAIN, 8));
		menuBar.add(PPriceMenuItem);
		
		JMenuItem AdmPageMenuItem = new JMenuItem("Admin Page");
		AdmPageMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Admin adm = new Admin();
				adm.setModalExclusionType(null);
				adm.setVisible(true);
			}
		});
		AdmPageMenuItem.setFont(new Font("Arial Black", Font.PLAIN, 10));
		menuBar.add(AdmPageMenuItem);
		
		JMenuItem ExitMenuItem = new JMenuItem("Exit");
		ExitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tourism Business Company", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		ExitMenuItem.setFont(new Font("Arial Black", Font.PLAIN, 12));
		menuBar.add(ExitMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 7), null));
		panel.setBounds(0, 0, 748, 277);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_1.setBounds(25, 22, 696, 64);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel TitleLabel = new JLabel("PACKAGE PRICE");
		TitleLabel.setFont(new Font("Arial Black", Font.BOLD, 27));
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setBounds(10, 11, 656, 42);
		panel_1.add(TitleLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		panel_2.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_2.setBounds(341, 97, 380, 160);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 360, 138);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(175, 238, 238));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Single Package", "Family Package"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(1).setPreferredWidth(88);
		table.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_3.setBounds(25, 97, 300, 160);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel SPackageLabel = new JLabel("Single Package");
		SPackageLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		SPackageLabel.setBounds(20, 23, 123, 19);
		panel_3.add(SPackageLabel);
		
		SPackageField = new JTextField();
		SPackageField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		SPackageField.setBounds(153, 24, 111, 20);
		panel_3.add(SPackageField);
		SPackageField.setColumns(10);
		
		JLabel FPackageLabel = new JLabel("Family Package");
		FPackageLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		FPackageLabel.setBounds(20, 70, 123, 19);
		panel_3.add(FPackageLabel);
		
		FPackageField = new JTextField();
		FPackageField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		FPackageField.setColumns(10);
		FPackageField.setBounds(153, 70, 111, 20);
		panel_3.add(FPackageField);
		
		JButton AddRecButton = new JButton("ADD RECORD");
		AddRecButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						
						SPackageField.getText(),
						FPackageField.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Package Price Update confirmed", "Thank you",
								JOptionPane.OK_OPTION);
					}
				}
				
				for(int i = 0; i<model.getRowCount(); i++) {
					s = String.valueOf(model.getValueAt(i, 0));
					s1 = String.valueOf(model.getValueAt(i, 1));
				}
				
				try {
					CustomerBooking CB = new CustomerBooking(s,s1);
					CB.setVisible(true);	
				}
				catch(Exception ee) {
					ee.printStackTrace();
				}
			}
		});
		AddRecButton.setBackground(new Color(0, 206, 209));
		AddRecButton.setFont(new Font("Arial Black", Font.BOLD, 13));
		AddRecButton.setBounds(20, 111, 149, 23);
		panel_3.add(AddRecButton);
		
		JButton UploadButton = new JButton("UPLOAD");
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\User\\OneDrive\\Documents\\A202\\PROGRAMMING 2\\Assignment 3\\src\\PackagePrice.txt");
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
		UploadButton.setFont(new Font("Arial Black", Font.BOLD, 13));
		UploadButton.setBackground(new Color(0, 206, 209));
		UploadButton.setBounds(178, 111, 99, 23);
		panel_3.add(UploadButton);
	}
}
