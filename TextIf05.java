import java.util.Scanner;
public class TextIf05{
	public static void main(String[] args){
		//��û�Ա����
		Scanner sc = new Scanner(System.in);
		System.out.print("���������Ļ�Ա����:");
		if(sc.hasNextInt()==true){
			int score = sc.nextInt();
			if(score>0){
				String discount = "";
				if(score>=8000){
					discount = "0.9";
				}else if(score>=4000){
					discount = "0.8";
				}else if(score>=2000){
					discount = "0.7";
				}else{
					discount = "0.6";
				}
				System.out.println("���Ļ�Ա�ۿ��ǣ�"+discount);
			}else{
				System.out.println("�Բ�����������Ǹ���");
			}
						
		}else{
			System.out.println("������������");
		}
	
		

	}
}