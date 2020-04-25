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
	
	public UI() {
		getContentPane().setBackground(new Color(135, 206, 250));
		getContentPane().setLayout(null);
		
		JLabel lblCriminalList = new JLabel("Criminal List");
		lblCriminalList.setFont(new Font("Castellar", Font.PLAIN, 16));
		lblCriminalList.setBounds(10, 34, 144, 33);
		getContentPane().add(lblCriminalList);
		
		JTextPane display = new JTextPane();
		display.setBounds(10, 70, 656, 112);
		getContentPane().add(display);
		
		JButton btnDisplayListOf = new JButton("Display List of Criminals");
		btnDisplayListOf.setFont(new Font("Castellar", Font.PLAIN, 14));
		btnDisplayListOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(Criminal.main(null));
			}
		});
		btnDisplayListOf.setBounds(193, 10, 302, 21);
		getContentPane().add(btnDisplayListOf);
		
		JLabel lblSortedList = new JLabel("Sorted List");
		lblSortedList.setFont(new Font("Castellar", Font.PLAIN, 16));
		lblSortedList.setBounds(10, 208, 144, 33);
		getContentPane().add(lblSortedList);
		
		JTextPane sort = new JTextPane();
		sort.setBounds(10, 244, 656, 118);
		getContentPane().add(sort);
		
		JButton btnSortByAge = new JButton("Sort by age");
		btnSortByAge.setFont(new Font("Castellar", Font.PLAIN, 14));
		btnSortByAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//sort.setText(data.toString3());
			}
		});
		btnSortByAge.setBounds(268, 192, 144, 21);
		getContentPane().add(btnSortByAge);

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




}