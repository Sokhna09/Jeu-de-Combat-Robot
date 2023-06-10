package JeuRobot;

public class Robot {
	protected String nom;
	protected int numéro;
	protected int X;
	protected int Y;
	protected int orientation;
	
	//Nord=0, Est=1, Sud=2, Ouest=3)
	
	public Robot() {
		this.X=0;
		this.Y=0;
		this.orientation=0;
		}
	public Robot(int X,int Y, String nom, int orientation) {
		this.X=X;
		this.Y=Y;
		this.orientation=orientation;
		this.nom=nom;
		}
	public Robot(String nom, Robot Robot1 ) {
		this.X=Robot1.X;
		this.Y=Robot1.Y;
		this.orientation=Robot1.orientation;
		this.nom=nom;
		}
	
	public void Avancer() {
		Y++;
	}
	
	public void tourneAdroite() {
		if (orientation==3) {orientation=0;}
		else {orientation++;}
		/*if (orientation==0) {
			orientation=1;}
		if (orientation==1) {
			orientation=2;}
		if (orientation==2) {
			orientation=3;}
		if (orientation==3) {
			orientation=0;}*/
		}
	public int getX() {
		return X;
	}
	public int getY() {
		return Y;
	}
	public String getName() {
		return nom;
	}
	public int getNum() {
		return numéro;
	}
	public int getOr() {
		return orientation;
	}
	}

