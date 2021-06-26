class Display
{
	void displayMessage() {
		System.out.println("this is the second class");
	}
}
//main class should be public    only one class can be public in java
//name of java file always given as the name given to the class which contain main method
public class Message_class_obj_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1 = new Display();
		
		//or 
		
		Display d2; // >> object creation
		d2 = new Display(); // >>> object instantiation
		
		d1.displayMessage(); //call method to print message
		d2.displayMessage();
		
		// Display is a class d1 is object and Display() is constructor
		// new is a operator which is responsible for creating the 
		// object d1 of display class using constructor display()
		
		// one more way to call method in java called anonymous method
		// here no name is given to object
		new Display().displayMessage();
		
	}

}
