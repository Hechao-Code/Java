//���ܣ�����¼��ʮ��ѧ���ĳɼ�����ͣ���ƽ������
import java.util.Scanner;
public class TestArray02{
	public static void main(String[] args){
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 0;i<=9;i++){
			System.out.print("�������"+(i+1)+"��ѧ���ĳɼ���");
			int score = sc.nextInt();				
			arr[i] = score;
			sum +=arr[i];
		}
		
		System.out.println("�ܳɼ�Ϊ��"+sum);
		System.out.println("ƽ���ɼ�Ϊ��"+sum/10);
		System.out.println("������ѧ���ĳɼ�Ϊ��"+arr[5]);		
		
		
	}
}