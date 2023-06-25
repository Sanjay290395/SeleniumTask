package week1.day1;

public class Primenumber {

	public static void main(String[] args) {

		for (int i = 2; i <=100; i++) {
			
			if(i<2){
				System.out.println("No " +  i + " is not a prime");
		}
		
			else if (i%2==0) {
			System.out.println("No " +  i  + " is not a prime");
		}
	     	else {
			System.out.println("No " +  i + " is a prime number");
		}
	}
	}
}