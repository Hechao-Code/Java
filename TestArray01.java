//���ܣ�����¼��ʮ��ѧ���ĳɼ�����ͣ���ƽ������
import java.util.Scanner;
public class TestArray01{
	public static void main(String[] args){
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=10;i++){
			System.out.print("�������"+i+"��ѧ���ĳɼ�:");
			int score = sc.nextInt();
			sum += score;
		}
		System.out.println("ʮ��ѧ�����ܳɼ�Ϊ��"+sum);
		System.out.println("ʮ��ѧ����ƽ���ɼ�Ϊ��"+sum/10);
		
	}
}