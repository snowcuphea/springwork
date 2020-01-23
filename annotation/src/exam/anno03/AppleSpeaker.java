package exam.anno03;

import org.springframework.stereotype.Service;

@Service("apple")
public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		
		System.out.println("AppleSpeaker 객체 생성");
		
	}
	// 생성자가 있어야 메소드를 만들 수 있다.
	public void soundUp() {
		System.out.println("AppleSpeaker의 볼륨업~~~~");
	}
	public void soundDown() {
		System.out.println("AppleSpeaker의 볼륨다운~~~~");
	}

}
