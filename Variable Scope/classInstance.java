public class classInstance {
	int a;
	int b;
	
	// Parameterized constructor
	classInstance(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	void display()
	{
		//Displaying value of variables a and b
		System.out.println("a = " + a + " b = " + b);
	}

	public static void main(String[] args)
	{
		classInstance obj = new classInstance(10, 20);
		obj.display();
	}

}
