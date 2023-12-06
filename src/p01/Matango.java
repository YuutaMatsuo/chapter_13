package p01;

// ## 非publicクラスの特徴 ##
// package privateクラス はソースファイル名とクラス名が異なっても良い
// １つのソースファイルにクラスを複数宣言しても良い

//外部クラス
class MatangoA{
}

class MatangoB{
	
}


public class Matango {
	private char suffix;
	private int hp;
	// package [rivate（同じパッケージ内のみアクセス可）
	private int mp;

	public void mpAid() {
		// 自分自身のクラスからであればprivateフィールドにアクセス可
		this.mp += 10;
	}
	
	
	
//	// ３つのprivateフィールドに対し「getter」「setter」を定義
//	// suffix用のgetter（取得特化）
//	public char getSuffix() {
//		return this.suffix;
//	}
//
//	// suffix用のsetter （設定【変更】特化）}
//	public void setSuffix(char suffix) {
//		this.suffix = suffix;
//	}
//
//	// hp用のgetter
//	public int getHp() {
//		return this.hp;
//	}
//
//	// hp用のsetter
//	public void setHp(int hp) {
//		this.hp = hp;
//	}
//
//	// mp用のgetter
//	public int getMp() {
//		return this.mp;
//	}
//
//	// mp用のsetter
//	public void setMp(int mp) {
//		this.mp = mp;
//	}

	
	
	// Eclipse 自動生成  右クリック → ソース → getter/setterの自動生成
	public char getSuffix() {
		return this.suffix;
	}

	public void setSuffix(char suffix) {
		this.suffix = suffix;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public int minusHp(int damage) {
		return this.hp - damage;
	}
	

}
