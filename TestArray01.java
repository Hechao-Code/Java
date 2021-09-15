//功能：键盘录入十个学生的成绩，求和，求平均数：
import java.util.Scanner;
public class TestArray01{
	public static void main(String[] args){
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=10;i++){
			System.out.print("请输入第"+i+"个学生的成绩:");
			int score = sc.nextInt();
			sum += score;
		}
		System.out.println("十个学生的总成绩为："+sum);
		System.out.println("十个学生的平均成绩为："+sum/10);
		
	}
}