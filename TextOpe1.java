//��һ����λ���������λ ʮλ ��λ ǧλ�ϵ�����
import java.util.*;
public class TextOpe1{
	public static void main(String[] args){
	//���һ����λ��
	Scanner sc = new Scanner(System.in);
	System.out.print("����������һ����λ��:");
	int num = sc.nextInt();
	
	//�����λ�ϵ�����	
	int num1 = num%10;
	//���ʮλ�ϵ�����
	int num2 = num/10%10;
	//�����λ�ϵ�����
	int num3 = num/100%10;
	//���ǧλ�ϵ�����
	int num4 = num/1000;
	
	//�ֱ������λ�ϵ�����
	System.out.println();
	System.out.println("������λ�ϵ�������:"+num1+"\n����ʮλ�ϵ�������:"+num2+"\n������λ�ϵ�������:"+num3+"\n����ǧλ�ϵ�������:"+num4);
		
	}
}