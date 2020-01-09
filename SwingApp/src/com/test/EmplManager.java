package com.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmplManager extends JFrame {

	private JPanel contentPane;
	private JTextField last_name;
	private JTextField name;
	private JTextField uid;
	private JTextField companyName;
	private JTextField jobPosition;
	private JTextField age;
	private JTextField salary;
	private JButton Logout;
	private JButton Update;
	private JButton Delete;
	private JButton Add;
	private JTextField search_text;
	private JButton Search;

	private int current_index = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmplManager frame = new EmplManager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 */

	private Employee[] data = Util.generateEmployee(10);

	private void loadEmpl(int index) {
		Employee empl = data[index];

		last_name.setText(empl.getLastName());
		name.setText(empl.getName());
		uid.setText(empl.getUid() + "");
		companyName.setText(empl.getCompanyName());
		jobPosition.setText(empl.getJobPosition());
		age.setText(empl.getAge() + "");
		salary.setText(empl.getSalary() + "");

	}

	public EmplManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Uid_info = new JLabel("Uid");
		Uid_info.setBounds(10, 14, 98, 20);
		contentPane.add(Uid_info);

		uid = new JTextField();
		uid.setEditable(false);
		uid.setBounds(112, 11, 147, 20);
		contentPane.add(uid);
		uid.setColumns(10);

		JLabel Name_info = new JLabel("Name");
		Name_info.setBounds(10, 46, 98, 20);
		contentPane.add(Name_info);

		name = new JTextField();
		name.setBounds(112, 42, 147, 23);
		contentPane.add(name);
		name.setColumns(10);

		JLabel LastName_info = new JLabel("Last Name");
		LastName_info.setBounds(10, 76, 87, 28);
		contentPane.add(LastName_info);

		last_name = new JTextField();
		last_name.setBounds(112, 71, 147, 28);
		contentPane.add(last_name);
		last_name.setColumns(10);

		JLabel CompanyName_info = new JLabel("CompanyName");
		CompanyName_info.setBounds(10, 113, 87, 23);
		contentPane.add(CompanyName_info);

		companyName = new JTextField();
		companyName.setBounds(112, 110, 147, 28);
		contentPane.add(companyName);
		companyName.setColumns(10);

		JLabel JobPosition_info = new JLabel("JobPosition");
		JobPosition_info.setBounds(10, 149, 87, 28);
		contentPane.add(JobPosition_info);

		jobPosition = new JTextField();
		jobPosition.setBounds(112, 149, 147, 28);
		contentPane.add(jobPosition);
		jobPosition.setColumns(10);

		JLabel Age_info = new JLabel("Age");
		Age_info.setBounds(10, 188, 98, 28);
		contentPane.add(Age_info);

		age = new JTextField();
		age.setBounds(112, 188, 147, 28);
		contentPane.add(age);
		age.setColumns(10);

		JLabel Salary_info = new JLabel("Salary");
		Salary_info.setBounds(10, 227, 98, 23);
		contentPane.add(Salary_info);

		salary = new JTextField();
		salary.setBounds(112, 227, 147, 28);
		contentPane.add(salary);
		salary.setColumns(10);

		JButton privious = new JButton("<");
		privious.setBounds(48, 327, 60, 23);
		contentPane.add(privious);

		JButton next = new JButton(">");
		next.setBounds(112, 327, 60, 23);
		contentPane.add(next);

		Logout = new JButton("LOGOUT");
		Logout.setBounds(441, 13, 163, 28);
		contentPane.add(Logout);

		Update = new JButton("UPDATE");
		Update.setBounds(212, 327, 87, 23);
		contentPane.add(Update);

		Delete = new JButton("DELETE");
		Delete.setBounds(411, 327, 98, 23);
		contentPane.add(Delete);

		Add = new JButton("ADD");
		Add.setBounds(411, 290, 98, 23);
		contentPane.add(Add);

		Search = new JButton("SEARCH");
		Search.setBounds(413, 155, 98, 23);
		contentPane.add(Search);

		search_text = new JTextField();
		search_text.setBounds(382, 113, 127, 28);
		contentPane.add(search_text);
		search_text.setColumns(10);

		JList list = new JList();
		list.setBounds(537, 113, 67, 64);
		contentPane.add(list);

		Choice choice = new Choice();
		choice.setBounds(379, 157, 28, 23);
		contentPane.add(choice);

		/// LOGIC

		loadEmpl(current_index);

		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (data.length-1 != current_index) {
					current_index++;
					loadEmpl(current_index);
				}
			}
		});

		privious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (current_index!= 0) {
					current_index--;
					loadEmpl(current_index);
				}
			}
		});
		
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

	}
}
