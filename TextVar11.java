import java.util.Scanner;
public class TextVar11{
	public static void main(String[] args){
		//����¼��ѧ�������䣬��ߣ��������Ա�
		//¼�����䣨���Σ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�������������:");
		int age = sc.nextInt();
		
		//¼�����(������)
		System.out.print("������������:");
		double height = sc.nextDouble();
		
		//¼������(String----�ַ�����)
		System.out.print("�������������:");
		String name = sc.next();
		
		//¼���Ա��ַ��ͣ�
		System.out.print("����������Ա�:");
		char sex = sc.next().charAt(0);
		
		System.out.println();
		
		System.out.print("��ѧ��������Ϊ:"+name+"\n��ѧ��������Ϊ:"+age+"\n��ѧ�����Ա�Ϊ:"+sex+"\n��ѧ�������Ϊ:"+height);
		
		
		
		
		}
}