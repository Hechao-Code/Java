//功能：我心里有一个数，你来猜，看是否猜对
/*import java.util.Scanner;
public class TestMethod02{
	public static void main(String[] args){
		//你猜一个数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你猜的数字:");
		int yourGuessNum = sc.nextInt();
		
		
		//我心里有一个数
		int myGuessNum = 1;
		
		
		//将两个数做比对
		System.out.println(yourGuessNum==myGuessNum?"猜对了！":"猜错了!");
	}
}*/
import java.util.Scanner;
public class TestMethod02{
	public static void guessNum(int yourGuessNum){
		//我会猜1-6的数字
		int myGuessNum = (int)(Math.random()*6+1);
		System.out.println(yourGuessNum==myGuessNum?"猜对了！":"猜错了!");
	}
	public static void main(String[] args){
		//你猜一个数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你猜的数字:");
		int yourGuessNum = sc.nextInt();
		guessNum(yourGuessNum);
		
			
	}
}