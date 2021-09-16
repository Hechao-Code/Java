//功能：给定一个数组,删除下标为2元素
import java.util.Arrays;
public class TestArray08{
	public static void main(String[] args){
		int[] arr = {23,54,34,546,57,343,33};
		//输出删除前的数组
		System.out.println("删除前的数组为：");
		System.out.println(Arrays.toString(arr));
		
		
		//删除
		int index = 2;
		for(int i=index;i<=arr.length-2;i++){
			arr[i] = arr[i+1];
			
		}		
		arr[arr.length-1] = 0;
		
		
		//输出删除后的数组
		System.out.println("删除后的数组为：");
		System.out.println(Arrays.toString(arr));
	}
}