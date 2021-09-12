//实现一个功能：随机给出三个数（1-6），对三个数求和计算，根据和的大小来分配不同的奖品
public class TestIf03{
	public static void main(String[] args){
		//给出三位数
		int num1 = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1;
		int num3 = (int)(Math.random()*6)+1; 
				
		//对三个数求和
		int sum = 0;
		sum += num1;
		sum += num2;
		sum += num3;	
		System.out.println("和为:"+sum);
		
		//根据和的大小分配奖品(双分支)
		if(sum>=10){
			System.out.println("中奖了");
		}else{
			System.out.println("没中奖");
		}
		
		System.out.println(sum>=10?"中奖了":"没中奖");
	}
}