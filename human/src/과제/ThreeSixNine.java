package 과제;
public class ThreeSixNine {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			int one = i % 10;	// 1의 자리를 10으로 나눈 후 나머지를 one에 저장
			int ten = i / 10;	// 10으로 나눴을 때 몫을 ten에 저장
			boolean one369 = (one == 3 || one == 6 || one == 9);	// one이 3, 6, 9 중 하나라도 true일 경우 true로 판단(or연산)
			boolean ten369 = (ten == 3 || ten == 6 || ten == 9);	// ten이 3, 6, 9 중 하나라도 true일 경우 true로 판단(or연산)
			
			if (one369 || ten369) {		//1의 자리와 10의 자리 중 하나라도 true라면
				if (one369) {			//1의 자리가 true일 경우
					System.out.print("*");	//*을 출력
				}
				if (ten369) {			//10의 자리가 *일 경우
					System.out.print("*");	//*을 출력
				}
				System.out.println();	//줄 바꿈
			} else {					//모두 false일 경우
				System.out.println(i);	//i 값을 그대로 출력
			}
		}
		
	}
}
