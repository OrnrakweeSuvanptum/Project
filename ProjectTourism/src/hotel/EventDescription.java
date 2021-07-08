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

public class EventDescription extends JFrame {

	private JPanel contentPane;
	private JFrame frame ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventDescription frame = new EventDescription();
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
	public EventDescription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 160, 122));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(205, 92, 92)));
		panel.setBounds(10, 11, 840, 62);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EVENT DESCRIPTION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(246, 11, 455, 40);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 235, 205));
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_1.setBounds(10, 78, 840, 345);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("COMPANY NAME");
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 14));
		lblNewLabel_1.setBounds(118, 50, 131, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("POSTCODE");
		lblNewLabel_1_1.setFont(new Font("Sitka Subheading", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(118, 91, 131, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("LOCATION");
		lblNewLabel_1_2.setFont(new Font("Sitka Subheading", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(118, 126, 131, 30);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("TELEPHONE NO.");
		lblNewLabel_1_3.setFont(new Font("Sitka Subheading", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(118, 167, 131, 30);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("WEBSITE");
		lblNewLabel_1_4.setFont(new Font("Sitka Subheading", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(118, 208, 131, 30);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("RATING");
		lblNewLabel_1_5.setFont(new Font("Sitka Subheading", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(118, 258, 96, 30);
		panel_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_2 = new JLabel(":  TWILIGHT HOTEL");
		lblNewLabel_2.setFont(new Font("Footlight MT Light", Font.BOLD, 14));
		lblNewLabel_2.setBounds(277, 48, 517, 30);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel(":  NO16, MENTARI ROAD, PANTAI CHENANG LANGKAWI, KEDAH");
		lblNewLabel_2_1.setFont(new Font("Footlight MT Light", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(277, 90, 517, 30);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel(":  03-3287640");
		lblNewLabel_2_2.setFont(new Font("Footlight MT Light", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(277, 167, 517, 30);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel(":  07000");
		lblNewLabel_2_3.setFont(new Font("Footlight MT Light", Font.BOLD, 14));
		lblNewLabel_2_3.setBounds(277, 126, 517, 30);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel(":  www.twilighthotel.com.my");
		lblNewLabel_2_4.setFont(new Font("Footlight MT Light", Font.BOLD, 14));
		lblNewLabel_2_4.setBounds(277, 208, 517, 30);
		panel_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel(":  4.5 STAR");
		lblNewLabel_2_5.setFont(new Font("Footlight MT Light", Font.BOLD, 14));
		lblNewLabel_2_5.setBounds(277, 257, 517, 30);
		panel_1.add(lblNewLabel_2_5);
		
		JButton btnNewButton = new JButton("CANCEL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Bodoni MT", Font.BOLD, 15));
		btnNewButton.setBounds(662, 291, 104, 30);
		panel_1.add(btnNewButton);
	}

}
