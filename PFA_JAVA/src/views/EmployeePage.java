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
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeePage {

	private JFrame frame;
	private JTextField employeeNameT;
	private JTextField EmployeeAgeT;
	private JTextField employeeAddressT;
	private JTextArea employeeNoteT;
	private JButton okBtn;
	private JPasswordField employeeKeyT;
	private JLabel lblKey;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeePage window = new EmployeePage();
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
	public EmployeePage() {
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
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(23, 49, 95, 38);
		frame.getContentPane().add(lblNewLabel);
		
		employeeNameT = new JTextField();
		employeeNameT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		employeeNameT.setBounds(23, 98, 95, 38);
		frame.getContentPane().add(employeeNameT);
		employeeNameT.setColumns(10);
		
		EmployeeAgeT = new JTextField();
		EmployeeAgeT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		EmployeeAgeT.setColumns(10);
		EmployeeAgeT.setBounds(141, 98, 95, 38);
		frame.getContentPane().add(EmployeeAgeT);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblAge.setBounds(141, 49, 95, 38);
		frame.getContentPane().add(lblAge);
		
		employeeAddressT = new JTextField();
		employeeAddressT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		employeeAddressT.setColumns(10);
		employeeAddressT.setBounds(259, 98, 95, 38);
		frame.getContentPane().add(employeeAddressT);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblAddress.setBounds(259, 49, 95, 38);
		frame.getContentPane().add(lblAddress);
		
		employeeNoteT = new JTextArea();
		employeeNoteT.setLineWrap(true);
		employeeNoteT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		employeeNoteT.setColumns(10);
		employeeNoteT.setBounds(495, 98, 167, 78);
		frame.getContentPane().add(employeeNoteT);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setHorizontalAlignment(SwingConstants.CENTER);
		lblNote.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblNote.setBounds(526, 49, 95, 38);
		frame.getContentPane().add(lblNote);
		
		okBtn = new JButton("Ok");
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().dispose();
			}
		});
		okBtn.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		okBtn.setBounds(685, 70, 111, 47);
		frame.getContentPane().add(okBtn);
		
		employeeKeyT = new JPasswordField();
		employeeKeyT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		employeeKeyT.setColumns(10);
		employeeKeyT.setBounds(377, 98, 95, 38);
		frame.getContentPane().add(employeeKeyT);
		
		lblKey = new JLabel("Key");
		lblKey.setHorizontalAlignment(SwingConstants.CENTER);
		lblKey.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblKey.setBounds(378, 49, 95, 38);
		frame.getContentPane().add(lblKey);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
