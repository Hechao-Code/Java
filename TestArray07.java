//功能：给定一个数组,在数组下标为2的位置上添加一个元素91
import java.util.Scanner;
public class TestArray07{
	public static void main(String[] args){
		int[] arr = {23,45,34,5,76,45,23,34,46,454};
		//输出添加前的数组
		System.out.print("增加前的数组：");
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}else{
				System.out.print(arr[i]);
			}
			
		}
		System.out.println();
		//添加
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你要添加元素的下标：");
		int index = sc.nextInt();
		System.out.print("请输入你要添加的指定元素：");
		int ele = sc.nextInt();
		insert(arr,index,ele);
		
		
		
		//输出添加后的数组
		System.out.print("\n增加后的数组：");
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(+arr[i]+",");
			}else{
				System.out.print(arr[i]);
			}
			
		}
	}
	//不确定元素：数组，位置和元素
	public static void insert(int[] arr,int index,int ele){
		for(int i = arr.length-1;i>=index+1;i--){
			arr[i] = arr[i-1];
		}
		arr[index] = ele;
	}
}