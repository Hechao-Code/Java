 //���ܣ���1-100�ĺͣ����͵�һ�γ���300��ʱ��ֹͣ����
public class TextFor4{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 1;i<=100;i++){
			sum += i;
			System.out.println(sum);
			if(sum>300){
				break;
			}
		}
		
	}
}