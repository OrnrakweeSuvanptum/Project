package TourismBusinessCompany;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField UsernameField;
	private JTextField PasswordField;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setType(Type.UTILITY);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new LineBorder(new Color(47, 79, 79), 7), null));
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(0, 0, 500, 551);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel UsernameLabel = new JLabel("USERNAME");
		UsernameLabel.setFont(new Font("Courier New", Font.BOLD, 25));
		UsernameLabel.setBounds(72, 100, 123, 35);
		panel.add(UsernameLabel);
		
		JLabel PasswordLabel = new JLabel("PASSWORD");
		PasswordLabel.setFont(new Font("Courier New", Font.BOLD, 25));
		PasswordLabel.setBounds(72, 170, 136, 43);
		panel.add(PasswordLabel);
		
		UsernameField = new JTextField();
		UsernameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = "WEE TOURISM ENTERPRISE";
				UsernameField.setText(username);
			}
		});
		UsernameField.setFont(new Font("Courier New", Font.PLAIN, 15));
		UsernameField.setHorizontalAlignment(SwingConstants.CENTER);
		UsernameField.setBounds(269, 102, 130, 28);
		panel.add(UsernameField);
		UsernameField.setColumns(10);
		
		PasswordField = new JTextField();
		PasswordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = "Wee0511";
				PasswordField.setText(password);
			}
		});
		PasswordField.setHorizontalAlignment(SwingConstants.CENTER);
		PasswordField.setFont(new Font("Courier New", Font.PLAIN, 15));
		PasswordField.setColumns(10);
		PasswordField.setBounds(269, 172, 130, 28);
		panel.add(PasswordField);
		
		JButton LoginButton = new JButton("LOGIN");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(UsernameField.getText().equals("WEE TOURISM ENTERPRISE") && PasswordField.getText().equals("Wee0511")) {
						JOptionPane.showMessageDialog(null, "Login Succesful");
						
						dispose();
						Admin adm = new Admin();
						adm.setModalExclusionType(null);
						adm.setVisible(true);
						
					}else 
						JOptionPane.showMessageDialog(null, "Please enter the right username and password");
					
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right username and password");
				}
			}
		});
		LoginButton.setBackground(new Color(0, 206, 209));
		LoginButton.setFont(new Font("Courier New", Font.BOLD, 20));
		LoginButton.setBounds(91, 325, 117, 35);
		panel.add(LoginButton);
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					UsernameField.setText("");
					PasswordField.setText("");
				
			}
		});
		ResetButton.setFont(new Font("Courier New", Font.BOLD, 20));
		ResetButton.setBackground(new Color(0, 206, 209));
		ResetButton.setBounds(269, 325, 117, 35);
		panel.add(ResetButton);
		
		JLabel LoginIcon = new JLabel("");
		LoginIcon.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Documents\\A202\\STIA1123 A202 (PROGRAMMING)\\Login-icon.png"));
		LoginIcon.setBounds(46, 110, 16, 14);
		panel.add(LoginIcon);
		
		JLabel KeyLoginIcon = new JLabel("");
		KeyLoginIcon.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Documents\\A202\\STIA1123 A202 (PROGRAMMING)\\key-login-icon.png"));
		KeyLoginIcon.setBounds(42, 179, 49, 24);
		panel.add(KeyLoginIcon);
		
		JButton HomeButton = new JButton("HOME");
		HomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				HomePage HP = new HomePage();
				HP.setModalExclusionType(null);
				HP.setVisible(true);
			}
		});
		HomeButton.setIcon(null);
		HomeButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		HomeButton.setBounds(399, 7, 94, 23);
		panel.add(HomeButton);
	}
}
