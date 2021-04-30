package testing_project;

public class Employee {
	
	private long id;
	private Vacancy vacancy;
	
	public Employee(long id, Vacancy vacancy) {
		this.id = id;
		this.vacancy = vacancy;
	}
	String getVacancy() {
		 return vacancy.getVacancy();
    }
    
	long getId() {
		 return id;
	}
}
