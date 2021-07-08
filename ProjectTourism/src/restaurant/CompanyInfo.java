package restaurant;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.k33ptoo.components.KGradientPanel;

import TravelTransport.Home;

import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CompanyInfo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyInfo frame = new CompanyInfo();
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
	public CompanyInfo() {
		setTitle("Company Info");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 519, 718);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 105, 180));
		panel_2.setBounds(0, 0, 519, 718);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(61, 20, 399, 86);
		panel_2.add(panel_1);
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Company Info");
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 25));
		lblNewLabel.setBounds(51, 10, 303, 66);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Company Name : Crowne Restaurant\r\n");
		lblNewLabel_1.setBounds(61, 130, 405, 27);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		
		JLabel lblNewLabel_1_1 = new JLabel("Telephone Number : 0175882774");
		lblNewLabel_1_1.setBounds(61, 163, 405, 27);
		panel_2.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setToolTipText("f");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Location : Pantai Cenang, 34563 Langkawi\r\n");
		lblNewLabel_1_1_1.setBounds(61, 200, 405, 27);
		panel_2.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setToolTipText("f");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Company No : 34238-A\r\n");
		lblNewLabel_1_1_1_1.setBounds(61, 229, 405, 27);
		panel_2.add(lblNewLabel_1_1_1_1);
		lblNewLabel_1_1_1_1.setToolTipText("f");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Web Site : www.CrowneRestaurantHotel.com\r\n");
		lblNewLabel_1_1_1_1_1.setBounds(61, 266, 405, 27);
		panel_2.add(lblNewLabel_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1.setToolTipText("f");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Email : CRLangkawi09@gmail.com\r\n");
		lblNewLabel_1_1_1_1_2.setBounds(61, 299, 405, 27);
		panel_2.add(lblNewLabel_1_1_1_1_2);
		lblNewLabel_1_1_1_1_2.setToolTipText("f");
		lblNewLabel_1_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(61, 336, 399, 63);
		panel_2.add(panel_1_1);
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_1_1.setBackground(new Color(224, 255, 255));
		
		JLabel lblMission = new JLabel("Mission");
		lblMission.setHorizontalAlignment(SwingConstants.CENTER);
		lblMission.setForeground(new Color(0, 191, 255));
		lblMission.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 25));
		lblMission.setBounds(51, 10, 303, 43);
		panel_1_1.add(lblMission);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("1.To serve high quality food");
		lblNewLabel_1_1_1_1_2_1.setBounds(61, 419, 405, 27);
		panel_2.add(lblNewLabel_1_1_1_1_2_1);
		lblNewLabel_1_1_1_1_2_1.setToolTipText("f");
		lblNewLabel_1_1_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		
		JLabel lblNewLabel_1_1_1_1_2_2 = new JLabel("2.To maintain a clean and comfortable\r\n");
		lblNewLabel_1_1_1_1_2_2.setBounds(61, 457, 405, 27);
		panel_2.add(lblNewLabel_1_1_1_1_2_2);
		lblNewLabel_1_1_1_1_2_2.setToolTipText("f");
		lblNewLabel_1_1_1_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_2_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(61, 505, 399, 63);
		panel_2.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 191, 255)));
		panel_1_1_1.setBackground(new Color(224, 255, 255));
		
		JLabel lblVision = new JLabel("Vision");
		lblVision.setHorizontalAlignment(SwingConstants.CENTER);
		lblVision.setForeground(new Color(0, 191, 255));
		lblVision.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 25));
		lblVision.setBounds(51, 10, 303, 43);
		panel_1_1_1.add(lblVision);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1 = new JLabel("To be the best restaurant service in the country");
		lblNewLabel_1_1_1_1_2_1_1.setBounds(61, 596, 405, 27);
		panel_2.add(lblNewLabel_1_1_1_1_2_1_1);
		lblNewLabel_1_1_1_1_2_1_1.setToolTipText("f");
		lblNewLabel_1_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_2_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Admin a = new Admin();
				a.setModalExclusionType(null);
	            a.setVisible(true);
	            dispose(); 
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(CompanyInfo.class.getResource("/gui/imge/icons8-back-50.png")));
		lblNewLabel_2.setBounds(0, 10, 47, 60);
		panel_2.add(lblNewLabel_2);
	}
}
