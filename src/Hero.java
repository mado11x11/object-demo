
public class Hero {
	//フィールド
	String	name;
	int hp;
	Sword sword;
	
	
	//メゾッド
	//void attack() {}
	void sleep() {
		this.hp=100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが"+ sec + "回復した");
	}
	void slip() {
		this.hp -=5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GameOver");
		System.out.println("最終HPは"+ this.hp + "でした");
	}
	
	Hero(String name){
		this.hp=100;
		this.name=name;
	}
	
	Hero(){
		this("ダミー");
	}
}
