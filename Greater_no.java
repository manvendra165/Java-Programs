import java.util.*;
public class Greater_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=0,num3=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter num1 =");
		num1 = input.nextInt();
		System.out.println("enter num2 =");
		num2 = input.nextInt();
		System.out.println("enter num3 =");
		num3 = input.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("num1 is greater");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("num2 is greater");
		}
		else
		{
			System.out.println("num3 is greater");
		}
		

	}

}
