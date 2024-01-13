package oop.studentandEmployee;

import java.util.ArrayList;

public class TestOurObject {

	public static void main(String[] args) {
		//list
		ArrayList<Student>  listofStudents=new ArrayList<>();
		ArrayList<Employee>  listofEmployees=new ArrayList<>();
		//Student
		Student st1=new Student("Name1", "Address1", "BIT", 1, 22.5);
		Student st2=new Student("Name2", "Address2", "BBIT", 2, 42.5);

		listofStudents.add(st1);
		listofStudents.add(st2);
		Employee emp1=new Employee("Emp name1", "Emp address 1", "Finance", 200);
		Employee emp2=new Employee("Emp name2", "Emp address 2", "Academic", 100);
		listofEmployees.add(emp1);
		listofEmployees.add(emp2);

		
				
		//for(int i=0;i<listofStudents.size()-1;i++) {
			School ahazaza=new School(listofStudents, listofEmployees);
			st1.setFees(10000.500);
			School.getchoolincome(st1.getFees());
			st2.setFees(100.500);
			School.getchoolincome(st2.getFees());
			ahazaza.setIncome();
			emp1.setPay(145.5);
			School.getschoolspending(emp1.getPay());
			emp2.setPay(160.5);
			School.getschoolspending(emp2.getPay());
			ahazaza.setSpending();
			System.out.println(ahazaza);
		//}
	}

}
