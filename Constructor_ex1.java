// calling constructor in another constructor in java
class Multi
{
	float num1,num2;
	Multi(int num1, int num2)
	{
		this((float)num1,(float)num2);
		// in java calling of another constructor is done by using (this)
		// keyword without the name of constructor
		// and variable with datatype must be passing with this
		
	}
	Multi(float num1, float num2)
	{
		this.num1 = num1; 
		this.num2 = num2;
		
	}
	float getMul()
	{
		return(num1*num2);
	}
}
public class Constructor_ex1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Multi m1 = new Multi(15,15);
      System.out.println("multiply of num1 and num2 ="+m1.getMul());  
      Multi m2 = new Multi(15.5f,15.4f);
      System.out.println("multiply of num1 and num2 ="+m2.getMul()); 
	}

}
