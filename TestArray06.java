//��ѯָ��Ԫ�ص�λ��--���ҳ�Ԫ�ض�Ӧ������
public class TestArray06{
	public static void main(String[] args){
		int[] arr = {23,34,56,34,23,34};
		int index = getIndex(arr,56);
		
		if(index != -1){
			System.out.println("��Ԫ�ص�������Ϊ��"+index);
		}else{
			System.out.println("���޴���");
		}
	}
	public static int getIndex(int[] arr,int ele){
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==ele){
				index = i;
				break;
			}
		}
		return index;
	}
}