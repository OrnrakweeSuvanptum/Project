package TravelTransport;

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

public class TypeOfPackages extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TypeOfPackages frame = new TypeOfPackages();
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
	public TypeOfPackages() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(34, 139, 34)));
		panel.setBackground(new Color(152, 251, 152));
		panel.setBounds(0, 0, 815, 467);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(34, 139, 34)));
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBounds(10, 11, 795, 65);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TYPES OF PACKAGES");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 30));
		lblNewLabel.setBounds(147, 11, 465, 56);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(34, 139, 34)));
		panel_2.setBackground(new Color(152, 251, 152));
		panel_2.setBounds(10, 87, 795, 96);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PACKAGE 1");
		lblNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 11, 73, 23);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("One ferry ticket (ROUND TRIP) to Pulau Langkawi.\r\n");
		lblNewLabel_2.setFont(new Font("Bell MT", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(93, 15, 251, 23);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("One vehicle for 3 days 2 nights and you can choose either car or motorcycle with full fuel in tank. ");
		lblNewLabel_3.setFont(new Font("Bell MT", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(93, 34, 456, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("One boat ticket (ROUND TRIP) to Tasik Dayang Bunting. ");
		lblNewLabel_4.setFont(new Font("Bell MT", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(93, 49, 282, 14);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("One ticket to ride Langkawi Skybridge Cable Car. ");
		lblNewLabel_5.setFont(new Font("Bell MT", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(93, 65, 266, 14);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(34, 139, 34)));
		panel_2_1.setBackground(new Color(152, 251, 152));
		panel_2_1.setBounds(10, 194, 795, 96);
		panel.add(panel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PACKAGE 2");
		lblNewLabel_1_1.setFont(new Font("Bell MT", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 11, 73, 23);
		panel_2_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Two ferry ticket (ROUND TRIP) to Pulau Langkawi.\r\n");
		lblNewLabel_2_1.setFont(new Font("Bell MT", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(93, 15, 251, 23);
		panel_2_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("One vehicle for 3 days 2 nights and you can choose either car or motorcycle with full fuel in tank. ");
		lblNewLabel_3_1.setFont(new Font("Bell MT", Font.PLAIN, 11));
		lblNewLabel_3_1.setBounds(93, 34, 456, 14);
		panel_2_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Two boat ticket (ROUND TRIP) to Tasik Dayang Bunting. ");
		lblNewLabel_4_1.setFont(new Font("Bell MT", Font.PLAIN, 11));
		lblNewLabel_4_1.setBounds(93, 49, 282, 14);
		panel_2_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Two ticket to ride Langkawi Skybridge Cable Car. ");
		lblNewLabel_5_1.setFont(new Font("Bell MT", Font.PLAIN, 11));
		lblNewLabel_5_1.setBounds(93, 65, 266, 14);
		panel_2_1.add(lblNewLabel_5_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(34, 139, 34)));
		panel_2_1_1.setBackground(new Color(152, 251, 152));
		panel_2_1_1.setBounds(10, 301, 795, 114);
		panel.add(panel_2_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PACKAGE 3");
		lblNewLabel_1_1_1.setFont(new Font("Bell MT", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(10, 11, 73, 23);
		panel_2_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Six ferry ticket (ROUND TRIP) to Pulau Langkawi.\r\n");
		lblNewLabel_2_1_1.setFont(new Font("Bell MT", Font.PLAIN, 11));
		lblNewLabel_2_1_1.setBounds(93, 15, 266, 23);
		panel_2_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("One vehicle for 3 days 2 nights and you can choose either car(standard/mpv) or van with full fuel in tank.");
		lblNewLabel_3_1_1.setFont(new Font("Bell MT", Font.PLAIN, 11));
		lblNewLabel_3_1_1.setBounds(93, 34, 498, 14);
		panel_2_1_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Six boat ticket (ROUND TRIP) to Tasik Dayang Bunting. ");
		lblNewLabel_4_1_1.setFont(new Font("Bell MT", Font.PLAIN, 11));
		lblNewLabel_4_1_1.setBounds(93, 49, 301, 14);
		panel_2_1_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Six ticket to ride Langkawi Skybridge Cable Car. ");
		lblNewLabel_5_1_1.setFont(new Font("Bell MT", Font.PLAIN, 11));
		lblNewLabel_5_1_1.setBounds(93, 65, 266, 14);
		panel_2_1_1.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("Six ticket to experience Mangrove Forest Kayaking Tour.");
		lblNewLabel_6.setFont(new Font("Bell MT", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(93, 83, 279, 14);
		panel_2_1_1.add(lblNewLabel_6);
		
		JButton BackButton = new JButton("BACK");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration CR = new CustomerRegistration();
				CR.setModalExclusionType(null);
	            CR.setVisible(true);
	            dispose(); 
			}
		});
		BackButton.setFont(new Font("Bell MT", Font.BOLD, 20));
		BackButton.setBackground(new Color(192, 192, 192));
		BackButton.setBounds(340, 426, 89, 30);
		panel.add(BackButton);
	}

}
