import java.util.Scanner;
public class TestIf04{
public static void main(String[] args){
	//获得一个积分
	Scanner sc = new Scanner(System.in);
	System.out.print("请输入你的会员积分:");
	if(sc.hasNextInt()==true){
		int score = sc.nextInt();
			if(score>0){
				String discount = "";
				if(score>=8000){
					discount = "0.6";
				}else if(score>=4000){
					discount = "0.7";
				}else if(score>=2000){
					discount = "0.8";
				}else{
					discount = "0.9";
				}
					System.out.print("您的折扣是:"+discount);
			}else{
				System.out.print("对不起，您输入的是负数！");
			}
					
	}else{
		System.out.print("您输入的积分不是整数！");
	}
									
	}
}