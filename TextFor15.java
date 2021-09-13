/*打印菱形
    *
   ***
  *****
 *******
  *****
   ***
    *
*/
public class TextFor15{
	public static void main(String[] args){
		for(int j = 1;j<=4;j++){ 			//控制行数
			for(int i = 1;i<=(5-j);i++){    	//控制空格数
				System.out.print(" ");
			}   
											
			for(int i = 1;i<=(2*j-1);i++){ 		//控制列数
			System.out.print("*");
		    }	
			
			System.out.println();
		}
		
		for(int j = 1;j<=3;j++){ 			//控制行数
			for(int i = 1;i<=(j+1);i++){    	//控制空格数
				System.out.print(" ");
			}   
											
			for(int i = 1;i<=(7-2*j);i++){ 		//控制列数
			System.out.print("*");
		    }	
			
			System.out.println();
		}
		
	}
}