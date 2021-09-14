/*练习：
会员购物时，不同积分享受的折扣不同，规则如下：
*/
import java.util.Scanner;
public class ReviewIf01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的会员积分：");
		
		if(sc.hasNextInt()==true){				//如果接受的会员积分是int型的话
			int score = sc.nextInt();
			if(score>=8000){
				System.out.println("您享受六折优惠");
			}else if(score>=4000){
				System.out.println("您享受七折优惠");
			}else if(score>=2000){
				System.out.println("您享受八折优惠");
			}else if(score>=0){
				System.out.println("您享受九折优惠");
			}else{
				System.out.println("抱歉，您输入的不是正数！");
			}
			
		}else{
			System.out.println("抱歉,您输入的不是整数！");
		}				
	}
}


