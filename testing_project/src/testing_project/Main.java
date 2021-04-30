package testing_project;

public class Main {
	public static void main(String args[]) {
		
		Vacancy vacancy = new Vacancy("Developer");
		Employee employee = new Employee(7, vacancy);
		
		System.out.println(employee.getId());
		System.out.println(employee.getVacancy());
	}
}
