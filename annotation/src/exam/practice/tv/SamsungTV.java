package exam.practice.tv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("samssung")
public class SamsungTV extends TV {
	@Autowired
	@Qualifier("ssony")
	
	Speaker speaker;
	
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}
	
	

	public SamsungTV() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void turnOn() {
		System.out.println("伙己TV难扁");

	}

	public void turnOff() {
		System.out.println("伙己TV掺扁");

	}

	public void soundUp() {
		System.out.println("伙己TV家府臭捞扁");
		speaker.soundUp();

	}

	public void soundDown() {
		System.out.println("伙己TV家府撤眠扁");
		speaker.soundDown();

	}
	

}
