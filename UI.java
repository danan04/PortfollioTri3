
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

//Creates Main UI
public class UI extends JFrame{
	public UI() {
		getContentPane().setBackground(new Color(135, 206, 235));
		getContentPane().setLayout(null);
		
		JLabel lblList = new JLabel("Lists:");
		lblList.setFont(new Font("Castellar", Font.PLAIN, 14));
		lblList.setBounds(10, 10, 53, 23);
		getContentPane().add(lblList);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 34, 656, 31);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSortedLists = new JLabel("Sorted Lists:");
		lblSortedLists.setFont(new Font("Castellar", Font.PLAIN, 14));
		lblSortedLists.setBounds(10, 157, 124, 23);
		getContentPane().add(lblSortedLists);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 75, 656, 31);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 116, 656, 31);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 189, 656, 31);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 230, 656, 31);
		getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(10, 271, 656, 31);
		getContentPane().add(textField_6);
	}
	
	public String User;
	public static JTextField Usernames = new JTextField();
	
	public int main;
	private JTextField txtCasInspired;
	private JTextField textField;
	private JTextField ItemCode;
	private JTextField Quantity;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

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
			
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 638, 100);
			panel.setBackground(new Color(30, 144, 255));
			getContentPane().add(panel);
			panel.setLayout(null);
		}
	}