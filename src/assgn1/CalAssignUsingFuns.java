package assgn1;

public class CalAssignUsingFuns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum, a, b, diff;
		//Functions obj = new Functions();
		//obj.add(20, 30);
		sum = add(100, 20);
		diff = sub(100, 20);
		System.out.println("sum is " + sum);
		System.out.println("Difference is " + diff);
		mul();
		div();
	}
	public static int add(int a, int b)
	{
		int sum = a + b;
		return sum;
		
	}
	public static int sub(int a, int b)
	{
		int diff = a - b;
		return diff;
	}
	
	public static void mul()
	{
		int x = 10, y = 20, mul = x * y;
		System.out.println("Multiplication is " + mul);
	}
	public static void div()
	{
		float x = 15f, y = 2f; 
	    float div = x / y;
		System.out.println("Division is " + div);
	}

}
