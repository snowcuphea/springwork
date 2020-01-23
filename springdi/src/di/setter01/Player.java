package di.setter01;

//player가 갖고 있는 Dice를 외부(스프링컨테이너)에서 Injection 받아 사용해야 하므로
// Injection 받을 수 있도록 미리 준비해야 한다. 
// ==> Constructor or setter메소드
public class Player implements AbstractPlayer {

	AbstractDice d; // Dice d; 하면 Dice만 쓸수있고 다른 CrystalDice이런애들 못쓴다. 무조건 상위타입으로 써줘야 한다. 
	//그래야 모든 하위 객체가 다 사용가능하다. 
	int totalValue=0;
	
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setD(AbstractDice d) {
		this.d = d;
	}
	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}
	public Player(AbstractDice d) {
		super();
		this.d = d; //외부에서 받아오는 값이 d 뿐이기 떄문에 d에 해당하는 생성자만 만들어준다. 
		System.out.println("Player의 매개변수 1개 생성자");
	}
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}