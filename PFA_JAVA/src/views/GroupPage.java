package views;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import services.Consts;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GroupPage {

	private JFrame frame;
	private JTextField groupNameT;
	private JTextField idChildT;
	private JTextField idEmployee;
	private JButton okBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupPage window = new GroupPage();
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
	public GroupPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(Consts.x-150, Consts.y+150, Consts.z-100, Consts.w-400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Group Name");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(49, 49, 95, 38);
		frame.getContentPane().add(lblNewLabel);
		
		groupNameT = new JTextField();
		groupNameT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		groupNameT.setBounds(49, 98, 95, 38);
		frame.getContentPane().add(groupNameT);
		groupNameT.setColumns(10);
		
		idChildT = new JTextField();
		idChildT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		idChildT.setColumns(10);
		idChildT.setBounds(246, 98, 95, 38);
		frame.getContentPane().add(idChildT);
		
		JLabel lblAge = new JLabel("ID Child");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblAge.setBounds(246, 49, 95, 38);
		frame.getContentPane().add(lblAge);
		
		idEmployee = new JTextField();
		idEmployee.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		idEmployee.setColumns(10);
		idEmployee.setBounds(457, 98, 95, 38);
		frame.getContentPane().add(idEmployee);
		
		JLabel lblAddress = new JLabel("ID Employee");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblAddress.setBounds(457, 49, 95, 38);
		frame.getContentPane().add(lblAddress);
		
		okBtn = new JButton("Ok");
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().dispose();
			}
		});
		okBtn.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		okBtn.setBounds(683, 82, 111, 47);
		frame.getContentPane().add(okBtn);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
