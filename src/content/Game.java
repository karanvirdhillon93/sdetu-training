package content;

class Player{
	String name;
	int level;
	boolean online;
	
	void logon() {
		if (online==true) {
			System.out.println("Player already logged in");
		}
		else {
			System.out.println("Logging in");
		}
	}
	void stats() {
		System.out.print("Combat level is"+level);
	}
	void who() {
		System.out.print("Character name:"+name);
	}
}

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1= new Player();
		p1.level=5;
		p1.online=true;
		p1.name="Falador Gaurd";
		p1.logon();
		p1.who();
		p1.stats();

	}

}
