//ʵ�ֹ��ܣ��к�Ů��ѡ������ʲô��������һ�£��������ģ���������һ�£���Ů����
import java.util.Scanner;
public class TextOpe7{
	public static void main(String[] args){
		System.out.println("���������:1.���2.�տ� 3.������ 4.����");
		Scanner sc = new Scanner(System.in);
		System.out.print("�к�ѡ���:");
		int boychoice = sc.nextInt();
		System.out.print("Ů��ѡ���:");
		int girlchoice = sc.nextInt();
		
		System.out.println((boychoice==girlchoice)?"��������":"��Ů����");
	}
}