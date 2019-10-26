package storyG.No01_strategy.game_ex;

public class GameCharactor {
	//접근점
	private Weapon weapon;
	
	//교환 가능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public void attack() {
		if(weapon == null) {
			System.out.println("맨손 공격");
		}
		else
			weapon.attack();
	}
}
