
public class Player extends People{
	private int points;
	
	public Player(int age,int heigth,String name){
		super(age,heigth,name);
		points=0;
	}
	
	public void setPoint(){
		points++;
	}
	public int getPoints(){return points;}
}
	
