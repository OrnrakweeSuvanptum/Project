package restaurant;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.border.LineBorder;

public class LoginPswd extends JFrame {

	private JPanel contentPane;
	private JTextField pw;
	private JTextField un;
	private String s, s1,s2,s3,s4,s5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPswd frame = new LoginPswd();
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
	public LoginPswd() {
		setTitle("Log in");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 911, 776); //set for 0,0,1400,800
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		panel.setAlignmentY(1.0f);
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.setBackground(new Color(0, 191, 255));
		panel.setBounds(213, 60, 481, 625);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO CROWNE RESTAURANT");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 23));
		lblNewLabel_1.setBounds(27, 49, 429, 47);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 21));
		lblNewLabel_2.setBounds(43, 178, 105, 27);
		panel.add(lblNewLabel_2);
		
		un = new JTextField();
		un.setForeground(new Color(255, 255, 255));
		un.setBackground(new Color(0, 191, 255));
		un.setBorder(null);
		un.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		un.setBounds(43, 209, 390, 33);
		panel.add(un);
		un.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 21));
		lblNewLabel_2_1.setBounds(43, 275, 105, 27);
		panel.add(lblNewLabel_2_1);
		
		pw = new JTextField();
		pw.setForeground(new Color(255, 255, 255));
		pw.setBackground(new Color(0, 191, 255));
		pw.setBorder(null);
		pw.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		pw.setColumns(10);
		pw.setBounds(43, 301, 390, 33);
		panel.add(pw);
		
		JSeparator separator = new JSeparator();
		separator.setAlignmentX(Component.LEFT_ALIGNMENT);
		separator.setBackground(new Color(255, 255, 255));
		separator.setBounds(43, 246, 390, 19);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(43, 340, 390, 19);
		panel.add(separator_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              try {
					
					if(un.getText().equals("hazim") && pw.getText().equals("123")) {
						JOptionPane.showMessageDialog(null, "Login Succesful");
						dispose();
						Admin RegSys = new Admin(); //calling another frame/window
							RegSys.setModalExclusionType(null);
				            RegSys.setVisible(true);
					}else
						JOptionPane.showMessageDialog(null, "Please enter the right user name and pswd");
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user name and pswd");
				}
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		btnNewButton.setBounds(80, 426, 117, 33);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(0, 191, 255));
		btnReset.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				un.setText("");
				pw.setText("");
			}
		});
		btnReset.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		btnReset.setBounds(276, 426, 105, 33);
		panel.add(btnReset);
		
		JButton btnUser = new JButton("User");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reservation a = new reservation();
				a.setModalExclusionType(null);
	            a.setVisible(true);
			}
		});
		btnUser.setForeground(new Color(255, 255, 255));
		btnUser.setBackground(new Color(0, 191, 255));
		btnUser.setBorder(null);
		btnUser.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		btnUser.setBounds(177, 508, 105, 33);
		panel.add(btnUser);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(LoginPswd.class.getResource("/gui/imge/blue-background-gradient-geometric-shapes-pointer-abstract-40811-1920x1080.jpeg")));
		lblNewLabel.setBounds(0, 10, 898, 730);
		contentPane.add(lblNewLabel);
	}
}
