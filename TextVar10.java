import java.util.Scanner;
public class TextVar10{
	public static void main(String[] args){
		//Բ���ܳ���
		
		final double PI = 3.1415926;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�������Բ�İ뾶:");
		int r = sc.nextInt();
		
		double c = 2*PI*r;
		System.out.println("��Բ���ܳ�Ϊ:"+c);
		
		//Բ�������
		
		double s = PI*r*r;
		System.out.println("��Բ�����Ϊ:"+s);
		
	}
}