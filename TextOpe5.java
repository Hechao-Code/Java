//���������� ���
import java.util.*;
public class TextOpe5{
	public static void main(String[] args){
		//�������������
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ����:");
		double num1 = sc.nextDouble();
		System.out.print("������ڶ�����:");
		double num2 = sc.nextDouble();
		System.out.print("�������������:");
		double num3 = sc.nextDouble();
		//���
		double sum = 0;
		sum = sum+num1;
		sum = sum+num2;
		sum = sum+num3;
				
		//�����ͽ��
		System.out.println("��ͽ��Ϊ:"+sum);
	}
}