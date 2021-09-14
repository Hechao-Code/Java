//功能：我心里有一个数，你来猜，看是否猜对
import java.util.Scanner;
public class ReviewMethod02{
	public static void main(String[] args){
		//输入一个你猜的数
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你猜的数:");
		int yourGuessNum = sc.nextInt();
		guessNum(yourGuessNum);	
	}
	public static void guessNum(int yourGuessNum){
		//我的心里会随机猜1-6的数字
		int myHeartNum =(int)(Math.random()*6+1);
		//通过比较看是否猜对
		if(yourGuessNum==myHeartNum){
			System.out.println("猜对了！");
		}else{
			System.out.println("猜错了！");
		}
	}
}