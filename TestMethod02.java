//���ܣ���������һ�����������£����Ƿ�¶�
/*import java.util.Scanner;
public class TestMethod02{
	public static void main(String[] args){
		//���һ����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������µ�����:");
		int yourGuessNum = sc.nextInt();
		
		
		//��������һ����
		int myGuessNum = 1;
		
		
		//�����������ȶ�
		System.out.println(yourGuessNum==myGuessNum?"�¶��ˣ�":"�´���!");
	}
}*/
import java.util.Scanner;
public class TestMethod02{
	public static void guessNum(int yourGuessNum){
		//�һ��1-6������
		int myGuessNum = (int)(Math.random()*6+1);
		System.out.println(yourGuessNum==myGuessNum?"�¶��ˣ�":"�´���!");
	}
	public static void main(String[] args){
		//���һ����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������µ�����:");
		int yourGuessNum = sc.nextInt();
		guessNum(yourGuessNum);
		
			
	}
}