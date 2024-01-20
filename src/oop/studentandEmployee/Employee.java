package oop.studentandEmployee;

public class Employee extends Person{
private String department;
private double pay;
public Employee(String name, String address, String department, double pay) {
	super(name, address);
	this.department = department;
	this.pay = pay;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public double getPay() {
	return pay;
}
public void setPay(double pay) {
	this.pay = pay;
	School.getschoolspending(this.pay);

}
@Override
public String toString() {
	return "Employee [department=" + department + ", pay=" + pay + "]";
}

}
