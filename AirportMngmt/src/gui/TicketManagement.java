package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Choice;

import javax.swing.JComboBox;
import javax.swing.JButton;

import com.blogspot.sontx.dut.primaryschool.ui.date.JDateChooser;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JTable;

public class TicketManagement extends JFrame {
	private JTextField txtSearch;
	public TicketManagement() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 201, 95);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDepartureDate = new JLabel("Departure Date");
		lblDepartureDate.setBounds(0, 11, 83, 14);
		panel.add(lblDepartureDate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(93, 8, 98, 20);
		panel.add(dateChooser);
		
		JLabel lblFlightNum = new JLabel("Flight No.");
		lblFlightNum.setBounds(0, 39, 61, 19);
		panel.add(lblFlightNum);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(93, 38, 74, 20);
		panel.add(comboBox);
		
		JButton btnView = new JButton("View");
		btnView.setBounds(93, 72, 61, 23);
		panel.add(btnView);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(221, 10, 203, 95);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnDetails = new JButton("");
		btnDetails.setBackground(SystemColor.menu);
		btnDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDetails.setBounds(new Rectangle(28, 11, 32, 32));
		btnDetails.setIcon(new ImageIcon("C:\\Users\\Thao\\Desktop\\icon\\detail48.png"));
		panel_1.add(btnDetails);
		
		JButton btnEdit = new JButton("");
		btnEdit.setIcon(new ImageIcon("C:\\Users\\Thao\\Desktop\\icon\\edit32.png"));
		btnEdit.setBounds(87, 11, 32, 32);
		panel_1.add(btnEdit);
		
		JButton btnDelete = new JButton("");
		btnDelete.setIcon(new ImageIcon("C:\\Users\\Thao\\Desktop\\icon\\1460626549_f-cross_256.png"));
		btnDelete.setBounds(143, 11, 32, 32);
		panel_1.add(btnDelete);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(28, 60, 105, 20);
		panel_1.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("");
		btnSearch.setIcon(new ImageIcon("C:\\Users\\Thao\\Desktop\\icon\\1460626895_Search.png"));
		btnSearch.setBounds(143, 52, 32, 32);
		panel_1.add(btnSearch);
		
		
		
	}
}
