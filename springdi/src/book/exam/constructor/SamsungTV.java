package book.exam.constructor;


public class SamsungTV extends TV {
	//���� Ŭ���� ���ο��� ����ϴ� ��ü - �����������̳ʸ� ���� ���޹��� �� �ֵ��� �غ� 
	Speaker speaker;

	public SamsungTV(SonySpeaker speaker) {
		super();
		this.speaker = speaker;
	}

	public SamsungTV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void turnOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void soundUp() {
	
		System.out.println("SamsungTV---�Ҹ� �ø���.");
		speaker.soundUp();
	}

	public void soundDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
		speaker.soundDown();
	}
	
	
	
}
