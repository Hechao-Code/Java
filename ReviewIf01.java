/*��ϰ��
��Ա����ʱ����ͬ�������ܵ��ۿ۲�ͬ���������£�
*/
import java.util.Scanner;
public class ReviewIf01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("���������Ļ�Ա���֣�");
		
		if(sc.hasNextInt()==true){				//������ܵĻ�Ա������int�͵Ļ�
			int score = sc.nextInt();
			if(score>=8000){
				System.out.println("�����������Ż�");
			}else if(score>=4000){
				System.out.println("�����������Ż�");
			}else if(score>=2000){
				System.out.println("�����ܰ����Ż�");
			}else if(score>=0){
				System.out.println("�����ܾ����Ż�");
			}else{
				System.out.println("��Ǹ��������Ĳ���������");
			}
			
		}else{
			System.out.println("��Ǹ,������Ĳ���������");
		}				
	}
}


