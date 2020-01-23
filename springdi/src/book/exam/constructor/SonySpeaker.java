package book.exam.constructor;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		
		System.out.println("SonySpeaker 객체 생성");
		
	}
	// 생성자가 있어야 메소드를 만들 수 있다.
	public void soundUp() {
		System.out.println("SonySpeaker의 볼륨업~~~~");
	}
	public void soundDown() {
		System.out.println("SonySpeaker의 볼륨다운~~~~");
	}

}
