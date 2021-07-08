package destination;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.SystemColor;

public class Packages extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Packages frame = new Packages();
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
	public Packages() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1087, 684);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(165, 42, 42)));
		panel.setBackground(new Color(218, 165, 32));
		panel.setBounds(0, 0, 1073, 647);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(189, 183, 107));
		panel_1.setBounds(41, 50, 465, 530);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" LIST OF DESTINATION PACKAGES ");
		lblNewLabel.setBounds(10, 10, 428, 45);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\mark.png"));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(45, 124, 265, 96);
		panel_1.add(panel_2);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_2.setBackground(new Color(218, 165, 32));
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PACKAGE 1");
		lblNewLabel_1.setBackground(SystemColor.desktop);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 11, 73, 75);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1. Natural Areas");
		lblNewLabel_2.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(93, 15, 251, 23);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Maisson Eatery Buffet");
		lblNewLabel_3.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(93, 34, 138, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ticket (RM 20) , 3 Hrs");
		lblNewLabel_4.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(93, 48, 282, 14);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RM 95");
		lblNewLabel_5.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(93, 65, 73, 14);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(167, 270, 257, 96);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_2_1.setBackground(new Color(218, 165, 32));
		
		JLabel lblNewLabel_1_1 = new JLabel("PACKAGE 2");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 11, 73, 75);
		panel_2_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("2. Beach Areas");
		lblNewLabel_2_1.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(93, 16, 127, 23);
		panel_2_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Edison Beachfront Cafe");
		lblNewLabel_3_1.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(93, 34, 163, 14);
		panel_2_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Ticket (RM 15) , 3 Hrs");
		lblNewLabel_4_1.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(93, 49, 163, 14);
		panel_2_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("RM 145");
		lblNewLabel_5_1.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_5_1.setBounds(93, 65, 99, 14);
		panel_2_1.add(lblNewLabel_5_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBounds(45, 413, 295, 96);
		panel_1.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_2_1_1.setBackground(new Color(218, 165, 32));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PACKAGE 3");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(10, 11, 73, 86);
		panel_2_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("3. Towns and Cities");
		lblNewLabel_2_1_1.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(93, 15, 145, 24);
		panel_2_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Etienna Hotel and Residences");
		lblNewLabel_3_1_1.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(93, 34, 194, 14);
		panel_2_1_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Ticket (RM 10) , 3D2N");
		lblNewLabel_4_1_1.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_4_1_1.setBounds(93, 49, 150, 14);
		panel_2_1_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("RM 295");
		lblNewLabel_5_1_1.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_5_1_1.setBounds(93, 65, 117, 14);
		panel_2_1_1.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBackground(SystemColor.desktop);
		lblNewLabel_8.setBounds(0, 0, 465, 530);
		panel_1.add(lblNewLabel_8);
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\home2.jpg"));
		
		JButton BackButton = new JButton("BACK");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration CR = new CustomerRegistration();
				CR.setModalExclusionType(null);
	            CR.setVisible(true);
	            dispose(); 
			}
		});
		BackButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BackButton.setBackground(SystemColor.activeCaption);
		BackButton.setBounds(493, 590, 89, 30);
		panel.add(BackButton);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_1_1.setBackground(new Color(189, 183, 107));
		panel_1_1.setBounds(569, 50, 465, 530);
		panel.add(panel_1_1);
		
		JLabel lblListOfCar = new JLabel(" LIST OF CAR PACKAGES");
		lblListOfCar.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\mark.png"));
		lblListOfCar.setHorizontalAlignment(SwingConstants.CENTER);
		lblListOfCar.setForeground(new Color(0, 0, 0));
		lblListOfCar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblListOfCar.setBounds(59, 10, 359, 45);
		panel_1_1.add(lblListOfCar);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(43, 131, 218, 96);
		panel_1_1.add(panel_2_2);
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_2_2.setBackground(new Color(218, 165, 32));
		
		JLabel lblNewLabel_1_2 = new JLabel("PACKAGE 1");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(10, 11, 73, 68);
		panel_2_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("4 Seater Car");
		lblNewLabel_2_2.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(93, 19, 122, 23);
		panel_2_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("RM 50");
		lblNewLabel_3_2.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(93, 52, 82, 14);
		panel_2_2.add(lblNewLabel_3_2);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBounds(209, 266, 212, 96);
		panel_1_1.add(panel_2_1_2);
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_2_1_2.setBackground(new Color(218, 165, 32));
		
		JLabel lblNewLabel_1_1_2 = new JLabel("PACKAGE 2");
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(10, 11, 73, 68);
		panel_2_1_2.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("6 Seater Car");
		lblNewLabel_2_1_2.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_2_1_2.setBounds(93, 15, 130, 23);
		panel_2_1_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("RM 100");
		lblNewLabel_4_1_2.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_4_1_2.setBounds(93, 49, 73, 14);
		panel_2_1_2.add(lblNewLabel_4_1_2);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBounds(43, 408, 191, 96);
		panel_1_1.add(panel_2_1_1_1);
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(165, 42, 42)));
		panel_2_1_1_1.setBackground(new Color(218, 165, 32));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("PACKAGE 3");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(10, 11, 73, 86);
		panel_2_1_1_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Motobike");
		lblNewLabel_2_1_1_1.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_2_1_1_1.setBounds(93, 25, 94, 23);
		panel_2_1_1_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("RM 30");
		lblNewLabel_4_1_1_1.setFont(new Font("Bell MT", Font.PLAIN, 14));
		lblNewLabel_4_1_1_1.setBounds(93, 58, 88, 14);
		panel_2_1_1_1.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBackground(SystemColor.desktop);
		lblNewLabel_7.setBounds(0, 0, 465, 530);
		panel_1_1.add(lblNewLabel_7);
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\picture.jpg"));
	}

}