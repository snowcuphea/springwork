package di.setter01;

//player�� ���� �ִ� Dice�� �ܺ�(�����������̳�)���� Injection �޾� ����ؾ� �ϹǷ�
// Injection ���� �� �ֵ��� �̸� �غ��ؾ� �Ѵ�. 
// ==> Constructor or setter�޼ҵ�
public class Player implements AbstractPlayer {

	AbstractDice d; // Dice d; �ϸ� Dice�� �����ְ� �ٸ� CrystalDice�̷��ֵ� ������. ������ ����Ÿ������ ����� �Ѵ�. 
	//�׷��� ��� ���� ��ü�� �� ��밡���ϴ�. 
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
		this.d = d; //�ܺο��� �޾ƿ��� ���� d ���̱� ������ d�� �ش��ϴ� �����ڸ� ������ش�. 
		System.out.println("Player�� �Ű����� 1�� ������");
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