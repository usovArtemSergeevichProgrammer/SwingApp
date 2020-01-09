package com.test;

class Util {
	public static Employee generateEmployee() {

		Employee empl = new Employee();

		String names[] = { "�����", "�������", "���������", "������", "���������", "�������", "�������", "�������",
				"��������", "������", "�����", "�������", "�����", "��������", "�������", "�������", "���� ", "�����",
				"������", "��������", "������", "�����", "�����", "��������", "�������", "��������", "������",
				"���������� ", "�������", "��������", "�������� ", "�������� ", "������ ", "���������", "�������",
				"�������� ", "���������", "�������", "����", "��������", "��������", "�������", "���������", "�������",
				"��������", "�������", "�������", "������", "����", "������", "��������", "������ ", "����� ", "������",
				"�����", "�������", "�������", "�����", "�������", "�������", "������", "�������", "�����", "��������",
				"����", "�������", "������", "�������", "����", "����", "�������", "������", "����", "�������", "�����",
				"����", "����������", "������� ", "������", "������", "������", "��� ", "������ ", "�������",
				"������� ", "����������", "��������", "������", "�������", "���������", "��� ", "������", "�������",
				"���� ", "�����", "������", "����������", "�����", "������", "���� ", "������", "������", "��������",
				"�����", "�������� ", "��������", "������", "��������", "����� ", "������", "�������", "������",
				"�������", "�������", "�����", "����", "������", "�����", "�����������", "��������", "ϸ��", "������ ",
				"��������", "�����", "����", "��������", "��������", "������", "��������", "������", "����� ",
				"���������", "������", "�����", "�������", "������ ", "���������", "���������", "���������", "����",
				"������", "���������", "��������� ", "�����", "��������", "���������", "������", "�����", "�������",
				"�����", "�����", "����� ", "������", "������", "������", "Ը���", "�������", "�����", "������",
				"��������", "�����", "������", "����", "�������", "���������", "������", "�����", "����", "����",
				"�����", "����", "����", "�������" };
		String lastNames[] = { "�������", "������", "��������", "�������", "�����", "�������", "������", "�������",
				"�������", "������", "������", "��������", "��������", "������", "������", "������", "�������",
				"����������", "��������", "��������", "Ը�����", "��������", "������", "�������", "�����", "�������",
				"�����", "������", "�������", "�������", "������", "�����", "�����", "�����", "�������", "���������",
				"�������", "�������", "��������", "��������", "�������", "�������", "�������", "�������", "�������",
				"�������", "������", "���������", "��������", "���������", "�������", "��������", "�����", "�������",
				"�������", "�����", "�������", "�������", "�������", "�����", "������", "�������", "��������",
				"������", "��������", "�������", "������", "��������", "�������", "��������", "������", "�������",
				"������", "��������", "�������", "��������", "�������", "�������", "��������", "���������", "�������",
				"��������", "������", "���������", "�������", "�������", "������", "�����������", "���������",
				"��������", "�������", "������", "�������", "������", "�����", "�������", "���������", "��������",
				"������", "����������", "������", "���������", "������", "������", "������", "�������", "������",
				"��������", "��������", "�����", "��������", "��������", "�����", "����", "���������", "��������",
				"�����", "�������", "�������", "�������", "�������", "�����", "�������", "��������", "��������",
				"���������", "�������", "������", "����������", "�������", "��������", "�������", "������", "������",
				"�������", "�������", "�����", "�������", "�������", "��������", "������", "������", "������", "�����",
				"��������", "�������", "�������", "��������", "�����", "�������", "�������", "��������", "��������",
				"�������", "�������", "�������", "������", "��������", "������", "�������", "�����", "���������",
				"����������", "�������", "������", "����", "�������", "�����", "��������", "��������", "���������",
				"��������", "��������", "��������", "��������", "�����", "�������", "�����", "�������", "�������",
				"������", "�����", "�������", "���������", "��������", "����������", "��������", "������", "��������",
				"������", "�������", "���������", "��������", "�������", "�����", "������", "����������", "��������",
				"�����", "������", "�����", "�������", "��������", "������", "����������", "������", "������������",
				"��������", "������", "�����", "�������", "�������", "�������", "�����", "�������", "�������",
				"�������", "������", "������������", "�������", "��������", "������", "��������", "������", "������",
				"������", "�������", "��������", "������", "��������", "��������", "�������", "�����", "������",
				"�������", "�������", "��������", "�����", "�������", "�������", "��������", "�����", "������",
				"�����������", "������", "����������", "�����", "��������", "������", "�����" };
		String companyNames[] = { "Google", "Yahoo!", "IBM", "SAP" };
		String jobPositions[] = { "Tester", "Developer", "Manager" };

		empl.setAge(18 + (int) (Math.random() * 40));
		empl.setName(names[((int) (Math.random() * names.length))]);
		empl.setLastName(lastNames[((int) (Math.random() * lastNames.length))]);
		empl.setCompanyName(companyNames[((int) (Math.random() * companyNames.length))]);
		int xPos = ((int) (Math.random() * jobPositions.length));
		empl.setJobPosition(jobPositions[xPos]);
		double salary = 0;
		if (xPos == 0) {
			salary = 1000 + (int) (Math.random() * 1000);
		} else if (xPos == 1) {
			salary = 2000 + (int) (Math.random() * 1000);
		} else {
			salary = 3000 + (int) (Math.random() * 1000);
		}

		empl.setSalary(salary);
		return empl;

	}

	public static Employee[] generateEmployee(int size) {
		Employee employee[] = new Employee[size];
		for (int i = 0; i < employee.length; i++) {
			Employee e = generateEmployee();
			e.setUid(i + 1);
			employee[i] = e;
			System.out.println(e);
		}

		return employee;
	}

}

public class Employee {

	private long uid;
	private int age;
	private String name;
	private String lastName;
	private String companyName;
	private String jobPosition;
	private double salary;

	// ����� �����������.��������� ������� ��������� ����������������
	// ������.����������� ������� ������ �� ����������.��� ������������
	// ��������� � ������ �����
	public Employee() {
		//System.out.println("Employee + 1");
	}

	public Employee(int age, String name, String lastName, String companyName, String jobPosition, double salary) {
		this();
		this.age = age;
		this.name = name;
		this.lastName = lastName;
		this.companyName = companyName;
		this.jobPosition = jobPosition;
		this.salary = salary;

	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", lastName=" + lastName + ", companyName=" + companyName
				+ ", jobPosition=" + jobPosition + ", salary=" + salary + "]";
	}

}

class Tester {
	public static void main(String[] args) {
		Employee em1 = new Employee();
		em1.setAge(30);
		em1.setName("Alex");
		em1.setLastName("Ivanov");
		em1.setJobPosition("Developer");
		em1.setCompanyName("EPAM");
		em1.setSalary(5000);

		em1.setAge(em1.getAge() + 1);

		em1.getJobPosition();
		em1.setJobPosition("Senior");

		System.out.println(em1.toString());

		Employee em2 = new Employee();
		em2.setAge(50);
		em2.setName("Artem");
		em2.setLastName("Petrov");
		em2.setJobPosition("Developer");
		em2.setCompanyName("Google");
		em2.setSalary(15000);
		System.out.println(em2.toString());

		Employee em3 = new Employee(40, "Bob", "D", "IBM", "TESTER", 50000);
		System.out.println(em3.toString());

		Employee em4 = Util.generateEmployee();
		System.out.println(em4.toString());

		Employee arr[] = new Employee[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Util.generateEmployee();
		}

	}
}
