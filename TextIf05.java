import java.util.Scanner;
public class TextIf05{
	public static void main(String[] args){
		//获得会员积分
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入您的会员积分:");
		if(sc.hasNextInt()==true){
			int score = sc.nextInt();
			if(score>0){
				String discount = "";
				if(score>=8000){
					discount = "0.9";
				}else if(score>=4000){
					discount = "0.8";
				}else if(score>=2000){
					discount = "0.7";
				}else{
					discount = "0.6";
				}
				System.out.println("您的会员折扣是："+discount);
			}else{
				System.out.println("对不起，您输入的是负数");
			}
						
		}else{
			System.out.println("请您输入整数");
		}
	
		

	}
}