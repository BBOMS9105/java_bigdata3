package CodeUp;

import java.util.Scanner;

public class _1205 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double oper [] = new double [10];
		
		oper [0] = a + b;
		oper [1] = b + a;
		oper [2] = a - b;
		oper [3] = b - a;
		oper [4] = a * b;
		oper [5] = b * a;
		oper [6] = a / b;
		oper [7] = b / a;
		oper [8] = Math.pow(a, b);
		oper [9] = Math.pow(b, a);
		
		double max = Integer.MIN_VALUE;
		for (int i = 0; i < oper.length; i++) {
			if(max < oper[i])
			max = oper[i];
		}
		System.out.printf("%.6f", max);
		
		sc.close();
		}
	
}