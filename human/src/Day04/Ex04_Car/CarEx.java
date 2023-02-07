package Day04.Ex04_Car;

public class CarEx {
	public static void main(String[] args) {
		//객체생성
		Car car = new Car();
		car.model = "제네시스";
		//private으로 지정한 변수는 직접 접근 불가능
		car.setSpeed(-100);
		System.out.println("model : " + car.getModel());
		System.out.println("Speed : " + car.getSpeed());
		
		car.setSpeed(500);
		System.out.println("Speed : " + car.getSpeed());
		
		car.setSpeed(80);
		System.out.println("Speed : " + car.getSpeed());
	}

}
