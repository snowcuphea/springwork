package exam.anno03;

import org.springframework.stereotype.Service;

@Service("sony")
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		
		System.out.println("SonySpeaker ��ü ����");
		
	}
	// �����ڰ� �־�� �޼ҵ带 ���� �� �ִ�.
	public void soundUp() {
		System.out.println("SonySpeaker�� ������~~~~");
	}
	public void soundDown() {
		System.out.println("SonySpeaker�� �����ٿ�~~~~");
	}

}
