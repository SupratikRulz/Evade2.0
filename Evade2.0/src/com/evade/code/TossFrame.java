package com.evade.code;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class TossFrame extends JFrame {

	private JPanel contentPane;
	private JTextField p1Name;
	private JTextField p2Name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TossFrame frame = new TossFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TossFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlayerName = new JLabel("Player1 Name");
		lblPlayerName.setBounds(29, 28, 97, 14);
		contentPane.add(lblPlayerName);
		
		p1Name = new JTextField();
		p1Name.setBounds(140, 25, 256, 20);
		contentPane.add(p1Name);
		p1Name.setColumns(10);
		
		p2Name = new JTextField();
		p2Name.setBounds(140, 72, 256, 20);
		contentPane.add(p2Name);
		p2Name.setColumns(10);
		
		JLabel lblPlayerName_1 = new JLabel("Player2 Name");
		lblPlayerName_1.setBounds(29, 75, 97, 14);
		contentPane.add(lblPlayerName_1);
		
		JButton btnToss = new JButton("TOSS");
		btnToss.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				Random r = new Random();
				int winner = r.nextInt(2);
				if(winner==0){
					JOptionPane.showMessageDialog(null, p1Name.getText()+" Won! So he is A and "+p2Name.getText()+" is B");
				}
				else
					JOptionPane.showMessageDialog(null, p2Name.getText()+" Won! So he is A and "+p1Name.getText()+" is B");
				
				GamePlayFrame.main(null);
				
			}
		});
		btnToss.setBounds(188, 135, 89, 23);
		contentPane.add(btnToss);
	}
}
