package app2;
/*
 * app1�� �ִ� �ڵ带 �����ؼ�,
 * oop�� ����Ǿ� �ִ� ���α׷�
 * 
 * oopƯ���� �����ϱ� ���� ����Ŭ������ �����ϰ�, MyBeanStyleXXXŬ������ ����ϴ� �Ű������� Ÿ���� ����Ÿ������ �����ϸ� �������� �����ߴ�.
 * ���Ǵ� ��ü�� ����Ǵ��� �ڵ带 �����ϴ� ������ �پ���.
 * 
 * 
 * �׷��� ���� ��ü�� �����ϴ� �������� �����ؼ� �����ϰ� �ִ�.
 * ����ϴ� ��ü�� �ٲ� ������ ��ü�� ���� �����ϴ� �ڵ带 ��� �����ؾ� �Ѵٴ� ������ �����Ѵ�. 
 * ����ϴ� ������ ���� new�ؼ� ��ü�� �����ϴ� �ڵ�� ������ �ϴ� �ڵ��̴�.
 *
 */

public class MyBeanTest {

	public static void main(String[] args) {

		MyBeanStyle obj = new MyBeanStyleA(); //�θ�Ÿ������ ��ü ����

	}

	public static void run(MyBeanStyleA obj) {
		System.out.println("**************");
		obj.hello("����");
		obj.hello("����");
		System.out.println("**************");
	}

	public static void show(MyBeanStyleA obj) {
		System.out.println("**************");
		obj.hello("����");
		obj.hello("����");
		System.out.println("**************");

	}

}