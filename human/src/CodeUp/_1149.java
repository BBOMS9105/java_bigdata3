package CodeUp;

import java.util.Scanner;

public class _1149 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = 0;
		if (a > b)
			result = a;
		else
			result = b;
		
		System.out.println(result);
	}

}
