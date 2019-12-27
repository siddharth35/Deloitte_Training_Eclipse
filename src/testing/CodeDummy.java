package testing;
public class CodeDummy {
	public static void main(String[] args) {
		run();
	}
	private static void run() {
		//WRITE YOUR CODE HERE
		System.out.println("Testing: System.in");
		while(true) System.out.println("You Entered: "+Integer.parseInt(Utility.read("Enter Message: ")));
	}
}
