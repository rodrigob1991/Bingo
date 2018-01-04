import java.util.Comparator;
import java.util.Scanner;
import java.util.HashMap;


public class StartGame{

	public static void main(String[]args){
		Scanner entry=new Scanner(System.in);
		int numPlayers=entry.nextInt();

		Player[] players=new Player[numPlayers];

		for(int i=0;i<numPlayers;i++){
			entry=new Scanner(System.in);
			int age=entry.nextInt();

			entry=new Scanner(System.in);
			int heigth=entry.nextInt();

			entry=new Scanner(System.in);
			String name=entry.nextLine();

			players[i]=new Player(age,heigth,name);
		}

		HashMap<Player,Board> relation=new HashMap<Player,Board>(numPlayers);

		for(int i=0;i<numPlayers;i++){
			relation.put(players[i],new Board());
		}
		DrawNumbers drawNums=new DrawNumbers();
		}

		String nameWinner="";
		for(int i=0;i<100;i++){
			Integer num=drawNums.getDrawNum();
			for(Player player:players){
				if(relation.get(player).confirmNum(num)){
					player.setPoint();
					if(player.getPoints()==24){
						nameWinner=nameWinner.concat(player.getName().concat(" "));
						i=100;
					}
				}
			}
		}
		System.out.println(nameWinner);
			
					
	}
}
