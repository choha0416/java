package ex1010;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		RemoteControl.changeBattry();
		
		RemoteControl rc = new SmartTelevision();
		System.out.println("미션1");
		rc.setVolume(5);
		System.out.println("미션2");
		rc.turnON();
		rc.setMute(true);
		rc.turnOff();
		
		 */
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnON();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnON();
		rc.setMute(true);
	}

}
