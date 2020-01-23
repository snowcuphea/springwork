package book.exam.constructor;

public class LgTV extends TV {
		Speaker speaker;
	
	public LgTV(Speaker speaker) {
			super();
			this.speaker = speaker;
		}

	public LgTV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void turnOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("LgTV---���� ����.");
	}

	public void soundUp() {
		System.out.println("LgTV---�Ҹ� �ø���.");
		speaker.soundUp();
	}

	public void soundDown() {
		System.out.println("LgTV---�Ҹ� ������.");
		speaker.soundDown();
	}
}
