package assgn1;

import java.util.Arrays;

public class ArrAscnDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		int num[] = {5, 2, 1, 3, 4};
		System.out.println("Original array: ");
		for (int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + " ");	
		}
		System.out.println();
		
		/*for(int i = 0; i < 5; i++)
		{
			 for (i = 0; i < num.length; i++) {     
		            for (int j = i+1; j < num.length; j++) {     
		               if(num[i] > num[j]) {    
		                   temp = num[i];    
		                   num[i] = num[j];    
		                   num[j] = temp;    
		               }     
		            }     
		        }    
		          
		}
		System.out.println("Ascending Order of array: ");
		for (int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + " ");	
		}
		System.out.println();
		for(int i = 0; i < 5; i++)
		{
			 for (i = 0; i < num.length; i++) {     
		            for (int j = i+1; j < num.length; j++) {     
		               if(num[i] < num[j]) {    
		                   temp = num[i];    
		                   num[i] = num[j];    
		                   num[j] = temp;    
		               }     
		            }     
		        }    
		          
		}
		System.out.println("Descending Order of array: ");
		for (int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + " ");	
		}*/
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + " ");	
		}

	}

}
