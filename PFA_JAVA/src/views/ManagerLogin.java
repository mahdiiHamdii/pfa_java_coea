package views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import services.Consts;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerLogin {

	private JFrame frame;
	private JTextField managerUsernameT;
	private JTextField managerPasswordT;
	private JTextField managerCodeT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerLogin window = new ManagerLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManagerLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 230, 140));
		frame.setBounds(Consts.x, Consts.y, Consts.z, Consts.w);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.decode("#EF4F4F"));
		panel.setBounds(0, 0, 924, 587);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(36, 30, 865, 534);
		panel.add(panel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ManagerLogin.class.getResource("/images/ManagerLogin.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(385, 36, 470, 446);
		panel_1.add(label);
		
		JLabel lblHelloManager = new JLabel("Welcome Chef ");
		lblHelloManager.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelloManager.setForeground(Color.BLACK);
		lblHelloManager.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblHelloManager.setBounds(177, 58, 198, 57);
		panel_1.add(lblHelloManager);
		
		managerUsernameT = new JTextField();
		managerUsernameT.setToolTipText("Username");
		managerUsernameT.setColumns(10);
		managerUsernameT.setBounds(58, 183, 225, 45);
		panel_1.add(managerUsernameT);
		
		managerPasswordT = new JTextField();
		managerPasswordT.setToolTipText("Password");
		managerPasswordT.setColumns(10);
		managerPasswordT.setBounds(58, 269, 225, 45);
		panel_1.add(managerPasswordT);
		
		JLabel label_2 = new JLabel("Email / Username");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_2.setBounds(58, 147, 143, 31);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Password");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_3.setBounds(58, 233, 88, 31);
		panel_1.add(label_3);
		
		JButton managerConfirmBtn = new JButton("Confirm");
		managerConfirmBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		managerConfirmBtn.setForeground(Color.WHITE);
		managerConfirmBtn.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		managerConfirmBtn.setBackground(Color.decode("#EF4F4F"));
		managerConfirmBtn.setBounds(150, 437, 225, 45);
		panel_1.add(managerConfirmBtn);
		
		managerCodeT = new JTextField();
		managerCodeT.setToolTipText("Password");
		managerCodeT.setColumns(10);
		managerCodeT.setBounds(58, 355, 225, 45);
		panel_1.add(managerCodeT);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setHorizontalAlignment(SwingConstants.LEFT);
		lblCode.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblCode.setBounds(58, 319, 88, 31);
		panel_1.add(lblCode);
	}
}
