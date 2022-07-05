package interfaceex.remotecontrol;

public class Audio implements RemoteControl {
	//필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		//볼륨의 크기 제한
		if(volume >  RemoteControl.MAX_VOULEM) {
			this.volume = RemoteControl.MAX_VOULEM;
		}else if(volume < RemoteControl.MIN_VOULEM) {
			this.volume = RemoteControl.MIN_VOULEM;
		}else {
			this.volume = volume;
		}
		
		System.out.println("현재 볼륨 : " + this.volume);
	}
	
}
