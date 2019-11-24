
public class Person {
	protected int age;
	protected String name;
	
	public Person (String name, int age) {
		this.age = age;
		this.name = name;
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
	@Override
	public String toString() {
		//String e = Integer.toString(this.age);
		return new StringBuilder().append("(").append(name).append(", ").append(age).append(")").toString();
	}
	public String work() {
		return ("None");
	}
}
