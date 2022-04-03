package views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import services.Consts;

public class HomePage {

	private JFrame frame;

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
		frame.setBounds(Consts.x, Consts.y, Consts.z, Consts.w);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
