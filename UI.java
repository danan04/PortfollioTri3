import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JScrollPane;

public class UI extends JFrame {
	public UI() {
		getContentPane().setBackground(new Color(135, 206, 250));
		getContentPane().setLayout(null);
		
		JLabel lblCriminalList = new JLabel("Criminal List");
		lblCriminalList.setFont(new Font("Castellar", Font.PLAIN, 16));
		lblCriminalList.setBounds(10, 53, 144, 33);
		getContentPane().add(lblCriminalList);
		
		JTextPane display = new JTextPane();
		display.setBounds(10, 87, 656, 95);
		getContentPane().add(display);
		
		JButton btnDisplayListOf = new JButton("Display List of Criminals");
		btnDisplayListOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(Criminal.main(null));
			}
		});
		btnDisplayListOf.setBounds(224, 10, 227, 21);
		getContentPane().add(btnDisplayListOf);
		
		JLabel lblSortedList = new JLabel("Sorted List");
		lblSortedList.setFont(new Font("Castellar", Font.PLAIN, 16));
		lblSortedList.setBounds(10, 209, 144, 33);
		getContentPane().add(lblSortedList);
		
		JButton btnSortByAge = new JButton("Sort by age");
		btnSortByAge.setBounds(289, 192, 85, 21);
		getContentPane().add(btnSortByAge);
		
		JTextPane sort = new JTextPane();
		sort.setBounds(10, 252, 656, 95);
		getContentPane().add(sort);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}