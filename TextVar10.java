import java.util.Scanner;
public class TextVar10{
	public static void main(String[] args){
		//圆的周长：
		
		final double PI = 3.1415926;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入此圆的半径:");
		int r = sc.nextInt();
		
		double c = 2*PI*r;
		System.out.println("此圆的周长为:"+c);
		
		//圆的面积：
		
		double s = PI*r*r;
		System.out.println("此圆的面积为:"+s);
		
	}
}