//���ܣ���������һ�����������£����Ƿ�¶�
import java.util.Scanner;
public class ReviewMethod02{
	public static void main(String[] args){
		//����һ����µ���
		Scanner sc = new Scanner(System.in);
		System.out.print("��������µ���:");
		int yourGuessNum = sc.nextInt();
		guessNum(yourGuessNum);	
	}
	public static void guessNum(int yourGuessNum){
		//�ҵ�����������1-6������
		int myHeartNum =(int)(Math.random()*6+1);
		//ͨ���ȽϿ��Ƿ�¶�
		if(yourGuessNum==myHeartNum){
			System.out.println("�¶��ˣ�");
		}else{
			System.out.println("�´��ˣ�");
		}
	}
}