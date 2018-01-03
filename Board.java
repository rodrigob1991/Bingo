import java.util.Random;
import java.util.HashSet;

public class Board{
	private Integer[][]board;
	
	public Board(){
		board=new Integer[5][5];

		Random colecR=new Random();
		HashSet<Integer> setNums=new HashSet<Integer>();

		int count=25;
		while(25>setNums.size()){
			if(setNums.add(colecR.nextInt(100))){count++;}
		}
		
		int j=0;
		int k=0;
		for(Integer num:setNums){
			board[j][k]=num;
			if(k==4){j++;k=0;}
			else{k++;}
		}
		board[2][2]=0;
	}

	public void printBoard(){for(Integer[] row:board){for(Integer num:row){System.out.println(num);};};}
}
