package views;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import services.Consts;
import services.DbConnector;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventPage {

	private JFrame frame;
	private JTextField eventNameT;
	private JButton okBtn;
	private JLabel lblEvent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventPage window = new EventPage();
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
	public EventPage() {
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
		
		JLabel lblNewLabel = new JLabel("Event Name");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(157, 47, 95, 38);
		frame.getContentPane().add(lblNewLabel);
		
		eventNameT = new JTextField();
		eventNameT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		eventNameT.setBounds(157, 96, 95, 38);
		frame.getContentPane().add(eventNameT);
		eventNameT.setColumns(10);
		
		JTextField eventDescriptionT = new JTextField();
		eventDescriptionT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		eventDescriptionT.setColumns(10);
		eventDescriptionT.setBounds(340, 96, 177, 78);
		frame.getContentPane().add(eventDescriptionT);
		
		
		okBtn = new JButton("Ok");
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				int rowSelected;
				String eventId="";
										
				try{
					char op=ManagerHomePage.getOperation();
					String eventName=eventNameT.getText().toString();
					String eventDescription=eventDescriptionT.getText().toString();					
					DbConnector database= new DbConnector();
					database.seConnecter();					
					if(op=='a') {
						String sql="insert into coea.event(eventname,description) values('"+eventName+"','"+eventDescription+"')";
						database.executerUpdate(sql);
					}
					else if(op=='u') {
						try {
							rowSelected=ManagerHomePage.getTable().getSelectedRow();
							eventId=ManagerHomePage.getaModel1().getValueAt(rowSelected, 0).toString();	
							//System.out.println(eventId);
						}catch (Exception ex) {
							// TODO: handle exception
							System.out.println("erreur");
						}	
						String sql="update coea.event set eventname='"+eventName+"',description='"+eventDescription+"' where idevent='"+eventId+"'";
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
		okBtn.setBounds(689, 70, 111, 47);
		frame.getContentPane().add(okBtn);
		
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescription.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblDescription.setBounds(375, 47, 95, 38);
		frame.getContentPane().add(lblDescription);
		
		lblEvent = new JLabel("Event");
		lblEvent.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		lblEvent.setBounds(381, 11, 62, 21);
		frame.getContentPane().add(lblEvent);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
