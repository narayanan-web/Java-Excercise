public class classLevel {
    public static void main(String args[])
	{
		{
			int x = 5;
			{
				//int x = 10;     Return error - Duplicate local variable
				System.out.println(x);
			}
		}
	}
}
