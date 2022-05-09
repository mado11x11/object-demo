
public class demo {
	
	public static void main(String[] args) throws Exception{
		//インスタンス化
		Hero h = new Hero();
		Sword s = new Sword();
		
		//フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		
		//フィールドに初期値をセット
		s.name = "炎の剣";
		
		
		//swordフィールドに生成済みの剣インスタンスを代入
		h.sword = s;
		System.out.println("勇者" + h.name + "生み出した!");
		System.out.println("剣の名前：" + h.sword.name);
		//インスタンス化
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.sufffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 28;
		m2.sufffix = 'B';
		
		
		//勇者のメソッドを呼び出してゆく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		
		//2つの変数
		Hero h1 = new Hero();
//		//フィールドに初期値をセット
//		h1.name = "ミナト";
//		h1.hp = 100;
//		Hero h2 = new Hero();
//		h2.name = "アサカ";
//		h2.hp=100;
//		Wizard w = new Wizard();
//		w.hp=50;
//		w.heal(h1);
//		w.heal(h2);
//		h2 = h1;
//		h2.hp=200;
//		System.out.println(h1.hp);
//		System.out.println(h2.hp);
		System.out.println("初期：" + h1.hp);
		System.out.println("初期：" + h1.name);
		
		

	}

}

