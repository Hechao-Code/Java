//���ܣ����1-100�б�6����������
public class TextFor03{
	public static void main(String[] args){
	/*��ʽһ	for(int num = 1;num<=100;num++){			
			if(num%6==0){
				System.out.println(num);
			}
		}*/
	/*��ʽ��	for(int num = 1;num<=100;num++){
			if(num%6 != 0){
				continue;
			}
			System.out.println(num);
		}}*/
		
		for(int num = 1;num<=100;num++){
			while(num%6 != 0){
				continue;
			}
			System.out.println(num);
		}
	}
}