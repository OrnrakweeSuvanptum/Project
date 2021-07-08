package TravelTransport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
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
		setBounds(100, 100, 860, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(34, 139, 34));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(34, 139, 34)));
		panel.setBackground(new Color(152, 251, 152));
		panel.setBounds(0, 0, 844, 456);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(144, 238, 144));
		panel_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(34, 139, 34)));
		panel_1.setBounds(228, 11, 441, 68);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MIRAE Travel&Transport");
		lblNewLabel.setForeground(new Color(85, 107, 47));
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 421, 46);
		panel_1.add(lblNewLabel);
		
		JLabel CompanyNameNewLabel_1 = new JLabel("COMPANY NAME          : MIRAE Travel&Transport");
		CompanyNameNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 15));
		CompanyNameNewLabel_1.setBounds(89, 202, 476, 37);
		panel.add(CompanyNameNewLabel_1);
		
		JLabel CompanyAddressNewLabel_1 = new JLabel("COMPANY ADDRESS    : No.06, Jalan Raja Udang, Pantai Cenang, Langkawi, Kedah");
		CompanyAddressNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 15));
		CompanyAddressNewLabel_1.setBounds(89, 229, 563, 31);
		panel.add(CompanyAddressNewLabel_1);
		
		JLabel CompanyPostCodeNewLabel_2 = new JLabel("POSTCODE                     : 07000");
		CompanyPostCodeNewLabel_2.setFont(new Font("Bell MT", Font.BOLD, 15));
		CompanyPostCodeNewLabel_2.setBounds(89, 253, 228, 31);
		panel.add(CompanyPostCodeNewLabel_2);
		
		JLabel LocationNewLabel_1 = new JLabel("LOCATION                      : Pantai Cenang, Langkawi");
		LocationNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 15));
		LocationNewLabel_1.setBounds(89, 280, 373, 22);
		panel.add(LocationNewLabel_1);
		
		JLabel TelephoneNumberNewLabel_1 = new JLabel("TELEPHONE NUMBER : 04-924 2944");
		TelephoneNumberNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 15));
		TelephoneNumberNewLabel_1.setBounds(89, 299, 333, 31);
		panel.add(TelephoneNumberNewLabel_1);
		
		JLabel FaxNumberNewLabel_1 = new JLabel("FAX NUMBER                 : 04-924 9244");
		FaxNumberNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 15));
		FaxNumberNewLabel_1.setBounds(89, 328, 272, 14);
		panel.add(FaxNumberNewLabel_1);
		
		JLabel lblNewLabel_1 = new JLabel("YOU CAN VISIT OUT WEBSITE AT WWW.MIRAETRAVEL.COM");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 15));
		lblNewLabel_1.setBounds(77, 360, 634, 37);
		panel.add(lblNewLabel_1);
		
		JButton AdminButton = new JButton("ADMIN");
		AdminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMenu AM = new AdminMenu();
				AM.setModalExclusionType(null);
	            AM.setVisible(true);
	            dispose(); 
			}
		});
		AdminButton.setFont(new Font("Bell MT", Font.BOLD, 18));
		AdminButton.setBackground(new Color(192, 192, 192));
		AdminButton.setBounds(10, 11, 117, 23);
		panel.add(AdminButton);
		
		JButton UserButton = new JButton("USER");
		UserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserMenu UM = new UserMenu();
				UM.setModalExclusionType(null);
	            UM.setVisible(true);
	            dispose(); 
			}
		});
		UserButton.setFont(new Font("Bell MT", Font.BOLD, 18));
		UserButton.setBackground(Color.LIGHT_GRAY);
		UserButton.setBounds(10, 45, 117, 23);
		panel.add(UserButton);
	}

}
