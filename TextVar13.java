//����¼��ѧ������Ϣ���������Ա����䣬��ߣ�ѧ�ţ�ѧУ
import java.util.*;
public class TextVar13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//¼��������String�ͣ�
		System.out.println("�������������:");
		String name = sc.next();
		
		//¼���Ա��ַ��ͣ�
		System.out.println("����������Ա�:");
		char sex = sc.next().charAt(0);
		
		//¼�����䣨���ͣ�
		System.out.println("�������������:");
		int age = sc.nextInt();
		
		//¼����ߣ������ͣ�
		System.out.println("������������:");
		double height = sc.nextDouble();
		
		//¼��ѧ�ţ�String�ͣ�
		System.out.println("���������ѧ��:");
		String num = sc.next();
		
		//¼��ѧУ��String�ͣ�
		System.out.println("���������ѧУ:");
		String sn = sc.next();
		
		//���ѧ����Ϣ
		System.out.println();
		System.out.println("��ѧ��������Ϊ:"+name+"\n��ѧ�����Ա�Ϊ:"+sex+"\n��ѧ��������Ϊ:"+age+"\n��ѧ�������Ϊ:"+height+"\n��ѧ����ѧ��Ϊ:"+num+"\n��ѧ����ѧУΪ:"+sn);
	}
}