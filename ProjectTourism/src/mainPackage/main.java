package mainPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TourismBusinessCompany.HomePage;
import TravelTransport.AdminMenu;
import TravelTransport.Home;
import hotel.Login;
import restaurant.Admin;
import restaurant.LoginPswd;
import destinations.HomeD;
import feedback.login;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setTitle("Tourism");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 772);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
				Login a = new Login();
				a.setModalExclusionType(null);
				a.setVisible(true);
			}
		});
		panel.setBackground(new Color(152, 251, 152));
		panel.setBounds(205, 190, 131, 132);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(main.class.getResource("/gui/imge/icons8-bed-60 (1).png")));
		lblNewLabel.setBounds(38, 10, 60, 60);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_7 = new JLabel("Hotel");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		lblNewLabel_7.setBounds(10, 80, 111, 29);
		panel.add(lblNewLabel_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				LoginPswd adm = new LoginPswd();
				adm.setModalExclusionType(null);
				adm.setVisible(true);
			}
		});
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBounds(401, 190, 131, 132);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(main.class.getResource("/gui/imge/icons8-restaurant-60.png")));
		lblNewLabel_1.setBounds(38, 10, 60, 60);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Restaurant");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		lblNewLabel_7_1.setBounds(10, 80, 111, 29);
		panel_1.add(lblNewLabel_7_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Home adm = new Home();
				adm.setModalExclusionType(null);
				adm.setVisible(true);
			}
		});
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(152, 251, 152));
		panel_2.setBounds(205, 360, 131, 132);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(main.class.getResource("/gui/imge/icons8-beach-umbrella-60.png")));
		lblNewLabel_2.setBounds(38, 10, 60, 60);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_7_2 = new JLabel(" Transport");
		lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		lblNewLabel_7_2.setBounds(10, 80, 111, 29);
		panel_2.add(lblNewLabel_7_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				HomeD a = new HomeD();
				a.setModalExclusionType(null);
				a.setVisible(true);	
			}
		});
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(152, 251, 152));
		panel_3.setBounds(401, 360, 131, 132);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(main.class.getResource("/gui/imge/icons8-home-address-60.png")));
		lblNewLabel_3.setBounds(38, 10, 60, 60);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_7_3 = new JLabel("Destination");
		lblNewLabel_7_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		lblNewLabel_7_3.setBounds(10, 81, 111, 29);
		panel_3.add(lblNewLabel_7_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login a = new login();
				a.setModalExclusionType(null);
				a.setVisible(true);	
			}
		});
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(152, 251, 152));
		panel_4.setBounds(205, 529, 131, 132);
		contentPane.add(panel_4);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(main.class.getResource("/gui/imge/icons8-feedback-60.png")));
		lblNewLabel_4.setBounds(38, 10, 60, 60);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7_4 = new JLabel("Feedback");
		lblNewLabel_7_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_4.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		lblNewLabel_7_4.setBounds(10, 80, 111, 29);
		panel_4.add(lblNewLabel_7_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				HomePage a = new HomePage();
				a.setModalExclusionType(null);
				a.setVisible(true);	
			}
		});
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(152, 251, 152));
		panel_5.setBounds(401, 529, 131, 132);
		contentPane.add(panel_5);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(main.class.getResource("/gui/imge/icons8-rent-60.png")));
		lblNewLabel_5.setBounds(38, 10, 60, 60);
		panel_5.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7_5 = new JLabel("Business");
		lblNewLabel_7_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_5.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		lblNewLabel_7_5.setBounds(10, 80, 111, 29);
		panel_5.add(lblNewLabel_7_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(main.class.getResource("/gui/imge/resize-1625296923423566739RadovaniTouristAgencyPhotography201024x576.jpg")));
		lblNewLabel_6.setBounds(0, 0, 720, 250);
		contentPane.add(lblNewLabel_6);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(60, 179, 113));
		panel_6.setBounds(0, 245, 720, 490);
		contentPane.add(panel_6);
	}
}
