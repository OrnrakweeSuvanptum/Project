package TourismBusinessCompany;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.border.MatteBorder;

import mainPackage.main;

import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import java.awt.Window.Type;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 689);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu HomeMenu = new JMenu("Home");
		HomeMenu.setBackground(new Color(95, 158, 160));
		HomeMenu.setFont(new Font("Arial Black", Font.BOLD, 15));
		menuBar.add(HomeMenu);
		
		JMenuItem LoginMenuItem = new JMenuItem("Login");
		LoginMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Login login = new Login();
				login.setModalExclusionType(null);
	            login.setVisible(true);
			}
		});
		LoginMenuItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		HomeMenu.add(LoginMenuItem);
		
		JMenu UserMenu = new JMenu("User");
		UserMenu.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		HomeMenu.add(UserMenu);
		
		JMenuItem CustomerbookMenuItem = new JMenuItem("Customer Booking");
		CustomerbookMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PackagePrice PP = new PackagePrice();
				PP.setModalExclusionType(null);
				PP.setVisible(true);
			}
		});
		CustomerbookMenuItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		UserMenu.add(CustomerbookMenuItem);
		
		JSeparator separator = new JSeparator();
		HomeMenu.add(separator);
		
		JMenuItem ExitMenuItem = new JMenuItem("Exit");
		ExitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tourism Business Company", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		
		JMenuItem DashboardmenuItem = new JMenuItem("Dashboard");
		DashboardmenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				main M = new main();
				M.setModalExclusionType(null);
				M.setVisible(true);
						
			}
		});
		DashboardmenuItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		HomeMenu.add(DashboardmenuItem);
		ExitMenuItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		HomeMenu.add(ExitMenuItem);
		
		JMenu AboutUsMenu = new JMenu("About Us");
		AboutUsMenu.setBackground(new Color(95, 158, 160));
		AboutUsMenu.setFont(new Font("Arial Black", Font.BOLD, 15));
		menuBar.add(AboutUsMenu);
		
		JMenuItem CompanyBackgroundMenuItem = new JMenuItem("Company Background");
		CompanyBackgroundMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				CompanyBackground ComBack = new CompanyBackground(); //calling another frame/window
				ComBack.setModalExclusionType(null);
	            ComBack.setVisible(true);
			}
		});
		CompanyBackgroundMenuItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		AboutUsMenu.add(CompanyBackgroundMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 7), null));
		panel.setBounds(0, 0, 901, 624);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Your Dream Vacation is here");
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setBounds(134, 335, 623, 144);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/TourismBusinessCompany/Image/tour 2.jpg")));
		lblNewLabel_1.setBounds(10, 10, 881, 604);
		panel.add(lblNewLabel_1);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
