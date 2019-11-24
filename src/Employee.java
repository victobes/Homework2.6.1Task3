
public class Employee extends Person{
	private String company;

	public Employee(String name, int age, String company) {
		super(name, age);
		this.company = company;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
public String toString() {
	super.toString();
	return new StringBuilder().append("(").append(name).append(", ").append(age).append(", ").append(company).append(")").toString();
}
@Override
public String work() {
	return ("Manager");
}

}
