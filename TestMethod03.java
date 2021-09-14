public class TestMethod03{
	public static void main(String[] args){
		//10+20
		System.out.println(add(10,20));
		//20+30+40
		System.out.println(add(20,30,40));		
		//30+40+50+60
		System.out.println(add(30,40,50,60));
	}
	public static int add(int num1,int num2){
		return num1+num2;
	}
	public static int add(int num1,int num2, int num3){
		return num1+num2+num3;
	}
	public static int add(int num1,int num2,int num3,int num4){
		return num1+num2+num3+num4;
	}
}