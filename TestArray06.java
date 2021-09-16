//查询指定元素的位置--》找出元素对应的索引
public class TestArray06{
	public static void main(String[] args){
		int[] arr = {23,34,56,34,23,34};
		int index = getIndex(arr,56);
		
		if(index != -1){
			System.out.println("此元素的索引号为："+index);
		}else{
			System.out.println("查无此数");
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