package TourismBusinessCompany;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class CustomerBooking extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField CNameField;
	private JTextField PhoneNumField;
	private JTextField CEmailField;
	private JTable table;
	private JTextField DepositField;
	private JTextField TotalPriceField;
	private String pSPackage, pFPackage;
	private JTextField BookDateField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PackagePrice PP = new PackagePrice();
					PP.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public CustomerBooking(String p, String p2) {
		this.pSPackage = p;
		this.pFPackage = p2;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1155, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1141, 566);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Booking", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 7), null));
		panel_1.setBounds(10, 0, 1126, 537);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		panel_2.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_2.setBounds(22, 118, 421, 399);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel CNameLabel = new JLabel("Name");
		CNameLabel.setForeground(new Color(47, 79, 79));
		CNameLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		CNameLabel.setBounds(35, 42, 49, 17);
		panel_2.add(CNameLabel);
		
		CNameField = new JTextField();
		CNameField.setBackground(new Color(175, 238, 238));
		CNameField.setHorizontalAlignment(SwingConstants.CENTER);
		CNameField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		CNameField.setBounds(203, 40, 150, 20);
		panel_2.add(CNameField);
		CNameField.setColumns(10);
		
		JLabel CPhoneNumLabel = new JLabel("Telephone Num");
		CPhoneNumLabel.setForeground(new Color(47, 79, 79));
		CPhoneNumLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		CPhoneNumLabel.setBounds(35, 79, 128, 17);
		panel_2.add(CPhoneNumLabel);
		
		PhoneNumField = new JTextField();
		PhoneNumField.setHorizontalAlignment(SwingConstants.CENTER);
		PhoneNumField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		PhoneNumField.setColumns(10);
		PhoneNumField.setBackground(new Color(175, 238, 238));
		PhoneNumField.setBounds(203, 77, 150, 20);
		panel_2.add(PhoneNumField);
		
		JLabel CEmailLabel = new JLabel("Email");
		CEmailLabel.setForeground(new Color(47, 79, 79));
		CEmailLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		CEmailLabel.setBounds(35, 114, 56, 17);
		panel_2.add(CEmailLabel);
		
		CEmailField = new JTextField();
		CEmailField.setHorizontalAlignment(SwingConstants.CENTER);
		CEmailField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		CEmailField.setColumns(10);
		CEmailField.setBackground(new Color(175, 238, 238));
		CEmailField.setBounds(203, 112, 150, 20);
		panel_2.add(CEmailField);
		
		JLabel Package_1 = new JLabel("Package");
		Package_1.setForeground(new Color(47, 79, 79));
		Package_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		Package_1.setBounds(35, 155, 85, 17);
		panel_2.add(Package_1);
		
		JLabel BookDateLabel = new JLabel("Book date");
		BookDateLabel.setForeground(new Color(47, 79, 79));
		BookDateLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		BookDateLabel.setBounds(35, 197, 91, 17);
		panel_2.add(BookDateLabel);
		
		JRadioButton rdbtnSinglePackage = new JRadioButton("Single Package");
		rdbtnSinglePackage.setBackground(new Color(175, 238, 238));
		rdbtnSinglePackage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		rdbtnSinglePackage.setBounds(149, 153, 122, 23);
		panel_2.add(rdbtnSinglePackage);
		
		JRadioButton rdbtnFamPackage = new JRadioButton("Family Package");
		rdbtnFamPackage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		rdbtnFamPackage.setBackground(new Color(175, 238, 238));
		rdbtnFamPackage.setBounds(277, 153, 122, 23);
		panel_2.add(rdbtnFamPackage);
		
		JLabel DepositLabel = new JLabel("Deposit");
		DepositLabel.setForeground(new Color(47, 79, 79));
		DepositLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		DepositLabel.setBounds(35, 237, 85, 17);
		panel_2.add(DepositLabel);
		
		DepositField = new JTextField();
		DepositField.setHorizontalAlignment(SwingConstants.CENTER);
		DepositField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		DepositField.setColumns(10);
		DepositField.setBackground(new Color(175, 238, 238));
		DepositField.setBounds(203, 235, 150, 20);
		panel_2.add(DepositField);
		
		JLabel PaymentLabel = new JLabel("Payment");
		PaymentLabel.setForeground(new Color(47, 79, 79));
		PaymentLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		PaymentLabel.setBounds(35, 276, 85, 17);
		panel_2.add(PaymentLabel);
		
		JCheckBox chckbxCash = new JCheckBox("Cash");
		chckbxCash.setBackground(new Color(175, 238, 238));
		chckbxCash.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		chckbxCash.setBounds(149, 273, 85, 23);
		panel_2.add(chckbxCash);
		
		JCheckBox chckbxOnline = new JCheckBox("Online transfer");
		chckbxOnline.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		chckbxOnline.setBackground(new Color(175, 238, 238));
		chckbxOnline.setBounds(245, 273, 141, 23);
		panel_2.add(chckbxOnline);
		
		TotalPriceField = new JTextField();
		TotalPriceField.setBounds(203, 313, 150, 20);
		panel_2.add(TotalPriceField);
		TotalPriceField.setHorizontalAlignment(SwingConstants.CENTER);
		TotalPriceField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		TotalPriceField.setColumns(10);
		TotalPriceField.setBackground(new Color(175, 238, 238));
		
		JLabel TotPriceLabel = new JLabel("Total Price");
		TotPriceLabel.setForeground(new Color(47, 79, 79));
		TotPriceLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		TotPriceLabel.setBounds(35, 315, 85, 17);
		panel_2.add(TotPriceLabel);
		
		BookDateField = new JTextField();
		BookDateField.setHorizontalAlignment(SwingConstants.CENTER);
		BookDateField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		BookDateField.setColumns(10);
		BookDateField.setBackground(new Color(175, 238, 238));
		BookDateField.setBounds(203, 197, 150, 20);
		panel_2.add(BookDateField);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_3.setBounds(22, 40, 1082, 67);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel TitleLabel = new JLabel("BOOKING");
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setFont(new Font("Arial Black", Font.BOLD, 38));
		TitleLabel.setBounds(10, 11, 1062, 45);
		panel_3.add(TitleLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_4.setBounds(453, 118, 650, 311);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 630, 289);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Telephone num", "Email", "Book date", "Package", "Price", "Deposit", "Total price"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(91);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(77);
		table.getColumnModel().getColumn(5).setPreferredWidth(86);
		table.getColumnModel().getColumn(6).setPreferredWidth(84);
		table.setBackground(new Color(175, 238, 238));
		scrollPane.setViewportView(table);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 255, 255));
		panel_6.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_6.setBounds(453, 440, 651, 77);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JButton BookingButton = new JButton("BOOKING");
		BookingButton.setBounds(21, 26, 154, 27);
		panel_6.add(BookingButton);
		BookingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Package = " ";
				String priceP = " ";
				double deposit;
				
				deposit = Double.parseDouble(DepositField.getText());
				
				double priceSPackage = Double.parseDouble(pSPackage);
				double priceFPackage = Double.parseDouble(pFPackage);
				
				if(rdbtnSinglePackage.isSelected()) {
					Package = rdbtnSinglePackage.getText();
					priceP = Double.toString(priceSPackage);
					double totalPrice = Double.parseDouble(priceP)+deposit;
					TotalPriceField.setText(Double.toString(totalPrice));
				}
				else {
					Package = rdbtnFamPackage.getText();
					priceP = Double.toString(priceFPackage);
					double totalPrice = Double.parseDouble(priceP)+deposit;
					TotalPriceField.setText(Double.toString(totalPrice));
				}
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
					
						CNameField.getText(),
						PhoneNumField.getText(),
						CEmailField.getText(),
						Package,
						BookDateField.getText(),
						priceP,
						DepositField.getText(),
						TotalPriceField.getText(),
						
								
				});
				
				
			}
		});
		BookingButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		BookingButton.setBackground(new Color(0, 206, 209));
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CNameField.setText("");
				PhoneNumField.setText("");
				CEmailField.setText("");
				rdbtnSinglePackage.setSelected(false);
				rdbtnFamPackage.setSelected(false);
				BookDateField.setText("");
				DepositField.setText("");
				chckbxCash.setSelected(false);
				chckbxOnline.setSelected(false);
				TotalPriceField.setText("");
				
			}
		});
		ResetButton.setBounds(196, 26, 117, 27);
		panel_6.add(ResetButton);
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
		DeleteButton.setBounds(336, 26, 135, 27);
		panel_6.add(DeleteButton);
		DeleteButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		DeleteButton.setBackground(new Color(0, 206, 209));
		
		JButton UploadButton = new JButton("UPLOAD");
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\User\\OneDrive\\Documents\\A202\\PROGRAMMING 2\\Assignment 3\\src\\CustomerBooking.txt");
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
		UploadButton.setBounds(488, 26, 138, 27);
		panel_6.add(UploadButton);
		UploadButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		UploadButton.setBackground(new Color(0, 206, 209));
		
		JButton HomeButton = new JButton("HOME");
		HomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				HomePage HP = new HomePage();
				HP.setModalExclusionType(null);
				HP.setVisible(true);
						
			}
		});
		HomeButton.setIcon(null);
		HomeButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		HomeButton.setBounds(1024, 8, 94, 23);
		panel_1.add(HomeButton);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Single Package", null, panel_5, null);
		panel_5.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 255, 255));
		panel_7.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 7), null));
		panel_7.setBounds(0, 0, 1136, 520);
		panel_5.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel ImageLabel = new JLabel("");
		ImageLabel.setIcon(new ImageIcon(CustomerBooking.class.getResource("/TourismBusinessCompany/Image/Jetski-.jpg")));
		ImageLabel.setBounds(47, 37, 187, 144);
		panel_7.add(ImageLabel);
		
		JLabel ImageLabel_1 = new JLabel("");
		ImageLabel_1.setIcon(new ImageIcon(CustomerBooking.class.getResource("/TourismBusinessCompany/Image/room.jpg")));
		ImageLabel_1.setBounds(316, 92, 275, 183);
		panel_7.add(ImageLabel_1);
		
		JLabel ImageLabel_2 = new JLabel("New label");
		ImageLabel_2.setIcon(new ImageIcon(CustomerBooking.class.getResource("/TourismBusinessCompany/Image/cycling-.jpg")));
		ImageLabel_2.setBounds(57, 255, 181, 113);
		panel_7.add(ImageLabel_2);
		
		JLabel ImageLabel_3 = new JLabel("New label");
		ImageLabel_3.setIcon(new ImageIcon(CustomerBooking.class.getResource("/TourismBusinessCompany/Image/dinner-.jpg")));
		ImageLabel_3.setBounds(308, 335, 194, 133);
		panel_7.add(ImageLabel_3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_8.setBounds(719, 129, 288, 268);
		panel_7.add(panel_8);
		panel_8.setLayout(null);
		
		JTextArea txtrdaysnights = new JTextArea();
		txtrdaysnights.setBackground(new Color(175, 238, 238));
		txtrdaysnights.setBounds(10, 11, 267, 246);
		panel_8.add(txtrdaysnights);
		txtrdaysnights.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
		txtrdaysnights.setText("-Single Package-\r\n-3days 2nights\r\n-2 persons per package\r\n-1 single room\r\n-Snorkeling\r\n-Jet Ski\r\n-Night boat fishing\r\n-Island hopping tour\r\n-Sunset cycling");
		
		JPanel panel_9 = new JPanel();
		tabbedPane.addTab("Family Package", null, panel_9, null);
		panel_9.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 255, 255));
		panel_10.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 7), null));
		panel_10.setBounds(0, 0, 1136, 538);
		panel_9.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel ImageLabel_4 = new JLabel("");
		ImageLabel_4.setIcon(new ImageIcon(CustomerBooking.class.getResource("/TourismBusinessCompany/Image/Jetski-.jpg")));
		ImageLabel_4.setBounds(72, 62, 182, 150);
		panel_10.add(ImageLabel_4);
		
		JLabel ImageLabel_5 = new JLabel("");
		ImageLabel_5.setIcon(new ImageIcon(CustomerBooking.class.getResource("/TourismBusinessCompany/Image/homestay.jpg")));
		ImageLabel_5.setBounds(316, 130, 275, 164);
		panel_10.add(ImageLabel_5);
		
		JLabel ImageLabel_6 = new JLabel("");
		ImageLabel_6.setIcon(new ImageIcon(CustomerBooking.class.getResource("/TourismBusinessCompany/Image/dinner-.jpg")));
		ImageLabel_6.setBounds(72, 313, 200, 133);
		panel_10.add(ImageLabel_6);
		
		JLabel ImageLabel_7 = new JLabel("");
		ImageLabel_7.setIcon(new ImageIcon(CustomerBooking.class.getResource("/TourismBusinessCompany/Image/island hopping-.jpg")));
		ImageLabel_7.setBounds(363, 383, 200, 105);
		panel_10.add(ImageLabel_7);
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setLayout(null);
		panel_8_1.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_8_1.setBounds(724, 130, 317, 268);
		panel_10.add(panel_8_1);
		
		JTextArea txtrdaysnightsn = new JTextArea();
		txtrdaysnightsn.setTabSize(10);
		txtrdaysnightsn.setText("-Family Package-\r\n-3days 2night\r\n-5 members per family\r\n-1 homestay with breakfast\r\n-BBQ night\r\n-Night boat\r\n-Snorkeling\r\n-3 Jet Ski\r\n-Cable car\r\n\t\t\t\t\t\t\t+ \"-Sunset with dinner\\n\"");
		txtrdaysnightsn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
		txtrdaysnightsn.setBackground(new Color(175, 238, 238));
		txtrdaysnightsn.setBounds(10, 11, 297, 246);
		panel_8_1.add(txtrdaysnightsn);
	}
}
