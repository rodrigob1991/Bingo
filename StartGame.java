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
		//for(Player player:players){
			//relation.get(player).printBoard();
		//}

	}
}
