/*
ʵ��һ�����ܣ�
���ݸ�����ѧ���������ж�ѧ���ĵȼ���
>=90  -----A
>=80  -----B
>=70  -----C
>=60  -----D
<60   -----E              
*/
public class TextSwitch{
	public static void main(String[] args){
		//����ѧ���ķ���
		int score = 92;
			
		//���ݷ������жϵȼ�
		switch(score/10){
			case 10 : System.out.println("A��");break;
			case 9 : System.out.println("A��");break;
			case 8 : System.out.println("B��");break;
			case 7 : System.out.println("C��");break;
			case 6 : System.out.println("D��");break;
			case 5 : System.out.println("E��");break;
			case 4 : System.out.println("E��");break;
			case 3 : System.out.println("E��");break;
			case 2 : System.out.println("E��");break;
			case 1 : System.out.println("E��");break;
			case 0 : System.out.println("E��");break;
			default : System.out.println("�������");
		}
	}
	
}