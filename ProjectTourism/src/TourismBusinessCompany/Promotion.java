package TourismBusinessCompany;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Promotion extends JFrame {

	private JPanel contentPane;
	private JTextField txtShopNow;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Promotion frame = new Promotion();
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
	public Promotion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 601);
		
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
		AdsMenuItem.setFont(new Font("Arial Black", Font.PLAIN, 9));
		menuBar.add(AdsMenuItem);
		
		JMenuItem PromotionMenuItem = new JMenuItem("Promotion");
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
		PackagePriceMenuItem.setFont(new Font("Arial Black", Font.PLAIN, 9));
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
		AdminPageMenuItem.setFont(new Font("Arial Black", Font.PLAIN, 11));
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
		
		JLabel BestDealLabel = new JLabel("BEST DEAL");
		BestDealLabel.setForeground(new Color(255, 255, 255));
		BestDealLabel.setHorizontalAlignment(SwingConstants.CENTER);
		BestDealLabel.setFont(new Font("Arial Black", Font.BOLD, 55));
		BestDealLabel.setBounds(165, 93, 416, 80);
		contentPane.add(BestDealLabel);
		
		JLabel Label = new JLabel("UP TO 30% OFF");
		Label.setForeground(new Color(255, 255, 255));
		Label.setHorizontalAlignment(SwingConstants.CENTER);
		Label.setFont(new Font("Arial Black", Font.BOLD, 45));
		Label.setBounds(177, 181, 416, 80);
		contentPane.add(Label);
		
		JLabel lblSinglePackage = new JLabel("Single Package");
		lblSinglePackage.setForeground(new Color(255, 255, 255));
		lblSinglePackage.setHorizontalAlignment(SwingConstants.CENTER);
		lblSinglePackage.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblSinglePackage.setBounds(88, 258, 311, 66);
		contentPane.add(lblSinglePackage);
		
		JLabel Label_2 = new JLabel("Family Package");
		Label_2.setForeground(new Color(255, 255, 255));
		Label_2.setHorizontalAlignment(SwingConstants.CENTER);
		Label_2.setFont(new Font("Arial Black", Font.BOLD, 25));
		Label_2.setBounds(372, 258, 311, 66);
		contentPane.add(Label_2);
		
		JLabel lblOfferValidFor = new JLabel("OFFER VALID FOR ONE MONTH");
		lblOfferValidFor.setForeground(new Color(255, 255, 255));
		lblOfferValidFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblOfferValidFor.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblOfferValidFor.setBounds(66, 319, 670, 80);
		contentPane.add(lblOfferValidFor);
		
		txtShopNow = new JTextField();
		txtShopNow.setBackground(new Color(30, 144, 255));
		txtShopNow.setForeground(new Color(255, 255, 255));
		txtShopNow.setFont(new Font("Arial Black", Font.PLAIN, 30));
		txtShopNow.setText("SHOP NOW");
		txtShopNow.setBounds(283, 397, 199, 36);
		contentPane.add(txtShopNow);
		txtShopNow.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Promotion.class.getResource("/TourismBusinessCompany/Image/background-.jpg")));
		lblNewLabel.setBounds(0, 0, 776, 553);
		contentPane.add(lblNewLabel);
	}

}
