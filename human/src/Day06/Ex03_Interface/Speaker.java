package Day06.Ex03_Interface;

//implements : 인터페이스를 구현하는 키워드
public class Speaker implements RemoteController {
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("스피커 전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스피커 전원을 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteController.MAX_VOLUME) {
			this.volume = RemoteController.MAX_VOLUME;
		}
		else if(volume < RemoteController.MIN_VOLUME) {
			this.volume = RemoteController.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 스피커 볼륨 : " + this.volume);
		
	}
	

}
