package views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import services.Consts;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomePage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

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
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(Consts.x, Consts.y, Consts.z, Consts.w);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(0, 0, 924, 587);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(36, 30, 865, 534);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);		
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(EmployeeHomePage.class.getResource("/images/bg3.jpg")).getImage().getScaledInstance(492 , 492 , Image.SCALE_DEFAULT));
		lblNewLabel.setIcon(new ImageIcon(EmployeeHomePage.class.getResource("/images/bg3.jpg")));
		lblNewLabel.setBounds(385, 36, 470, 446);
		panel_1.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("Sign In");
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		label_1.setBounds(58, 41, 150, 57);
		panel_1.add(label_1);
		
		textField = new JTextField();
		textField.setToolTipText("Username");
		textField.setColumns(10);
		textField.setBounds(58, 177, 225, 45);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Password");
		textField_1.setColumns(10);
		textField_1.setBounds(58, 264, 225, 45);
		panel_1.add(textField_1);
		
		JLabel lblEmailOrUsername = new JLabel("Email / Username");
		lblEmailOrUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmailOrUsername.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblEmailOrUsername.setBounds(58, 147, 143, 31);
		panel_1.add(lblEmailOrUsername);
		
		JLabel label_3 = new JLabel("Password");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_3.setBounds(58, 234, 88, 31);
		panel_1.add(label_3);
		
		JButton btnConfirm = new JButton("Sign In");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirm.setForeground(new Color(255, 255, 255));
		btnConfirm.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnConfirm.setBackground(new Color(100, 149, 237));
		btnConfirm.setBounds(58, 391, 225, 45);
		panel_1.add(btnConfirm);
		
		JLabel lblNewLabel_1 = new JLabel("Don't Have An Account ?");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(58, 99, 155, 23);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.setForeground(new Color(100, 149, 237));
		lblSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		lblSignUp.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblSignUp.setBounds(223, 99, 69, 23);
		panel_1.add(lblSignUp);
		
		JLabel lblNotAnEmployee = new JLabel("Not An Employee?");
		lblNotAnEmployee.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNotAnEmployee.setBounds(58, 335, 155, 23);
		panel_1.add(lblNotAnEmployee);
		
		JLabel lblChangeToManager = new JLabel("Log As Manager");
		lblChangeToManager.setForeground(new Color(100, 149, 237));
		lblChangeToManager.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblChangeToManager.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblChangeToManager.setBounds(177, 335, 108, 23);
		panel_1.add(lblChangeToManager);
	}
}
