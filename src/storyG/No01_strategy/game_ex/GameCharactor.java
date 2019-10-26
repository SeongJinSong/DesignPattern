package storyG.No01_strategy.game_ex;

public class GameCharactor {
	//������
	private Weapon weapon;
	
	//��ȯ ����
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public void attack() {
		if(weapon == null) {
			System.out.println("�Ǽ� ����");
		}
		else
			weapon.attack();
	}
}
