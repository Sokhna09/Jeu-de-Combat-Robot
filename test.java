package JeuRobot;
import java.util.Random;
import java.util.ArrayList;


public class test{
	
	public static  void VideGRILLE(String[][] grille ) {
		for(int i = 0;i<15;i++) {
			for(int j = 0;j<15;j++) {
				grille[i][j]="*";};
	     }
	}
	
	public static  void AfficheGRILLE(String[][] grille ) {
		for(int i = 0;i<grille.length;i++) {
			for(int j = 0;j<grille.length;j++) {
				System.out.print(grille[i][j]);}
		System.out.println();	
		}
	}
	public static void RemplirGRILLE(String [][] grille,ArrayList<RobotCombat> listeRobots) {
		for (int k=0;k<listeRobots.size();k++) {
			grille[listeRobots.get(k).X][listeRobots.get(k).Y]=listeRobots.get(k).nom;
		}
		}
	public static void LesAttack(RobotCombat r,ArrayList<RobotCombat> listeRobots ) {
		for(int c =0;c<listeRobots.size();c++) {
			if (r.X==listeRobots.get(c).X && r.Y==listeRobots.get(c).Y && r!=listeRobots.get(c)){
				r.Attaquer(listeRobots.get(c));
				System.out.println(r.nom+" a attaqué "+ listeRobots.get(c).nom+". Felicitations à "+r.nom+"!!");
			}
		}
		
	}
	
	//Changer la positionner des robots au hasard
	

	public static void Lancer(RobotCombat r,String [][] grille) {
		int max = grille.length-1;
		int min = 0;
		Random rand = new Random();
		r.X=rand.nextInt(max - min + 1) + min;
		r.Y=rand.nextInt(max - min + 1) + min;
		System.out.println("Les nouveaux coordonnés de "+ r.nom +" sont : ("+r.X+","+r.Y+").");
		
	}

	public static void main(String[] args) {
		RobotCombat r1=new RobotCombat(0,0,"r1",0,20,5);
		RobotCombat r2=new RobotCombat(0,9,"r2",0,20,5);
		RobotCombat r3=new RobotCombat(7,10,"r3",0,20,5);
		RobotCombat r4=new RobotCombat(3,8,"r4",0,20,5);
		RobotCombat r5=new RobotCombat(12,7,"r5",0,20,5);
		RobotCombat r6=new RobotCombat(9,14,"r6",0,20,5);
		RobotCombat r7=new RobotCombat(8,1,"r7",0,20,5);
		RobotCombat r8=new RobotCombat(5,2,"r8",0,20,5);
		RobotCombat r9=new RobotCombat(13,4,"r9",0,20,5);
		RobotCombat r10=new RobotCombat(6,11,"r10",0,20,5);
		
		//Stocker les robots dans un tableau pour avoir les joueurs du debut les tests
		RobotCombat[] TabRobots={r1,r2,r3,r4,r5,r6,r7,r8,r9,r10};
		
		//Stocker les robots dans une liste pour manipuler les joueurs (eliminer par exemple)
		ArrayList<RobotCombat> listeRobots = new ArrayList<RobotCombat>();
		for(int j = 0;j<TabRobots.length;j++) {listeRobots.add(TabRobots[j]);};
      
		
		
		
		//Declaration de la grille
		String GRILLE[][]=new String[15][15];
		
		
		for(int i = 0;i<GRILLE.length;i++) {
			for(int j = 0;j<GRILLE.length;j++) {
				System.out.print(GRILLE[i][j]);}
		System.out.println();	
		}
		
		
		RemplirGRILLE(GRILLE,listeRobots);
		AfficheGRILLE(GRILLE);

		
		
		
		//{Jouer} sur 5 tours
		int t=0;
		while (listeRobots.size()>1) {
			 VideGRILLE(GRILLE );
			 System.out.println();
			 RemplirGRILLE(GRILLE,listeRobots);
		     AfficheGRILLE(GRILLE);
			 System.out.println();
		     System.out.println("Tour"+(t+1));	
		     for (int r=0;r<listeRobots.size();r++)
		          {RemplirGRILLE(GRILLE,listeRobots);
		           Lancer(listeRobots.get(r),GRILLE);
		           LesAttack(listeRobots.get(r),listeRobots);}
		     
		     System.out.println();
		     for(int i=0;i<listeRobots.size();i++) {
		    	 if (listeRobots.get(i).health==0) {System.out.println(listeRobots.get(i).nom +" est éliminé.A la prochaine !!");
		    	                                    listeRobots.remove(i);}
		    	 
		     }
		     
		     System.out.println();
		     t++;
		     
		      
		
		}
		System.out.println("Felicitations au gagnant!! Reclames ton cadeau!");
		
		
		
		
	
		
		
		
		
		
	}
	
	
	
	
}

	
		