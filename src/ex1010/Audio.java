package ex1010;

public class Audio implements RemoteControl {
private int volume;
private boolean mute;	
	public void turnON() {
		System.out.println("오디오 켭니다");
	}
	
	public void turnOff() {
		System.out.println("오디오 끕니다");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨" +volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("오디오를 무음처리합니다");
		} else {
			System.out.println("오디오를 무음헤제합니다");
		}
	}
}
