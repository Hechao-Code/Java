/*打印一个三角形
   *
  ***
 *****
*******
*/
public class ReviewFor08{
	public static void main(String[] args){
		for(int j = 1;j<=4;j++){		//控制行数
			for(int i = 1;i<=(4-j);i++){	//控制空格数
				System.out.print(" ");
				
			}
			for(int i = 1;i<=(j*2-1);i++){	//控制*数
			System.out.print("*");
			}
			System.out.println();
		}
		
	}
}