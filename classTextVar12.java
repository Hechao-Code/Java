import java.util.Scanner;
public class TextVar12{
	public static void main(String[] args){
		//����Բ���ܳ�
		final double PI = 3.141592;
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Բ�İ뾶:");
		int r = sc.nextInt();
			
		double c = 2*PI*r;
		System.out.println("��Բ���ܳ�Ϊ:"+c);		
			
		//����Բ�����
		
		double s =PI*r*r;
		System.out.println("��Բ�����Ϊ:"+s);
	}
}