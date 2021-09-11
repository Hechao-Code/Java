//给出三个数 求和
import java.util.*;
public class TextOpe5{
	public static void main(String[] args){
		//任意给出三个数
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个数:");
		double num1 = sc.nextDouble();
		System.out.print("请输入第二个数:");
		double num2 = sc.nextDouble();
		System.out.print("请输入第三个数:");
		double num3 = sc.nextDouble();
		//求和
		double sum = 0;
		sum = sum+num1;
		sum = sum+num2;
		sum = sum+num3;
				
		//输出求和结果
		System.out.println("求和结果为:"+sum);
	}
}