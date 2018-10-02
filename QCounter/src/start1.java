import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class start1 {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					start1 window = new start1();
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
	public start1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setBounds(149, 46, 162, 14);
		frame.getContentPane().add(lblWelcome);
		
		JButton btnSt = new JButton("BEGIN");
		btnSt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				start window = new start();
				window.frame.setVisible(true);
			}
		});
		btnSt.setBounds(149, 119, 89, 23);
		frame.getContentPane().add(btnSt);
	}

}
