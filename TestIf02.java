//ʵ��һ�����ܣ�������������1-6��������������ͼ��㣬���ݺ͵Ĵ�С�����䲻ͬ�Ľ�Ʒ
public class TestIf02{
	public static void main(String[] args){
		//������λ��
		int num1 = 4;
		int num2 = 3;
		int num3 = 4;
				
		//�����������
		int sum = 0;
		sum += num1;
		sum += num2;
		sum += num3;
						
		//���ݺ͵Ĵ�С���佱Ʒ(���֧)
		if(sum>=14){
			System.out.println("���һ�Ƚ�");
		}else if(sum>=10){
			System.out.println("��ö��Ƚ�");
		}else if(sum>=5){
			System.out.println("������Ƚ�");
		}else{
			System.out.println("����ĵȽ�");
		}
	}
}