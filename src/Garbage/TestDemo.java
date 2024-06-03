package Garbage;

public class TestDemo{

	public static void main(String[] args) {
		try 
		{
		SingletonDemo.test();//we call that by class name without obj creation because method is static
		SingletonDemo.display();
		}
		catch(NullPointerException ne)
		{
		ne.printStackTrace();	
		}

	}
}
