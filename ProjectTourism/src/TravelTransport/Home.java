package TravelTransport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Home extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(152, 251, 152));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(34, 139, 34)));
		panel.setBounds(0, 0, 818, 470);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 798, 65);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(34, 139, 34)));
		panel_1.setBackground(new Color(152, 251, 152));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel HomeNewLabel = new JLabel("HOME");
		HomeNewLabel.setForeground(new Color(0, 128, 0));
		HomeNewLabel.setFont(new Font("Bell MT", Font.BOLD, 30));
		HomeNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		HomeNewLabel.setBounds(300, 11, 161, 43);
		panel_1.add(HomeNewLabel);
		
		JButton AdminButton = new JButton("ADMIN");
		AdminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginUser LU = new LoginUser();
				LU.setModalExclusionType(null);
				LU.setVisible(true);
			}
		});
		AdminButton.setFont(new Font("Bell MT", Font.BOLD, 20));
		AdminButton.setBackground(new Color(192, 192, 192));
		AdminButton.setBounds(222, 197, 119, 44);
		panel.add(AdminButton);
		
		JButton UserButton = new JButton("USER");
		UserButton.setBackground(new Color(192, 192, 192));
		UserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserMenu UM = new UserMenu();
				UM.setModalExclusionType(null);
	            UM.setVisible(true);
	            dispose(); 
			}
		});
		UserButton.setFont(new Font("Bell MT", Font.BOLD, 20));
		UserButton.setBounds(459, 197, 119, 44);
		panel.add(UserButton);
		
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
		ExitButton.setFont(new Font("Bell MT", Font.BOLD, 25));
		ExitButton.setBackground(new Color(192, 192, 192));
		ExitButton.setBounds(329, 268, 147, 65);
		panel.add(ExitButton);
		
		JLabel NewLabel = new JLabel("MIRAE TRAVEL&TRANSPORT");
		NewLabel.setForeground(new Color(0, 128, 0));
		NewLabel.setFont(new Font("Bell MT", Font.BOLD, 30));
		NewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NewLabel.setBounds(176, 135, 447, 35);
		panel.add(NewLabel);
	}
}
