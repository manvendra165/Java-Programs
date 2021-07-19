// default constructor in java

class Subtract
{
	int num1,num2;
	/*
	 
	 Subtract(int num1, int num2) // constructor made by us
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	*/
	Subtract()  // default constructor
	            // use with blank paranthesis
	{
		this.num1=10;
		this.num2=5;
	}
	void getSub()
	{
		int num3=num1-num2;
		System.out.println("Subtraction is "+num3);
	}
}

public class Default_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Subtract s1=new Subtract(34,24);
		
		
		// we can not use default constructor by creating our
		// Subtract s1=new Subtract(); it will give error
		
		// s1.getSub();
		Subtract s2=new Subtract();
		s2.getSub();

	}

}
