/*
��ϰ��
С���Ѱ����ӣ�
�������7�꣬���԰����ӣ�
����������5�꣬�Ա����У����԰����ӣ�
���򲻿��԰ᶯ���ӣ���ʾ���㻹̫С��
*/
import java.util.Scanner;
public class TextIf06{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������С���ѵ����䣺");
		int age = sc.nextInt();
		if(age>7){
			System.out.println("���԰�����");
		}else if(age>5){
			System.out.println("������С���ѵ��Ա�: 1.���� 2.Ů��");
			int sex = sc.nextInt();
			if(sex==1){
				System.out.println("���԰�����");
			}else{
				System.out.println("�����԰�����");
			}
			
		}else{
			System.out.println("�����԰�����");
		}
	}
}