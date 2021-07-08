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
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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

public class Advertisement extends JFrame {

	private JPanel contentPane;
	private JTextField PlatformField;
	private JTextField PriceField;
	private JTextField TaxField;
	private JTextField TotalPriceField;
	private JTable table;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advertisement frame = new Advertisement();
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
	public Advertisement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 530);
		
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
		AdsMenuItem.setFont(new Font("Arial Black", Font.PLAIN, 10));
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
		PromotionMenuItem.setFont(new Font("Arial Black", Font.PLAIN, 12));
		menuBar.add(PromotionMenuItem);
		
		JMenuItem PackagePriceMenuItem = new JMenuItem("Package Price");
		PackagePriceMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				PackagePrice PP = new PackagePrice();
				PP.setModalExclusionType(null);
				PP.setVisible(true);
			}
		});
		PackagePriceMenuItem.setFont(new Font("Arial Black", Font.PLAIN, 11));
		menuBar.add(PackagePriceMenuItem);
		
		JMenuItem AdminPageMenuItem = new JMenuItem("Admin Page");
		AdminPageMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Admin adm = new Admin();
				adm.setModalExclusionType(null);
				adm.setVisible(true);
			}
		});
		AdminPageMenuItem.setFont(new Font("Arial Black", Font.PLAIN, 12));
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
		ExitMenuItem.setFont(new Font("Arial Black", Font.PLAIN, 12));
		menuBar.add(ExitMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 7), null));
		panel.setBounds(0, 0, 834, 459);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_1.setBounds(27, 31, 776, 77);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel TitleLabel = new JLabel("ADVERTISEMENT MANAGEMENT");
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		TitleLabel.setBounds(10, 11, 756, 55);
		panel_1.add(TitleLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		panel_2.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_2.setBounds(27, 119, 355, 219);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel PlatformLabel = new JLabel("Platform");
		PlatformLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		PlatformLabel.setBounds(30, 31, 93, 18);
		panel_2.add(PlatformLabel);
		
		JLabel PriceLabel = new JLabel("Platform price");
		PriceLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		PriceLabel.setBounds(30, 73, 130, 18);
		panel_2.add(PriceLabel);
		
		JLabel TaxLabel = new JLabel("Tax");
		TaxLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		TaxLabel.setBounds(30, 116, 93, 18);
		panel_2.add(TaxLabel);
		
		JLabel TotalPriceLabel = new JLabel("Total price");
		TotalPriceLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		TotalPriceLabel.setBounds(30, 163, 93, 18);
		panel_2.add(TotalPriceLabel);
		
		PlatformField = new JTextField();
		PlatformField.setHorizontalAlignment(SwingConstants.CENTER);
		PlatformField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		PlatformField.setBounds(179, 32, 116, 20);
		panel_2.add(PlatformField);
		PlatformField.setColumns(10);
		
		PriceField = new JTextField();
		PriceField.setHorizontalAlignment(SwingConstants.CENTER);
		PriceField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		PriceField.setColumns(10);
		PriceField.setBounds(179, 74, 116, 20);
		panel_2.add(PriceField);
		
		TaxField = new JTextField();
		TaxField.setHorizontalAlignment(SwingConstants.CENTER);
		TaxField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		TaxField.setColumns(10);
		TaxField.setBounds(179, 117, 116, 20);
		panel_2.add(TaxField);
		
		TotalPriceField = new JTextField();
		TotalPriceField.setHorizontalAlignment(SwingConstants.CENTER);
		TotalPriceField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		TotalPriceField.setColumns(10);
		TotalPriceField.setBounds(179, 163, 116, 20);
		panel_2.add(TotalPriceField);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_3.setBounds(399, 119, 404, 219);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 384, 197);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Platform", "Price", "Tax", "Total price"
			}
		));
		table.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		scrollPane.setViewportView(table);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_6.setBackground(Color.CYAN);
		panel_6.setBounds(27, 351, 776, 77);
		panel.add(panel_6);
		
		JButton AddButton = new JButton("ADD");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
					
						PlatformField.getText(),
						PriceField.getText(),
						TaxField.getText(),
						TotalPriceField.getText(),
			
				});
			}
		});
		AddButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		AddButton.setBackground(new Color(0, 206, 209));
		AddButton.setBounds(21, 26, 138, 27);
		panel_6.add(AddButton);
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PlatformField.setText("");
				PriceField.setText("");
				TaxField.setText("");
				TotalPriceField.setText("");
			}
		});
		ResetButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		ResetButton.setBackground(new Color(0, 206, 209));
		ResetButton.setBounds(315, 26, 118, 27);
		panel_6.add(ResetButton);
		
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
		DeleteButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		DeleteButton.setBackground(new Color(0, 206, 209));
		DeleteButton.setBounds(455, 26, 141, 27);
		panel_6.add(DeleteButton);
		
		JButton UploadButton = new JButton("UPLOAD");
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\User\\OneDrive\\Documents\\A202\\PROGRAMMING 2\\Assignment 3\\src\\Advertisement.txt");
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
		UploadButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		UploadButton.setBackground(new Color(0, 206, 209));
		UploadButton.setBounds(615, 26, 138, 27);
		panel_6.add(UploadButton);
		
		JButton CalLabel = new JButton("CAL");
		CalLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double price;
				double tax;
				double totPrice;
				
				price = Double.parseDouble(PriceField.getText());
				tax = Double.parseDouble(TaxField.getText());
				
				double Tax = price*tax;
				totPrice = price - tax;
				
				TotalPriceField.setText(Double.toString(totPrice));
				TaxField.setText(Double.toString(Tax));
				
			}
		});
		CalLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		CalLabel.setBackground(new Color(0, 206, 209));
		CalLabel.setBounds(179, 26, 118, 27);
		panel_6.add(CalLabel);
	}
}
