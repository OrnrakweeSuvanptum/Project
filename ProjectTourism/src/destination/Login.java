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

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Login extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldUserId;
	private JTextField textFieldEmail;
	private JTextField textFieldPassword;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 982, 582);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(165, 42, 42)));
		panel.setBackground(new Color(218, 165, 32));
		panel.setBounds(0, 0, 965, 545);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setBounds(73, 172, 160, 48);
		lblUserId.setFont(new Font("Times New Roman", Font.BOLD, 23));
		panel.add(lblUserId);
		
		JLabel lblemail = new JLabel("EMAIL");
		lblemail.setBounds(73, 310, 126, 48);
		lblemail.setFont(new Font("Times New Roman", Font.BOLD, 23));
		panel.add(lblemail);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(73, 240, 172, 48);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 23));
		panel.add(lblPassword);
		
		textFieldUserId = new JTextField();
		textFieldUserId.setBackground(new Color(255, 228, 196));
		textFieldUserId.setBounds(269, 182, 427, 29);
		textFieldUserId.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		textFieldUserId.setColumns(10);
		panel.add(textFieldUserId);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBackground(new Color(255, 228, 196));
		textFieldEmail.setBounds(269, 320, 427, 29);
		textFieldEmail.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		textFieldEmail.setColumns(10);
		panel.add(textFieldEmail);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setBackground(new Color(255, 228, 196));
		textFieldPassword.setBounds(269, 250, 427, 29);
		textFieldPassword.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		textFieldPassword.setColumns(10);
		panel.add(textFieldPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(690, 497, 98, 27);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(textFieldUserId.getText().equals("Ain Syazana") && textFieldEmail.getText().equals("ain@gmail.com") && textFieldPassword.getText().equals("ain12345")) { //Condition and action for success login
						JOptionPane.showMessageDialog(null, "Login Succesful");
						
							EmployeeManage a = new EmployeeManage();     //Button Login connect to Employee Manage
							a.setModalExclusionType(null);
				            a.setVisible(true);
				            dispose(); //login frame will disappear
					}else  //Action for failed login
						JOptionPane.showMessageDialog(null, "Login Failed! Please enter the right user id and password");
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user id and password");
				}
			}
		});
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnLogin.setBackground(SystemColor.activeCaption);
		panel.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(808, 497, 98, 26);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();  //Action for Exit Button
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Login", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.setBackground(SystemColor.activeCaption);
		panel.add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(375, 31, 276, 69);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_1.setBackground(new Color(218, 165, 32));
		panel.add(panel_1);
		
		JLabel lblLogin = new JLabel(" LOGIN");
		lblLogin.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\login.png"));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblLogin.setBounds(22, 10, 227, 47);
		panel_1.add(lblLogin);
	}
}