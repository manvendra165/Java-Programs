
class Multiply
{
	float num1,num2;
	Multiply(int num1, int num2)
	{
		this.num1 = num1; // automatic type casting 
		this.num2 = num2;
		
	}
	Multiply(float num1, float num2)
	{
		this.num1 = num1; 
		this.num2 = num2;
		
	}
	float getMul()
	{
		return(num1*num2);
	}
}
public class constructor_ex {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Multiply m1 = new Multiply(15,15);
      System.out.println("multiply of num1 and num2 ="+m1.getMul());  
      Multiply m2 = new Multiply(15.5f,15.4f);
      System.out.println("multiply of num1 and num2 ="+m2.getMul()); 
	}

}
