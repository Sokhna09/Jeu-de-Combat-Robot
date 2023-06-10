package JeuRobot;

public class RobotCombat extends Robot {
	public int health;
	public int attack;
	
	public RobotCombat(int X,int Y, String nom, int orientation,int health, int attack) {
		super(X,Y,nom, orientation);
		this.health=health;
		this.attack=attack;
		
	}
	
	public void Attaquer(RobotCombat robotAttaqué) {
	robotAttaqué.health=robotAttaqué.health-this.attack;	

	}
}
