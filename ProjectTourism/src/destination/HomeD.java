package destination;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class HomeD extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeD frame = new HomeD();
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
	public HomeD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 987, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(165, 42, 42)));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 973, 552);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHome = new JLabel("WELCOME TO DESTINATION SERVICES");
		lblHome.setBounds(82, 62, 811, 46);
		lblHome.setForeground(new Color(255, 255, 255));
		lblHome.setBackground(new Color(255, 255, 255));
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setFont(new Font("Rockwell", Font.BOLD, 40));
		panel.add(lblHome);
		
		JButton btnAdmin = new JButton(" Employee");
		btnAdmin.setBounds(547, 320, 245, 46);
		btnAdmin.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\admin.png"));
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login a = new Login();		//Button Employee connect to Login menu
				a.setVisible(true);
				dispose();
			}
		});
		btnAdmin.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnAdmin.setBackground(new Color(255, 248, 220));
		panel.add(btnAdmin);
		
		JButton btnCustomer = new JButton(" Customer");
		btnCustomer.setBounds(170, 320, 245, 46);
		btnCustomer.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\customer.png"));
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration a = new CustomerRegistration();		//Button Customer connect to Customer Registration
				a.setVisible(true);
				dispose();
			}
		});
		btnCustomer.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnCustomer.setBackground(new Color(255, 248, 220));
		panel.add(btnCustomer);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(404, 441, 183, 40);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();		//Exit button
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Home", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnExit.setBackground(new Color(255, 248, 220));
		panel.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 287, 953, 255);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\home1.jpg"));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 27, 953, 265);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\home2.jpg"));
		panel.add(lblNewLabel_1);
		
		JButton btnAbout = new JButton("About Us");
		btnExit.setBounds(404, 441, 183, 46);
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Company a = new Company();		//Button About connect to Company
				a.setVisible(true);
				dispose();
			}
		});
		btnAbout.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAbout.setBackground(SystemColor.activeCaption);
		btnAbout.setBounds(861, 10, 102, 17);
		panel.add(btnAbout);
		
		JButton btnOurPackage = new JButton("Our Packages");
		btnOurPackage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Packages UM = new Packages();
				UM.setModalExclusionType(null);
	            UM.setVisible(true);
	            dispose(); 
			}
		});
		btnOurPackage.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnOurPackage.setBackground(SystemColor.activeCaption);
		btnOurPackage.setBounds(728, 10, 133, 17);
		panel.add(btnOurPackage);
	}
}