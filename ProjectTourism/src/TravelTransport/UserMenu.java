package TravelTransport;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserMenu extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMenu frame = new UserMenu();
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
	public UserMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(34, 139, 34)));
		panel.setBackground(new Color(152, 251, 152));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(34, 139, 34)));
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBounds(10, 11, 783, 65);
		panel.add(panel_1);
		
		JLabel UserMenuLabel = new JLabel("USER MENU");
		UserMenuLabel.setHorizontalAlignment(SwingConstants.CENTER);
		UserMenuLabel.setForeground(new Color(0, 128, 0));
		UserMenuLabel.setFont(new Font("Bell MT", Font.BOLD, 30));
		UserMenuLabel.setBounds(284, 11, 226, 43);
		panel_1.add(UserMenuLabel);
		
		JButton CompanyBackground = new JButton("COMPANY BACKGROUND\r\n");
		CompanyBackground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground CB = new CompanyBackground();
				CB.setModalExclusionType(null);
	            CB.setVisible(true);
	            dispose(); 
			}
		});
		CompanyBackground.setFont(new Font("Bell MT", Font.BOLD, 20));
		CompanyBackground.setBackground(new Color(192, 192, 192));
		CompanyBackground.setBounds(264, 198, 293, 44);
		panel.add(CompanyBackground);
		
		JButton CustomerRegistrationButton = new JButton("CUSTOMER REGISTRATION");
		CustomerRegistrationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration CR = new CustomerRegistration();
				CR.setModalExclusionType(null);
	            CR.setVisible(true);
	            dispose(); 
			}
		});
		CustomerRegistrationButton.setFont(new Font("Bell MT", Font.BOLD, 20));
		CustomerRegistrationButton.setBackground(new Color(192, 192, 192));
		CustomerRegistrationButton.setBounds(252, 266, 317, 44);
		panel.add(CustomerRegistrationButton);
		
		JButton ExitButton = new JButton("BACK");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home H = new Home();
				H.setModalExclusionType(null);
	            H.setVisible(true);
	            dispose(); 
			}
		});
		ExitButton.setFont(new Font("Bell MT", Font.BOLD, 25));
		ExitButton.setBackground(new Color(192, 192, 192));
		ExitButton.setBounds(333, 344, 147, 65);
		panel.add(ExitButton);
		
		JLabel NewLabel = new JLabel("MIRAE TRAVEL&TRANSPORT");
		NewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NewLabel.setForeground(new Color(0, 128, 0));
		NewLabel.setFont(new Font("Bell MT", Font.BOLD, 30));
		NewLabel.setBounds(176, 135, 447, 35);
		panel.add(NewLabel);
	}

}
