

/**
 * Write a description of class PalindromeUI here.
 *
 * @author (Sravani D)
 * @version (13-11-2019)
 */
import java.io.*;
import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;



public class mainUI extends JFrame {
	public mainUI() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		txtCriminalDatabse = new JTextField();
		txtCriminalDatabse.setBackground(Color.LIGHT_GRAY);
		txtCriminalDatabse.setHorizontalAlignment(SwingConstants.CENTER);
		txtCriminalDatabse.setFont(new Font("Monospaced", Font.BOLD, 36));
		txtCriminalDatabse.setText("Criminal Database");
		getContentPane().add(txtCriminalDatabse, BorderLayout.NORTH);
		txtCriminalDatabse.setColumns(10);
		
		JButton btnNewButton = new JButton("Sort by Name");
		getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("Sort by Age");
		getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
		
		JButton btnSortByCrime = new JButton("Sort by Crime Level");
		getContentPane().add(btnSortByCrime, BorderLayout.EAST);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtCriminalDatabse;

	
}