public class ReviewMethod03{
	public static void main(String[] args){
		//10+20
		add(10,20);
		//23+24+45
		add(23,24,45);
		//23+35+67+12
		add(23,35,67,12);
	}
	public static void add(int num1,int num2){
		int sum = num1+num2;
		System.out.println(sum);
	}
	public static void add(int num1,int num2,int num3){
		int sum = num1+num2+num3;
		System.out.println(sum);
	}
	public static void add(int num1,int num2,int num3,int num4){
		int sum = num1+num2+num3+num4;
		System.out.println(sum);
	}
}