package com.test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Hello");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setBounds(200, 300, 450, 450);
		
		JLabel label = new JLabel();
		label.setText("Some text here!");
		label.setBounds(50, 50, 170, 20);
		frame.add(label);
		
		JButton button = new JButton();
		button.setText("Push me!");
		button.setBounds(50, 100, 100, 20);
		frame.add(button);
		
		
		
	}

}
