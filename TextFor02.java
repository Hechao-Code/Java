//���ܣ���1-100�ĺͣ����͵�һ�γ���300��ʱ��ֹͣ����
public class TextFor02{
	public static void main(String[] args){
		int sum = 0;
		outer:
		for(int num = 1;num<=100;num++){
			sum +=num;			
			while(sum>300){
				break outer;
			}
			System.out.println(sum);
		}
	}
}