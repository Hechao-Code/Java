//���������������������н���
import java.util.*;
public class TextOpe4{
	public static void main(String[] args){
		//��������������
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ����:");
		int num1 = sc.nextInt();
		System.out.print("������ڶ�����:");
		int num2 = sc.nextInt();
		
		//�������ǰ��������
		System.out.println("����ǰ�Ľ��Ϊ:"+num1+"\t"+num2);
		
		//���н���
		int t = 0;
		t = num1;
		num1 = num2;
		num2 = t;	
		//����������
		System.out.println("������Ľ��Ϊ:"+num1+"\t"+num2);
	}
}