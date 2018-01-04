import java.util.Random;
import java.util.HashSet;


public class DrawNumbers{
	HashSet<Integer> setNums;
	Random numsR;

	public DrawNumbers(){
		numsR=new Random();
		setNums=new HashSet<Integer>();
	}
	public Integer getDrawNum(){
		while(true){
			Integer num=numsR.nextInt(99)+1;
			if(setNums.add(num)){
				return num;
			}
		}
	}
}
