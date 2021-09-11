//给一个四位数，求出个位 十位 百位 千位上的数字
import java.util.*;
public class TextOpe1{
	public static void main(String[] args){
	//获得一个四位数
	Scanner sc = new Scanner(System.in);
	System.out.print("请任意输入一个四位数:");
	int num = sc.nextInt();
	
	//求出个位上的数字	
	int num1 = num%10;
	//求出十位上的数字
	int num2 = num/10%10;
	//求出百位上的数字
	int num3 = num/100%10;
	//求出千位上的数字
	int num4 = num/1000;
	
	//分别输出各位上的数字
	System.out.println();
	System.out.println("该数个位上的数字是:"+num1+"\n该数十位上的数字是:"+num2+"\n该数百位上的数字是:"+num3+"\n该数千位上的数字是:"+num4);
		
	}
}