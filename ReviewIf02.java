/*��ϰ��
С���Ѱ����ӣ�
�������7�꣬���԰����ӣ�
����������5�꣬�Ա����У����԰����ӣ�
���򲻿��԰ᶯ���ӣ���ʾ���㻹̫С��
*/
import java.util.Scanner;
public class ReviewIf02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������������䣺");
		int age = sc.nextInt();
		if(age>=7){
			System.out.println("���԰�����!");
		}else if(age>=5){
			System.out.println("����������Ա�1.����  2.Ů��");
			int sex = sc.nextInt();
			if(sex==1){
				System.out.println("���԰����ӣ�");
			}else{
				System.out.println("�����԰����ӣ�");
			}
		}else{
			System.out.println("�����԰����ӣ�");
		}
	}
}