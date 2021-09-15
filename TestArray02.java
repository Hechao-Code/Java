//功能：键盘录入十个学生的成绩，求和，求平均数：
import java.util.Scanner;
public class TestArray02{
	public static void main(String[] args){
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 0;i<=9;i++){
			System.out.print("请输入第"+(i+1)+"个学生的成绩：");
			int score = sc.nextInt();				
			arr[i] = score;
			sum +=arr[i];
		}
		
		System.out.println("总成绩为："+sum);
		System.out.println("平均成绩为："+sum/10);
		System.out.println("第六个学生的成绩为："+arr[5]);		
		
		
	}
}