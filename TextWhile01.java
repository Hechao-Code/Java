//计算1+2+3+4+5
public class TextWhile01{
	public static void main(String[] args){
		int num = 1;
		int sum = 0;
		while(num<=5){
			sum +=num;
			num++;
		}
		System.out.println("结果为:"+sum);
	}
}