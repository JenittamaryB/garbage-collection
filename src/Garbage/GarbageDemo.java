package Garbage;

public class GarbageDemo {
	// is a process jvm automaticaly manage the memory used in java program
	//Nullifying a Object.
	//Reassigning Reference Variable.
	//Object declared inside method definition 
		
		public static void main(String[] args)
		{
			GarbageDemo GCD1 = new GarbageDemo();
			GarbageDemo GCD2 = new GarbageDemo();
			GarbageDemo GCD3 = new GarbageDemo();
	     	
	    	GCD1=GCD2;	//assingning value	
			System.out.println(GCD1);
			System.out.println(GCD2);
			System.out.println(GCD3);
			GCD1.display();
			System.gc();//we request to run gc
			
			String person1="india";
			String person2="india";
			String person3="japan";
			
			Runtime rt = Runtime.getRuntime();//we request run gc
			rt.gc();
			
		}

		private void display() {
			GarbageDemo gcd4 = new GarbageDemo();//obj declaration inside method	
		}
		
		

	}

