//实现一个功能：给出三个数（1-6），对三个数求和计算，根据和的大小来分配不同的奖品
public class TestIf01{
	public static void main(String[] args){
		//给出三位数
		int num1 = 4;
		int num2 = 3;
		int num3 = 4;
				
		//对三个数求和
		int sum = 0;
		sum += num1;
		sum += num2;
		sum += num3;
						
		//根据和的大小分配奖品(单分支)
		if(sum>=14){
			System.out.println("获得一等奖");
		}
		
		if(sum>=10&&sum<14){
			System.out.println("获得二等奖");
		}
		
		if(sum>=5&&sum<10){
			System.out.println("获得三等奖");
		}
		
		if(sum<5){
			System.out.println("获得鼓励奖");
		}
	}
}