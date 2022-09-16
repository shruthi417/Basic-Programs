package assgn1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 25,i, flag = 0;
		for(i = 2; i <= num/2; i++)
		{
			if((num % i) == 0)
			{
				flag = 1;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println(num + " is prime");
		}
		else
		{
			System.out.println(num + " is not prime");
		}

	}

}
