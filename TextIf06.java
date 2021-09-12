/*
练习：
小朋友搬桌子：
年龄大于7岁，可以搬桌子；
如果年龄大于5岁，性别是男，可以搬桌子；
否则不可以搬动桌子，提示：你还太小了
*/
import java.util.Scanner;
public class TextIf06{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入小朋友的年龄：");
		int age = sc.nextInt();
		if(age>7){
			System.out.println("可以搬桌子");
		}else if(age>5){
			System.out.println("请输入小朋友的性别: 1.男生 2.女生");
			int sex = sc.nextInt();
			if(sex==1){
				System.out.println("可以搬桌子");
			}else{
				System.out.println("不可以搬桌子");
			}
			
		}else{
			System.out.println("不可以搬桌子");
		}
	}
}