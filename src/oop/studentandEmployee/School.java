package oop.studentandEmployee;

import java.util.ArrayList;

public class School {
	private ArrayList<Student>listofStudents;
	private ArrayList<Employee>listofEmployees;
	private double income;
	private double spending;
	private static double addincome;
	private static double addspending;
	public School(ArrayList<Student> listofStudents, ArrayList<Employee> listofEmployees, double income, double spending) {
		super();
		this.listofStudents = listofStudents;
		this.listofEmployees = listofEmployees;
		this.income = income;
		this.spending = spending;
	}
	public School(ArrayList<Student> listofStudents, ArrayList<Employee> listofEmployees) {
		this.listofStudents = listofStudents;
		this.listofEmployees = listofEmployees;
	}

	public ArrayList<Student> getListofStudents() {
		return listofStudents;
	}
	public void setListofStudents(ArrayList<Student> listofStudents) {
		this.listofStudents = listofStudents;
	}
	public ArrayList<Employee> getListofEmployees() {
		return listofEmployees;
	}
	public void setListofEmployees(ArrayList<Employee> listofEmployees) {
		this.listofEmployees = listofEmployees;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome() {
		this.income = addincome;
	}
	public double getSpending() {
		return spending;
	}
	public void setSpending() {
		this.spending = addspending;
	}

	public static double getchoolincome(double fees) {
		addincome=+fees;
		return addincome;
		//setIncome();
	}
	public static double getschoolspending(double pay) {
		addspending=+pay;
		return addspending;
	}
	@Override
	public String toString() {
		return "School [listofStudents=" + listofStudents + ", listofEmployees=" + listofEmployees + ", income=" + income
				+ ", spending=" + spending + "]";
	}

}
