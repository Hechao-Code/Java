/*��ӡ������
    *
   ***
  *****
 *******
*/
public class TextFor14{
	public static void main(String[] args){
		for(int j = 1;j<=4;j++){ 			//��������
			for(int i = 1;i<=(5-j);i++){    	//���ƿո���
				System.out.print(" ");
			}   
											
			for(int i = 1;i<=(2*j-1);i++){ 		//��������
			System.out.print("*");
		    }	
			
			System.out.println();
		}
		
	}
}