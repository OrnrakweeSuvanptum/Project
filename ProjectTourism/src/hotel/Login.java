package hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Login extends JFrame {
	
	private JFrame frame;
	private JTextField UsernameField;
	private JTextField PasswrdField;

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
		setBounds(100, 100, 872, 474);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 160, 122));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(205, 92, 92)));
		panel.setBounds(10, 11, 833, 63);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel.setBounds(365, 11, 122, 41);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 235, 205));
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_1.setBounds(10, 78, 833, 346);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME  :");
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		lblNewLabel_1.setBounds(191, 69, 198, 40);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD  :");
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		lblNewLabel_2.setBounds(191, 133, 139, 34);
		panel_1.add(lblNewLabel_2);
		
		UsernameField = new JTextField();
		UsernameField.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		UsernameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Username = "Nur Azimah";
				UsernameField.setText(Username);
			}
		});
		UsernameField.setBounds(353, 69, 223, 29);
		panel_1.add(UsernameField);
		UsernameField.setColumns(10);
		
		PasswrdField = new JTextField();
		PasswrdField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Password = "azimah123";
				PasswrdField.setText(Password);
			}
		});
		PasswrdField.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		PasswrdField.setColumns(10);
		PasswrdField.setBounds(353, 135, 223, 29);
		panel_1.add(PasswrdField);
		
		JButton ExitButton = new JButton("EXIT");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm ?", "Exit", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		ExitButton.setForeground(new Color(184, 134, 11));
		ExitButton.setFont(new Font("Bodoni MT", Font.BOLD, 19));
		ExitButton.setBackground(Color.WHITE);
		ExitButton.setBounds(450, 247, 125, 40);
		panel_1.add(ExitButton);
		
		JButton aboutButton = new JButton("about us");
		aboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventDescription frame = new EventDescription() ;
				frame.setVisible(true);
			}
		});
		aboutButton.setBounds(722, 312, 89, 23);
		panel_1.add(aboutButton);
		
		JButton LoginButton = new JButton("LOGIN");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					if(UsernameField.getText().equals("Nur Azimah") && PasswrdField.getText().equals("azimah123")) {
						//JOptionPane.showMessageDialog(null, "Login Succesful");
						
						//RegistrationSystem RegSys = new RegistrationSystem(); //calling another frame/window
							Home frame = new Home();
							frame.setModalExclusionType(null);
				            frame.setVisible(true);
				            dispose(); //login frame will disappear
					}else
						JOptionPane.showMessageDialog(null, "Please enter the right Username and Password");
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right Username and Password");
				}
			}
		});
		LoginButton.setForeground(new Color(184, 134, 11));
		LoginButton.setFont(new Font("Bodoni MT", Font.BOLD, 19));
		LoginButton.setBackground(Color.WHITE);
		LoginButton.setBounds(260, 247, 125, 40);
		panel_1.add(LoginButton);
	}
}
