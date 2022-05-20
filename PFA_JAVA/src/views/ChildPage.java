package views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import services.Consts;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChildPage {

	private JFrame frame;
	private JTextField childNameT;
	private JTextField childAgeT;
	private JTextField childAddressT;
	private JTextArea childNoteT;
	private JButton okBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChildPage window = new ChildPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Create the application.
	 */
	public ChildPage() {
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
		lblNewLabel.setBounds(10, 49, 95, 38);
		frame.getContentPane().add(lblNewLabel);
		
		childNameT = new JTextField();
		childNameT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		childNameT.setBounds(10, 98, 95, 38);
		frame.getContentPane().add(childNameT);
		childNameT.setColumns(10);
		
		childAgeT = new JTextField();
		childAgeT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		childAgeT.setColumns(10);
		childAgeT.setBounds(149, 98, 95, 38);
		frame.getContentPane().add(childAgeT);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblAge.setBounds(149, 49, 95, 38);
		frame.getContentPane().add(lblAge);
		
		childAddressT = new JTextField();
		childAddressT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		childAddressT.setColumns(10);
		childAddressT.setBounds(293, 98, 95, 38);
		frame.getContentPane().add(childAddressT);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblAddress.setBounds(293, 49, 95, 38);
		frame.getContentPane().add(lblAddress);
		
		childNoteT = new JTextArea();
		childNoteT.setLineWrap(true);
		childNoteT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		childNoteT.setColumns(10);
		childNoteT.setBounds(448, 98, 167, 78);
		frame.getContentPane().add(childNoteT);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setHorizontalAlignment(SwingConstants.CENTER);
		lblNote.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblNote.setBounds(474, 49, 95, 38);
		frame.getContentPane().add(lblNote);
		
		okBtn = new JButton("Ok");
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().dispose();
			}
		});
		okBtn.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		okBtn.setBounds(689, 70, 111, 47);
		frame.getContentPane().add(okBtn);
	}

}
