
public class Dog extends Animal
{
	private int weight;
	
	
	
	public Dog(String name, String breed, int age, int weight) 
	{
		super(name, breed, age);
		this.weight = weight;
	}
	
	public Dog() 
	{
		// TODO Auto-generated constructor stub
	}
	
		
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String makeNoise()
	{
		String noise;
		noise = "woof";
		
		return noise;
	}
	
	public String getGender()
	{
		String gender;
		gender = "male";
		
		return gender; 
	}

}
