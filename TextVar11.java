import java.util.Scanner;
public class TextVar11{
	public static void main(String[] args){
		//键盘录入学生的年龄，身高，姓名，性别
		//录入年龄（整形）
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你的年龄:");
		int age = sc.nextInt();
		
		//录入身高(浮点型)
		System.out.print("请输入你的身高:");
		double height = sc.nextDouble();
		
		//录入姓名(String----字符串型)
		System.out.print("请输入你的姓名:");
		String name = sc.next();
		
		//录入性别（字符型）
		System.out.print("请输入你的性别:");
		char sex = sc.next().charAt(0);
		
		System.out.println();
		
		System.out.print("该学生的姓名为:"+name+"\n该学生的年龄为:"+age+"\n该学生的性别为:"+sex+"\n该学生的身高为:"+height);
		
		
		
		
		}
}