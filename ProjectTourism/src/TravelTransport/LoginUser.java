package TravelTransport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class LoginUser extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField UsernametextField;
	private JTextField PasswordtextField;
	private JButton LogoutButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUser frame = new LoginUser();
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
	public LoginUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 275);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(34, 139, 34)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel UsernameLabel = new JLabel("USERNAME");
		UsernameLabel.setFont(new Font("Bell MT", Font.BOLD, 14));
		UsernameLabel.setForeground(new Color(0, 0, 0));
		UsernameLabel.setBounds(33, 37, 87, 26);
		contentPane.add(UsernameLabel);
		
		JLabel PasswordLabel = new JLabel("PASSWORD");
		PasswordLabel.setFont(new Font("Bell MT", Font.BOLD, 14));
		PasswordLabel.setBounds(33, 74, 87, 26);
		contentPane.add(PasswordLabel);
		
		UsernametextField = new JTextField();
		UsernametextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = "Mirae";
				UsernametextField.setText(userName);
			}
		});
		UsernametextField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		UsernametextField.setBounds(150, 40, 138, 20);
		contentPane.add(UsernametextField);
		UsernametextField.setColumns(10);
		
		PasswordtextField = new JTextField();
		PasswordtextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userPswd = "mirae01";
				PasswordtextField.setText(userPswd);
			}
		});
		PasswordtextField.setFont(new Font("Bell MT", Font.PLAIN, 12));
		PasswordtextField.setBounds(150, 77, 138, 20);
		contentPane.add(PasswordtextField);
		PasswordtextField.setColumns(10);
		
		JButton LoginButton = new JButton("LOGIN");
		LoginButton.setBackground(new Color(192, 192, 192));
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	try {
					
					if(UsernametextField.getText().equals("Mirae") && PasswordtextField.getText().equals("mirae01")) {
						
							AdminMenu AM = new AdminMenu();
							AM.setModalExclusionType(null);
				            AM.setVisible(true);
				            dispose(); 
					}else
						JOptionPane.showMessageDialog(null, "Please enter the right user name and password");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user name and password");
				}
			}
		});
		
		LoginButton.setForeground(new Color(34, 139, 34));
		LoginButton.setFont(new Font("Bell MT", Font.BOLD, 14));
		LoginButton.setBounds(106, 136, 89, 23);
		contentPane.add(LoginButton);
		
		LogoutButton = new JButton("LOGOUT");
		LogoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Home H = new Home();
				H.setModalExclusionType(null);
				H.setVisible(true);
			}
		});
		LogoutButton.setBackground(new Color(192, 192, 192));
		LogoutButton.setForeground(new Color(34, 139, 34));
		LogoutButton.setFont(new Font("Bell MT", Font.BOLD, 14));
		LogoutButton.setBounds(219, 136, 115, 23);
		contentPane.add(LogoutButton);
	}
}
