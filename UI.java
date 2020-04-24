
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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;

public class UI extends JFrame
{
	public int main;
	private JTextField List1;
	private JTextField List2;
	private JTextField List3;
	private JTextField Sort1;
	private JTextField Sort2;
	private JTextField Sort3;

	
	//create frame
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.createLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		public void createLayout() {
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 800, 645);
			setBackground(Color.LIGHT_GRAY);
			getContentPane().setLayout(null);
		}
		
		public UI() {
			getContentPane().setBackground(new Color(135, 206, 235));
			getContentPane().setLayout(null);
			
			//display lists
			JLabel lblList = new JLabel("Lists:");
			lblList.setFont(new Font("Castellar", Font.PLAIN, 14));
			lblList.setBounds(10, 10, 53, 23);
			getContentPane().add(lblList);
			
			List1 = new JTextField();
			List1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Criminal.main(null);
				}
			});
			List1.setBounds(10, 34, 656, 31);
			getContentPane().add(List1);
			List1.setColumns(10);

			List2 = new JTextField();
			List2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Cupcakes.main(null);
				}
			});
			List2.setColumns(10);
			List2.setBounds(10, 75, 656, 31);
			getContentPane().add(List2);
			
			List3 = new JTextField();
			List3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Alphabet.main(null);
				}
			});
			List3.setColumns(10);
			List3.setBounds(10, 116, 656, 31);
			getContentPane().add(List3);
			
			//display sorted lists
			JLabel lblSortedLists = new JLabel("Sorted Lists:");
			lblSortedLists.setFont(new Font("Castellar", Font.PLAIN, 14));
			lblSortedLists.setBounds(10, 157, 124, 23);
			getContentPane().add(lblSortedLists);
			
			
			Sort1 = new JTextField();
			Sort1.setColumns(10);
			Sort1.setBounds(10, 189, 656, 31);
			getContentPane().add(Sort1);
			
			Sort2 = new JTextField();
			Sort2.setColumns(10);
			Sort2.setBounds(10, 230, 656, 31);
			getContentPane().add(Sort2);
			
			Sort3 = new JTextField();
			Sort3.setColumns(10);
			Sort3.setBounds(10, 271, 656, 31);
			getContentPane().add(Sort3);
		}
	}