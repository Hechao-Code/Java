/*��ӡ��������
   *
  * *
 *   *
*     *
 *   *
  * *
   *
*/
public class ReviewFor10{
	public static void main(String[] args){
		for(int j = 1;j<=4;j++){			//��������
			for(int i = 1;i<=(4-j);i++){		//���ƿո���
				System.out.print(" ");
			}
			
			for(int i = 1;i<=(2*j-1);i++){		//����*��
				if(i==1||i==(2*j-1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int j = 1;j<=3;j++){				//��������
			for(int i = 1;i<=j;i++){			//���ƿո���
				System.out.print(" ");
			}
			
			for(int i = 1;i<=(7-2*j);i++){		//����*��
				if(i==1||i==(7-2*j)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}