/*
ʵ��һ�����ܣ� 
��1����¼��10�������������������666��ʱ���˳�����
��2���ж�����¼�������ĸ����������
��3���ж�ϵͳ���˳�״̬���������˳����Ǳ����˳���
*/
import java.util.Scanner;
public class ReviewFor02{
	public static void main(String[] args){
		int count = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i<=10;i++){
			System.out.print("�������"+i+"������");
			int num = sc.nextInt();
			if(num>0){
				count++;
			}
			if(num==666){
				flag = false;
				break;
			}					
		}
		if(flag==true){
			System.out.println("�����������˳�");
		}else{
			System.out.println("������ǿ���˳�");
		}
		System.out.println("������ĸ���Ϊ:"+count);
		
		
		
	}
}