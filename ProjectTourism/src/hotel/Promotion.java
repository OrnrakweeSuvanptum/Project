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
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Promotion extends JFrame {

	private JPanel contentPane;
	private JFrame frame ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Promotion frame = new Promotion();
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
	public Promotion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 160, 122));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(205, 92, 92)));
		panel.setBounds(10, 11, 839, 61);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PROMOTION SECTION");
		lblNewLabel.setBounds(238, 11, 391, 39);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 235, 205));
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(205, 92, 92)));
		panel_1.setBounds(10, 78, 839, 345);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PROMOTION 50%");
		lblNewLabel_1.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(272, 61, 356, 43);
		panel_1.add(lblNewLabel_1);
		
		JRadioButton AcceptrdbtnNewRadioButton = new JRadioButton("ACCEPT");
		AcceptrdbtnNewRadioButton.setBackground(new Color(255, 165, 0));
		AcceptrdbtnNewRadioButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		AcceptrdbtnNewRadioButton.setBounds(241, 168, 109, 23);
		panel_1.add(AcceptrdbtnNewRadioButton);
		
		JRadioButton RejectrdbtnNewRadioButton = new JRadioButton("REJECT");
		RejectrdbtnNewRadioButton.setBackground(new Color(255, 165, 0));
		RejectrdbtnNewRadioButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		RejectrdbtnNewRadioButton.setBounds(397, 168, 109, 23);
		panel_1.add(RejectrdbtnNewRadioButton);
		
		JButton ExitButton = new JButton("EXIT");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
			}
		});
		ExitButton.setFont(new Font("Bodoni MT", Font.BOLD, 14));
		ExitButton.setBounds(702, 293, 89, 23);
		panel_1.add(ExitButton);
	}

}
