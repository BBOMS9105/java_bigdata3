package Day06.Ex03_Interface;

public class RcEx {
	public static void main(String[] args) {
		//인터페이스는 객체로 생성 불가
		//인터페이스 = 구현 객체 생성
		RemoteController tvRc = new Television();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(true);
		tvRc.turnOff();
		System.out.println();
		
		RemoteController speakerRc = new Speaker();
		speakerRc.turnOn();
		speakerRc.setVolume(5);
		speakerRc.setVolume(100);
		speakerRc.setMute(true);
		speakerRc.turnOff();
		System.out.println();
		
		RemoteController.changeBattery();
		
		
	}

}
