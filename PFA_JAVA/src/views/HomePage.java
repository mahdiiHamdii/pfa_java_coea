package views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import services.Consts;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class HomePage {

	private JFrame frame;
	private JTextField usernameT;
	private JTextField passwordT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
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
	public HomePage() {
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
		
		JLabel lblNewLabel = new JLabel("LOGO APP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 154, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome To COEA");
		lblNewLabel_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(151, 52, 321, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPleaseLogin = new JLabel("Sign In");
		lblPleaseLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseLogin.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lblPleaseLogin.setBounds(251, 140, 121, 50);
		frame.getContentPane().add(lblPleaseLogin);
		
		usernameT = new JTextField();
		usernameT.setToolTipText("Username");
		usernameT.setBounds(235, 187, 154, 45);
		frame.getContentPane().add(usernameT);
		usernameT.setColumns(10);
		
		passwordT = new JTextField();
		passwordT.setToolTipText("Password");
		passwordT.setColumns(10);
		passwordT.setBounds(235, 243, 154, 45);
		frame.getContentPane().add(passwordT);
		
		JLabel lblNewLabel_2 = new JLabel("Username ");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(153, 187, 88, 45);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(151, 243, 88, 45);
		frame.getContentPane().add(lblPassword);
		
		JButton confirmBtn = new JButton("Confirm");
		confirmBtn.setForeground(new Color(255, 255, 255));
		confirmBtn.setBackground(new Color(0, 139, 139));
		confirmBtn.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		confirmBtn.setBounds(235, 308, 154, 45);
		frame.getContentPane().add(confirmBtn);
	}

}
