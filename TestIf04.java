import java.util.Scanner;
public class TestIf04{
public static void main(String[] args){
	//���һ������
	Scanner sc = new Scanner(System.in);
	System.out.print("��������Ļ�Ա����:");
	if(sc.hasNextInt()==true){
		int score = sc.nextInt();
			if(score>0){
				String discount = "";
				if(score>=8000){
					discount = "0.6";
				}else if(score>=4000){
					discount = "0.7";
				}else if(score>=2000){
					discount = "0.8";
				}else{
					discount = "0.9";
				}
					System.out.print("�����ۿ���:"+discount);
			}else{
				System.out.print("�Բ�����������Ǹ�����");
			}
					
	}else{
		System.out.print("������Ļ��ֲ���������");
	}
									
	}
}