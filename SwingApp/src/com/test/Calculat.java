package com.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculat extends JFrame {

	private JPanel contentPane;
	private JTextField a;
	private JTextField b;
	private JTextField a1;
	private JTextField b1;
	private JTextField r;
	private JTextField r1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculat frame = new Calculat();
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
	public Calculat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		a = new JTextField();
		a.setText("0");
		a.setBounds(53, 30, 86, 20);
		contentPane.add(a);
		a.setColumns(10);

		JLabel lab = new JLabel("+");
		lab.setBounds(160, 33, 20, 14);
		contentPane.add(lab);

		b = new JTextField();
		b.setText("0");
		b.setBounds(189, 30, 86, 20);
		contentPane.add(b);
		b.setColumns(10);

		JLabel ravno = new JLabel("=");
		ravno.setBounds(295, 33, 20, 14);
		contentPane.add(ravno);

		r = new JTextField();
		r.setBounds(338, 30, 86, 20);
		contentPane.add(r);
		r.setColumns(10);

		a1 = new JTextField();
		a1.setText("0");
		a1.setBounds(53, 82, 86, 20);
		contentPane.add(a1);
		a1.setColumns(10);

		JLabel lab1 = new JLabel("-");
		lab1.setBounds(160, 85, 20, 14);
		contentPane.add(lab1);

		b1 = new JTextField();
		b1.setText("0");
		b1.setBounds(189, 85, 86, 20);
		contentPane.add(b1);
		b1.setColumns(10);

		JLabel ravno1 = new JLabel("=");
		ravno1.setBounds(295, 85, 20, 14);
		contentPane.add(ravno1);

		r1 = new JTextField();
		r1.setBounds(338, 82, 86, 20);
		contentPane.add(r1);
		r1.setColumns(10);

		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setText("0.0");
				b.setText("0.0");
				a1.setText("0.0");
				b1.setText("0.0");
				r.setText("0.0");
				r1.setText("0.0");
			}
		});
		clear.setBounds(302, 180, 89, 23);

		contentPane.add(clear);

		JButton calc = new JButton("CALCULATE");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("CALCULATING");
				double a_val = Double.parseDouble(a.getText());
				double b_val = Double.parseDouble(b.getText());
				r.setText((a_val + b_val) + "");

				double a1_val = Double.parseDouble(a1.getText());
				double b1_val = Double.parseDouble(b1.getText());
				r1.setText((a1_val - b1_val) + "");
			}
		});
		calc.setBounds(50, 180, 89, 23);
		contentPane.add(calc);
	}
}
