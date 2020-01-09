package com.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Welcome = new JLabel("WELCOME IN CRAZY");
		Welcome.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 11));
		Welcome.setBounds(90, 25, 193, 20);
		contentPane.add(Welcome);
		
		JLabel status = new JLabel("");
		status.setFont(new Font("Traditional Arabic", Font.BOLD, 11));
		status.setForeground(Color.RED);
		status.setBounds(10, 56, 285, 20);
		contentPane.add(status);
		
		JLabel lblLogin = new JLabel("NAME");
		lblLogin.setBounds(10, 112, 46, 14);
		contentPane.add(lblLogin);
		
		name = new JTextField();
		name.setBounds(102, 109, 193, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(10, 143, 80, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(102, 140, 193, 20);
		contentPane.add(passwordField);
		
		String user_name = "ADMIN";
		String user_pass = "12345678";
		
		JButton Login = new JButton("LOGIN");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(name.getText().trim().equalsIgnoreCase(user_name)){
					if(passwordField.getText().trim().equals(user_pass)){
						status.setText("Welcome back,Dear "+ user_name);
						EmplManager frame = new EmplManager();
						frame.setVisible(true);
						setVisible(false);
					}else{
						status.setText("Incorrect password!");
					}
				}else{
					status.setText("Incorrect login!");
				}
			}
		});
		Login.setBounds(112, 177, 89, 23);
		contentPane.add(Login);
	}
}
