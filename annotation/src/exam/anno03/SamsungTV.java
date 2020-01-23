package exam.anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("samsung")
public class SamsungTV extends TV {
	@Autowired
	@Qualifier("sony")
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
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void turnOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void soundUp() {
	
		System.out.println("SamsungTV---소리 올린다.");
		speaker.soundUp();
	}

	public void soundDown() {
		System.out.println("SamsungTV---소리 내린다.");
		speaker.soundDown();
	}
	
	
	
}
