package assgn1;

public class RevOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String name = "Shruthi", rev = "";
		for(i = name.length() - 1; i >= 0; i--)
			
		{
			rev = rev + name.charAt(i);
		}
		System.out.println("Reverse of a string is " + rev);
	}

}
