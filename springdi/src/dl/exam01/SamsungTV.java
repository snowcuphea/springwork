package dl.exam01;

public class SamsungTV extends TV {
	
	
	public SamsungTV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void turnOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void turnOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void soundUp() {
		System.out.println("SamsungTV---소리 올린다.");
	}

	public void soundDown() {
		System.out.println("SamsungTV---소리 내린다.");
	}
}
