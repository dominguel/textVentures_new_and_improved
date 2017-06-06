package resources;

public class Player {
	
	//All fields private, because I was taught this...
	private int hp;//see: boolean alive
	private boolean alive;//is the game still going?
	private int lvl;//0 at the start, is usedin MANY calculations
	private String name;//damn right you need a name
	private String race;//elves, dwarves, humans by default...
	private String affliction;//curses, vampirism...
	private boolean gender;//False for female, true for male. No other choices.
	private int[] p = new int[3];//x,y,z (i,j,k) coordinates
	
	//constructor, returns base player
	public Player(String name) {
		hp = 100;
		alive = true;
		lvl = 0;
		this.name = name;
		affliction = "";
		race = "human";
		gender = false;
	}
	
	//GETTERS, SETTERS AND SIMPLE MODIFIERS
	//getAlive... mostly
	public boolean checkPulse() {
		if(!affliction.equals("")) {
			//you might be a vampire, zombie, ghoul or other undead
			//return somtehing?
		}
		return alive;
	}
	
	//getName
	public String whoRU() {
		return name;
	}
	
	///getLvl
	public int howHigh() {
		return lvl;
	}
	
	//getRace
	public String judgeMe() {
		return race;
	}
	
	//getLocation
	public int[] where() {
		return p;
	}
	
	//hp modifiers
	//hp decrementer
	public void hurt(int damage) {
		hp -= damage;
	}
	//hp incrementer
	public void heal(int halp) {
		hp += halp;
	}
	
	//life ender
	public void kill() {
		alive = false;
	}
	
	//position modifiers
	public void move(int dx, int dy, int dz) {
		p[0] = p[0] + dx;
		p[1] = p[1] + dy;
		p[2] = p[2] + dz;
	}
	
	public void moveTo(int x, int y, int z) {
		p[0] = x;
		p[1] = y;
		p[2] = z;
	}
}