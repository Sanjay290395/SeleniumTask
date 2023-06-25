package week1.day1;

public class Fibbinocci {
	
	public static void main(String[] args) {
		
		  int a = 11, firstnum = 0, secondnum = 1;
	        System.out.print("Fibonacci Series of "+a+" numbers:");

	        for (int i = 1; i <= a; ++i)
	        {
	            System.out.print(firstnum+" ");

	            int c = firstnum + secondnum;
	            firstnum = secondnum;
	            secondnum = c;
	        }
	    }
	}