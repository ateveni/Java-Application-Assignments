
public class Cat extends Animal
{
	private int height;
	
	public Cat(String name, String breed, int age, int height) {
		super(name, breed, age);
		this.height = height;
	}

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public String makeNoise()
	{
		String noise;
		noise = "meow";
		
		return noise;
	}
	
	public String getGender()
	{
		String gender;
		gender = "female";
		
		return gender; 
	}

}
