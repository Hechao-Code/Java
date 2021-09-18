//功能：给定一个数组,删除下标为2元素
import java.util.*;
public class ReviewArr09{
	public static void main(String[] args){
		//给定一个数组
		int[] arr = {23,35,65,34,43,6};
		//           0  1  2  3  4  5
		//输出删除前的数组
		System.out.println("删除前的数组为："+Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你要删除元素的位置：");
		int index = sc.nextInt();
		delEle(arr,index);
		
		
		
		//输出删除后的数组
		System.out.println("删除后的数组为："+Arrays.toString(arr));
	}
	//提取为一个方法：不确定因素：哪个数组？删除哪个位置的元素？没有返回值
	public static void delEle(int[] arr,int index){
		//删除
		for(int i=index;i<=arr.length-2;i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
		
	}
}