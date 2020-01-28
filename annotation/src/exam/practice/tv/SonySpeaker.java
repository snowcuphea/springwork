package exam.practice.tv;

import org.springframework.stereotype.Service;

@Service("ssony")

public class SonySpeaker extends Speaker {
	
	
	
	public SonySpeaker() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void soundUp() {
		System.out.println("Sony 스피커 사운드 up");

	}
	
	

	public void soundDown() {
		System.out.println("Sony 스피커 사운드 down");

	}

}
