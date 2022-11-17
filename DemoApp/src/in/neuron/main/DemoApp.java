package in.neuron.main;

public class DemoApp {
	
	
	public static void main(String [] args) {
		
		int a[] = {10 , 20  , 30  , 40  , 50};
		for(int ele : a) {
			System.out.print(ele + "  ");
		}
		
		String name = "sachin";
		int count = name.toUpperCase().length();
		
		System.out.println("The length of the String is :: " + count);
	}

}
