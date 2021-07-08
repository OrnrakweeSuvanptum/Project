package hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 874, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(205, 92, 92)));
		panel.setBackground(new Color(255, 160, 122));
		panel.setBounds(10, 11, 838, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOME PAGE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(297, 11, 331, 42);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_1.setBackground(new Color(255, 235, 205));
		panel_1.setBounds(10, 80, 838, 355);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnGuest = new JButton("GUEST");
		btnGuest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration frame = new CustomerRegistration();
				frame.setVisible(true);
			}
		});
		btnGuest.setForeground(new Color(184, 134, 11));
		btnGuest.setFont(new Font("Bodoni MT", Font.BOLD, 19));
		btnGuest.setBackground(Color.WHITE);
		btnGuest.setBounds(243, 226, 125, 40);
		panel_1.add(btnGuest);
		
		JButton AdminButton = new JButton("ADMIN");
		AdminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setVisible(true);
			}
		});
		AdminButton.setForeground(new Color(184, 134, 11));
		AdminButton.setFont(new Font("Bodoni MT", Font.BOLD, 19));
		AdminButton.setBackground(Color.WHITE);
		AdminButton.setBounds(435, 226, 125, 40);
		panel_1.add(AdminButton);
		
		JLabel lblNewLabel_1 = new JLabel("TWILIGHT HOTEL");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		lblNewLabel_1.setBounds(273, 50, 383, 40);
		panel_1.add(lblNewLabel_1);
	}

}
