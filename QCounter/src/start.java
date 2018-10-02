import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class start {

	public JFrame frame;
	private JTextField textField1;
	
	Counter c = new Counter(6); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					start window = new start();
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
	public start() {
		initialize();
		myRefresh();
	}

	private void myRefresh() {
		// TODO Auto-generated method stub
		textField1.setText(""+c.readValue());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Value");
		label1.setBounds(87, 89, 46, 14);
		frame.getContentPane().add(label1);
		
		textField1 = new JTextField();
		textField1.setBounds(189, 86, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
			}
		});
		btnClose.setBounds(136, 214, 109, 23);
		frame.getContentPane().add(btnClose);
		
		JButton btnIncr = new JButton("Incr");
		btnIncr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				c.step();
				myRefresh();
			}
		});
		btnIncr.setBounds(57, 157, 89, 23);
		frame.getContentPane().add(btnIncr);
		
		JButton btnDecr = new JButton("Decr");
		btnDecr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.down();
				myRefresh();
			}
		});
		btnDecr.setBounds(219, 157, 89, 23);
		frame.getContentPane().add(btnDecr);
	}
}
