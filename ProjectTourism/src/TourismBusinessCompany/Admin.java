package TourismBusinessCompany;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 985, 701);
		
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
		EmployeeMenuItem.setFont(new Font("Arial Black", Font.BOLD, 15));
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
		AdsMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		AdsMenuItem.setFont(new Font("Arial Black", Font.BOLD, 12));
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
		PromotionMenuItem.setFont(new Font("Arial Black", Font.BOLD, 15));
		menuBar.add(PromotionMenuItem);
		
		JMenuItem HomePageMenuItem = new JMenuItem("Home Page");
		HomePageMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				HomePage HP = new HomePage();
				HP.setModalExclusionType(null);
				HP.setVisible(true);
				
			}
		});
		
		JMenuItem PackagePriceMenuItem = new JMenuItem("Package Price");
		PackagePriceMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PackagePrice PP = new PackagePrice();
				PP.setModalExclusionType(null);
				PP.setVisible(true);
				
			}
		});
		PackagePriceMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		PackagePriceMenuItem.setFont(new Font("Arial Black", Font.BOLD, 13));
		menuBar.add(PackagePriceMenuItem);
		HomePageMenuItem.setFont(new Font("Arial Black", Font.BOLD, 15));
		menuBar.add(HomePageMenuItem);
		
		JMenuItem ExitMenuItem = new JMenuItem("Exit");
		ExitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tourism Business Company", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			
			}
		});
		ExitMenuItem.setFont(new Font("Arial Black", Font.BOLD, 15));
		menuBar.add(ExitMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Admin.class.getResource("/TourismBusinessCompany/Image/Admin 2.jpg")));
		lblNewLabel.setBounds(0, 0, 1248, 651);
		contentPane.add(lblNewLabel);
	}
}
