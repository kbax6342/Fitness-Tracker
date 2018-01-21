package Business;

public class User {
	
	public String name;
	public int age;
	public int weight;
	String email;
	
	public User(String name, int age,int weight, String email) {
		name = "";
		age = 0;
		weight = 0;
		email = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
