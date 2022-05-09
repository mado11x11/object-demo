
public class Wizard {
	String naeme;
	int hp;
	void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復↓！");
	}

}
