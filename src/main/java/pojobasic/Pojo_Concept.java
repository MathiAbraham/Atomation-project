package pojobasic;

public class Pojo_Concept {
	
	public static void main(String[] args) {
		
		Basic_Pojo p = new Basic_Pojo();
		p.setAge(45);
		int age = p.getAge();
		System.out.println(age);
		
		p.setName("mathi");
		String name = p.getName();
		System.out.println(name);
		
		p.setNuber(96291597);
		long nuber = p.getNuber();
		System.out.println(nuber);
	
	}

}
