/*��ӡһ��������
   *
  ***
 *****
*******
*/
public class ReviewFor08{
	public static void main(String[] args){
		for(int j = 1;j<=4;j++){		//��������
			for(int i = 1;i<=(4-j);i++){	//���ƿո���
				System.out.print(" ");
				
			}
			for(int i = 1;i<=(j*2-1);i++){	//����*��
			System.out.print("*");
			}
			System.out.println();
		}
		
	}
}