package ex1010;

public class SmartTelevision implements RemoteControl, Searchable {
private int volume;
	
	public void turnON() {
		System.out.println("스마트티비 켭니다");
	}
	
	public void turnOff() {
		System.out.println("스마트티비 끕니다");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 스마트티비 볼륨" +volume);
	}
	
	public void search(String url) {
		System.out.println(url+"을 검색합니다");
	}
}
