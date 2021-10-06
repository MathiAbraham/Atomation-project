package pojobasic;

public class Basic_Pojo {
	
	//here we are going to access private variable into another class without using extend keywords
	//pojo concept
	
	//rightclick-source-generate getter and setter-generate
	
	private int age;
	private String name;
	private long nuber;
	
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
	public long getNuber() {
		return nuber;
	}
	public void setNuber(long nuber) {
		this.nuber = nuber;
	}
	
	
}
