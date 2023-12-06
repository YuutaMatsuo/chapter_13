package p01;

public class Hero {
	private static int exp = 100;
	private int hp;
	String name;
	Sword sword;

	public void bye() {
		System.out.println("さようなら");
	}

	private void die() {
		System.out.println("死んでしまった！");
	}

	public void attack(Matango m) {
		System.out.println("勇者のこうげき！");
//		m.mp -= 10;
		int hp = m.getHp();
		hp -= 10;
		m.setHp(hp);
		
		//別の書き方
		m.setHp(m.getHp() - 10);
		System.out.println("お化けキノコに10ダメージ！");
	}

	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
}
