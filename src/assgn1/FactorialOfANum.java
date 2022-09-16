package assgn1;

public class FactorialOfANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4, fact = 1, i = 1;
		if(num == 0)
		{
			System.out.println("Factorial of" + num + " is 1");
		}
		else
		{
			while(i <= num)
			{
				fact = fact * i;
				i++;
			}
			System.out.println("Factorial of the number " + num + " is " + fact);
	
		}
		
	}

}
