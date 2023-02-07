package Day04.Ex03_Calculator;

public class CalculatorEx {
	
	public static void main(String[] args) {
		//계산기 객체 생성
		Calculator calculator = new Calculator();
		int a = 10;
		int b = 5;
		double x = 10.25;
		double y = 5.4;
		int arr[] = {1, 2, 3, 4, 5};
		
		int plus = calculator.plus(a, b);
		int minus = calculator.minus(a, b);
		double multiply = calculator.multiply(x, y);
		double divide = calculator.divide(x, y);
		double remain = calculator.remain(x, y);
		int sum = calculator.sum(arr);
		double avg = calculator.avg(arr);
		
		System.out.println("plus : " + plus);
		System.out.println("minus : " + minus);
		// - printf() : %X.Y(리터럴)
		// - 형식기호를 사용하여 값을 형식에 따라 표현하는 함수
		//				- X : 양수 - 크기만큼 칸을 지정하고 오른쪽 정렬
		//					  음수 - 크기만큼 칸을 지정하고 왼쪽 정렬
		//				- Y : 지정한 크기만큼 소수점 아래 자리수를 표현(반올림)
		//				- (리터럴) : %d (정수), %f (실수)
		// ex) printf("%d, %d, a, b);
		//		-> (출력) : 10, 20
		System.out.printf("multiply : %5.2f \n", multiply);
		System.out.printf("divide : %5.2f \n", divide);
		System.out.printf("remain : %f \n", remain);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		
	}

}