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

public class AdminMenu extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu frame = new AdminMenu();
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
	public AdminMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(34, 139, 34)));
		panel.setBackground(new Color(152, 251, 152));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(34, 139, 34)));
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBounds(10, 11, 798, 65);
		panel.add(panel_1);
		
		JLabel AdminMenuLabel = new JLabel("ADMIN MENU");
		AdminMenuLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AdminMenuLabel.setForeground(new Color(0, 128, 0));
		AdminMenuLabel.setFont(new Font("Bell MT", Font.BOLD, 30));
		AdminMenuLabel.setBounds(284, 11, 226, 43);
		panel_1.add(AdminMenuLabel);
		
		JButton CompanyBackgroundButton = new JButton("COMPANY BACKGROUND");
		CompanyBackgroundButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground CB = new CompanyBackground();
				CB.setModalExclusionType(null);
	            CB.setVisible(true);
	            dispose(); 
			}
		});
		CompanyBackgroundButton.setFont(new Font("Bell MT", Font.BOLD, 20));
		CompanyBackgroundButton.setBackground(new Color(192, 192, 192));
		CompanyBackgroundButton.setBounds(225, 198, 358, 44);
		panel.add(CompanyBackgroundButton);
		
		JButton EmployeeButton = new JButton("EMPLOYEE");
		EmployeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee EM = new Employee();
				EM.setModalExclusionType(null);
	            EM.setVisible(true);
	            dispose(); 
			}
		});
		EmployeeButton.setBackground(new Color(192, 192, 192));
		EmployeeButton.setFont(new Font("Bell MT", Font.BOLD, 20));
		EmployeeButton.setBounds(310, 280, 188, 44);
		panel.add(EmployeeButton);
		
		JButton ExitButton = new JButton("BACK");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home H = new Home();
				H.setModalExclusionType(null);
	            H.setVisible(true);
	            dispose(); 
			}
		});
		ExitButton.setFont(new Font("Bell MT", Font.BOLD, 25));
		ExitButton.setBackground(new Color(192, 192, 192));
		ExitButton.setBounds(330, 381, 147, 65);
		panel.add(ExitButton);
		
		JLabel NewLabel = new JLabel("MIRAE TRAVEL&TRANSPORT");
		NewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NewLabel.setForeground(new Color(0, 128, 0));
		NewLabel.setFont(new Font("Bell MT", Font.BOLD, 30));
		NewLabel.setBounds(176, 135, 447, 35);
		panel.add(NewLabel);
	}

}
