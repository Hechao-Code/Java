//ʵ��һ�����ܣ����������������1-6��������������ͼ��㣬���ݺ͵Ĵ�С�����䲻ͬ�Ľ�Ʒ
public class TestIf03{
	public static void main(String[] args){
		//������λ��
		int num1 = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1;
		int num3 = (int)(Math.random()*6)+1; 
				
		//�����������
		int sum = 0;
		sum += num1;
		sum += num2;
		sum += num3;	
		System.out.println("��Ϊ:"+sum);
		
		//���ݺ͵Ĵ�С���佱Ʒ(˫��֧)
		if(sum>=10){
			System.out.println("�н���");
		}else{
			System.out.println("û�н�");
		}
		
		System.out.println(sum>=10?"�н���":"û�н�");
	}
}