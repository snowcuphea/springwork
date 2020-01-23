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
		System.out.println("LgTV---전원 켠다.");
	}

	public void turnOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void soundUp() {
		System.out.println("LgTV---소리 올린다.");
		speaker.soundUp();
	}

	public void soundDown() {
		System.out.println("LgTV---소리 내린다.");
		speaker.soundDown();
	}
}
