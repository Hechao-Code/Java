//给出任意两个数，并进行交换
import java.util.*;
public class TextOpe4{
	public static void main(String[] args){
		//给出任意两个数
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个数:");
		int num1 = sc.nextInt();
		System.out.print("请输入第二个数:");
		int num2 = sc.nextInt();
		
		//输出交换前的两个数
		System.out.println("交换前的结果为:"+num1+"\t"+num2);
		
		//进行交换
		int t = 0;
		t = num1;
		num1 = num2;
		num2 = t;	
		//输出交换结果
		System.out.println("交换后的结果为:"+num1+"\t"+num2);
	}
}