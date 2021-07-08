package TourismBusinessCompany;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompanyBackground extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyBackground frame = new CompanyBackground();
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
	public CompanyBackground() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1007, 650);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Home");
		mnNewMenu.setFont(new Font("Arial Black", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Login");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login login = new Login();
				login.setModalExclusionType(null);
	            login.setVisible(true);
			}
		});
		mntmNewMenuItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("User");
		mnNewMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				PackagePrice PP = new PackagePrice();
				PP.setModalExclusionType(null);
				PP.setVisible(true);
			}
		});
		mnNewMenu_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Customer Booking");
		mntmNewMenuItem_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tourism Business Company", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		mntmNewMenuItem_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("About Us");
		mnNewMenu_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Company Background");
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mnNewMenu_2.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 7), null));
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 993, 585);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 4, true), new LineBorder(new Color(95, 158, 160), 6)));
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(39, 27, 911, 78);
		panel.add(panel_1);
		
		JLabel CompanyLabel = new JLabel("WEE TOURISM ENTERPRISE");
		CompanyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		CompanyLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 39));
		CompanyLabel.setBounds(10, 11, 891, 56);
		panel_1.add(CompanyLabel);
		
		JLabel CompanyNameLabel = new JLabel("Company Name: WEE TOURISM ENTERPRISE");
		CompanyNameLabel.setFont(new Font("Arial Black", Font.BOLD, 19));
		CompanyNameLabel.setBounds(64, 343, 548, 21);
		panel.add(CompanyNameLabel);
		
		JLabel AddressLabel = new JLabel("Address: No252, Jalan Bunga Mawar, Pantai Cenang Langkawi, Kedah ");
		AddressLabel.setFont(new Font("Arial Black", Font.BOLD, 19));
		AddressLabel.setBounds(64, 375, 787, 21);
		panel.add(AddressLabel);
		
		JLabel PosscodeLabel = new JLabel("Posscode: 07000");
		PosscodeLabel.setFont(new Font("Arial Black", Font.BOLD, 19));
		PosscodeLabel.setBounds(64, 407, 215, 21);
		panel.add(PosscodeLabel);
		
		JLabel LocationLabel = new JLabel("Location: Pantai Cenang, Langkawi ");
		LocationLabel.setFont(new Font("Arial Black", Font.BOLD, 19));
		LocationLabel.setBounds(64, 439, 417, 21);
		panel.add(LocationLabel);
		
		JLabel TelNumLabel = new JLabel("Telephone Number: 04-4550493");
		TelNumLabel.setFont(new Font("Arial Black", Font.BOLD, 19));
		TelNumLabel.setBounds(64, 471, 361, 21);
		panel.add(TelNumLabel);
		
		JLabel FaxLabel = new JLabel("Fax: 04-4550934");
		FaxLabel.setFont(new Font("Arial Black", Font.BOLD, 19));
		FaxLabel.setBounds(64, 503, 202, 21);
		panel.add(FaxLabel);
		
		JLabel WebsiteLabel = new JLabel("Website: www.weetourism.com.my ");
		WebsiteLabel.setFont(new Font("Arial Black", Font.BOLD, 19));
		WebsiteLabel.setBounds(64, 535, 406, 21);
		panel.add(WebsiteLabel);
		
		JLabel ImageLabel = new JLabel("");
		ImageLabel.setIcon(new ImageIcon(CompanyBackground.class.getResource("/TourismBusinessCompany/Image/tourism company.jpg")));
		ImageLabel.setBounds(355, 133, 277, 174);
		panel.add(ImageLabel);
	}
}
