package CodeUp;

import java.util.Scanner;

public class _1508 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		
		int[][] a = new int[20][20];
		for (int i = 0; i < x; i++) {
			a[i][0] = stdIn.nextInt();
		}
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++) {
				a[i+1][j+1] = a[i+1][j] - a[i][j];
			}
		}
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(a[i][j]+"");
			}
			System.out.println();
		}
	}
}
