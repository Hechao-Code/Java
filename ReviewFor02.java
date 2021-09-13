/*
实现一个功能： 
【1】请录入10个整数，当输入的数是666的时候，退出程序。
【2】判断其中录入正数的个数并输出。
【3】判断系统的退出状态：是正常退出还是被迫退出。
*/
import java.util.Scanner;
public class ReviewFor02{
	public static void main(String[] args){
		int count = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i<=10;i++){
			System.out.print("请输入第"+i+"个数：");
			int num = sc.nextInt();
			if(num>0){
				count++;
			}
			if(num==666){
				flag = false;
				break;
			}					
		}
		if(flag==true){
			System.out.println("您属于正常退出");
		}else{
			System.out.println("您属于强制退出");
		}
		System.out.println("您输入的个数为:"+count);
		
		
		
	}
}