/*
ʵ��һ�����ܣ� 
��1����¼��10�������������������666��ʱ���˳�����
��2���ж�����¼�������ĸ����������
��3���ж�ϵͳ���˳�״̬���������˳����Ǳ����˳���
*/
import java.util.Scanner;
public class TextFor8{
	public static void main(String[] args){
		boolean flag = true;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i<=10;i++){
			System.out.println("�������"+i+"����:");
			int num = sc.nextInt();
			
			if(num>0){
				count++;
			}
			
			if(num==666){
				flag = false;
				break;
			}			
		}
		System.out.println("�����������Ϊ��"+count+"��");
		if(flag==true){
			System.out.println("���������˳�");
		}else if(flag==false){
			System.out.println("���Ǳ����˳�");
		}
		
		}
}