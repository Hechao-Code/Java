//功能：给定一个数组,删除下标为2元素
import java.util.*;
public class ReviewArr08{
	public static void main(String[] args){
		//给定一个数组
		int[] arr = {23,35,65,34,43,6};
		//           0  1  2  3  4  5
		//输出删除前的数组
		System.out.println("删除前的数组为："+Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你要删除元素的位置：");
		int index = sc.nextInt();
		
		//删除
		for(int i=index;i<=arr.length-2;i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
		
		
		//输出删除后的数组
		System.out.println("删除后的数组为："+Arrays.toString(arr));
	}
}