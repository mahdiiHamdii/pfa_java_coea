package views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import services.Consts;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class EmployeeHomePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeHomePage window = new EmployeeHomePage();
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
	public EmployeeHomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(Consts.x, Consts.y, Consts.z, Consts.w);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("LOGO APP");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		label.setBounds(0, 0, 154, 45);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Sign out");
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(525, 6, 89, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Manage Children");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 139, 139));
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton_1.setBounds(232, 317, 162, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnViewGroups = new JButton("View Groups");
		btnViewGroups.setForeground(new Color(255, 255, 255));
		btnViewGroups.setBackground(new Color(0, 139, 139));
		btnViewGroups.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnViewGroups.setBounds(232, 65, 162, 37);
		frame.getContentPane().add(btnViewGroups);
		
		JButton btnViewTasks = new JButton("View Tasks");
		btnViewTasks.setForeground(new Color(255, 255, 255));
		btnViewTasks.setBackground(new Color(0, 139, 139));
		btnViewTasks.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnViewTasks.setBounds(232, 149, 162, 37);
		frame.getContentPane().add(btnViewTasks);
		
		JButton btnAddNote = new JButton("Manage Note");
		btnAddNote.setForeground(new Color(255, 255, 255));
		btnAddNote.setBackground(new Color(0, 139, 139));
		btnAddNote.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnAddNote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddNote.setBounds(232, 233, 162, 37);
		frame.getContentPane().add(btnAddNote);
	}

}
