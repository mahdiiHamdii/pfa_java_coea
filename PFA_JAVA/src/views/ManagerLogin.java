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

public class ManagerLogin {

	private JFrame frame;
	private JTextField managerIdT;
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
		
		JLabel label = new JLabel("LOGO APP");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		label.setBounds(0, 0, 154, 45);
		frame.getContentPane().add(label);
		
		JLabel lblManagerDetected = new JLabel("Manager Detected !");
		lblManagerDetected.setBackground(new Color(250, 235, 215));
		lblManagerDetected.setHorizontalAlignment(SwingConstants.CENTER);
		lblManagerDetected.setForeground(new Color(34, 139, 34));
		lblManagerDetected.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		lblManagerDetected.setBounds(206, 85, 212, 50);
		frame.getContentPane().add(lblManagerDetected);
		
		JLabel label_2 = new JLabel("Sign In");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		label_2.setBounds(251, 129, 121, 50);
		frame.getContentPane().add(label_2);
		
		managerIdT = new JTextField();
		managerIdT.setToolTipText("Username");
		managerIdT.setColumns(10);
		managerIdT.setBounds(235, 176, 154, 45);
		frame.getContentPane().add(managerIdT);
		
		managerPasswordT = new JTextField();
		managerPasswordT.setToolTipText("Password");
		managerPasswordT.setColumns(10);
		managerPasswordT.setBounds(237, 232, 154, 45);
		frame.getContentPane().add(managerPasswordT);
		
		JLabel label_3 = new JLabel("Username ");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		label_3.setBounds(143, 176, 88, 45);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Password");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		label_4.setBounds(143, 232, 88, 45);
		frame.getContentPane().add(label_4);
		
		JButton managerLoginBtn = new JButton("Confirm");
		managerLoginBtn.setForeground(Color.WHITE);
		managerLoginBtn.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		managerLoginBtn.setBackground(new Color(34, 139, 34));
		managerLoginBtn.setBounds(235, 297, 154, 45);
		frame.getContentPane().add(managerLoginBtn);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblCode.setBounds(395, 232, 60, 45);
		frame.getContentPane().add(lblCode);
		
		managerCodeT = new JTextField();
		managerCodeT.setToolTipText("Password");
		managerCodeT.setColumns(10);
		managerCodeT.setBounds(448, 232, 88, 45);
		frame.getContentPane().add(managerCodeT);
	}

}
