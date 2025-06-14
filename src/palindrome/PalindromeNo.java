package palindrome;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		int num ;
		int digit;
		int rev=0;
		int temp;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no:");
		 num = sc.nextInt();
		temp = num;
		
		
		while(num>0) {
			
			digit = num % 10;
			rev = rev*10+digit;
			num = num /10;
			
			
		}
		
		if(temp==rev) {
		System.out.println("The number is a palindrome.  ");
		
	}
		else {
			System.out.println("The no is not panlindrome");
		}

}
}