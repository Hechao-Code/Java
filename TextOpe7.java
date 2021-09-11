//实现功能：男孩女孩选择晚饭吃什么，如果意见一致，听男生的，如果意见不一致，听女生的
import java.util.Scanner;
public class TextOpe7{
	public static void main(String[] args){
		System.out.println("今天的晚饭吃:1.火锅2.烧烤 3.麻辣烫 4.炒菜");
		Scanner sc = new Scanner(System.in);
		System.out.print("男孩选择吃:");
		int boychoice = sc.nextInt();
		System.out.print("女孩选择吃:");
		int girlchoice = sc.nextInt();
		
		System.out.println((boychoice==girlchoice)?"听男生的":"听女生的");
	}
}