package hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Package extends JFrame {

	private JPanel contentPane;
	private JFrame frame ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Package frame = new Package();
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
	public Package() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 160, 122));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(205, 92, 92)));
		panel.setBounds(10, 11, 723, 66);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PREVIEW PACKAGE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(217, 11, 378, 44);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 235, 205));
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_1.setBounds(10, 80, 242, 310);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("GRAND SUITE");
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(75, 11, 121, 22);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Requirement :");
		lblNewLabel_2.setFont(new Font("Modern No. 20", Font.ITALIC, 13));
		lblNewLabel_2.setBounds(26, 52, 83, 27);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("# Meal for Breakfast, Lunch, Dinner");
		lblNewLabel_3.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		lblNewLabel_3.setBounds(26, 90, 206, 27);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("# Free For Baucher SPA, Wifi");
		lblNewLabel_3_1.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(26, 121, 206, 27);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("# Unlimited Pool, Gym");
		lblNewLabel_3_2.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(26, 149, 206, 27);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("# Free Netflix");
		lblNewLabel_3_3.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		lblNewLabel_3_3.setBounds(26, 176, 206, 27);
		panel_1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("# 4 King Bed | 2 Queen Bed");
		lblNewLabel_3_4.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		lblNewLabel_3_4.setBounds(26, 209, 206, 27);
		panel_1.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_4 = new JLabel("RM3500.00");
		lblNewLabel_4.setBackground(new Color(245, 245, 245));
		lblNewLabel_4.setForeground(new Color(219, 112, 147));
		lblNewLabel_4.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 12));
		lblNewLabel_4.setBounds(75, 257, 83, 22);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_1_1.setBackground(new Color(255, 235, 205));
		panel_1_1.setBounds(250, 80, 242, 310);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("GRAND DELUXE");
		lblNewLabel_1_1.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(75, 11, 121, 22);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Requirement :");
		lblNewLabel_2_1.setFont(new Font("Modern No. 20", Font.ITALIC, 13));
		lblNewLabel_2_1.setBounds(34, 53, 83, 27);
		panel_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_5 = new JLabel("# Meal for Breakfast, Lunch, Dinner");
		lblNewLabel_3_5.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		lblNewLabel_3_5.setBounds(26, 89, 206, 27);
		panel_1_1.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("# Unlimited Pool, Gym");
		lblNewLabel_3_2_1.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		lblNewLabel_3_2_1.setBounds(26, 118, 206, 27);
		panel_1_1.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("# Free Wifi");
		lblNewLabel_3_1_1.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		lblNewLabel_3_1_1.setBounds(26, 144, 206, 27);
		panel_1_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("# 2 King Bed | 2 Queen Bed");
		lblNewLabel_3_4_1.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		lblNewLabel_3_4_1.setBounds(26, 173, 206, 27);
		panel_1_1.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("RM2000.00");
		lblNewLabel_4_1.setForeground(new Color(219, 112, 147));
		lblNewLabel_4_1.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 12));
		lblNewLabel_4_1.setBackground(new Color(245, 245, 245));
		lblNewLabel_4_1.setBounds(55, 252, 83, 22);
		panel_1_1.add(lblNewLabel_4_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_1_2.setBackground(new Color(255, 235, 205));
		panel_1_2.setBounds(491, 80, 242, 310);
		contentPane.add(panel_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("STANDARD ROOM");
		lblNewLabel_1_2.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(72, 11, 121, 22);
		panel_1_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Requirement :");
		lblNewLabel_2_2.setFont(new Font("Modern No. 20", Font.ITALIC, 13));
		lblNewLabel_2_2.setBounds(34, 53, 83, 27);
		panel_1_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("# Meal for Breakfast, Lunch, Dinner");
		lblNewLabel_3_5_1.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		lblNewLabel_3_5_1.setBounds(26, 83, 206, 27);
		panel_1_2.add(lblNewLabel_3_5_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("# Free Wifi");
		lblNewLabel_3_1_1_1.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		lblNewLabel_3_1_1_1.setBounds(26, 115, 206, 27);
		panel_1_2.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_4_1_1 = new JLabel("# 2 Queen Bed | 2 Standard Bed");
		lblNewLabel_3_4_1_1.setFont(new Font("Myanmar Text", Font.BOLD, 12));
		lblNewLabel_3_4_1_1.setBounds(26, 142, 206, 27);
		panel_1_2.add(lblNewLabel_3_4_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("RM1000.00");
		lblNewLabel_4_1_1.setForeground(new Color(219, 112, 147));
		lblNewLabel_4_1_1.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 12));
		lblNewLabel_4_1_1.setBackground(new Color(245, 245, 245));
		lblNewLabel_4_1_1.setBounds(72, 248, 83, 22);
		panel_1_2.add(lblNewLabel_4_1_1);
		
		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration frame = new CustomerRegistration();
				frame.setVisible(true);
			}
		});
		BackButton.setBounds(143, 276, 89, 23);
		panel_1_2.add(BackButton);
	}

}
