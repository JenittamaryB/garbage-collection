package Garbage;

public class SingletonDemo {
		
		
		private SingletonDemo() {
			System.out.println("come");
		}
		public static void main(String[] args) {
			SingletonDemo sd = new SingletonDemo();
			SingletonDemo.test();
			SingletonDemo.display();
		}

		public static void test() {
			System.out.println("welcome");
		}

		public static void display() {
			System.out.println("goodbye");
		}
	}

