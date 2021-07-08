package destination;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Company extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Company frame = new Company();
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
	public Company() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(34, 139, 34));
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(165, 42, 42)));
		panel.setBackground(new Color(218, 165, 32));
		panel.setBounds(0, 0, 844, 456);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(225, 29, 441, 68);
		panel_1.setBackground(new Color(218, 165, 32));
		panel_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(165, 42, 42)));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHomePage = new JLabel("HOME PAGE");
		lblHomePage.setBounds(0, 10, 442, 47);
		panel_1.add(lblHomePage);
		lblHomePage.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePage.setForeground(Color.BLACK);
		lblHomePage.setFont(new Font("Bell MT", Font.BOLD, 30));
		
		JLabel CompanyNameNewLabel_1 = new JLabel("COMPANY NAME          : Destination Services Sdn.Bhd");
		CompanyNameNewLabel_1.setBounds(27, 178, 381, 37);
		CompanyNameNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 15));
		panel.add(CompanyNameNewLabel_1);
		
		JLabel CompanyAddressNewLabel_1 = new JLabel("COMPANY ADDRESS    : No, 949, Pulau Matsirat, 08100 \r\nLangkawi, Kedah Darul Aman");
		CompanyAddressNewLabel_1.setBounds(27, 225, 622, 31);
		CompanyAddressNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 15));
		panel.add(CompanyAddressNewLabel_1);
		
		JLabel TelephoneNumberNewLabel_1 = new JLabel("COMPANY EMAIL         : langkawi@services.com");
		TelephoneNumberNewLabel_1.setBounds(27, 266, 372, 31);
		TelephoneNumberNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 15));
		panel.add(TelephoneNumberNewLabel_1);
		
		JLabel FaxNumberNewLabel_1 = new JLabel("NUMBER                         : 04 - 555 9999 / 04 - 666 8101");
		FaxNumberNewLabel_1.setBounds(27, 307, 381, 23);
		FaxNumberNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 15));
		panel.add(FaxNumberNewLabel_1);
		
		JButton EmployeeButton = new JButton("");
	    EmployeeButton.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\admin.png"));
		EmployeeButton.setBounds(168, 395, 65, 37);
		EmployeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login AM = new Login();
				AM.setModalExclusionType(null);
	            AM.setVisible(true);
	            dispose(); 
			}
		});
		EmployeeButton.setFont(new Font("Bell MT", Font.BOLD, 18));
		EmployeeButton.setBackground(SystemColor.activeCaption);
		panel.add(EmployeeButton);
		
		JButton UserButton = new JButton("");
		UserButton.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\customer.png"));
		UserButton.setBounds(243, 393, 57, 39);
		UserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration UM = new CustomerRegistration();
				UM.setModalExclusionType(null);
	            UM.setVisible(true);
	            dispose(); 
			}
		});
		UserButton.setFont(new Font("Bell MT", Font.BOLD, 18));
		UserButton.setBackground(SystemColor.activeCaption);
		panel.add(UserButton);
		
		JLabel lblWelcomeToDestination = new JLabel(" Welcome To Destination Services");
		lblWelcomeToDestination.setBounds(168, 107, 513, 31);
		lblWelcomeToDestination.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\welcome.png"));
		lblWelcomeToDestination.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToDestination.setForeground(Color.BLACK);
		lblWelcomeToDestination.setFont(new Font("Bell MT", Font.PLAIN, 23));
		panel.add(lblWelcomeToDestination);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\unnamed.gif"));
		lblNewLabel.setBounds(457, 178, 377, 268);
		panel.add(lblNewLabel);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();		//Exit button
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Home", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
			}
		}
	});
		btnExit.setFont(new Font("Bell MT", Font.BOLD, 18));
		btnExit.setBackground(SystemColor.activeCaption);
		btnExit.setBounds(310, 395, 117, 23);
		panel.add(btnExit);
	}

}