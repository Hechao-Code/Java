//实现一个功能：删除指定元素
import java.util.*;
public class TestArray09{
	public static void main(String[] args){
		int[] arr = {23,54,34,546,57,343,33};
		//输出删除前的数组
		System.out.println("删除前的数组为："+Arrays.toString(arr));
				
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你要删除的数：");
		int num = sc.nextInt();
		
		//找到要删除的数的索引
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				index = i;
				break;
			}
		}
		
		//删除
		if(index==-1){
			System.out.println("这里没有你要删除的元素！");
		}else{
			for(int i=index;i<=arr.length-2;i++){
			arr[i] = arr[i+1];
			
			}		
			arr[arr.length-1] = 0;
		}
		
		
		
		//输出删除后的数组
		System.out.println("删除后的数组为："+Arrays.toString(arr));
	}
}