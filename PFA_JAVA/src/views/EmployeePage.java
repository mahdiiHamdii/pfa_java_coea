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
import services.DbConnector;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeePage {

	private JFrame frame;
	private JTextField employeeNameT;
	private JTextField employeeAgeT;
	private JTextField employeeAddressT;
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
		
		employeeAgeT = new JTextField();
		employeeAgeT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		employeeAgeT.setColumns(10);
		employeeAgeT.setBounds(181, 98, 95, 38);
		frame.getContentPane().add(employeeAgeT);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblAge.setBounds(181, 49, 95, 38);
		frame.getContentPane().add(lblAge);
		
		employeeAddressT = new JTextField();
		employeeAddressT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		employeeAddressT.setColumns(10);
		employeeAddressT.setBounds(340, 98, 95, 38);
		frame.getContentPane().add(employeeAddressT);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblAddress.setBounds(340, 49, 95, 38);
		frame.getContentPane().add(lblAddress);
		
		okBtn = new JButton("Ok");
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowSelected;
				int employeeId=0;								
				try{
					char op=ManagerHomePage.getOperation();
					String employeeName=employeeNameT.getText().toString();
					String employeeAge=employeeAgeT.getText().toString();	
					String employeeAddress=employeeAddressT.getText().toString();
					String employeePassword=employeeKeyT.getText().toString();
					DbConnector database= new DbConnector();
					database.seConnecter();					
					if(op=='a') {								
						String sql="insert into coea.employee(name,age,address,password) values('"+employeeName+"','"+employeeAge+"','"+employeeAddress+"','"+employeePassword+"')";
						database.executerUpdate(sql);
					}
					else if(op=='u') {
						try {
							rowSelected=ManagerHomePage.getTable().getSelectedRow();
							employeeId=Integer.valueOf(ManagerHomePage.getaModel1().getValueAt(rowSelected, 0).toString());	
							//System.out.println(eventId);
						}catch (Exception ex) {
							// TODO: handle exception
							System.out.println("erreur");
						}
						String sql="update coea.employee set name='"+employeeName+"',age='"+employeeAge+"',age='"+employeeAge+"',address='"+employeeAddress+"',password='"+employeePassword+"'where idemployee='"+employeeId+"'";
						database.executerUpdate(sql);
					}					
					else {						
					}
					getFrame().dispose();
				}catch(Exception eex) {					
				}
			}
		});
		okBtn.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		okBtn.setBounds(685, 70, 111, 47);
		frame.getContentPane().add(okBtn);
		
		employeeKeyT = new JPasswordField();
		employeeKeyT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		employeeKeyT.setColumns(10);
		employeeKeyT.setBounds(494, 98, 95, 38);
		frame.getContentPane().add(employeeKeyT);
		
		lblKey = new JLabel("Key");
		lblKey.setHorizontalAlignment(SwingConstants.CENTER);
		lblKey.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblKey.setBounds(495, 49, 95, 38);
		frame.getContentPane().add(lblKey);
		
		JLabel lblNewLabel_1 = new JLabel("Employee");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		lblNewLabel_1.setBounds(364, 11, 95, 21);
		frame.getContentPane().add(lblNewLabel_1);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
