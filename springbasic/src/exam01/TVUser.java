package exam01;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new SamsungTV(); //������ �θ� Ÿ������ ��ü �����ؾ� �Ѵ�. 
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		
		TV lgtv = new LgTV(); //������ �θ� Ÿ������ ��ü �����ؾ� �Ѵ�. 
		lgtv.turnOn();
		lgtv.soundUp();
		lgtv.soundDown();
		lgtv.turnOff();
	}

}