
public abstract class Animal 
{
	private String name;
	private String breed;
	private int age;

	
	public Animal(String name, String breed, int age) 
	{
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public Animal() 
	{
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract String makeNoise(int noise);
	
	public abstract String getGender(String gender);

}
