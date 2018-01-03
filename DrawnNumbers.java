import java.util.Random;
import java.util.HashSet;

public class DrawnNumbers{
	HashSet<Integer> setNums;
	Random numsR;

	public DrawnNumbers(){
		numsR=new Random();
		setNums=new HashSet<Integer>();
	}
	public Integer getDrawnNum(){
		while(true){
			Integer num=numsR.nextInt(100);
			if(setNums.add(num)){
				return num;
			}
		}
	}
}
