public class People implements Comparable<People>{
	
	private int age;
	private String name;
	private int heigth;
	
	public People(int age,int heigth,String name){
		
		this.age=age;
		this.name=name;
		this.heigth=heigth;
	}
	
	public int compareTo(People person){

		int result=0;
		if(age>person.age){result=1;}
		else if(age<person.age){result=-1;}
		return result;
	}
	public int compareToHeigth(People person){
		
		int result=0;
		if(heigth>person.heigth){result=1;}
		else if(heigth<person.heigth){result=-1;}
		return result;
	}
	public void printData(){System.out.println(name+"-"+age+"-"+heigth);}
	
	public String getName(){return name;}
		
}
