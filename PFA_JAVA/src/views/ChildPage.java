package views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import services.Consts;
import services.DbConnector;

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
	private JButton okBtn;
	private JLabel lblChild;

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
		lblNewLabel.setBounds(64, 43, 95, 38);
		frame.getContentPane().add(lblNewLabel);
		
		childNameT = new JTextField();
		childNameT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		childNameT.setBounds(64, 92, 95, 38);
		frame.getContentPane().add(childNameT);
		childNameT.setColumns(10);
		
		childAgeT = new JTextField();
		childAgeT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		childAgeT.setColumns(10);
		childAgeT.setBounds(258, 92, 95, 38);
		frame.getContentPane().add(childAgeT);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblAge.setBounds(258, 43, 95, 38);
		frame.getContentPane().add(lblAge);
		
		childAddressT = new JTextField();
		childAddressT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		childAddressT.setColumns(10);
		childAddressT.setBounds(456, 92, 95, 38);
		frame.getContentPane().add(childAddressT);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblAddress.setBounds(456, 43, 95, 38);
		frame.getContentPane().add(lblAddress);
		
		okBtn = new JButton("Ok");
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowSelected;
				int childId=0;
				
							
				try{
					char op=ManagerHomePage.getOperation();
					String childName=childNameT.getText().toString();
					String childAge=childAgeT.getText().toString();
					String childAddress=childAddressT.getText().toString();						
					DbConnector database= new DbConnector();
					database.seConnecter();					
					if(op=='a') {
						String sql="insert into coea.child(name,age,address) values('"+childName+"','"+childAge+"','"+childAddress+"')";
						database.executerUpdate(sql);
					}
					else if(op=='u') {
						try {
							rowSelected=ManagerHomePage.getTable().getSelectedRow();
							childId=Integer.valueOf(ManagerHomePage.getaModel1().getValueAt(rowSelected, 0).toString());	
						}catch (Exception ex) {
							// TODO: handle exception
							
						}
						String sql="update coea.child set name='"+childName+"',age='"+childAge+"',address='"+childAddress+"' where idchild='"+childId+"'";
						database.executerUpdate(sql);
					}
					
					else {
						
					}
					getFrame().dispose();
				}catch(Exception eex) {
					eex.printStackTrace();;
				}
				
			}
		});
		okBtn.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		okBtn.setBounds(689, 70, 111, 47);
		frame.getContentPane().add(okBtn);
		
		lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		lblChild.setBounds(389, 11, 46, 21);
		frame.getContentPane().add(lblChild);
	}

}
