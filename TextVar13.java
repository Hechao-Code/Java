//键盘录入学生的信息：姓名，性别，年龄，身高，学号，学校
import java.util.*;
public class TextVar13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//录入姓名（String型）
		System.out.println("请输入你的姓名:");
		String name = sc.next();
		
		//录入性别（字符型）
		System.out.println("请输入你的性别:");
		char sex = sc.next().charAt(0);
		
		//录入年龄（整型）
		System.out.println("请输入你的年龄:");
		int age = sc.nextInt();
		
		//录入身高（浮点型）
		System.out.println("请输入你的身高:");
		double height = sc.nextDouble();
		
		//录入学号（String型）
		System.out.println("请输入你的学号:");
		String num = sc.next();
		
		//录入学校（String型）
		System.out.println("请输入你的学校:");
		String sn = sc.next();
		
		//输出学生信息
		System.out.println();
		System.out.println("该学生的姓名为:"+name+"\n该学生的性别为:"+sex+"\n该学生的年龄为:"+age+"\n该学生的身高为:"+height+"\n该学生的学号为:"+num+"\n该学生的学校为:"+sn);
	}
}