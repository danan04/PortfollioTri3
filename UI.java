
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
	private JTextField DisplayLists;
	private JTextField SortedLists;
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
			

			DisplayLists = new JTextField();
			DisplayLists.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CircleQueueDriver.main(null);
				}
			});
			DisplayLists.setBounds(10, 41, 656, 133);
			getContentPane().add(DisplayLists);
			DisplayLists.setColumns(10);
			
			//display sorted lists
			JLabel lblSortedLists = new JLabel("Sorted Lists:");
			lblSortedLists.setFont(new Font("Castellar", Font.PLAIN, 14));
			lblSortedLists.setBounds(10, 173, 124, 34);
			getContentPane().add(lblSortedLists);
			
			
			SortedLists = new JTextField();
			SortedLists.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CircleQueueDriver.main(null);
				}
			});
			SortedLists.setColumns(10);
			SortedLists.setBounds(10, 206, 656, 133);
			getContentPane().add(SortedLists);
		}
	}