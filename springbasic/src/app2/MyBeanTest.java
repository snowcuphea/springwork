package app2;
/*
 * app1에 있는 코드를 수정해서,
 * oop가 적용되어 있는 프로그램
 * 
 * oop특성을 적용하기 위해 상위클래스를 정의하고, MyBeanStyleXXX클래스를 사용하는 매개변수의 타입을 상위타입으로 변경하며 다형성을 적용했다.
 * 사용되는 객체가 변경되더라도 코드를 수정하는 범위는 줄어든다.
 * 
 * 
 * 그러나 실제 객체를 전달하는 곳에서는 생성해서 전달하고 있다.
 * 사용하는 객체가 바뀔 때마다 객체를 직접 생서하는 코드를 모두 수정해야 한다는 단점은 존재한다. 
 * 사용하는 곳에서 직접 new해서 객체를 생성하는 코드는 없엊야 하는 코드이다.
 *
 */

public class MyBeanTest {

	public static void main(String[] args) {

		MyBeanStyle obj = new MyBeanStyleA(); //부모타입으로 객체 생성

	}

	public static void run(MyBeanStyleA obj) {
		System.out.println("**************");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("**************");
	}

	public static void show(MyBeanStyleA obj) {
		System.out.println("**************");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("**************");

	}

}
