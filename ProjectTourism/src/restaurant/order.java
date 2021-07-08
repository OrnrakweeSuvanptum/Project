

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
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class order extends JFrame {
	
	private JPanel contentPane;
	private JTextField name;
	private JTextField phone;
	private JTextField table;
	private JTextField totalPrice;
	private JTextField Burger;
	private JTextField spa;
	private JTextField chicken;
	private JTextField carrot;
	private JTextField apple;
	private JTextField orange;
	private JFrame frame;
	private String pBurger, pSpagetti, pChickenChop,  pCarrot, pApple, pOrange;
	String itotalPrice;
	double[]itemcost=new double[20];
		/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales frame = new Sales();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}}
					});
	}
	/**
	 * Create the frame.
	 */
	
		public order(String p, String p2, String p3, String p4, String p5, String p6) {
		this.pBurger = p; //
		this.pSpagetti = p2;
		this.pChickenChop = p3;
		this.pCarrot = p4;
		this.pApple = p5;
		this.pOrange = p6;
		
		
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(200, 24, 993, 77);
		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1165, 796);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 13));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("User");
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				reservation RegSys = new reservation(); //calling another frame/window
				 RegSys.setVisible(true);
			}
		});
		mnNewMenu.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 13));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Reservation");
		mntmNewMenuItem.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				reservation RegSys = new reservation(); //calling another frame/window
				
	            RegSys.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Company Info");
		mntmNewMenuItem_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyInfo RegSys = new CompanyInfo(); //calling another frame/window
				RegSys.setModalExclusionType(null);
	            RegSys.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(10, 0, 1141, 725);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(10, 23, 1116, 116);
		panel_1.add(panel1);
		panel1.setBackground(new Color(224, 255, 255));
		panel1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel1.setLayout(null);
		
		JLabel welcome = new JLabel("Welcome To Crowne Restaurant");
		welcome.setForeground(new Color(0, 0, 139));
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		welcome.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 40));
		welcome.setBounds(133, 31, 947, 61);
		panel1.add(welcome);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(order.class.getResource("/gui/imge/icons8-restaurant-100.png")));
		lblNewLabel.setBounds(10, 10, 100, 97);
		panel1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(10, 148, 346, 414);
		panel_1.add(panel_1_1);
		panel_1_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Cust Name");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_2.setBounds(25, 75, 84, 23);
		panel_1_1.add(lblNewLabel_2);
		
		name = new JTextField();
		name.setBounds(138, 76, 170, 28);
		panel_1_1.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Phone No");
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(25, 135, 84, 23);
		panel_1_1.add(lblNewLabel_2_1);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(138, 136, 170, 28);
		panel_1_1.add(phone);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Table No");
		lblNewLabel_2_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(25, 194, 84, 23);
		panel_1_1.add(lblNewLabel_2_1_1);
		
		table = new JTextField();
		table.setColumns(10);
		table.setBounds(138, 195, 170, 28);
		panel_1_1.add(table);
		
		JPanel panel_2_2_1_1 = new JPanel();
		panel_2_2_1_1.setLayout(null);
		panel_2_2_1_1.setForeground(new Color(135, 206, 235));
		panel_2_2_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 191, 255)));
		panel_2_2_1_1.setBackground(new Color(0, 191, 255));
		panel_2_2_1_1.setBounds(10, 10, 326, 38);
		panel_1_1.add(panel_2_2_1_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Customer Detail");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(84, 0, 150, 33);
		panel_2_2_1_1.add(lblNewLabel_4_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_1_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1_1.setBounds(780, 148, 346, 414);
		panel_1.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JTextArea receipt = new JTextArea();
		receipt.setBounds(10, 10, 329, 394);
		panel_1_1_1.add(receipt);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_1_1_2.setBackground(new Color(224, 255, 255));
		panel_1_1_2.setBounds(366, 149, 404, 551);
		panel_1.add(panel_1_1_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 191, 255)));
		panel_2.setBackground(new Color(0, 191, 255));
		panel_2.setForeground(new Color(135, 206, 235));
		panel_2.setBounds(10, 472, 384, 69);
		panel_1_1_2.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Total Price");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 21));
		lblNewLabel_3.setBounds(10, 10, 111, 49);
		panel_2.add(lblNewLabel_3);
		
		totalPrice = new JTextField();
		totalPrice.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 19));
		totalPrice.setBounds(155, 10, 219, 49);
		panel_2.add(totalPrice);
		totalPrice.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Food");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_4.setBounds(168, 10, 67, 33);
		panel_1_1_2.add(lblNewLabel_4);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setForeground(new Color(135, 206, 235));
		panel_2_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 191, 255)));
		panel_2_2.setBackground(new Color(0, 191, 255));
		panel_2_2.setBounds(10, 238, 384, 38);
		panel_1_1_2.add(panel_2_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Drink");
		lblNewLabel_4_1.setBounds(166, 0, 67, 33);
		panel_2_2.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setForeground(new Color(135, 206, 235));
		panel_2_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 191, 255)));
		panel_2_2_1.setBackground(new Color(0, 191, 255));
		panel_2_2_1.setBounds(10, 10, 384, 38);
		panel_1_1_2.add(panel_2_2_1);
		
		Burger = new JTextField();
		Burger.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		Burger.setHorizontalAlignment(SwingConstants.CENTER);
		Burger.setText("0");
		Burger.setColumns(10);
		Burger.setBounds(228, 84, 166, 33);
		panel_1_1_2.add(Burger);
		
		spa = new JTextField();
		spa.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		spa.setHorizontalAlignment(SwingConstants.CENTER);
		spa.setText("0");
		spa.setColumns(10);
		spa.setBounds(228, 137, 166, 33);
		panel_1_1_2.add(spa);
		
		chicken = new JTextField();
		chicken.setText("0");
		chicken.setHorizontalAlignment(SwingConstants.CENTER);
		chicken.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		chicken.setColumns(10);
		chicken.setBounds(228, 193, 166, 33);
		panel_1_1_2.add(chicken);
		
		carrot = new JTextField();
		carrot.setHorizontalAlignment(SwingConstants.CENTER);
		carrot.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		carrot.setText("0");
		carrot.setColumns(10);
		carrot.setBounds(228, 300, 166, 33);
		panel_1_1_2.add(carrot);
		
		apple = new JTextField();
		apple.setHorizontalAlignment(SwingConstants.CENTER);
		apple.setText("0");
		apple.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		apple.setColumns(10);
		apple.setBounds(228, 350, 166, 33);
		panel_1_1_2.add(apple);
		
		orange = new JTextField();
		orange.setText("0");
		orange.setHorizontalAlignment(SwingConstants.CENTER);
		orange.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		orange.setColumns(10);
		orange.setBounds(228, 401, 166, 33);
		panel_1_1_2.add(orange);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_1.setBounds(279, 44, 74, 30);
		panel_1_1_2.add(lblNewLabel_1);
		
		JCheckBox Tburger = new JCheckBox("Burger");
		Tburger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Tburger.isSelected())
				{
					Burger.setEnabled(true);
					Burger.setText("");
					Burger.requestFocus();
				}
				else
				{
					Burger.setEnabled(false);
					Burger.setText("0");
					
				}
			}
		});
		Tburger.setBackground(new Color(224, 255, 255));
		Tburger.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		Tburger.setBounds(25, 84, 166, 30);
		panel_1_1_2.add(Tburger);
		
		JCheckBox Tspa = new JCheckBox("Spagetti");
		Tspa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Tspa.isSelected())
				{
					spa.setEnabled(true);
					spa.setText("");
					spa.requestFocus();
				}
				else
				{
					spa.setEnabled(false);
					spa.setText("0");
					
				}
			}
		});
		Tspa.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		Tspa.setBackground(new Color(224, 255, 255));
		Tspa.setBounds(25, 138, 166, 30);
		panel_1_1_2.add(Tspa);
		
		JCheckBox Tcc = new JCheckBox("Chicken Chop");
		Tcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Tcc.isSelected())
				{
					chicken.setEnabled(true);
					chicken.setText("");
					chicken.requestFocus();
				}
				else
				{
					chicken.setEnabled(false);
					chicken.setText("0");
					
				}
			}
		});
		Tcc.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		Tcc.setBackground(new Color(224, 255, 255));
		Tcc.setBounds(25, 193, 166, 30);
		panel_1_1_2.add(Tcc);
		
		JCheckBox Tcarrot = new JCheckBox("Carrot ");
		Tcarrot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Tcarrot.isSelected())
				{
					carrot.setEnabled(true);
					carrot.setText("");
					carrot.requestFocus();
				}
				else
				{
					carrot.setEnabled(false);
					carrot.setText("0");
					
				}
			}
		});
		Tcarrot.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		Tcarrot.setBackground(new Color(224, 255, 255));
		Tcarrot.setBounds(25, 300, 166, 30);
		panel_1_1_2.add(Tcarrot);
		
		JCheckBox Tapple = new JCheckBox("Apple");
		Tapple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Tapple.isSelected())
				{
					apple.setEnabled(true);
					apple.setText("");
					apple.requestFocus();
				}
				else
				{
					apple.setEnabled(false);
					apple.setText("0");
					
				}
			}
		});
		Tapple.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		Tapple.setBackground(new Color(224, 255, 255));
		Tapple.setBounds(25, 353, 166, 30);
		panel_1_1_2.add(Tapple);
		
		JCheckBox Torange = new JCheckBox("Orange");
		Torange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Torange.isSelected())
				{
					orange.setEnabled(true);
					orange.setText("");
					orange.requestFocus();
				}
				else
				{
					orange.setEnabled(false);
					orange.setText("0");
					
				}
			}
		});
		Torange.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		Torange.setBackground(new Color(224, 255, 255));
		Torange.setBounds(25, 404, 166, 30);
		panel_1_1_2.add(Torange);
		
		JPanel panel_1_1_2_1 = new JPanel();
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_1_1_2_1.setBackground(new Color(224, 255, 255));
		panel_1_1_2_1.setBounds(780, 572, 346, 128);
		panel_1.add(panel_1_1_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setForeground(new Color(135, 206, 235));
		panel_2_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 191, 255)));
		panel_2_1_1.setBackground(new Color(0, 191, 255));
		panel_2_1_1.setBounds(10, 10, 326, 108);
		panel_1_1_2_1.add(panel_2_1_1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Burger.setEnabled(false);
				spa.setEnabled(false);
				chicken.setEnabled(false);
				carrot.setEnabled(false);
				apple.setEnabled(false);
				orange.setEnabled(false);
				
				
				
				Burger.setText("0");
				spa.setText("0");
				chicken.setText("0");
				carrot.setText("0");
				apple.setText("0");
				orange.setText("0");
				name.setText(" ");
				phone.setText(" ");
				table.setText(" ");
				receipt.setText("");
				totalPrice.setText("");
				
				Tburger.setSelected(false);
				Tspa.setSelected(false);
				Tcc.setSelected(false);
				Tcarrot.setSelected(false);
				Tapple.setSelected(false);
				Torange.setSelected(false);
				
				

			}
		});
		btnReset.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 19));
		btnReset.setBounds(39, 36, 99, 35);
		panel_2_1_1.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Order System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 19));
		btnExit.setBounds(191, 36, 99, 35);
		panel_2_1_1.add(btnExit);
		
		JPanel panel_1_1_2_1_1 = new JPanel();
		panel_1_1_2_1_1.setLayout(null);
		panel_1_1_2_1_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_1_1_2_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1_2_1_1.setBounds(10, 572, 346, 128);
		panel_1.add(panel_1_1_2_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(10, 10, 326, 108);
		panel_1_1_2_1_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		panel_2_1.setForeground(new Color(135, 206, 235));
		panel_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 191, 255)));
		panel_2_1.setBackground(new Color(0, 191, 255));
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					receipt.print();
				}
				catch(java.awt.print.PrinterException e) {
					System.err.format("No Printer Found", e.getMessage());
				}
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 19));
		btnNewButton.setBounds(40, 34, 99, 35);
		panel_2_1.add(btnNewButton);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double priceBurger = Double.parseDouble(pBurger);
				double priceSpagetti = Double.parseDouble(pSpagetti);
				double priceChickenChop = Double.parseDouble(pChickenChop);
				double priceCarrot = Double.parseDouble(pCarrot);
				double priceApple = Double.parseDouble(pApple);
				double priceOrange = Double.parseDouble(pOrange);
				itemcost[0]=Double.parseDouble(Burger.getText())*(priceBurger);
				  
				itemcost[1]=Double.parseDouble(spa.getText())*(priceSpagetti);
				itemcost[2]=Double.parseDouble(chicken.getText())*(priceChickenChop);
				itemcost[3]=Double.parseDouble(carrot.getText())*(priceCarrot);
				itemcost[4]=Double.parseDouble(apple.getText())*(priceApple);
				itemcost[5]=Double.parseDouble(orange.getText())*(priceOrange);
				
				
				itemcost[6]=itemcost[0]+itemcost[1]+itemcost[2];
				itemcost[7]=itemcost[3]+itemcost[4]+itemcost[5];
				itemcost[8]=itemcost[6]+itemcost[7];
				
				itotalPrice=String.format("RM %.2f", itemcost[8]);
				totalPrice.setText(itotalPrice);
				
				receipt.append("\t           Crowne Restaurant"+"\n\t              Classic & Retro"+"\n\t         Company No: 34238-A "
			            +"\n\t      Pantai Cenang, Langkawi"+"\n\t           Tel: 019-324232678\n"
					      +"\twww.CrowneRestaurantHotel.com\n"+"\n\t                  Receipt"+"\n============================================\t"+
				"\nCustomer Name:\t"+name.getText()+
				"\nPhone No:\t\t"+phone.getText()+
				"\nTable No:\t\t"+table.getText()+
				"\n\nBurger\t\t"+Burger.getText()+
				"\nSpagetti\t\t"+spa.getText()+
				"\nChicken Chop\t\t"+chicken.getText()+
				"\nCarrot Juice\t\t"+carrot.getText()+
				"\nApple Juice\t\t"+apple.getText()+
				"\nOrange Juice\t\t"+orange.getText()+
				"\n\nTotal Price\t\t"+itotalPrice+
				"\n=============================================\t"+
				"\n\tThank You Use Our Service "
				);
				
				
				
			}
		});
		btnTotal.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 19));
		btnTotal.setBounds(194, 34, 99, 35);
		panel_2_1.add(btnTotal);
	}
}
