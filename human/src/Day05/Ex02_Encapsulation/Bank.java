package Day05.Ex02_Encapsulation;

public class Bank {
	
	public static void main(String[] args) {
		Encapsulation ec
			= new Encapsulation(0, "기업은행", "486-058410-01-016", "이승찬");
		
		ec.setDeposit(10000000);
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println("계좌 잔액 : " + money);
	}

}
